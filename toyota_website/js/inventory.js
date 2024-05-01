// swiperJS
var swiper = new Swiper(".Vehicle_Slider", {
  grabCursor: true,
  spaceBetween: 20,
  loop: true,
  centeredSlides: true,
  autoplay: {
    delay: 1000,
    desableOnInteraction: false,
  },
  pagination: {
    el: ".swiper-pagination",
    clickable: true,
  },
  breakpoints: {
    0: {
      slidesPerView: 1,
    },
    768: {
      slidesPerView: 2,
    },
    1024: {
      slidesPerView: 3,
    },
  },
});

// Main Logic
document.querySelectorAll(".ThemeToggle .themeBtn").forEach((btn) => {
  btn.onclick = () => {
    let color = btn.style.background;

    document.querySelector(":root").style.setProperty("--main", color);
  };
});


'use strict';

/**
 * navbar toggle
 */

const overlay = document.querySelector("[data-overlay]");
const navbar = document.querySelector("[data-navbar]");
const navToggleBtn = document.querySelector("[data-nav-toggle-btn]");
const navbarLinks = document.querySelectorAll("[data-nav-link]");

const navToggleFunc = function () {
  navToggleBtn.classList.toggle("active");
  navbar.classList.toggle("active");
  overlay.classList.toggle("active");
}

navToggleBtn.addEventListener("click", navToggleFunc);
overlay.addEventListener("click", navToggleFunc);

for (let i = 0; i < navbarLinks.length; i++) {
  navbarLinks[i].addEventListener("click", navToggleFunc);
}



/**
 * header active on scroll
 */

const header = document.querySelector("[data-header]");

window.addEventListener("scroll", function () {
  window.scrollY >= 10 ? header.classList.add("active")
    : header.classList.remove("active");
});


document.addEventListener('DOMContentLoaded', function () {
  // Add event listeners to the "Book now" buttons
  const bookButtons = document.querySelectorAll('.featured-car-list .btn');

  bookButtons.forEach((button) => {
    button.addEventListener('click', function () {
      // Find the parent .featured-car-card element
      const card = button.closest('.featured-car-card');

      // Extract data from the card
      const carModel = card.querySelector('.card-title a').textContent;

      // Check if a booking for this car model already exists
      if (isAlreadyBooked(carModel)) {
        alert(`You have already booked ${carModel}.`);
        return;
      }

      const year = card.querySelector('.year').getAttribute('value');
      const price = card.querySelector('.card-price').textContent.trim();
      const capacity = card.querySelector('.card-list-item:nth-child(1) .card-item-text').textContent.trim();
      const engine = card.querySelector('.card-list-item:nth-child(2) .card-item-text').textContent.trim();
      const fuelConsumption = card.querySelector('.card-list-item:nth-child(3) .card-item-text').textContent.trim();
      const transmission = card.querySelector('.card-list-item:nth-child(4) .card-item-text').textContent.trim();

      // Store the booking data in local storage
      const bookingData = {
        carModel,
        year,
        price,
        capacity,
        engine,
        fuelConsumption,
        transmission,
      };

      // Get existing bookings from local storage or initialize an empty array
      const bookings = JSON.parse(localStorage.getItem('bookings')) || [];

      // Add the new booking to the array
      bookings.push(bookingData);

      // Update local storage with the updated bookings array
      localStorage.setItem('bookings', JSON.stringify(bookings));

      alert(`Booking for ${carModel} successful! Check your account for details.`);
    });
  });

  // Сheck if a booking for a specific car model already exists
  function isAlreadyBooked(carModel) {
    const bookings = JSON.parse(localStorage.getItem('bookings')) || [];
    return bookings.some(booking => booking.carModel === carModel);
  }
});
