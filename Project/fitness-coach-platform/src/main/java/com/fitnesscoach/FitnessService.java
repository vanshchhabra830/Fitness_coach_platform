import java.util.ArrayList;
import java.util.List;

public class FitnessService {
    private List<User> users;
    private List<Workout> workouts;
    private List<DietPlan> dietPlans;
    private ProgressTracker progressTracker;

    public FitnessService() {
        users = new ArrayList<>();
        workouts = new ArrayList<>();
        dietPlans = new ArrayList<>();
        progressTracker = new ProgressTracker();
        loadWorkouts();
        loadDietPlans();
    }

    public void registerUser (String username, String password) {
        users.add(new User(username, password));
        System.out.println("User  registered successfully!");
    }

    public boolean loginUser (String username, String password) {
        for (User  user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void viewWorkouts() {
        System.out.println("\nAvailable Workouts:");
        for (Workout workout : workouts) {
            System.out.println(workout);
        }
    }

    public void viewDietPlans() {
        System.out.println("\nAvailable Diet Plans:");
        for (DietPlan dietPlan : dietPlans) {
            System.out.println(dietPlan);
        }
    }

    public void trackProgress(String workoutName, int duration, String dietName, int calories) {
        progressTracker.trackWorkout(workoutName, duration);
        progressTracker.trackDiet(dietName, calories);
        progressTracker.displayProgress();
    }

    private void loadWorkouts() {
        workouts.add(new Workout("Running", "A great cardio workout.", 30));
        workouts.add(new Workout("Weight Lifting", "Build muscle and strength.", 45));
        workouts.add(new Workout("Yoga", "Improve flexibility and relaxation.", 60));
    }

    private void loadDietPlans() {
        dietPlans.add(new DietPlan("Keto", "High fat, low carb diet."));
        dietPlans.add(new DietPlan("Mediterranean", "Healthy fats, whole grains, and lean proteins."));
        dietPlans.add(new DietPlan("Paleo", "Focus on whole foods and lean proteins."));
    }
}