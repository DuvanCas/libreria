/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duvan
 */
public class Proveedor {
    int idProveedor;
    int cantidad;
    String nombre;
    String telefono;
    String direccion;

    /*
    este constructor sera utilizado para recibir los parametros solicitados por la clase
    */
    public Proveedor(int cantidad, String nombre, String telefono, String direccion) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    /*
    el metodo vender sera usado para entregar libros solicitados por la libreria
    */
    public void vender(){
        
    }
      
}
