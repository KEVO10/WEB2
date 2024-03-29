/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.camariweb2.entidades;

import java.util.Date;

/**
 *
 * @author Lis
 */
public class clsFactura {
    private int _numero_factura;
    private clsCliente cliente;
    private Date _fecha;
    private double subtotal;
    private double total;
    private double iva;

    public clsFactura() {
    }

    public clsFactura(int _numero_factura, clsCliente cliente, Date _fecha, double subtotal, double total, double iva) {
        this._numero_factura = _numero_factura;
        this.cliente = cliente;
        this._fecha = _fecha;
        this.subtotal = subtotal;
        this.total = total;
        this.iva = iva;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getNumero_factura() {
        return _numero_factura;
    }

    public void setNumero_factura(int _numero_factura) {
        this._numero_factura = _numero_factura;
    }

    public clsCliente getCliente() {
        return cliente;
    }

    public void setCliente(clsCliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return _fecha;
    }

    public void setFecha(Date _fecha) {
        this._fecha = _fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "clsFactura{" + "_numero_factura=" + _numero_factura + ", cliente=" + cliente + ", _fecha=" + _fecha + ", subtotal=" + subtotal + ", total=" + total + ", iva=" + iva + '}';
    }
    
}
