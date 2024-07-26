import java.util.Scanner;
public class CambioPalabras {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Ingresa algun texto al que le quiera cambiar letras: ");
        String Palabra= Palabra.nextLine();

        System.out.println ("Que letra le gustaria cambiar: ");
        String Letra = Letra.nextLine();

        System.out.println ("Por cual letra le gustaria reemplazarla: ");
        String rem = rem.nextLine();

        System.out.println (Palabra.remplace(Letra, rem));

        
    }
}
