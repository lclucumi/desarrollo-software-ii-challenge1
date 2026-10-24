public class Main {
    
    //hacemos pruebas de creacion de diferentes vehiculos 
    //pruebas de qa :)

    public static void main(String[] args) {

        //Delivery delivery = new Delivery(

          //  5.0,
            //true

        //);
        
         Delivery delivery = new Delivery (
          13, 
          true 

          );

         Delivery delivery2 = new Delivery (

             5,
             true 

             );
        


        DeliveryService service = new DeliveryService();
        DeliveryService service2 = new DeliveryService();

        service.createDelivery(
            delivery,
            new Carro()
        );

        service.createDelivery(
            delivery2,
            new Bicicleta()

          );
    }
}
