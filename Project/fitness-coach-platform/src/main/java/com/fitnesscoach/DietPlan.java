public class DietPlan {
    private String name;
    private String details;

    public DietPlan(String name, String details) {
        this.name = name;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Diet Plan: " + name + " | Details: " + details;
    }
}