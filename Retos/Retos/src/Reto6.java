import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        int cantidad;
        double precio=0, total;
        Scanner leer=new Scanner(System.in);
        System.out.println("Bienvenid@ a la tienda");
        System.out.println("Digite la cantidad de productos ");
        cantidad=leer.nextInt();

        for(int i=0;i<cantidad;i++){
            System.out.println("Digite el precio del producto");
            precio=leer.nextDouble();
        }
        
        total=precio*cantidad;
        System.out.println("Su precio total es "+total);
        
        leer.close();
    }
    
    
}
