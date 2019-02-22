
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duvan
 */
public class Inventario {
    
    /**
     * @param cantidad variable que sera de tipo acumulativa incrementativa respecto a 
     * al nombre del libro por medio de la variable "nombre"
     * @param idInventario variable utilizada para codificar la cantidad de libros que se encuentran en inventario
     * esta variable sera autoincrementable
    */
    private int cantidad;
    private int idInventario;

    /*
    metodo calcularDisponibilidad sera utilizado para calcular la cantidad de un mismo libro 
    el cual sus atributos todos sean iguales
    */
    public void calcularDisponibilidad()
    {
    }
    
    /*metodo calcularBarato sera utilizado para calcular que libro es el mas barato
    */
    public void calcularBarato()
    {
    }

    /*metodo calcularCostoso sera utilizado para calcular que libro es el mas costoso
    */
    public void calcularCostoso()
    { 
    }
    
    /*metodo masVendido sera utilizado para calcular que libro es el mas vendido
    */
    public void masVendido()
    {    
    }
    
    /*metodo menosVendido sera utilizado para calcular que libro es el menos vendido
    */
    public void menosVendido()
    {    
    }
    
    
    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the idInventario
     */
    public int getIdInventario() {
        return idInventario;
    }

    /**
     * @param idInventario the idInventario to set
     */
    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }
          
    
}
