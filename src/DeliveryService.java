
public class DeliveryService {

    public void createDelivery(
            Delivery delivery,
            Vehicles vehicle
    ) {

        double cost = delivery.getDistance() * 2000;

        if (delivery.isPriority()) {
            cost = cost + 5000;
        }

        vehicle.AsignarVehiculo();

        System.out.println("Saving delivery...");

        System.out.println(
            "Notification sent. Cost: " + cost
        );
    }
}
/*  En DeliveryService se llama a vehicle.AsignarVheicle el cual como se dijo anteriormente
    llama el nombre dle vehiculo asignado y genera el mensage de asignacion
     */