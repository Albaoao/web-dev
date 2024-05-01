$(document).ready(function() {
  $('.logout-button-container').hide(); 
  
  $('.user-info').click(function() {
    $('.logout-button-container').slideToggle(); // Анимация отображения/скрытия
  });
  

  $('.logout-button-container').click(function() {
    alert('You have been logged out.');
    window.location.href = 'signin-up.html';
  });
});
document.addEventListener('DOMContentLoaded', function () {
  // Function to update the table in the account page
  function updateTable() {
    // Get the table body element
    const tbody = document.querySelector('#orderTable tbody');

    // Clear existing rows
    tbody.innerHTML = '';

    // Retrieve bookings from local storage
    const bookings = JSON.parse(localStorage.getItem('bookings')) || [];

    // Iterate through bookings and add rows to the table
    bookings.forEach((booking, index) => {
      const row = document.createElement('tr');

      // Add data cells
      for (const key in booking) {
        const cell = document.createElement('td');
        cell.textContent = booking[key];
        row.appendChild(cell);
      }

      // Сancel button
      const cancelCell = document.createElement('td');
      const cancelButton = document.createElement('button');
      cancelButton.textContent = 'Cancel';
      cancelButton.classList.add('btn', 'cancel-btn');
      cancelButton.addEventListener('click', function () {
        cancelBooking(index);
      });
      cancelCell.appendChild(cancelButton);
      row.appendChild(cancelCell);

      tbody.appendChild(row);
    });
  }

  // Initialize the table on page load
  updateTable();

  // Function to cancel a booking
  function cancelBooking(index) {
    // Retrieve bookings from local storage
    const bookings = JSON.parse(localStorage.getItem('bookings')) || [];

    // Remove the booking at the specified index
    bookings.splice(index, 1);

    // Update local storage with the updated bookings array
    localStorage.setItem('bookings', JSON.stringify(bookings));

    // Update the table after canceling the booking
    updateTable();
  }
});



  
