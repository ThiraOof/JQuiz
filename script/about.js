document.addEventListener("scroll", function () {

    var current = window.pageYOffset;
    var Stepfade1_1 = getOffset(document.getElementById("Stepfade1_1")).top;
    var Stepfade1_2 = getOffset(document.getElementById("Stepfade1_2")).top;
    var Stepfade1_3 = getOffset(document.getElementById("Stepfade1_3")).top;
    var Stepfade2 = getOffset(document.getElementById("Stepfade2")).top;
    var Stepfade3 = getOffset(document.getElementById("Stepfade3")).top;
    var Stepslide1 = getOffset(document.getElementById("Stepslide1")).top;
    var Stepslide2 = getOffset(document.getElementById("Stepslide2")).top;
    var Stepslide3 = getOffset(document.getElementById("Stepslide3")).top;
    if (current >= Stepfade1_1 - screen.height + 200) {
        document.getElementById("Stepfade1_1").classList.add("Out-fade");
    }
    if (current >= Stepfade1_2 - screen.height + 200) {
        document.getElementById("Stepfade1_2").classList.add("Out-fade");
    }
    if (current >= Stepfade1_3 - screen.height + 200) {
        document.getElementById("Stepfade1_3").classList.add("Out-fade");
    }
    if (current >= Stepfade2 - screen.height + 200) {
        document.getElementById("Stepfade2").classList.add("Out-fade");
    }
    if (current >= Stepfade3 - screen.height + 200) {
        document.getElementById("Stepfade3").classList.add("Out-fade");
    }
    if (current >= Stepslide1 - screen.height + 200) {
        document.getElementById("Stepslide1").classList.add("Out-slide");
    }
    if (current >= Stepslide2 - screen.height + 200) {
        document.getElementById("Stepslide2").classList.add("Out-slide");
    }
    if (current >= Stepslide3 - screen.height + 200) {
        document.getElementById("Stepslide3").classList.add("Out-slide");
    }
    var xnxx = document.getElementById("xnxx");
    console.log("translate(" + current / 10 + "%" + ",y)");
    if (current / 30 <= 15) {
        xnxx.style.transform = "translate(0%, -" + current / 30 + "%" + ")"
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
