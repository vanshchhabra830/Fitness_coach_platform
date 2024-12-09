document.addEventListener("DOMContentLoaded", function() {
    // Handle workout selection
    const workoutButtons = document.querySelectorAll(".workout-button");
    workoutButtons.forEach(button => {
        button.addEventListener("click", function() {
            const workoutName = this.dataset.workout;
            alert(`You have selected the workout: ${workoutName}`);
            // Here you can add more functionality, like tracking the workout
        });
    });

    // Handle diet plan selection
    const dietButtons = document.querySelectorAll(".diet-button");
    dietButtons.forEach(button => {
        button.addEventListener("click", function() {
            const dietName = this.dataset.diet;
            alert(`You have selected the diet plan: ${dietName}`);
            // Here you can add more functionality, like tracking the diet
        });
    });

    // Form validation for registration
    const registrationForm = document.getElementById("registration-form");
    if (registrationForm) {
        registrationForm.addEventListener("submit", function(event) {
            const username = document.getElementById("username").value;
            const password = document.getElementById("password").value;

            if (username === "" || password === "") {
                event.preventDefault();
                alert("Please fill in all fields.");
            } else {
                alert("Registration successful!");
            }
        });
    }

    // Form validation for login
    const loginForm = document.getElementById("login-form");
    if (loginForm) {
        loginForm.addEventListener("submit", function(event) {
            const username = document.getElementById("login-username").value;
            const password = document.getElementById("login-password").value;

            if (username === "" || password === "") {
                event.preventDefault();
                alert("Please fill in all fields.");
            } else {
                alert("Login successful!");
            }
        });
    }
});