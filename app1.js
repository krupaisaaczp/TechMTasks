const x = document.getElementById("i")

const day = document.getElementById("l")

const night = document.getElementById("b")
function light(){
    x.src="https://cdn-icons-png.flaticon.com/128/1788/1788911.png";
    document.body.style.background = "orange";
}
function dark(){
    x.src="https://cdn-icons-png.flaticon.com/128/4139/4139162.png";
    document.body.style.background = "black";
}