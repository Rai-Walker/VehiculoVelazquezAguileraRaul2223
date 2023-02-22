
package vehiculo;

/**
 *
 * @author Raúl Velázquez Aguilera
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoVelazquezAguileraRaul2223 miVehiculoVelazquezAguileraRaul2223;
        int stockActual;
        miVehiculoVelazquezAguileraRaul2223 = new VehiculoVelazquezAguileraRaul2223("Seat",18000,100);
        operativaVehiculosVelazquezAguileraRaul2223(miVehiculoVelazquezAguileraRaul2223, 50); 
    }

    public static void operativaVehiculosVelazquezAguileraRaul2223(VehiculoVelazquezAguileraRaul2223 miVehiculoVelazquezAguileraRaul2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoVelazquezAguileraRaul2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoVelazquezAguileraRaul2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoVelazquezAguileraRaul2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
