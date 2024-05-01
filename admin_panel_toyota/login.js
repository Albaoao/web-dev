document.addEventListener('DOMContentLoaded', function () {
    const loginForm = document.getElementById('login-form');

    loginForm.addEventListener('submit', function (event) {
        event.preventDefault();

        const username = document.getElementById('username').value;
        const password = document.getElementById('password').value;

        // логика аутентификации
        if (username === 'admin' && password === 'qwerty') {
            window.location.href = 'admin-panel.html';
        } else {
            alert('Invalid username or password. Please try again.');
        }
    });
});
