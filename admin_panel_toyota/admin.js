$(document).ready(function() {
    $('.logout-button-container').hide(); 
    
    $('.user-info').click(function() {
      $('.logout-button-container').slideToggle(); // Анимация отображения/скрытия
    });
    
  
    $('.logout-button-container').click(function() {
      alert('You have been logged out.');
      window.location.href = 'login.html';
    });
  });
  $(document).ready(function() {
    // Load users from Local Storage on page load
    loadUsers();

    // Handle create user form submission
    $("#create-user-form").submit(function(e) {
        e.preventDefault();
        createUser();
    });

    // Function to load users from Local Storage
    function loadUsers() {
        const users = JSON.parse(localStorage.getItem('registeredUsers')) || [];
        displayUsers(users);
    }

    // Function to display users in the user list
    function displayUsers(users) {
        const userList = $("#user-list tbody");
        userList.empty();

        users.forEach(user => {
            const row = $("<tr>");
            row.append($("<td>").text(user.firstname));
            row.append($("<td>").text(user.lastname));
            row.append($("<td>").text(user.email));
            row.append($("<td>").text(user.password));

            const statusCell = $("<td>");
            if (user.blocked) {
                statusCell.text("Blocked");
                statusCell.addClass("status-blocked");
            } else {
                statusCell.text("Active");
            }
            row.append(statusCell);

            const actionCell = $("<td>");
            const blockButton = $("<button>").text(user.blocked ? "Unblock" : "Block");
            blockButton.click(function() {
                toggleUserStatus(user.email);
            });
            actionCell.append(blockButton);

            const editButton = $("<button>").text("Edit");
            editButton.click(function() {
                editUser(user.email);
            });
            actionCell.append(editButton);

            const deleteButton = $("<button>").text("Delete");
            deleteButton.click(function() {
                deleteUser(user.email);
            });
            actionCell.append(deleteButton);

            row.append(actionCell);

            userList.append(row);
        });
    }

    // Function to create a new user
    function createUser() {
        const firstname = $("#firstname").val();
        const lastname = $("#lastname").val();
        const email = $("#email").val();
        const password = $("#password").val();

        const users = JSON.parse(localStorage.getItem('registeredUsers')) || [];
        const newUser = { firstname, lastname, email, password, blocked: false };

        const existingUser = users.find(user => user.email === email);
        if (existingUser) {
            alert("This email is already registered. Please use a different email.");
            document.getElementById("email").classList.add("error");
            return;
        }
        else{
            document.getElementById("email").classList.remove("error");
        }

        users.push(newUser);
        localStorage.setItem('registeredUsers', JSON.stringify(users));

        loadUsers();
    }

    // Function to switch user status (block/unblock)
    function toggleUserStatus(email) {
        const users = JSON.parse(localStorage.getItem('registeredUsers')) || [];
        const user = users.find(u => u.email === email);

        if (user) {
            user.blocked = !user.blocked;
            localStorage.setItem('registeredUsers', JSON.stringify(users));
            loadUsers();
        }
    }

    // Function to edit user data
    function editUser(email) {
        const users = JSON.parse(localStorage.getItem('registeredUsers')) || [];
        const user = users.find(u => u.email === email);

        if (user) {
            const newFirstname = prompt("Enter new firstname", user.firstname);
            const newLastname = prompt("Enter new lastname", user.lastname);
            const newPassword = prompt("Enter new password", user.password);

            if (newFirstname !== null && newLastname !== null && newPassword !== null) {
                user.firstname = newFirstname;
                user.lastname = newLastname;
                user.password = newPassword;

                localStorage.setItem('registeredUsers', JSON.stringify(users));
                loadUsers();
            }
        }
    }

    // Function to delete a user
    function deleteUser(email) {
        const users = JSON.parse(localStorage.getItem('registeredUsers')) || [];
        const updatedUsers = users.filter(u => u.email !== email);
        localStorage.setItem('registeredUsers', JSON.stringify(updatedUsers));
        loadUsers();
    }
});
