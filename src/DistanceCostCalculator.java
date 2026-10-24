public class DistanceCostCalculator implements CostCalculator {
    
    @Override
    public double calculate(Delivery delivery) {
        double cost = delivery.getDistance() * 2000;
        double recharge = cost * 0.25;

        if (delivery.isPriority()) {
            cost = cost + recharge;
        }

        return cost;
    }
    
}
