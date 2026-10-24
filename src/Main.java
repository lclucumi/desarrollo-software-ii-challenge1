public class Main {

    public static void main(String[] args) {

        DeliveryService service = new DeliveryService(
            new DistanceCostCalculator()
        );

        Transport[] transports = {
            new Motorcycle(), new Bicycle(), new Car()
        };

      
        for (Transport transport : transports) {

            System.out.println("--- Prioritario, 5 km ---");
            service.createDelivery(new Delivery(5.0, true), transport);

            System.out.println("--- No prioritario, 5 km ---");
            service.createDelivery(new Delivery(5.0, false), transport);

            System.out.println();
        }
    }
}

