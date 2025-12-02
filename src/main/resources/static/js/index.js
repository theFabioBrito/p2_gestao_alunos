function toggleTheme() {
    document.body.classList.toggle("dark")
}

document.addEventListener("DOMContentLoaded", function () {

    const toast = document.querySelector(".toast");

    if (toast) {
        setTimeout(() => {
            toast.classList.add("saindo");
        }, 2000);

        setTimeout(() => {
            toast.remove();
        }, 2400);
    }

});