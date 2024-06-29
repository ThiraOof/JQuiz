// Header Hover
//==================================================*
[document.getElementById("nav-main")].forEach(function (item) {
  item.addEventListener("mouseover", function () {
    document.getElementById("page-nav").classList.add('is-view');
  })
  item.addEventListener("mouseout", function () {
    document.getElementById("page-nav").classList.remove('is-view');
  })
})

function navBar(item) {
  var barWidth = item.parentElement.offsetWidth;
  var barLeft = item.parentElement.offsetLeft;
  document.getElementById("nav-bar").classList.add("is-view");
  document.getElementById("nav-bar").style.width = `${barWidth}px`;
  document.getElementById("nav-bar").style.left = `${barLeft + 79.07799999999997}px`;
  console.log(barLeft);
}
document.querySelectorAll(".list-link").forEach(function (items) {
  items.addEventListener("mouseover", function () {
    document.getElementById("page-nav").classList.add('is-view');
    var bar = document.getElementById(items.parentElement.getAttribute("bar"));
    var barWidth = bar.offsetWidth;
    var barLeft = bar.offsetLeft;
    console.log(barLeft);
    document.getElementById("nav-bar").classList.add("is-view");
    document.getElementById("nav-bar").style.width = `${barWidth}px`;
    document.getElementById("nav-bar").style.left = `${barLeft + 79.07799999999997}px`;
  })
  items.addEventListener("mouseleave", function () {
    document.getElementById("page-nav").classList.remove('is-view');
  })
})