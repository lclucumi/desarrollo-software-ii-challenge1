public class Vehicles {

    public  String name;

    public  Vehicles(String name){
        this.name = name;
    }

    public  String getName(){
        return name;
    }

    public void AsignarVehiculo(){
        System.out.println(
                "Delivery assigned to " + name
            );
    }
}

/*  Se creo la clase vehiculos la cual genera el nombre del vehiculo y lo almacena
    para luego llamarlo en DeliveryService, asi como tambien genera el mensage de asignaion 
    de pedido.
*/ 
