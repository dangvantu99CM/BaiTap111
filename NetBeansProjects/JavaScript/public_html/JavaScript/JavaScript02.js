// alert >> canh bao, thong bao
// prompt >> thong bao nhac nho >> tra ve 1 text
// confirm >> return boolean
// prompt >> return text
// false = null = undefined = 0 = ''
//var botest = confirm('TRUE OR FALSE');
//console.log(botest);
//var name = prompt('Enter your name !');
//console.log(name);
//if (name == "" || name == "null") {
//    alert('Please enter your name');
//} else {
//    alert('Hello ! ' + name);
//}
//
//
// kiem tra tuoi nguoiw dung khi dang nhap vao website
// 
// c1
//var age = prompt('Enter your age!');
//if(age >= 18){
//    alert('Hello client !');
//}else{
//    alert('Sorry you are not fit with website !');
//}
//
//c2 >> cofirm >> de xac nhan nguoi dung

//var age = confirm('Are you age 18 or than');
//if(age == true){
//    
//}
//else{
//    window.location.assign('JavaScript/Demo.html');
//}

var is_confirm = confirm('Ban co chac minh tren 18 tuoi.');
if (is_confirm == true) {
//    var sto = setTimeout(function () {
//        alert('Ban da du 18');
//    }, 3000);
//
//    console.log(sto);
//
//    clearTimeout(sto);
//    console.log('da clear Time out');
    var second = 5;
    var testSetInterval = setInterval(function () {
        console.log(testSetInterval);
//        var text = document.getElementById('second');
//        console.log(document.getElementById('second'));
        var second_t = document.getElementById('second');
        second_t.innerHTML = second;
        console.log(second_t);
        if (second == 0) {
            clearInterval(testSetInterval);
            window.location.assign('https://www.google.com/');
        }
        second--;
//        if (second == 0) {
//            clearInterval(testSetInterval);
//            window.location.assign('https://www.google.com/');
//        }
        

    }, 1000);
}
