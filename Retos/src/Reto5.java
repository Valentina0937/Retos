import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
         
        int mes, dia;
        System.out.println("Digite el mes");
        mes=leer.nextInt();
        System.out.println("Digite el dia");
        dia=leer.nextInt();
        if (mes==3 && dia>=21 || mes==4 && dia<=19)
        System.out.println("Su signo es Aries y sus características son:\n La iniciativa es el punto fuerte de la personalidad de Aries. Son los que siempre van un paso por delante, animan al resto a hacer lo mismo y de los signos en los que más puedes confiar. Eso sí, sacarán lo peor de ellos impulsividad, impaciencia y egoísmo, si no estás a la altura de su energía. No son fáciles de llevar.");
        
        else if(mes==4 && dia>=20 || mes==5 && dia<=20)
        System.out.println("Su signo es Tauro y sus características son:\n Tauro es uno de los signos más centrados del horóscopo, porque su lealtad es difícil de conseguir. Pero una vez la tengas, será para siempre. Pocas veces pierden los papeles o montan un pollo en público. Solo cuando les empiezan a discutir algo en lo que saben que tienen razón. Si no la tienen, también la lucharán.");

        else if(mes==5 && dia>=21 || mes==6 && dia<=20)
        System.out.println("Su signo es Géminis y sus características son:\n Cambiantes como los gemelos que representan su imagen. Uno de los rasgos de la personalidad de Géminis es que suele tener miedo al compromiso, ya que sus decisiones duran poco tiempo estables y cambian de opinión muy rápido. Son excelentes oradores. Cualquier cosa que salga por sus bocas te la creerás.");

        else if(mes==6 && dia>=21 || mes==7 && dia<=22)
        System.out.println("Su signo es Cáncer y sus características son:\nLos Cáncer son los más sensibles del zodiaco. Son conocidos por ‘montar el drama’ bajo cualquier circunstancia, pero lo que quizá no sepas es que estas enormes emociones que experimentan les hace ser los más empáticos del horóscopo. Son personas muy especiales, y ojito cuando se cabrean.");

        else if(mes==7 && dia>=23 || mes==8 && dia<=22)
        System.out.println("Su signo es Leo y sus características son:\n Cuando un Leo entra en un lugar, se nota. Su presencia y luz llenan el sitio... y a estos les encantan que suceda. Son bastante egocéntricos, valoran muchísimo el físico de los demás y siempre sacarán lo mejor de ti. Seres superiores gobernados por el Sol.");

        else if(mes==8 && dia>=23 || mes==9 && dia<=22)
        System.out.println("Su signo es Virgo y sus características son:\n Analíticos y ordenados. No hay detalle que se le escape, aunque el gran problema de la personalidad de los Virgo está en lo poco que fluyen. Necesitan saber cuándo y a qué hora para poder hacerlo. Siempre están pensando en lo que pasará después y muchas veces no viven el presente como deberían.");

        else if(mes==9 && dia>=23 || mes==10 && dia<=22)
        System.out.println("Su signo es Libra y sus características son:\n Los Libra son los más románticos del horóscopo, aunque también los más dudosos. Mala combinación si tenemos en cuenta que sopesan cada decisión que toman una media de mil veces. También se les reconoce por su elegancia y por no perder nunca los papeles (aunque lo estén deseando). Su misión está en tirarse a la piscina sin reflexionar tanto.");

        else if(mes==10 && dia>=23 || mes==11 && dia<=21)
        System.out.println("Su signo es Escorpio y sus características son:\n Intensidad. No hay palabra que mejor defina la personalidad de Escorpio. Para todo además: el amor, trabajo, discusiones, sexo, trabajo... Sin embargo, cuando salen heridos tras darlo todo, se cierran en banda y debes tener cuidado porque poseen bastante mal carácter. Sí, son los típicos que siempre te contestan mal.");

        else if(mes==11 && dia>=22 || mes==12 && dia<=21)
        System.out.println("Su signo es Sagitario y sus características son:\n La buena suerte la poseen ellos, gracias a que Júpiter es su planeta regente. Los Sagitario son los que siempre encuentran aparcamiento a la primera, los que consiguen las mejores ofertas... Le sale todo tan bien, que se cabrean muchísimo cuando algo se tuerce. Al igual, les encanta expandir todos sus conocimientos.");

        else if(mes==12 && dia>=22 || mes==1 && dia<=19)
        System.out.println("Su signo es Capricornio y sus características son:\n Cuerpo a tierra si tu intención es discutir con un Capricornio. Cuando algo se les mete entre ceja y ceja, es mejor quitarles la cabeza que la idea. El principal rasgo de la personalidad de los Capricornio es que son muy, muy cabezone, y pocas veces reconocen su error. Su sentido de la responsabilidad asciende a niveles extremos y suelen ser bastante ‘workaholics’.");

        else if(mes==1 && dia>=20 || mes==2 && dia<=18)
        System.out.println("Su signo es Acuario y sus características son:\n Nunca te contestarán a un WhatsApp. Acuario representa la libertad y la rebeldía, por lo que la última cosa que harán será estar pendientes de los mensajes que les llegan. No es que no quieran comprometerse, pero prefieren no tener ataduras. El rasgo principal de la personalidad de los Acuario es que no suelen concentrarse en un solo camino.");

        else if(mes==2 && dia>=19 || mes==3 && dia<=20)
        System.out.println("Su signo es Piscis y sus características son:\n Piscis es el signo más creativo del horóscopo. Esto les permite ser los más originales, pero también montarse unas películas en la cabeza que se acaban creyendo. Viven más en las nubes que en el presente, lo que les hace también estar bastante empanados. La empatía es su fuerte.");

        leer.close();
    }
    
}
