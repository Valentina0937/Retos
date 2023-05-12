import java.util.Random;
import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Random random=new Random();
        int juego =random.nextInt(3);
        String objeto=null, resp="si";
        int opcion=0, verificar=0;

        
        
        while( resp.equalsIgnoreCase("si") && opcion==0 || opcion==1 || opcion==2 ){
            System.out.println("Este es un juego de Piedra Papel o Tijera\n Por favor digite una opción ");
            System.out.println("0.Piedra\n1.Papel\n2.Tijera");
            opcion=leer.nextInt();
            
            if (juego==0){
                objeto="Piedra";
                verificar=0;
            }
            else if (juego==1){
                objeto="Papel";
                verificar=1;
            }
            else if (juego==2){
                objeto="Tijera";
                verificar=2;
            }
            
        
            System.out.println("El sistema eligio "+objeto);

        if (verificar==opcion){
        System.out.println("empate");}
        
        
        else if(opcion==0 && verificar==2 || 
        opcion==1 && verificar==0 ||
        opcion==2 && verificar==1) {
        System.out.println("Ganaste");
        
    }

        else{
            System.out.println("Perdiste");
            
        }
        leer.nextLine();
        System.out.println("Desea jugar de nuevo?");
        resp=leer.nextLine();
        
    }

    leer.close();

    }
     

        
    }
   

