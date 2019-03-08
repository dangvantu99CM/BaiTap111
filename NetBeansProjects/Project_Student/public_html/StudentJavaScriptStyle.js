

/* global validation */

var students = [
    {
        name: 'Name',
        address: 'Address',
        age: 'Age',
        id: 'ID',
        birthyear: 'Birthyear',
        stt: 'STT',
        khoa: 'Course',
        nganh: 'Majors',
        phoneNumber: 'Phone Number',
        email: 'Email'

    },
    {
        name: 'Phạm Hoàng Long',
        address: 'Hà Nội',
        age: '21',
        id: '1234',
        birthyear: '1980',
        stt: '1',
        khoa: 'Hóa Học',
        nganh: 'Hóa Dược',
        phoneNumber: '032315466',
        email: 'longHus@gmail.com'
    },
    {
        name: 'Nguyễn Nhật Thùy Linh',
        address: 'Nam Định',
        age: '18',
        id: '1111',
        birthyear: '1989',
        stt: '2',
        khoa: 'Toán - Cơ - Tin Học',
        nganh: 'Khoa Học Dữ Liệu',
        phoneNumber: '0323154663213',
        email: 'linhHus@gmail.com'
    }


];

var event_html_loaded = document.addEventListener('DOMContentLoaded', function () {
    renderVeiw();

    var click_submit = document.getElementById('submit');
    var count = 0;
    click_submit.addEventListener('click', function () {


        var name_join = document.getElementById('name').value;

        var address_join = document.getElementById('address').value;

        var age_join = document.getElementById('age').value;

        var id_join = document.getElementById('id').value;

        var birht_join = document.getElementById('BirthYear').value;

        var khoa_join = document.getElementById('Khoa').value;

        var ngh_hoc_join = document.getElementById('nganh_hoc').value;

        var phNumber_join = document.getElementById('phoneNumber').value;
        
        var mail_join = document.getElementById('email').value;
        
        var test = document.getElementById('phoneNumber');
        console.log(test);
        console.log(phNumber_join);
        // event blur cho cac the input khi khong nhap du lieu
        // su dung addEventListener
        // 3 cach >> su dung tru tiep trong cac th inline cua html (goi la cac event Attribute) >> , >> su dung viet trong 
        // chinh trong the script >> 
        // c2 la su dung node.tensukien = function(){}
        // c3 su dung node.addEventListener('tensukien',Xu ly su kien)



        var student_oblect = {

            name: name_join,
            address: address_join,
            age: age_join,
            id: id_join,
            birthyear: birht_join,
            khoa: khoa_join,
            nganh: ngh_hoc_join,
            phoneNumber: phNumber_join,
            email : mail_join
        };
        
        eventClickButtonSubmit();
        
        students.push(student_oblect);

        arr_id.push(students[students.length - 1].id);
        
        renderVeiw();

    });
    getId();

    // kiem tra dua ra cac cach su ly su kien trong cac the input

//    var inputOnBlur = document.querySelectorAll('#my_form input');
//    // lay ra dsch cac node cua tp phan con trong cha la #my_form
//    for (var i = 0; i < inputOnBlur.length; i++) {
//
//        console.log(inputOnBlur[i].value);
//        if (inputOnBlur[i].value === '') {
//            
//            inputOnBlur[i].addEventListener('blur', function () {
//                error(this);
//            });
//        }
//    }

    var event_button_search = document.getElementById('search-button');
    event_button_search.addEventListener('click', function () {
        get_text_search();
    });
    var button_del = document.getElementById('del-button');
    button_del.addEventListener('click', function () {
        delete_student();

    });
    var buton_reset_object = document.getElementById('reset-all-data');
    buton_reset_object.addEventListener('click', function () {
        reset_data();
    });
    validation.init([
        {
            selector: '#name',
            name: 'name',
            type: 'text',
            min: 1,
            max: 255

                    // gioi han so luong ki tu nhap vao trong input 

                    //// doi voi text >> neu k gioi han thi mac dinh 
                    // lay gioi han mac dinh 
                    // min >> 1
                    // max >> 255
        },
        {
            selector: '#age',
            name: 'age',
            type: 'number',
            min: 2,
            max : 2

        },
        {
            selector: '#address',
            name: 'address',
            type: 'text',
            min: 1,
            max: 255
        },
        {
            selector: '#phoneNumber',
            name: 'phone',
            type: 'number',
            min: 10,
            max: 12
        },
        {
            selector: '#id',
            name: 'ID',
            type: 'number',
            min: 6,
            max: 6
        },
        {
            selector: '#BirthYear',
            name: 'BirthYear',
            type: 'number',
            min: 4
            
        },
        {
            selector: '#Khoa',
            name: 'Course',
            type: 'text',
            min: 1,
            max: 255
        },
        {
            selector: '#nganh_hoc',
            name: 'Majors',
            type: 'text',
            min: 1,
            max: 255
        },
        {
            selector: '#email',
            name: 'Email',
            type: 'email'

        }


    ]);

});

