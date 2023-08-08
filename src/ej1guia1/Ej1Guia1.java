
package ej1guia1;


public class Ej1Guia1 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Producto producto1=new Producto(11,"leche",234,200);
        producto1.saludar();
        producto1.setDescripcion("caja de leche");
        System.out.println("el codigo del prod es "+producto1.getCodigo());
        System.out.println("nombre del producto "+producto1.getDescripcion());
        System.out.println("precio del producto $"+producto1.getPrecio());
        System.out.println("stock del producto "+producto1.getStock()+" unidades");
        
                
        
    }
    
}
