import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FitnessService fitnessService = new FitnessService();

        System.out.println("Welcome to the Fitness Tracker!");
        boolean running = true;

        while (running) {
            System.out.println("\n1. Register\n2. Login\n3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    fitnessService.registerUser (username, password);
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    password = scanner.nextLine();
                    if (fitnessService.loginUser (username, password)) {
                        System.out.println("Login successful!");
                        userDashboard(scanner, fitnessService);
                    } else {
                        System.out.println("Invalid credentials. Please try again.");
                    }
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
        scanner.close();
    }

    private static void userDashboard(Scanner scanner, FitnessService fitnessService) {
        boolean dashboardRunning = true;
        while (dashboardRunning) {
            System.out.println("\nUser  Dashboard:");
            System.out.println("1. View Workouts\n2. View Diet Plans\n3. Track Progress\n4. Logout");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    fitnessService.viewWorkouts();
                    break;
                case 2:
                    fitnessService.viewDietPlans();
                    break;
                case 3:
                    // Gather input for tracking progress
                    System.out.print("Enter workout name: ");
                    String workoutName = scanner.nextLine();
                    System.out.print("Enter duration in minutes: ");
                    int duration = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter diet name: ");
                    String dietName = scanner.nextLine();
                    System.out.print("Enter calories consumed: ");
                    int calories = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    // Call trackProgress with the gathered inputs
                    fitnessService.trackProgress(workoutName, duration, dietName, calories);
                    break;
                case 4:
                    dashboardRunning = false;
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}