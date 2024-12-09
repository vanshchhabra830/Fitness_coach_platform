-- Create Users Table
CREATE TABLE Users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

-- Create Workouts Table
CREATE TABLE Workouts (
    workout_id INT PRIMARY KEY AUTO_INCREMENT,
    workout_name VARCHAR(100) NOT NULL,
    duration INT NOT NULL, -- Duration in minutes
    calories_burned INT NOT NULL
);

-- Create Diet Plans Table
CREATE TABLE DietPlans (
    diet_id INT PRIMARY KEY AUTO_INCREMENT,
    diet_name VARCHAR(100) NOT NULL,
    calories INT NOT NULL
);

-- Create Progress Table
CREATE TABLE Progress (
    progress_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    workout_id INT,
    diet_id INT,
    date DATE NOT NULL,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (workout_id) REFERENCES Workouts(workout_id),
    FOREIGN KEY (diet_id) REFERENCES DietPlans(diet_id)
);

-- Insert Sample Users
INSERT INTO Users (username, password) VALUES
('john_doe', 'password123'),
('jane_smith', 'securepass'),
('alice_jones', 'mypassword'),
('bob_brown', 'passw0rd'),
('charlie_black', 'charlie123');

-- Insert Sample Workouts
INSERT INTO Workouts (workout_name, duration, calories_burned) VALUES
('Running', 30, 300),
('Cycling', 45, 400),
('Yoga', 60, 200),
('Weight Lifting', 50, 500),
('Swimming', 40, 350),
('HIIT', 25, 450),
('Pilates', 55, 250),
('Boxing', 35, 400),
('Dance', 30, 300),
('Rock Climbing', 60, 600);

-- Insert Sample Diet Plans
INSERT INTO DietPlans (diet_name, calories) VALUES
('Keto Diet', 1500),
('Mediterranean Diet', 1800),
('Paleo Diet', 1600),
('Vegan Diet', 1400),
('Intermittent Fasting', 1200),
('High Protein Diet', 2000),
('Low Carb Diet', 1700),
('Balanced Diet', 1900),
('DASH Diet', 1600),
('Raw Food Diet', 1500);

-- Insert Sample Progress Records
INSERT INTO Progress (user_id, workout_id, diet_id, date) VALUES
(1, 1, 1, '2023-10-01'),
(1, 2, 2, '2023-10-02'),
(2, 3, 3, '2023-10-01'),
(2, 4, 4, '2023-10-03'),
(3, 5, 5, '2023-10-01'),
(3, 6, 6, '2023-10-02'),
(4, 7, 7, '2023-10-01'),
(4, 8, 8, '2023-10-03'),
(5, 9, 9, '2023-10-01'),
(5, 10, 10, '2023-10-02');

-- Additional Sample Data for Progress
INSERT INTO Progress (user_id, workout_id, diet_id, date) VALUES
(1, 1, 2, '2023-10-04'),
(2, 3, 1, '2023-10-05'),
(3, 4, 3, '2023-10-06'),
(4, 5, 4, '2023-10-07'),
(5, 6, 5, '2023-10-08'),
(1, 7, 6, '2023-10-09'),
(2, 8, 7, '2023-10-10'),
(3, 9, 8, '2023-10-11'),
(4, 10, 9, '2023-10-12'),
(5, 1, 10, '2023-10-13');