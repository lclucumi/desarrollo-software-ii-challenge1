public class NoPriorityCost implements TransportCost{
    @Override
    public double cost(Delivery delivery){
        return delivery.getDistance() * 2000;
    }
}
