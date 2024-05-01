function myMenuFunction() {
  var i = document.getElementById("navMenu");
  if(i.className === "nav-menu") {
      i.className += " responsive";
  } else {
      i.className = "nav-menu";
  }
 }
  $(document).ready(function () {
    // Анимация при переключении на форму входа
    $("#loginBtn").click(function () {
      $("#login").animate({ left: "5px" }, 300);
      $("#register").animate({ right: "-510px" }, 300);
      $("#loginBtn").addClass("white-btn");
      $("#registerBtn").removeClass("white-btn");
      $("#login").animate({ opacity: 1 }, 300);
      $("#register").animate({ opacity: 0 }, 300);
    });
  
    // Анимация при переключении на форму регистрации
    $("#registerBtn").click(function () {
      $("#login").animate({ left: "-510px" }, 300);
      $("#register").animate({ right: "5px" }, 300);
      $("#loginBtn").removeClass("white-btn");
      $("#registerBtn").addClass("white-btn");
      $("#login").animate({ opacity: 0 }, 300);
      $("#register").animate({ opacity: 1 }, 300);
    });

    // Анимация при переключении на форму входа
    $("#SignInBtn").click(function () {
      $("#login").animate({ left: "5px" }, 300);
      $("#register").animate({ right: "-510px" }, 300);
      $("#SignInBtn").addClass("white-btn");
      $("#SignUpBtn").removeClass("white-btn");
      $("#login").animate({ opacity: 1 }, 300);
      $("#register").animate({ opacity: 0 }, 300);
  });

    // Анимация при переключении на форму регистрации
  $("#SignUpBtn").click(function () {
      $("#login").animate({ left: "-510px" }, 300);
      $("#register").animate({ right: "5px" }, 300);
      $("#SignInBtn").removeClass("white-btn");
      $("#SignUpBtn").addClass("white-btn");
      $("#login").animate({ opacity: 0 }, 300);
      $("#register").animate({ opacity: 1 }, 300);
  });   
});
function validateLoginForm() {
// Login form validation
var loginEmail = document.getElementById("login-email").value;
var loginPassword = document.getElementById("login-password").value;

if (loginEmail === "" && loginPassword === "") {
  alert("Please fill in all login fields.");
  document.getElementById("login-email").classList.add("error"); 
  document.getElementById("login-password").classList.add("error");
  return false;
}

// Check if required fields are not empty
if (loginEmail === "") {
alert("Please enter your email address.");
document.getElementById("login-email").classList.add("error");
return false;
} else if (!/\S+@\S+\.\S+/.test(loginEmail)) {
alert("Please enter a valid email address.");
document.getElementById("login-email").classList.add("error");
return false;
} else {
document.getElementById("login-email").classList.remove("error");
}
if (loginPassword === "") {
alert("Please enter your password.");
document.getElementById("login-password").classList.add("error");
return false;
} else {
document.getElementById("login-password").classList.remove("error");
}
// Retrieve existing user data from Local Storage
var users = JSON.parse(localStorage.getItem('registeredUsers')) || [];

// Check if the email is registered
var existingUser = users.find(user => user.email === loginEmail);

if (existingUser) {
   // Check if the user is blocked
  if (existingUser.blocked) {
    alert("This user is blocked.");
    document.getElementById("login-email").classList.add("error");
    return false;
  }
  // Check if the password is correct
  if (existingUser.password === loginPassword) {
    alert("Login successful! Welcome, " + existingUser.firstname + " " + existingUser.lastname + "!");
   
   
    window.location.href = 'vehicles.html';


  } else {
    alert("Incorrect password. Please try again.");
    document.getElementById("login-password").classList.add("error");
  }
} else {
  alert("Account not recognized. Please register.");
  document.getElementById("login-email").classList.add("error");
}

return true;
}

function validateRegisterForm() {
// Registration form validation
var registerFirstname = document.getElementById("register-firstname").value;
var registerLastname = document.getElementById("register-lastname").value;
var registerEmail = document.getElementById("register-email").value;
var registerPassword = document.getElementById("register-password").value;

if (registerFirstname === "" && registerLastname === "" && registerEmail === "" && registerPassword === "") {
  alert("Please fill in all registration fields.");
  document.getElementById("register-firstname").classList.add("error");
  document.getElementById("register-lastname").classList.add("error");
  document.getElementById("register-email").classList.add("error");
  document.getElementById("register-password").classList.add("error");
  return false;
}

// Check if required fields are not empty
if (registerFirstname  === "") {
  alert("Please enter your first name.");
  document.getElementById("register-firstname").classList.add("error");
  return false;
} else {
  document.getElementById("register-firstname").classList.remove("error");
}

if (registerLastname === "") {
  alert("Please enter your last name.");
  document.getElementById("register-lastname").classList.add("error");
  return false;
} else {
  document.getElementById("register-lastname").classList.remove("error");
}

if (registerEmail === "") {
  alert("Please enter your email address.");
  document.getElementById("register-email").classList.add("error");
  return false;
} else if (!/\S+@\S+\.\S+/.test(registerEmail)) {
  alert("Please enter a valid email address.");
  document.getElementById("register-email").classList.add("error");
  return false;
} else {
  document.getElementById("register-email").classList.remove("error");
}

if (registerPassword === "") {
  alert("Please enter your password.");
  document.getElementById("register-password").classList.add("error");
  return false;
} else {
  document.getElementById("register-password").classList.remove("error");
}
  
// Retrieve existing user data from Local Storage
var users = JSON.parse(localStorage.getItem('registeredUsers')) || [];

// Check if the email is already registered
var existingUser = users.find(user => user.email === registerEmail);
if (existingUser) {
  alert("This email is already registered. Please use a different email.");
  document.getElementById("register-email").classList.add("error");
  return false;
}

// Save new user data to the object
var newUser = {
  firstname: registerFirstname,
  lastname: registerLastname,
  email: registerEmail,
  password: registerPassword
};
users.push(newUser);

// Save the updated array back to Local Storage
localStorage.setItem('registeredUsers', JSON.stringify(users));

$(document).ready(function () {
//Анимация переключения на форму входа после успешной регистрации
$("#login").animate({ left: "5px" }, 300);
$("#register").animate({ right: "-510px" }, 300);
$("#login").animate({ opacity: 1 }, 300);
$("#register").animate({ opacity: 0 }, 300);
});
return true;
}

