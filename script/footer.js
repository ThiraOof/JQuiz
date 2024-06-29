function Footerfamily() {
    let show = document.getElementById("Footer-list").style.height;
    if (document.getElementById("Footer-list").style.height == "0px") {
        document.getElementById("Footer-list").style.transform = "scaleY(1)";
        document.getElementById("Footer-list").style.height = "180px";
        document.getElementById("Footer-list").style.opacity = "100%";
        document.getElementById("Footer-family-img").style.transform = "rotate(45deg)";
    }
    else {
        document.getElementById("Footer-list").style.height = "0px";
        document.getElementById("Footer-list").style.opacity = "0%";
        document.getElementById("Footer-list").style.transform = "scaleY(0)";
        document.getElementById("Footer-family-img").style.transform = "rotate(0deg)";

    }
}