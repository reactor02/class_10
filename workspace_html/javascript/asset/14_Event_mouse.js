window.onload = function(){
    const cursor = document.querySelector('#cursor')
    cursor.style.top = '0px'
    cursor.style.left = '0px'
    bind()
     
}

function bind(){
    
    const log = document.querySelector('#log')
    const area = document.querySelector('#area')
    // 마우스 오른쪽 버튼 방지
    area.oncontextmenu = function(){
        return false
    }
   
    // area.addEventListener('contextmenu', function(){
    //     // alert(1)
    //     return false // 안먹음
    //      // 추후에 event.preventDefault() 배우면 가능
    // })

    // 마우스로 drag 방지
    area.onselectstart = function(){
        return false
    }

    area.addEventListener('dblclick', function(){
        let div = document.createElement('div')
        div.innerHTML = '더블클릭 발생'
        log.prepend(div)
    })

    area.addEventListener('mousedown', function(){
        let div = document.createElement('div')
        div.innerHTML = 'mousedown 발생'
        log.prepend(div)
    })

    area.addEventListener('mouseup', function(){
        let div = document.createElement('div')
        div.innerHTML = 'mouseup 발생'
        log.prepend(div)
    })
    area.addEventListener('click', function(evt){
        // let div = document.createElement('div')
        // div.innerHTML = 'click 발생'
        // log.prepend(div)

        /*
            offset  : DOM 좌상단 기준
            page : 스크롤에 관계없이 문서 좌상단 기준
            client : 지금 보이는 화면 좌상단 기준
            screen : 모니터 좌상단 기준
        */

        console.log('offsetY',evt.offsetY)
        console.log('pageY',evt.pageY)
        console.log('clientY',evt.clientY)
        console.log('screenY',evt.screenY)
        showLog('click 발생')
    })
    area.addEventListener('mouseover', function(){
        showLog('mouseover 발생')
        area.style.backgroundColor = 'yellow'
    })
    // area.addEventListener('mouseenter', function(){
    //     showLog('mouseenter 발생')
    //     area.style.backgroundColor = 'yellow'
    // })
    // area.addEventListener('mouseleave', function(){
    //     showLog('mouseleave 발생')
    //     area.style.backgroundColor = 'white'
    // })
    area.addEventListener('mouseout', function(){
        showLog('mouseout 발생')
        area.style.backgroundColor = 'white'
    })
    area.addEventListener('mousemove', function(evt){        
        const offsetX = evt.offsetX
        const offsetY = evt.offsetY
        showLog(`offsetX: ${offsetX}, offsetY : ${offsetY}`)

        document.querySelector('body').addEventListener('mousemove',function(evt){
            const cursor = document.querySelector('#cursor')
        })

    })
    
    // const cursor1 = document.querySelector('body')
    // cursor1.addEventListener('mousemove',function(evt){
    //     const pageY = evt.pageY
    //     const pageX = evt.pageX
    //     cursor.style.top = pageY +'px'
    //     cursor.style.left = pageX + 'px'
    //     showLog(`pageX: ${pageX}, pageY : ${pageY}`)
    // })
    
    
    document.querySelector('body').addEventListener('mousemove', function(evt){
        // 마우스 따라다니는 코드
        // 단, 마우스 눌렀을 때만
        if(isDrag){
            let drag = document.querySelector('#drag')
            drag.style.top = (evt.pageY - drag_offset_y)+ 'px'
            drag.style.left = (evt.pageX - drag_offset_x) + 'px'
        }
    })
    document.querySelector('#drag').addEventListener('mousedown', function(evt){
        isDrag = true
        drag_offset_x = evt.offsetX
        drag_offset_y = evt.offsetY
    })
    document.querySelector('#drag').addEventListener('mouseup', function(evt){
        isDrag = false
    })
}
let isDrag = false;
let drag_offset_x = 0;
let drag_offset_y = 0;

function showLog(msg){
    let div = document.createElement('div')
        div.innerHTML = msg
        log.prepend(div)
}
