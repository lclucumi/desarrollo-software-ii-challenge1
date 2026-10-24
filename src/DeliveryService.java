public class DeliveryService {

    private final CostCalculator costCalculator;

    public DeliveryService(CostCalculator costCalculator) {
        this.costCalculator = costCalculator;
    }

    public void createDelivery(
            Delivery delivery,
            Transport transport
    ) {

        double cost = costCalculator.calculate(delivery);

        
        transport.assign();

        System.out.println("Saving delivery...");

        System.out.println(
            "Notification sent. Cost: " + cost
        );
    }
}


/*  logramos identificar que el codigo no esta cumpliendo con el 
principio SRP de SOLID, ya que en esta clase se esta encargando de hacer mas de una cosa a la vez
primero calcula y asigna los costos del envio, y luego asi asigna el vehiculo
y manda la notificacion de que se ha guardado el envio, 
lo cual deberia estar en otra clase, ya que esta clase deberia encargarse solo  calcular el costo del envio. */