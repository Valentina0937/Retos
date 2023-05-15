import java.util.Random;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        //Instanciamos random
        Random random = new Random();
        //Declaramos variable al random
        int moneda =random.nextInt(2);

        //Declaramos variables
        String lado=null;
        int opcion, verificar=0;
        //Instanciamos clase Scanner
        Scanner leer=new Scanner(System.in);
        //Solicitamos opción
        System.out.println("Este es un juego de cara o sello\n Por favor digite una opción ");
        System.out.println("0.Cara\n1.Sello");
        //Capturamos opción
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
