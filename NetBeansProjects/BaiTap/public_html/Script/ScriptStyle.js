var sec = 7;

var second = setInterval(function () {
    var second_test = document.getElementById('second');
    console.log(second_test);
    second_test.innerHTML = 'Quay trở lại trang chủ trong ' + sec + 's';
    
    if (sec == 0) {
        clearInterval(second);
        window.location.assign("file:///F:/Documents/NetBeansProjects/htmlBasic/public_html/Youtube/Youtube.html");
    }
    sec--;

}, 1000);
//// alert >> dua ra thong bao
//// comfirm >> dua ra a thong bao nguoi dung xac nhan co hay khong >> true ~~ false
//// prompt >> dua ra 1 input >> tra ve 1 text >> trong 1 box-input
//var sto = setTimeout(function (){
//    alert('Thành công');
////    clearTimeout(sto);
//},1000);

