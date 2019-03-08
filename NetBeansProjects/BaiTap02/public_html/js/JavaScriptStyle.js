var arr = ['Hà Nội', 'TP Hồ Chí Minh', 'Nam Định', 'NewYord', 'Paris', 'Tokyo'];
console.log(arr);
var joinHtml = document.getElementById('select-op');
console.log(joinHtml);
for (var i = 0; i < arr.length; i++) {
    console.log(arr[i]);
}
for (var i = 0; i < arr.length; i++) {
    
    joinHtml.innerHTML += '<option>' + arr[i] + '</option>';
    
    console.log(joinHtml);
}

