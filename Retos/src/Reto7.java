import java.util.Random;
import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        //instanciamos clase
        Random random = new Random();
        Scanner leer=new Scanner(System.in);
        //declaramos variables
        int moneda =random.nextInt(2);
        String lado=null, resp="si";
        int i=0,opcion=0, verificar=0;
        double dinero=0, total=1000;
        
        

        while( resp.equalsIgnoreCase("si")){
        System.out.println("Su dinero es "+total);
        System.out.println("Ingrese el monto del dinero que va a apostar");
        dinero=leer.nextDouble();
        System.out.println("Ahora juegue cara o sello\n Por favor digite una opción ");
        System.out.println("0.Cara\n1.Sello ");
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
        System.out.println("Ganaste");
total=total+dinero;
            
        
        }
        
        
        else {
        System.out.println("Perdiste");
        total=total-dinero;
    
    }
        leer.nextLine();
        System.out.println("Desea seguir apostando?");
        resp=leer.nextLine();
        i++;
            
        }
        if (resp.equalsIgnoreCase("no")){
            System.out.println("Usted jugo "+i+" veces\n su dinero acumulado es "+total);
        }
 leer.close();
    }
}   
