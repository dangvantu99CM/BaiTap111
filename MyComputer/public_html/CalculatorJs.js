var arrStack = new Array();
var veiwTextFeild = null;
var veiwTextResult = null;
var loaded = document.addEventListener('DOMContentLoaded', function () {

    veiwTextFeild = document.getElementById("veiw-text");
    veiwTextFeild.addEventListener('focus', function () {
        veiwTextFeild.classList.remove("Error");
    });
    veiwTextResult = document.getElementById("result");

});
function show(value) {

    veiwTextFeild.value += value;

}
function getAns() {

    veiwTextFeild.value = veiwTextResult.value;
}

function show_reset() {
    veiwTextFeild.value = "";
    veiwTextResult.value = "";

}
function button_js_def() {

    if (veiwTextFeild.value.length === 0) {
        
        return;
    }
    veiwTextFeild.classList.remove("Error");
    veiwTextFeild.value = veiwTextFeild.value.substring(0, veiwTextFeild.value.length - 1);

}
;

function evaluate1() {

    if (!checked() || !checkNgoac()) {

        veiwTextFeild.classList.add("Error");

        return;
    }
    console.log(veiwTextFeild.value);
    veiwTextResult.value = eval(veiwTextFeild.value);

}

function checked() {

    for (var i = 0; i < veiwTextFeild.value.length - 1; i++) {

        if (veiwTextFeild.value.charAt(i) === veiwTextFeild.value.charAt(i + 1) && veiwTextFeild.value.charAt(i) === '*') {
            
            return false;
        }
        if (veiwTextFeild.value.charAt(i) === veiwTextFeild.value.charAt(i + 1) && veiwTextFeild.value.charAt(i) === '/') {
            
            return false;
        }
        if (veiwTextFeild.value.charAt(i) === veiwTextFeild.value.charAt(i + 1) && veiwTextFeild.value.charAt(i) === '-') {
            
            return false;
        }
        if (veiwTextFeild.value.charAt(i) === veiwTextFeild.value.charAt(i + 1) && veiwTextFeild.value.charAt(i) === '+') {
            
            return false;
        }

    }
    if (veiwTextFeild.value.charAt(0) === '*' || veiwTextFeild.value.charAt(0) === '/') {
        
        return false;
    }
    if (veiwTextFeild.value.charAt(veiwTextFeild.value.length - 1) === '*' || veiwTextFeild.value.charAt(veiwTextFeild.value.length - 1) === '/' || veiwTextFeild.value.charAt(veiwTextFeild.value.length - 1) === '+' || veiwTextFeild.value.charAt(veiwTextFeild.value.length - 1) === '-') {
        

        return false;
    }
    return true;
}

function checkNgoac() {
    for (var i = 0; i < veiwTextFeild.value.length; i++) {

        if (veiwTextFeild.value.charAt(i) === '(') {
            arrStack.push(veiwTextFeild.value.charAt(i));
        } else if (veiwTextFeild.value.charAt(i) === ')') {
            if (arrStack.length === 0) {
                return false;
            } else {
                arrStack.pop();
            }

        }
    }
    if (arrStack.length === 0)
        return true;
    if (arrStack.length !== 0)
        return false;

}







