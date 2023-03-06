package vehiculo;

/**
 *
 * @author Javier Diaz Aviles
 * @version 1.0
 * @since 06/03/2023
 */
public class Main {
      public static void main(String[] args) {
        operativaVehiculosJDA2223(50);
    }
      /**
       * @param enteroParaElExamen Entero creado con refactor para el examen
       */
    public static void operativaVehiculosJDA2223(int enteroParaElExamen) {
        VehiculoJDA2223 miVehiculoJDA2223;
        int stockActual;
        miVehiculoJDA2223 = new VehiculoJDA2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoJDA2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoJDA2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoJDA2223.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

}
    
