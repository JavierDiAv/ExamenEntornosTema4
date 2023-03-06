package vehiculo;

/**
 *
 * @author Javier Diaz Aviles
 * @version 1.0
 * @since 06/03/2023
 */
public class VehiculoJDA2223 {

    /**
     * @return El nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre El nombre al set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return El precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio El precio al set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return El precio con IVA
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * @param precioIVA El precioIVA al set
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * @return El stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock El stock al set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /**
     * Constructor sin argumentos 
     */
    public VehiculoJDA2223 ()
    {
    }
   
    /**
     * Constructor con parámetro para iniciar todas las propiedades de la clase
     * @param nom String del nombre
     * @param precio Precio en tipo double
     * @param stock  Stock en tipo entero
     */
    
    public VehiculoJDA2223 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
  /**
   * Método para asignar el nombre del vehiculo.
   * @param nom String el nombre.
   */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /**
     * Método que me devuelve el nombre del vehiculo
     * @return El nombre
     */
     
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método que me devuelve el stock de vehiculos disponible en cada momento
     * @return El stock
     */
    
     public int obtenerStock ()
    {
        return getStock();
    }

    /**
     * 
     * @param cantidad Entero de la cantidad.
     * @throws Exception Envia un mensaje de alerta.
     * Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }
    /**
     * 
     * @param cantidad Entero de la cantidad.
     * @throws Exception Envia un mensaje de alerta.
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }
    
}  
   
    

