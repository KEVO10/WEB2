/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.camariweb2.entidades;

/**
 *
 * @author Lis
 */
public class clsProducto {
    private int _id_producto;
    private String _nombre;
    private int _stock;
    private double _precioventa;

    public clsProducto() {
    }

    public clsProducto(int _id_producto, String _nombre, int _stock, double _precioventa) {
        this._id_producto = _id_producto;
        this._nombre = _nombre;
        this._stock = _stock;
        this._precioventa = _precioventa;
    }

    public double getPrecioventa() {
        return _precioventa;
    }

    public void setPrecioventa(double _precioventa) {
        this._precioventa = _precioventa;
    }

    public int getId_producto() {
        return _id_producto;
    }

    public void setId_producto(int _id_producto) {
        this._id_producto = _id_producto;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public int getStock() {
        return _stock;
    }

    public void setStock(int _stock) {
        this._stock = _stock;
    }

    @Override
    public String toString() {
        return "clsProducto{" + "_id_producto=" + _id_producto + ", _nombre=" + _nombre + ", _stock=" + _stock + ", _precioventa=" + _precioventa + '}';
    }
    
}
