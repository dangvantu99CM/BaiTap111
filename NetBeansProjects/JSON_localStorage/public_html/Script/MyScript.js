// JSON la 1 kieu dinh dang du lieu kieu String
// kieu cua JSON la String
// luu String cac doi tuong 
// tuong tu nhu css 
// javaScript cung co cac cach de tac dong vao cac the html
// internal >> viet chinh tai html  , external >> lien ket file .js , inline >> su dung cac thuoc tinh cua javascript
// luu y JSON dinh dang luu du lieu duoi dang String

var StringJson = '[{"name" : "van Lam","age" : "24"},{"name" : "van Lam","age" : "24"},{"name" : "van Lam","age" : "24"}]';

console.log(typeof StringJson);
console.log(StringJson);
var StringJSonOfNumber = 32131321;
console.log(StringJSonOfNumber,typeof StringJSonOfNumber);
//alert(StringJson);

// chuyen tu String OF JSON >> ve dang quen thuoc la cac Array >> Object , Number , ....
// su dung phuong thuc parse 
// parse >> chuyen JSON >> ve cac dinh dang doi tuong JavaScript
var ArrayStudent = JSON.parse(StringJson);
for(var i = 0; i < ArrayStudent.length; i++){
    console.log('Object ',i,ArrayStudent[i]);
    console.log(ArrayStudent[i].name);
}
for(let object of ArrayStudent){
    console.log('Use let >> ',object);
}
console.log(typeof  ArrayStudent);
console.log(ArrayStudent);
// chuyen nguoc lai tu Array la cac doi tuong ta cho vao doi tuong String JSON 
//  su dung phuong thuc JSON.stringify(Array//typeData)
var students = [
    
    {
        name : 'Dang Van Lam',
        age : '25'
    },
    {
        name : 'Tran Xuan Bach',
        age: '26'
    }
    
    
];
// su dung Stringify >> chuyen cac kieu du lieu tuong ung trong JavaScript >> Sang Cac dinh dang 
// chuan cua JSON
// convert >> JavaScript ve dang JSON chuan
var JsConvertJson = JSON.stringify(students); 
console.log(typeof JsConvertJson);
console.log(JsConvertJson);

// lam viec voi kho luu tru du lieu cuc bo tren chinh trinh duyet may tinh
// lam viec dua vao dinh dang ten mien , va trinh duyet su dung tuong ung
// luu y dac trung luu tru du lieu duoi dang key - value
// co the ghi de cac du lieu co cung key   


/*
 
  ban chat localStorage cung co cac tinh chat tuong tu nhu JSON
  Du lieu dua vao duoc dinh dang duoi kieu String

*/
localStorage.setItem('name','Lam');// phuong thuc set de them vao // sua cac du lieu trong kho luu tru
localStorage.setItem('age','26');
var get_data = localStorage.getItem('name');
var get_data_age = localStorage.getItem('age');

console.log(get_data_age);

console.log(get_data);
// set la cac doi tuong

localStorage.setItem('ObjectStudent',JsConvertJson);
var Array_Students = localStorage.getItem('ObjectStudent');// lay ra cac chuoi tuong ung
var daymoilamang = JSON.parse(Array_Students);
console.log('Day la mang',daymoilamang);
for(let object of daymoilamang){
    console.log(object);
}
console.log(Array_Students);
// phuong thuc xoa khoi localStorage
localStorage.removeItem('name');
localStorage.removeItem('age');
localStorage.removeItem('ObjectStudent');



