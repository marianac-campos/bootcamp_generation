let nome = document.querySelector('#nome')
let email = document.querySelector('#email')
let assunto = document.querySelector('#assunto')

nome.style.width = '32%'
email.style.width = '32%'
assunto.style.width = '32%'

function validaNome() {
    
    let txtNome = document.querySelector('#txtNome')

    if(nome.value.length < 5) {
        txtNome.innerHTML = "Valor inválido!"
        txtNome.style.color = 'red'
    } else {
        txtNome.innerHTML = ""
    }
}

function validaEmail() {

    let txtEmail = document.querySelector('#txtEmail')

    if(email.value.indexOf('@' && '.com') == -1) {
        txtEmail.innerHTML = "Email inválido!"
        txtEmail.style.color = 'red'
    } else {
        txtEmail.innerHTML = ""
    }
}