document.addEventListener("scroll", function(){
    let winHeight = window.pageYOffset;
    if ((winHeight > 700)){
        document.getElementById('btnPage').classList.add('lock');
    }else{
        document.getElementById('btnPage').classList.remove('lock');
    }
    if (winHeight <= 0){
        document.getElementById('btnPage').style.opacity = "0";
    }else{
        document.getElementById('btnPage').style.opacity = "100%";
    }
})