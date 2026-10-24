public class PriorityCost implements TransportCost {
    @Override
    public double cost(Delivery delivery){
        double cost = delivery.getDistance() * 2000;
        return cost + cost * 0.25;
    }
    
}
