

const name =  document.querySelector("[name=name]");
const kor =  document.querySelector("[name=kor]");
const eng =  document.querySelector("[name=eng]");
const math =  document.querySelector("[name=math]");

const param = {
    'name' : name.value , 'kor' : kor.value, 'eng': eng.value , 'math' : math.value
}
const url = "/result"

const response = await fetch(url, { method : 'post',
     headers :{'Content-Type' : 'application/json'},
     body : JSON.stringify(param)

})

const data = await response.json()

document.querySelector("#result").innerHTML = data;