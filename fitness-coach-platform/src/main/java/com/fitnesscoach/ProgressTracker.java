import java.util.HashMap;
import java.util.Map;

public class ProgressTracker {
    private Map<String, Integer> workoutProgress;
    private Map<String, Integer> dietProgress;

    public ProgressTracker() {
        workoutProgress = new HashMap<>();
        dietProgress = new HashMap<>();
    }

    public void trackWorkout(String workoutName, int minutes) {
        workoutProgress.put(workoutName, workoutProgress.getOrDefault(workoutName, 0) + minutes);
    }

    public void trackDiet(String dietName, int days) {
        dietProgress.put(dietName, dietProgress.getOrDefault(dietName, 0) + days);
    }

    public void displayProgress() {
        System.out.println("\nWorkout Progress:");
        for (Map.Entry<String, Integer> entry : workoutProgress.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " minutes");
        }

        System.out.println("\nDiet Progress:");
        for (Map.Entry<String, Integer> entry : dietProgress.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " days");
        }
    }

    public Map<String, Integer> getWorkoutProgress() {
        return workoutProgress;
    }

    public void setWorkoutProgress(Map<String, Integer> workoutProgress) {
        this.workoutProgress = workoutProgress;
    }

    public Map<String, Integer> getDietProgress() {
        return dietProgress;
    }

    public void setDietProgress(Map<String, Integer> dietProgress) {
        this.dietProgress = dietProgress;
    }
}
