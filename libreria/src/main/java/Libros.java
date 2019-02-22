/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duvan
 */
public class Libros {
    /**
     * @param idLibro variable utilizada para capturar el identificador del libro
     * @param autor variable utilizada para capturar el nombre de quien escribio el libro
     * @param version variable utilizada para capturar la version del libro en inventario
     * @param precio variable utilizada para capturar el costo de venta del libro
     * @param precio variable utilizada para capturar la editorial a la que pertenece el libro
     * @param cantidad variable utilizada para capturar la cantidad disponible en inventario
     */
    private Byte idLibro;
    private String autor;
    private Byte version;
    private Short precio;
    private String editorial;
    private Byte costo;

    /*
    el constructor Libros se encaragara de recibir los parametros requeridos por la clase 
    */
    public Libros(Byte idLibro, String autor, Byte version, Short precio, String editorial, Byte costo) {
        this.idLibro = idLibro;
        this.autor = autor;
        this.version = version;
        this.precio = precio;
        this.editorial = editorial;
        this.costo = costo;
    } 
    
    /*
    el metodo consultarDisponibilidad hace una consulta contra la clase inventario
    si el libro solicitado por el cliente tiene unidades existentes dentro del sistema
    */
    public void consultarDisponiblidad()
    {
    }
    
    /*
    el metodo insertar se utilizara para ingresar un nuevo al libro al sistema cuando sea
    entregado por el proveedor
    */
    public void insertar()
    {
    }
    
    /*
    el motodo vender se utilizara para hacer la venta del libro solicitado por el cliente
    */
    public void vender()
    {
    }
    
    /*
    el metodo eliminar se utilizara para eliminar del inventario la cantidad de unidades compradas
    por el cliente
    */
    public void eliminar()
    {
    }
    
    /**
     * @return the codigo
     */
    public Byte getIdLibro() {
        return idLibro;
    }

    /**
     * @param idLibro the codigo to set
     */
    public void setIdLibro(Byte idLibro) {
        this.idLibro = idLibro;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the version
     */
    public Byte getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(Byte version) {
        this.version = version;
    }

    /**
     * @return the precio
     */
    public Short getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Short precio) {
        this.precio = precio;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the cantidad
     */
    public Byte getCosto() {
        return costo;
    }

    /**
     * @param costo the cantidad to set
     */
    public void setCosto(Byte costo) {
        this.costo = costo;
    }
}