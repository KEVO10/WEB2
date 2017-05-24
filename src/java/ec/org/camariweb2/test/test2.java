/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.camariweb2.test;

import ec.org.camariweb2.entidades.clsCliente;
import ec.org.camariweb2.entidades.clsFactura;
import ec.org.camariweb2.entidades.clsFacturaProducto;
import ec.org.camariweb2.entidades.clsProducto;
import ec.org.camariweb2.funciones.crudCliente;
import ec.org.camariweb2.funciones.crudFactura;
import ec.org.camariweb2.funciones.crudFacturaProducto;
import ec.org.camariweb2.funciones.crudProducto;
import java.sql.SQLException;
/**
 *
 * @author Lis
 */
public class test2 {
    public static void main(String[] args) {
       clsCliente a=new clsCliente(7,"123","kevin","RIOBAMBA");
         
////            clsPropietario d;
       crudCliente cc = new crudCliente();
        
        System.out.println("Prueba de clases");
        System.out.println("=============================================");
        System.out.println("contenido de la clase c");
        System.out.println(a.toString());
        System.out.println("=============================================");
        System.out.println("=============================================");
        System.out.println("INSERTANDO");
        if (cc.save(a)) {
            System.out.println("Guardado");
        }else{
            System.out.println("error!!!!");
     }
//        System.out.println("Comprobando si hay datos");
//        System.out.println(cc.findbyId(a).toString());
//        System.out.println("=============================================");
//        System.out.println("=============================================");
//        System.out.println("Eliminando");    
//        if (cc.delete(a)) {
//            System.out.println("eliminado");
//        }else{
//            System.out.println("no se ha podido eliminar");
//        }
//          System.out.println("actualizacion de los datos");
//          cc.update(a);
          
         clsFactura c= new clsFactura(3,a,null,20,1200,0.12);
         crudFactura b =new crudFactura();
//         System.out.println("Prueba de clases");
//        System.out.println("=============================================");
//        System.out.println("contenido de la clase c");
//        System.out.println(a.toString());
//        System.out.println("=============================================");
//        System.out.println("=============================================");
//        System.out.println("INSERTANDO");
//        if (b.save(c)) {
//            System.out.println("Guardado");
//        }else{
//            System.out.println("error!!!!");
//        }
//        System.out.println("Comprobando si hay datos");
//        System.out.println(b.findbyId(c).toString());
//        System.out.println("=============================================");
//        System.out.println("=============================================");
//        System.out.println("Eliminando");    
//        if (b.delete(c)) {
//            System.out.println("eliminado");
//        }else{
//            System.out.println("no se ha podido eliminar");
//        }

//          System.out.println("actualizacion de los datos");
//          b.update(c);
          
        clsProducto p= new clsProducto(2,"ARROZ",20,20);
        crudProducto pp= new crudProducto();
        
//         System.out.println("Prueba de clases");
//        System.out.println("=============================================");
//        System.out.println("contenido de la clase c");
//        System.out.println(a.toString());
//        System.out.println("=============================================");
//        System.out.println("=============================================");
//        System.out.println("INSERTANDO");
//        if (pp.save(p)) {
//            System.out.println("Guardado");
//        }else{
//            System.out.println("error!!!!");
//        }
//        System.out.println("Comprobando si hay datos");
//        System.out.println(pp.findbyId(p).toString());
//        System.out.println("=============================================");
//        System.out.println("=============================================");
//        System.out.println("Eliminando");    
//        if (pp.delete(p)) {
//            System.out.println("eliminado");
//        }else{
//            System.out.println("no se ha podido eliminar");
//        }

//           System.out.println("actualizacion de los datos");
//           pp.update(p);
           
           
        clsFacturaProducto fp= new clsFacturaProducto(4,c,p,50,50);
        crudFacturaProducto ffpp= new crudFacturaProducto();
//         System.out.println("Prueba de clases");
//        System.out.println("=============================================");
//        System.out.println("contenido de la clase c");
//        System.out.println(a.toString());
//        System.out.println("=============================================");
//        System.out.println("=============================================");
//        System.out.println("INSERTANDO");
//        if (ffpp.save(fp)) {
//            System.out.println("Guardado");
//        }else{
//            System.out.println("error!!!!");
//        }
//        System.out.println("Comprobando si hay datos");
//        System.out.println(ffpp.findbyId(fp).toString());
//        System.out.println("=============================================");
//        System.out.println("=============================================");
//        System.out.println("Eliminando");    
//        if (ffpp.delete(fp)) {
//            System.out.println("eliminado");
//        }else{
//            System.out.println("no se ha podido eliminar");
//        }
           System.out.println("actualizacion de los datos");
           ffpp.update(fp);
    }
}
