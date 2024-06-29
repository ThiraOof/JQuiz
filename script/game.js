document.addEventListener("scroll", function () {
    /*
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
    }*/

    var current = window.pageYOffset;
    var Card1 = getOffset(document.getElementById("Card1")).top;
    var Card2 = getOffset(document.getElementById("Card2")).top;
    var Card3 = getOffset(document.getElementById("Card3")).top;
    var Card4 = getOffset(document.getElementById("Card4")).top;
    var Card5 = getOffset(document.getElementById("Card5")).top;
    var Card6 = getOffset(document.getElementById("Card6")).top;
    var Card7 = getOffset(document.getElementById("Card7")).top;
    var Card8 = getOffset(document.getElementById("Card8")).top;
    var Card9 = getOffset(document.getElementById("Card9")).top;
    var Card10 = getOffset(document.getElementById("Card10")).top;
    var Card11 = getOffset(document.getElementById("Card11")).top;

    if (current >= Card2 - screen.height + 200) {
        document.getElementById("Card2").classList.add("Section-line");
        document.getElementById("Card2").classList.add("Fade-in");
        document.getElementById("Card2-img").classList.add("Img-slideup");
        document.getElementById("Card2-site").classList.add("Text-slide");
    }
    if (current >= Card3 - screen.height + 200) {
        document.getElementById("Card3").classList.add("Section-line");
        document.getElementById("Card3").classList.add("Fade-in");
        document.getElementById("Card3-img").classList.add("Img-slideup");
        document.getElementById("Card3-site").classList.add("Text-slide");
    }
    if (current >= Card4 - screen.height + 200) {
        document.getElementById("Card4").classList.add("Section-line");
        document.getElementById("Card4").classList.add("Fade-in");
        document.getElementById("Card4-img").classList.add("Img-slideup");
        document.getElementById("Card4-site").classList.add("Text-slide");
    }
    if (current >= Card5 - screen.height + 200) {
        document.getElementById("Card5").classList.add("Section-line");
        document.getElementById("Card5").classList.add("Fade-in");
        document.getElementById("Card5-img").classList.add("Img-slideup");
        document.getElementById("Card5-site").classList.add("Text-slide");
    }
    if (current >= Card6 - screen.height + 200) {
        document.getElementById("Card6").classList.add("Section-line");
        document.getElementById("Card6").classList.add("Fade-in");
        document.getElementById("Card6-img").classList.add("Img-slideup");
        document.getElementById("Card6-site").classList.add("Text-slide");
    }
    if (current >= Card7 - screen.height + 200) {
        document.getElementById("Card7").classList.add("Section-line");
        document.getElementById("Card7").classList.add("Fade-in");
        document.getElementById("Card7-img").classList.add("Img-slideup");
        document.getElementById("Card7-site").classList.add("Text-slide");
    }
    if (current >= Card8 - screen.height + 200) {
        document.getElementById("Card8").classList.add("Section-line");
        document.getElementById("Card8").classList.add("Fade-in");
        document.getElementById("Card8-img").classList.add("Img-slideup");
        document.getElementById("Card8-site").classList.add("Text-slide");
    }
    if (current >= Card9 - screen.height + 200) {
        document.getElementById("Card9").classList.add("Section-line");
        document.getElementById("Card9").classList.add("Fade-in");
        document.getElementById("Card9-img").classList.add("Img-slideup");
        document.getElementById("Card9-site").classList.add("Text-slide");
    }
    if (current >= Card10 - screen.height + 200) {
        document.getElementById("Card10").classList.add("Section-line");
        document.getElementById("Card10").classList.add("Fade-in");
        document.getElementById("Card10-img").classList.add("Img-slideup");
        document.getElementById("Card10-site").classList.add("Text-slide");
    }
    if (current >= Card11 - screen.height + 200) {
        document.getElementById("Card11").classList.add("Section-line");
        document.getElementById("Card11").classList.add("Fade-in");
        document.getElementById("Card11-img").classList.add("Img-slideup");
        document.getElementById("Card11-site").classList.add("Text-slide");
    }
    if (current >= Card11 - screen.height + 200) {
        document.getElementById("Card11").classList.add("Section-line");
    }
})

// $('#draggable').draggable();
function getOffset(el) {
    const rect = el.getBoundingClientRect();
    return {
        left: rect.left + window.scrollX,
        top: rect.top + window.scrollY,
        bottom: rect.bottom + window.scrollY
    };
}
