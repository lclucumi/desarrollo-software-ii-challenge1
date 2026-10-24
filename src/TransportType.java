public class TransportType {
    
    public void assignTransport(String transportType) {
        switch (transportType) {
            case "MOTORCYCLE" -> System.out.println(
                        "Delivery assigned to motorcycle"
                );
            case "BICYCLE" -> System.out.println(
                        "Delivery assigned to bicycle"
                );
            
            case "CAR" -> System.out.println(
                        "Delivery assigned to car"
                );
            default -> System.out.println(
                        "Unknown transport type"
                );
        }
    }
}
