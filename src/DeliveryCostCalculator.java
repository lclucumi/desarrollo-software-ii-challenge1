public class DeliveryCostCalculator {
    private static final double COST_PER_KILOMETER = 2000;
    private static final double PRIORITY_SURCHARGE = 0.25;

    public double calculate(Delivery delivery) {
        double cost = delivery.getDistance() * COST_PER_KILOMETER;

        if (delivery.isPriority()) {
            cost += cost * PRIORITY_SURCHARGE;
        }

        return cost;
    }
}
