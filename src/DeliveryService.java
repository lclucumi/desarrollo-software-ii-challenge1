
public class DeliveryService {

    public void createDelivery(
            Delivery delivery,
            Vehicles vehicle
    ) {

        // Se aplica el equivalente al 25% al costo y eliminamos el recargo de 5000
        double cost = delivery.getDistance() * 2000;
        double costplus = cost * 0.25;

        

        if (delivery.isPriority()) {
            cost = costplus + cost;
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

// Parte 2
// Se modifico el diseño orginial eliminando la suma por 5000, reemplazandose por una variable double llamada costoplus
// esto se hizo para aplicar el equvalnete dle 25% y despeus sumarse el costo base con el costoplus y asi otener el costo con el cargo aplicado
// y asi no se modifica ni se pierde la funcion de prioridad manteniendo el costo fijo en caso de que no haya prioridad y
// cambiandolo si la hay