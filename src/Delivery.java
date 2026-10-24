public class Delivery {

    private final double distance;
    private final boolean priority;

    public Delivery(double distance, boolean priority) {
        this.distance = distance;
        this.priority = priority;
    }

    public double getDistance() {
        return distance;
    }
 
    public boolean isPriority() {
        return priority;
    }
}
