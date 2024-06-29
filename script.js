// nav
var lastscroll = 0;
function nav() {
    let nav_sub = document.getElementById("nav-sub");
    document.getElementById("nav-sub").style.transition = "all 0.2s";
    document.getElementById("nav-sub").style.transform = "scale(1)";
    document.getElementById("nav-sub").style.opacity = "100%";
}
document.addEventListener('mouseleave', function () {
    document.getElementById("nav-sub").style.transition = "all 0.2s";
    document.getElementById("nav-sub").style.transform = "scale(0.9)";
    document.getElementById("nav-sub").style.opacity = "0";
})
/* Scroll Function*/
document.addEventListener("scroll", function () {
    var direct = window.pageYOffset || document.documentElement.scrollTop;

    /* Direct คือ เช็คว่าขึ้นหรือลง */
    if (direct > lastscroll) {
        document.getElementById("nav").classList.add("is-up");
        document.getElementById("nav").classList.remove("is-down");

    } else {
        document.getElementById("nav").classList.add("is-down");
        document.getElementById("nav").classList.remove("is-up");
    }
    lastscroll = direct;
    // Game
    if ((window.pageYOffset > 1500) && (window.pageYOffset < 2200)) {
        document.getElementById('body').style.background = "black";
        document.querySelectorAll(".change").forEach(function (element) {
            if (!(element.className.includes("Bg-black"))) {
                element.className += " Bg-black";
            }
        });
    } else {
        document.getElementById('body').style.background = "white";
        document.querySelectorAll(".Bg-black").forEach(function (element) {
            element.classList.remove("Bg-black");
        })
        // ถ้ามี change เอาคลาส Bg-black ออก
    }
    var current = window.pageYOffset;
    var Step1 = getOffset(document.getElementById("Step1")).top;
    var Step2 = getOffset(document.getElementById("Step2")).top;
    var Step3 = getOffset(document.getElementById("Step3")).top;
    var Step4 = getOffset(document.getElementById("Step4")).top;
    var Step5 = getOffset(document.getElementById("Step5")).top;
    var Step6 = getOffset(document.getElementById("Step6")).top;
    var Step7 = getOffset(document.getElementById("Step7")).top;    
    if (current >= Step1-700) {
        $(".New-title").addClass("Meeted");
    }
    if (current >= Step2-700) {
        $(".Scale-img").addClass("Meeted");
        $(".New-img").addClass("appear");
    }
    if (current >= Step3-700) {
        $(".Career-title").addClass("Meeted");
    }
    if (current >= Step4-700) {
        $(".Scale-img-career").addClass("Meeted");
        $(".Careers-img").addClass("appear");

    }
    if (current >= Step5-700) {
        $(".games").addClass("Meeted");
    }
    if (current >= Step6-700) {
        $(".MainStudios-text").addClass("Meeted");
    }
    if (current >= Step7-700) {
        $(".Studio-frame").addClass("Meeted");
    }
})

/*Studio Hover*/

function StudiosOver() {
    $(this).addClass("activate").siblings("div").removeClass("activate");
}
$(document).on("mouseover", ".Frame-card", StudiosOver);

// Career
document.getElementById('Careers-content1').addEventListener("mouseover", function () {
    document.getElementById("arrow-link1").style.transform = "translateX(10px)";
})
document.getElementById('Careers-content1').addEventListener("mouseleave", function () {
    document.getElementById("arrow-link1").style.transform = "translateX(0px)";
})
document.getElementById('Careers-content2').addEventListener("mouseover", function () {
    document.getElementById("arrow-link2").style.transform = "translateX(10px)";
})
document.getElementById('Careers-content2').addEventListener("mouseleave", function () {
    document.getElementById("arrow-link2").style.transform = "translateX(0px)";
})
/* Footer Family */
function Footerfamily() {
    let show = document.getElementById("Footer-list").style.height;
    if (document.getElementById("Footer-list").style.height == "0px") {
        document.getElementById("Footer-list").style.transform = "scaleY(1)";
        document.getElementById("Footer-list").style.height = "180px";
        document.getElementById("Footer-list").style.opacity = "100%";
    }
    else {
        document.getElementById("Footer-list").style.height = "0px";
        document.getElementById("Footer-list").style.opacity = "0%";
        document.getElementById("Footer-list").style.transform = "scaleY(0)";

    }
}
// Studio Game
// $('#draggable').draggable();
function getOffset(el) {
    const rect = el.getBoundingClientRect();
    return {
        left: rect.left + window.scrollX,
        top: rect.top + window.scrollY,
        bottom: rect.bottom + window.scrollY
    };
}