window.addEventListener('load', function(){

    bind()
    
})


function bind(){
    // --- [1] 할 일 리스트 로직 (이벤트 위임) ---
    document.querySelector('.parent').addEventListener('click', function(evt){ 
        // 추가 버튼 클릭
        if(evt.target.id === "bt"){
            const input = this.querySelector('#todo');
            const text = input.value;
            if(!text) return alert("할 일을 입력해주세요!");

            const divfirst = document.createElement('div');
            divfirst.setAttribute('class', 'first');
            
            // 체크박스 생성
            const xs = document.createElement('input');
            xs.setAttribute('type',"checkbox");
            xs.setAttribute('class',"check");
            
            // 할 일 텍스트 생성
            const div2 = document.createElement('div');
            div2.setAttribute('class', 'todo');
            div2.innerText = text;

            // 개별 삭제 버튼 생성
            const del = document.createElement('button');
            del.setAttribute('class', 'del');
            del.innerText = '삭제';

            // 조립
            divfirst.append(xs, div2, del);
            this.querySelector('#bt').after(divfirst);
            input.value = ""; // 입력창 초기화
        }
        
        // 개별 삭제 버튼
        if(evt.target.classList.contains('del')){
            evt.target.parentNode.remove();
        }
        
        // 선택 삭제 버튼 (상단 '전체삭제' 버튼)
        if(evt.target.classList.contains('delete')){
            document.querySelectorAll('.check').forEach(i => {
                if(i.checked) i.parentNode.remove();
            });
        }
    });

    // 체크박스 상태 동기화 (전체 선택 <-> 개별 선택)
    document.querySelector('.parent').addEventListener('change', function(evt){
        const allCheck = this.querySelector('.all');
        const checks = this.querySelectorAll('.check');

        if (evt.target.classList.contains('all')) {
            checks.forEach(c => c.checked = evt.target.checked);
        }

        if (evt.target.classList.contains('check')) {
            allCheck.checked = [...checks].every(c => c.checked);
        }
    });

    // --- [2] 가짜 로그인 로직 ---
    const mid1Element = document.querySelector('#mid1');
    if(mid1Element) {
        mid1Element.addEventListener('click', function(evt){
            if(evt.target.id === "loginbtn"){
                const userId = document.querySelector('#userId').value;
                const userPw = document.querySelector('#userPw').value;

                // 테스트용 계정: admin / 1234
                if(userId === "admin" && userPw === "1234"){
                    alert(userId + "님, 환영합니다!");
                    document.querySelector('#login1').innerHTML = 
                        `<strong>${userId}</strong>님 접속 중 <button id="logoutbtn">로그아웃</button>`;
                } else {
                    alert("아이디 또는 비밀번호가 틀렸습니다.\n(ID: admin / PW: 1234)");
                }
            }

            if(evt.target.id === "logoutbtn"){
                location.reload(); // 로그아웃 시 페이지 새로고침
            }
        });
    }
}


    
