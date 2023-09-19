const footer = document.getElementById("footer");

window.addEventListener("scroll", () => {
    const scrollY = window.scrollY;
    const windowHeight = window.innerHeight;
    const pageHeight = document.body.scrollHeight;

    // Check if the user has scrolled to the bottom
    if (scrollY + windowHeight >= pageHeight) {
        footer.style.bottom = "0";
    } else {
        footer.style.bottom = "-100px";
    }
});