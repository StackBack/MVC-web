let loginForm = document.forms.loginForm;
let valEmail =loginForm.elements.email;
let valPassword =loginForm.elements.password;

loginForm.onsubmit = function () {
    let obj =({
        email: valEmail.value,
        password: valPassword.value,
    });
    let json = JSON.stringify(obj);
    let xhr = new XMLHttpRequest();
    console.log(valEmail.value + " " + valPassword.value);
    xhr.open("POST", "http://localhost:8080/login");
    xhr.setRequestHeader('Content-type', 'application/json; charset=utf-8');
    xhr.send(json);
}