import java.util.Scanner;
public class MCD {
    public static void main(final String[] args) throws Exception {
        scanner Scanner = new scanner(System.in);

        System.out.print ("Ingresa el primer numero: ");
        int n1= Scanner.nextInt();

        System.out.print ("Ingresa el segundo numero: ");
        int n2= Scanner.nextInt();

        final int mcd = calcularmcd (n1,n2);
        System.out.println("El MCD de " + n1 + " y " + n2 + " es " + mcd);

        scanner.close(); }

    public static int calcularmcd (int a, int b){
        while (b != 0){
            int temp = b;
            b= a%b;
            a=temp;
    }
    return a;
    }
}
