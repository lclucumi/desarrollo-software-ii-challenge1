public class DeliveryService {

    public void createDelivery(
            Delivery delivery,
            String transportType
    ) {

        double cost = delivery.getDistance() * 2000;
        double recharge = cost * 0.25;

        if (delivery.isPriority()) {
            cost = cost + recharge;
        }

        if (transportType.equals("MOTORCYCLE")) {
            System.out.println(
                "Delivery assigned to motorcycle"
            );
        }

        if (transportType.equals("BICYCLE")) {
            System.out.println(
                "Delivery assigned to bicycle"
            );
        }

        if (transportType.equals("CAR")) {
            System.out.println(
                "Delivery assigned to Car"
            );
        }



        System.out.println("Saving delivery...");

        System.out.println(
            "Notification sent. Cost: " + cost
        );
    }
}

/*  logramos identificar que el codigo no esta cumpliendo con el 
principio SRP de SOLID, ya que en esta clase se esta encargando de hacer mas de una cosa a la vez
primero calcula y asigna los costos del envio, y luego asi */