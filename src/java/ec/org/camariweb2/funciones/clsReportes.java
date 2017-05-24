
package ec.org.camariweb2.funciones;

import ec.org.camariweb2.accesodatos.AccesoDatos;
import ec.org.camariweb2.accesodatos.ConjuntoResultado;
import ec.org.camariweb2.accesodatos.Parametro;
import ec.org.camariweb2.entidades.clsFactura;
import ec.org.camariweb2.entidades.clsFacturaProducto;
import java.util.ArrayList;

public class clsReportes {
    
    // listado de todos los clientes con compras mayores a 1000
    // mostrar el numero factura, fecha, total, nombre cliente, ruc y el nombre del cliente 
    //1- mostrar la suma de compras por cada cliente
    //2- el numero de compras que hizo el cliente 
    //3- el numero de compras y el total de la compra
    //4- cliente que mas a comprado
    //5- cliente q menos a comprado
    //6- el promedio de compras 
    //7- el producto q mas se vende
    //8- el producto q mesno se vende
    //9- la s ventas por producto
    
    
    
      public ArrayList<clsFactura> CLIENTEFACTURAMAYORMIL() {
        ArrayList<clsFactura> listado = new ArrayList<>();
        String sql = "SELECT cliente.id_cliente,factura.cliente_id,factura.numero_factura,factura.fecha,factura.total,cliente.nombre, cliente.ruc "+
                "FROM public.cliente INNER JOIN public.factura"+
                " ON cliente.id_cliente = factura.cliente_id ORDER BY cliente.cnombre=ABC";

        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsFactura defa = null;
            while (cres.next())
            {
                defa = new clsFactura();
                defa.setNumero_factura(cres.getInt("numero_factura"));
                defa.setFecha(cres.getDate("fecha"));
                defa.setTotal(cres.getDouble("total"));
                listado.add((defa));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }
}
