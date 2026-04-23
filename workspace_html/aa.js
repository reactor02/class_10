document.addEventListener('load', function(){
    bind()
})

function bind(){
    const myModal = document.getElementById('myModal')
    const btnRegister = document.getElementsByClassName("btn-register")
    btnRegister.addEventListener('click', function(e){
        e.preventDefault()
        e.stopPropagation()
        myModal.showModal()


    } )

}