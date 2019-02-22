/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duvan
 */

/*
public class Cliente 
es la clase donde se solicitaran datos al usuario que hara uso del sistema 
para la compra de los libros
*/
public class Cliente { 
    
    /**
     * @param idCliente variable utilizada para capturar el documento del usuario
     * @param nombre variable utilizada para capturar el nombre del usuario
     * @param apellido variable utilizada para capturar el apellido del usuario
     * @param telefono variable utilizada para capturar el telefono del usuario
     */
    private int idCliente;
    private String nombre;
    private String apellido;
    private int telefono;
    private String direccion;
    
    /*
    el constructor Cliente se encaragara de recibir los parametros requeridos por la clase 
    */
    public Cliente(int idCliente, String nombre, String apellido, int telefono)
    {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    
    //Metodo que servira al cliente para realizar consultas de los libros disponibles y asi realizar su compra
    public void consultar()
    {
        
    }
    
    //Metodo que servira al cliente para realizarla compra del libro deseado
    public void comprar()
    {
  
    }
    
    //Metodo que servira para eliminar libros de la lista de compras del cliente
    public void eliminar()
    {
    
    }
    
    /**
     * @return the identificacion
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the identificacion to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
