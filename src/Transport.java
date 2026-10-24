    /*decidimos cambiar en este caso el archivo DeliverySERVICE los condicionales debido a que esto incumplia la 
    claasula O de SOLID porque se deben poder agregar nuevas variantes sin modificar repetitivamente el codigo, 
    en este caso esto se incumplia porque para agregar una nueva variante debimos entrar al codigo y modificarlo, 
    çentonces la solucion de esto fue implementar interface para que se cree un contrato con las nuevas variantes 
    sin tocar las anteriores 
    
    El segundo problema de diseño mas grande viene siendo el de la clausula de S de SOLID, esto devido a 
    que createDelivery hace 4 cosas: calcula el costo, asigna el transporte, simula guardar, cosa que incumple
    el single responsability para cada clase */

public interface Transport {
    void assign();
}

