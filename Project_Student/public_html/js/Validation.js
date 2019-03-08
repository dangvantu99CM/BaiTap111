// Dat gia tri can xu ly logic nho nhat la 1 ki tu
const MIN_LENGTH = 1;

// lon nhat la 255 ki tu
const MAX_LENGTH = 255;
// 1 mang luu tat ca cac truong can validation
let validationFields = [];
// 1 doi tuong validation >> luu cac truong can validation trong 1 doi tuong validation
//moi key trong doi tuong validation >> la 1 function >> xu li 1 calidation
// bao gom ca cac ham checkError va xu ly cac logic
const validation = {

    // ham init la ham khoi tao cua validation
    // gia tri nhan vao cua ham nay la 1 mang cac fields mo ta 1 truong input 
    // can duoc validation 
    /*
     * [
     *  {
     *      selector : '' >> phuong thuc selector cua doi tuong
     *      name: '' >> ten cua doi tuong
     *      type : '' >> lieu cua doi tuong (text,number)
     *      min :(neu kieu la number)
     *      max : (neu kieu la number)
     *      
     *  },
     
     */
    init: function (arrFeilds) {

        // gan mang chua cac truong can xu li validation bang arrFeilds
        validationFields = arrFeilds;
        this.generate();
    },
    // ham tao
    // ham tao ra cac cach thuc y tuong validation
    generate: function () {
        //Lap cac truong can validation cua tung the input
        for (const field of validationFields) {
            // lay ra tung phan tu trong validationFeilds
            // thong qua cac selector
            const fieldElement = this.getElement(field.selector);
            // lang nghe su kien focus >> khi ta nhap chuot vao the input
            fieldElement.onfoucs = function () {
                this.classList.remove('error');
                // this o day dai dien cho doi tuong the inout khi duoc focus vao
            };
            const that = this;
            // kiem tra tung phan tu input xem co truong nao co loi khong
            fieldElement.onblur = function () {
                // goi toi ham checkFieldError >> de kiem tra loi
                that.checkFieldError(field);
            };  
            //  tao tool de thong bao loi
            // tao the p trong chinh tai lieu html 
            const messageWrap = document.createElement('p');
            // gan class cho the vua tao
            messageWrap.className = 'input-message';
            // tao ra thong bao tuong ung 
            // moi 1 doi tuong co 1 type tuong ung >> se co
            // kieu thong bao loi tuong ung
            const message = this.getMessage(field); // goi toi ham getMessage 
            // >> ham getMessage >> dua ra thong bao cu the cho cac lieu tuong ung 

            // tao ra 1 textNode >> voi noi dung trong message
            const messageNode = document.createTextNode(message);
            // dua textNode nay vao trong the p >> voi class 
            // vua tao

            messageWrap.appendChild(messageNode);
            // dua noi dung the p nay voi class do vao trong chinh 
            // the cha cua the input can xu ly su kien ngoai giao dien

            fieldElement.parentElement.appendChild(messageWrap);

        }
        ;

    },
    // su dung de check toan bo cac doi tuong the input
    // neu khong doi tuong nao phat sinh loi 
    // return : all k loi >> return flase
    // neu co it nhat 1 doi tuong co loi >> return true
    // trong javaScript >> khi gap cau lenh return >> ngay lap tuc thoat khoi ham do
    // khong thuc hien tiep cac cau lenh phia duoi
    checkAllError: function () {
        let isError = false;
        for (const field of validationFields) {
            const ElementField = field.getElement(field.selector); // goi toi ham getElement >> trong doi tuong validation
            this.checkFieldEror(field) && (isError = true);
        }
        return isError;
    },
    // ham checkfieldError >> co nhiem vu check tung doi tung trong form
    // neu co loi >> return >>  true
    // neu doi tuong do k co loi >> return >> false
    checkFieldError: function (field) {
        const fieldElement = this.getElement(field.selector);
        // gan 1 hang k doi la valid bang 1 ham xu ly logic dk voi tung truong >> tuong ung voi kieu tuong ung cua no
        const valid = this[field.type](fieldElement.value, field.min, field.max);
        // vi cac ham nhan valid >> tra ve true || false
        // con ham nay neu co loi >> tra ve true
        // k co loi tra ve false
        if (!valid) {
            fieldElement.classList.add('error');
            return true; // tra ve true nhay ra >> co loi
        }
        else{
             fieldElement.classList.remove('error');
        }
       
        return false;
    },
    // ham kiem tra xem toan bo form co loi hay khong 
    // co loi >> return flase
    // khong loi >> return true
    noError: function () {
        const haveError = this.checkAllError();
        return !haveError;
    },
    // ham lay ra cac node tuong ung voi tung selector
    getElement: function (selector) {
        const element = document.querySelector(selector);
        return element;
    },
    getMessage: function (field) {
        let message = "Enter your " + field.name; // gia tri mac dinh cua message
        if (field.type === 'number') {
            message += ',number only';
        }
        // cu phap nay dung de kiem tra xem trong truong 
        // do co ton tai gioi han nho nhat cua ta khong
        if (field.min) {
            message += ',minimum ' + field.min + ' charactors';
        }
        // tuong tu neu ton tai truog max
        if (field.max) {
            message += ',maximum ' + field.max + ' charactors';
        }
        return message;
    },
    // gia tri tra ve cua ham la true || false
    number: function (value, min = MIN_LENGTH, max = MAX_LENGTH) {
        const isNumber = !!value && !isNaN(value); // kiem tra gia tri trong truong do co phai la so va khong duoc rong hay k
        const length = value.length;
        return isNumber && length >= min && length <= max;
        // dung tat ca cac dk tra ve true
        // sai >> tra ve false
    },
    text: function (value, min = MIN_LENGTH, max = MAX_LENGTH) {
        const length = value.length;
        return length >= min && length <= max;
    },
    email: function (value) {
        const emailFormat = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return emailFormat.test(value);
    }

};



