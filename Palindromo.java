import java.util.Scanner;
public class Palindromo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Ingrese un texto: ");
        String texto= scanner.nextLine();
        if (esPalindromo(texto)){
            System.out.println("Es un palindromo.");
        }else{
            System.out.println("No es un palindromo.");
        }
        scanner.close();
    }
    
    public static boolean esPalindromo(String texto){
        String minusculas= texto.replaceAll("\\s", " ").toLowerCase();
        int longitud= minusculas.length();
        for (int i = 0; i<longitud/2; i++){
            if (minusculas.charAt(i) != minusculas.charAt(longitud - 1 - i));
            return true;
        }

    {
    return false;
}
    }
}

