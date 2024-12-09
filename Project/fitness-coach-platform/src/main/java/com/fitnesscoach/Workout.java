public class Workout {
    private String name;
    private String description;
    private int duration; // in minutes

    public Workout(String name, String description, int duration) {
        this.name = name;
        this.description = description;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Workout: " + name + " | Duration: " + duration + " mins | Description: " + description;
    }
}