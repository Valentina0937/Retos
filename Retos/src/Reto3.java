import java.util.Random;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Random random = new Random();
        int moneda =random.nextInt(2);
        String lado=null;
        
        int opcion, verificar=0;

        Scanner leer=new Scanner(System.in);
        System.out.println("Este es un juego de cara o sello\n Por favor digite una opción ");
        System.out.println("0.Cara\n1.Sello");
        opcion=leer.nextInt();
        
        if (moneda==0){
            lado="cara";
            verificar=0;
        }
        else if (moneda==1){
            lado="sello";
            verificar=1;
        }
            
        
        System.out.println("El sistema eligio "+lado);


        if (verificar==opcion){
        System.out.println("Ganaste");}
        
        
        else {
        System.out.println("Perdiste");}
        leer.close();
    }
}