function renderVeiw() {
    var tbo = document.getElementById('table_object');
    var htmt_table = '<tr>' + '<th>' + students[0].stt + '</th>' + '<th>' + students[0].name + '</th>' + '<th>' + students[0].address + '</th>' + '<th>' + students[0].age + '</th>' +
            '<th>' + students[0].id + '</th>' + '<th>' + students[0].birthyear + '</th>' + '<th>' + students[0].khoa + '</th>' + '<th>' + students[0].nganh + '</th>' + '<th>' + students[0].phoneNumber + '</th>'
            + '<th>' + students[0].email + '</th>' + '</tr>';
    for (var i = 1; i < students.length; i++) {

        htmt_table += '<tr>' + '<td>' + (i) + '</td>' + '<td>' + students[i].name + '</td>' + '<td>' + students[i].address + '</td>' + '<td>' + students[i].age + '</td>' +
                '<td>' + students[i].id + '</td>' + '<td>' + students[i].birthyear + '</td>'
                + '<td>' + students[i].khoa + '</td>' + '<td>' + students[i].nganh + '</td>' + '<td>' + students[i].phoneNumber + '</td>' + '<td>' + students[i].email + '</td>'+'</tr>';

    }
    console.log(students.length);
    tbo.innerHTML = htmt_table;
    console.log(tbo);

    console.log(students, students.length);

}
var arr_id = [];
function getId() {
    for (var i = 1; i < students.length; i++) {
        arr_id.push(students[i].id);
    }
}

function get_text_search() {
    var count = 0;

    console.log(arr_id);

    var text_search_input = document.getElementById('input-search').value;
    for (var i = 0; i < arr_id.length; i++) {
        if (text_search_input === arr_id[i]) {
            renderVeiwSearch(i + 1);
            console.log('true');
            count += 1;
        }
    }
    if (count === 0) {
        alert('Not exist data with id is ' + text_search_input);
    }


}
function renderVeiwSearch(index_search) {
    var tbo = document.getElementById('table_object');
    var htmt_table = '<tr>' + '<th>' + students[0].stt + '</th>' + '<th>' + students[0].name + '</th>' + '<th>' + students[0].address + '</th>' + '<th>' + students[0].age + '</th>' +
            '<th>' + students[0].id + '</th>' + '<th>' + students[0].birthyear + '</th>' + '<th>' + students[0].khoa + '</th>' + '<th>' + students[0].nganh + '</th>' + '<th>' + students[0].phoneNumber + '</th>'
            + '<th>' + students[0].email + '</th>' + '</tr>';
    
    htmt_table += '<tr>' + '<td>' + (index_search) + '</td>' + '<td>' + students[index_search].name + '</td>' + '<td>' + students[index_search].address + '</td>' + '<td>' + students[index_search].age + '</td>' +
            '<td>' + students[index_search].id + '</td>' + '<td>' + students[index_search].birthyear + '</td>' + '<td>' + students[index_search].khoa + '</td>' + '<td>' + students[index_search].nganh + '</td>' + '<td>' + students[index_search].phoneNumber + '</td>'
            + '<td>' + students[index_search].email + '</td>'
            + '</tr>';

    tbo.innerHTML = htmt_table;
    console.log(tbo);

}
function delete_student() {
    var count = 0;
    var text_id = document.getElementById('in-del').value;

    console.log('delete student ' + arr_id + text_id);

    for (var i = 0; i < arr_id.length; i++) {
        if (text_id === arr_id[i]) {
            var index = students.indexOf(students[i + 1]);
            students.splice(index, 1);
            arr_id.splice(i, 1);
            count += 1;
            renderVeiw();
        }
    }
    console.log('Mang sau khi xoa : ' + arr_id);

    if (count === 0)
    {
        alert('Not exist data with id is ' + text_id);
    }
}
function reset_data() {

    var creat_object = document.getElementById('my_form');
    var creat_object_01 = document.getElementById('form_del');
    var creat_object_02 = document.getElementById('form_ser');
    creat_object_01.reset();
    creat_object_02.reset();
    creat_object.reset();
}

function eventClickButtonSubmit(){
    if(!validation.noError()) {
        return;
    }
}










