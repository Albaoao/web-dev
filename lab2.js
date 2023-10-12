function showLoginPage() {
    document.getElementById('registration').classList.remove('active');
    document.getElementById('login').classList.add('active');
    document.getElementById('home').classList.remove('active');
}

function showHomePage() {
    document.getElementById('registration').classList.remove('active');
    document.getElementById('login').classList.remove('active');
    document.getElementById('home').classList.add('active');
}