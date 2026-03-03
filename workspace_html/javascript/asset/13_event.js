console.log('hello js')

    const btn1 = document.getElementById('bt1')
    console.log(1, btn1)
    
    // window.onload = init;
    window.addEventListener('load', init)
    
    function init(){
        const btn1 = document.getElementById('bt1')
        console.log(2, 'btn1' , btn1)

        game.style.left = '10px'
        game.style.top = '300px'

        bind()
    }

    function btn3click(){
        const log =document.querySelector('#log')
        log.innerHTML += '<br>버튼3 클릭'
    }


    function bind(){
        const log =document.querySelector('#log')
        const bt1 = document.querySelector('#bt1') 
        bt1.onclick = function(){
            log.innerHTML += '<br>버튼1 클릭'
        } 
        
        // onclick은 변수라서 하나의 값만 저장된다
        bt1.onclick = function(){
            log.innerHTML += '<br>버튼1 click'
        }

        // addEventListener : 동일한 이벤트에 여러 함수를 추가할 수 있다
        const btn2 = document.querySelector('#bt2')
        btn2.addEventListener('click', function(){
            log.innerHTML += '<br>버튼2 click'
        })
        btn2.addEventListener('click', function(){
            log.innerHTML += '<br>버튼2 클릭'
        })
        
        // 로그인 버튼을 눌렀을 때
        // 아이디와 비밀번호가 비어있지 않다면
        //      아이디, 비밀번호 출력
        // 하나라도 비어있다면 
        //      아이디는 필수입니다
        //      비밀번호는 필수입니다 출력

        
        const login = document.querySelector('#login')
        login.addEventListener('click', () => {
            if (id.value.trim() && pw.value.trim().length != 0 ){
                const id = document.querySelector('#id')
                const pw = document.querySelector('#pw')
                // log.log(id.value)
                // log.log(pw.value)
                log.innerHTML = 'id :' + id.value + '<br> pw : ' + pw.value
                log.innerHTML =  `${id.value} , ${pw.value}`
            }else{
                if(!(id.value.trim())){
                    log.innerHTML += '<br>아이디는 필수입니다'
                }
                if(!(pw.value.trim())){
                    log.innerHTML += '<br>비밀번호는 필수입니다'
                }

            } 
            
        })


        const id = document.querySelector('#id')
        document.querySelector('#id').addEventListener('keydown', function(){
            log.innerHTML += '<br>keydown 발생'
        })
        document.querySelector('#id').addEventListener('keyup', function(evt){
            log.innerHTML += '<br>keyup 발생'
            console.log(evt)
            console.log(evt.key)
            console.log(evt.keyCode)
            console.log(evt.shiftKey)
            console.log(evt.ctrlKey)
            console.log(evt.altKey)

            if(evt.ctrlKey == true && evt.keyCode ==67){
                alert('복사감지')
            }
        })

        // 엔터를 치면
        // "엔터 빵11"
        document.querySelector('#id').addEventListener('keyup', function(evt){
            if(evt.keyCode == 13){
                log.innerHTML += '<br>엔터 빵!!'

                document.querySelector('#pw').focus() // DOM에 focus 발생
            }
            
        })

        document.querySelector('#pw').addEventListener('keyup', function(evt){
            if(evt.keyCode == 13){
                document.querySelector('#login').click() // DOM에 click 발생
            }
        })

        // const area = document.getElementById('area')
        const bt4 = document.querySelector('#bt4')
        bt4.addEventListener('click', bt4click)
         // removeEventListener
        // 이벤트 제거
        // 단, 익명함수는 불가능   
        bt4.removeEventListener('click', bt4click)

        document.querySelector('body').addEventListener('keydown', function(event){
            console.log('body event.KeyCode :', event.keyCode)
           

            const game = document.querySelector('#game')
            console.log('game.style.left : ', game.style.left)
            console.log('game.style.top : ', game.style.top)
            if(event.keyCode == 39){ // 오른쪽
                // game.style.left == '10px'
                // parseInt(game.style.left) // 10
                // game.style.left.split('px')[0] // 10
                game.style.left = (parseInt(game.style.left) + 10) + 'px'
            }else if(event.keyCode == 37) {// 왼쪽
                game.style.left = (parseInt(game.style.left) - 10) + 'px'
            }else if(event.keyCode == 40) { // 아래
                game.style.top = (parseInt(game.style.top) + 10) + 'px'
            }else if(event.keyCode == 38) { // 위
                game.style.top = (parseInt(game.style.top) - 10) + 'px'
            }
        })

        document.querySelector('#top').addEventListener('click', function(event){
            console.log(document.documentElement.scrollTop)
            // document.documentElement.scrollTop = 0
            // window.scrollTo({
            //     top: 0, 
            //     behavior: 'smooth'
            // })

            // 계산 결과가 실시간으로 빠르게 반영되진 않는다
            // let top = document.documentElement.scrollTop
            // while(top > 0){
            //     document.documentElement.scrollTop -=10
            //     top = document.documentElement.scrollTop
            // }

            // 시간에 따라서 setTimeout을 대량으로 만들어서
            // 부드럽게 보이길 예상하는

            // for(let i =document.documentElement.scrollTop; i>0; i -= 10 ){
            //     let delay = 2000-i
            //     setTimeout(function(){
            //         document.documentElement.scrollTop = i
            //     }, delay);
            // }
            
        })

        window.addEventListener('scroll', function(){
            console.log('window.scrollY :', this.window.scrollY)
        })

        
        function bt4click(){
            const log =document.querySelector('#log')
            log.innerHTML += '<br>버튼1 click'
        }


        















    }