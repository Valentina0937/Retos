import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        // Declara variable
        String nombreE, nombreB, nombreP;
        double edad, peso, dosis = 0;
        Scanner capturar=new Scanner(System.in);
        System.out.println("Por favor ingresra el nombre de la enferma:");
        nombreE = capturar.nextLine();
        System.out.println("Por favor ingresar el nombre del padre");
        nombreP = capturar.nextLine();
        System.out.println("Por favor ingresar el nombre del bebe:");
        nombreB = capturar.nextLine();
        System.out.println("Por favor digite la edad del bebe:");
        edad = capturar.nextInt();
        System.out.println("Por favor digite el peso del bebe:");
        peso = capturar.nextInt();

        dosis = (peso + 10 / edad * 10);
        
        System.out.println("El nombre de la enfermera es: " + nombreE);
        System.out.println("El nombre del padre es "+nombreP);
        System.out.println("El nombre del bebe es: "+nombreB);
        System.out.println("La edad del bebe es: "+edad);
        System.out.println("El peso del bebe es: "+peso);
        System.out.println("la dosis para aplicar al bebe es: "+dosis);
capturar.close();
    }
}
