function toggleTheme() {
    document.body.classList.toggle("dark")
}

setTimeout(() => {
    document.querySelectorAll('.toast').forEach(toast => toast.remove());
}, 3500);