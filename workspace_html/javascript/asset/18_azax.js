window.addEventListener('load', function(){

    bind()
    
})

function bind(){
    const btn1 = document.querySelector('#btn1')
    btn1.addEventListener('click', function(){
        
        // ajax object 생성
        const xhr = new XMLHttpRequest();

        // 보낼 준비
        // 방식mehtod, 주소
        xhr.open('get','https://jsonplaceholder.typicode.com/users')

        // 보내기
        xhr.send()
        console.log(0, xhr.responseText)

        xhr.onload = function(){
            console.log('다녀왔어')
            console.log(xhr.responseText)

            // 깜짝퀴즈
            // 두번째 사람의 이름을 출력한다
            // 세번째 사람의 lat를 출력한다
            const a=JSON.parse(xhr.responseText)
            console.log(a[1]['name'])
            console.log(a[2]['address']['geo']['lat'])
        }

        

    })


    const btn2 = document.querySelector('#btn2')
    btn2.addEventListener('click', function(){
     // ajax object 생성
        const xhr = new XMLHttpRequest();

        // 보낼 준비
        // 방식mehtod, 주소
        xhr.open('get', '17_json.html')

        // 보내기
        xhr.send()
        console.log(0, xhr.responseText)

        xhr.onload = function(){
            console.log(xhr.responseText)
        }
    })


    const btn3 = document.querySelector('#btn3')
    btn3.addEventListener('click', function(){
    
        const xhr = new XMLHttpRequest();

        const key = '627412863471962df971a95288237fc4f567806731af621b6ef355b5d974e765'
        let url = 'http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtFcst'
        url += '?serviceKey='+ key
        url += '&numOfRows=1000'
        url += '&pageNo=1'
        url += '&dataType=JSON'
        url += '&base_date=20260212'
        url += '&base_time=1300'
        url += '&nx=63'
        url += '&ny=110'


        xhr.open('get', url)
        xhr.send()
        console.log(0, xhr.responseText)

        xhr.onload = function(){
            console.log(JSON.parse(xhr.responseText))
             // 첫 번째 자료의 category, fcstValue 출력
            const an = JSON.parse(xhr.responseText)
            an.response.body.items.item[0].category
            console.log(an.response.body.items.item[0].category)
            an.response.body.items.item[0].fcstValue
            console.log(an.response.body.items.item[0].fcstValue)
            // 카테고리가 T1H(기온), RN1(강수량), REH(습도) 모두 출력

            // 이렇게도 해보자
            // let json ={}
            // json.T1H = {}
            // json['RN1'] = {}
            // json['REH'] = {}
            // json['1400'] = {}

            let json = {}

            for(i in an.response.body.items.item){
                if(an.response.body.items.item[i].category == 'T1H'){
                    console.log(an.response.body.items.item[i])
                    /*
                        <tr>
                            <td>1400</td>
                            <td>8</td>
                        </tr>
                        <tr>
                            <td>1400</td>
                            <td>8</td>
                        </tr>

                    */
                   document.querySelector('#temp').innerHTML += `
                        <tr>
                            <td>${an.response.body.items.item[i].fcstTime}</td>
                            <td>${an.response.body.items.item[i].fcstValue}</td>
                        </tr>
                    `

                    if(!json[an.response.body.items.item[i].fcstTime]){
                        json[an.response.body.items.item[i].fcstTime] = {}
                    }
                    json[an.response.body.items.item[i].fcstTime][json[an.response.body.items.item[i].category]] =json[an.response.body.items.item[i].fcstTime]

                }
                if(an.response.body.items.item[i].category == 'RN1'){
                    console.log(an.response.body.items.item[i])
                }
                if(an.response.body.items.item[i].category == 'REH'){
                    console.log(an.response.body.items.item[i])
                }
            }     
        }
    })

    const btn4 = document.querySelector('#btn4')
    btn4.addEventListener('click', function(){
        // const xhr = new XMLHttpRequest();
        // xhr.open('get','https://jsonplaceholder.typicode.com/users')
        // xhr.send()
        // xhr.onload = function(){
            
        //     let response = xhr.responseText
        //     let json = JSON.parse(response)
        //     console.log(json)

        // }

        const url = 'https://jsonplaceholder.typicode.com/users'
        const option = {
            method: 'get'
        }
        fetch(url, option).then(function(response){
            return response.json()
        }).then(function(json){
            console.log(json)
        }).catch(function(error){
            console.error(error)
        })


    })
    const btn5 = document.querySelector('#btn5')
    btn5.addEventListener('click', function(){
        const xhr = new XMLHttpRequest();
        xhr.open('get','https://jsonplaceholder.typicode.com/users')
        xhr.send()
        xhr.onreadystatechange = function(){
            console.log(xhr.readyState)
            if(xhr.readyState ==4){
                if(xhr.readyState ==XMLHttpRequest.DONE){
                    console.log("다녀왔어")
                }
                
            }
        }
    })

    const btn6 = document.querySelector('#btn6')
    btn6.addEventListener('click', function(){

        $.ajax({
            url : 'https://jsonplaceholder.typicode.com/users',
            type : 'get', // method
            success : function(data){
                console.log('성공')
                // 자동으로 json으로 바뀌어 온다
                console.log(data)
            }, error: function(error){
                console.log('실패')
                console.log(error)

            }, complete : function(){
                console.log('무조건 실행')
            }
        })
    })    

    const btn7 = document.querySelector('#btn7')
    btn7.addEventListener('click', function(){

        $.ajax({
           url : 'https://jsonplaceholder.typicode.com/users',
            type : 'get' // method
        }).done(function(data){
                console.log('성공')
                // 자동으로 json으로 바뀌어 온다
                console.log(data)}).fail(function(error){
                console.log('실패')
                console.log(error)
            }).always(function(){
                console.log('무조건 실행')
            })
    })    
    
    btn4.addEventListener('click', async function(){
        // const xhr = new XMLHttpRequest();
        // xhr.open('get','https://jsonplaceholder.typicode.com/users')
        // xhr.send()
        // xhr.onload = function(){
            
        //     let response = xhr.responseText
        //     let json = JSON.parse(response)
        //     console.log(json)

        // }

        const url = 'https://jsonplaceholder.typicode.com/users'
        const option = {
            method: 'get'
        }
        // fetch(url, option).then(function(response){
        //     return response.json()
        // }).then(function(json){
        //     console.log(json)
        // }).catch(function(error){
        //     console.error(error)
        // })

        let response = await fetch(url, option)
        let json = await response.json()
        console.log(json)
    })


}