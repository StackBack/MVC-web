let formReg = document.forms.registerForm;
let valueLogin = formReg.elements.login;
let valueEmail = formReg.elements.email;
let valuePassword = formReg.elements.password;

formReg.onsubmit = function () {
    let obj =({
        login: valueLogin.value,
        email: valueEmail.value,
        password: valuePassword.value
    });
    let json = JSON.stringify(obj);
    let xhr = new XMLHttpRequest();
    console.log(valueLogin.value + " " + valueEmail.value + " " + valuePassword.value);
    xhr.open("POST", "http://localhost:8080/reg");
    xhr.setRequestHeader('Content-type', 'application/json; charset=utf-8');
    console.log(json);
    xhr.send(json);
}
