public class PriceCalculator {
    public double calculate(Delivery delivery){
        double cost = delivery.getDistance() * 2000;
        return delivery.isPriority() ? cost * 1.25 : cost;
    }
    
}
