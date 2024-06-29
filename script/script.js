// Banner
//==================================================*
function studioOver(item) {
    document.querySelectorAll(".studio-item").forEach(function (card) {
        card.classList.remove("is-active");
    })
    item.classList.add("is-active");
}
//Scroll
// =================================================*
var lastScrollTop = 0;
document.addEventListener("scroll", function () {
    var direct = window.pageYOffset || document.documentElement.scrollTop;
    if (direct > lastScrollTop) {
        document.getElementById("page-nav").classList.add("is-up");
        document.getElementById("page-nav").classList.remove("is-down");
    } else {
        document.getElementById("page-nav").classList.add("is-down");
        document.getElementById("page-nav").classList.remove("is-up");
    }
    lastScrollTop = direct;
    document.querySelectorAll(".a-opacity").forEach(function (item) {
        var rect = item.getBoundingClientRect();
        if (item.getBoundingClientRect().top <= 1000) {
            item.classList.add("is-opacity");
        }
    })
    if ((document.getElementById("games").getBoundingClientRect().top <= 500) && (document.getElementById("games").getBoundingClientRect().top >= -500)) {
        document.querySelectorAll(".bg-white").forEach(function (element) {
            element.classList.replace("bg-white", "bg-black");
        })

    } else {
        document.querySelectorAll(".bg-black").forEach(function (element) {
            element.classList.replace("bg-black", "bg-white");
        })
    }
    if (document.getElementById("footer").getBoundingClientRect().top <= 1000) {
        document.getElementById("btnTop").classList.add("is-stop");
    } else {
        document.getElementById("btnTop").classList.remove("is-stop");
    }
    if (document.getElementById("careers").getBoundingClientRect().top <= 800) {
        document.getElementById("btnTop").classList.add("is-open");
    } else {
        document.getElementById("btnTop").classList.remove("is-open");
    }
})
