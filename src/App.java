public class App {
    public static void main(String[] args) throws Exception {
        
        //creando un array de electrodomesticos
   //     Electrodomestico lista[] = new Electrodomestico[2];

        //asignando electrodomesticos en cada posicion

     //   lista[0] = new Lavadora(300,"blanco",'A',40,40);

     //   for (int i = 0; i < lista.length; i++) {
            
     //       if(lista[i] instanceof Lavadora){
     //           lista[i].precioFinal();
    //          System.out.println(lista[i].getPrecioBase());
    //        }
    //    }

    Lavadora la = new Lavadora(400,"blanco",'F',40,31);
    la.precioFinal();
    System.out.println(la.getPrecioBase());
    
    System.out.println("--------------------------------");
    
    Television tv = new Television(500,"blanco",'A',2,40,true);
    tv.precioFinal();
    System.out.println(tv.getPrecioBase());
    }
}
