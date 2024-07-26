import java.util.Scanner;
public class NumerosPrimos{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Ingresa un numero entero: ");
        int Numero = scanner.nextInt();

        if (Primo(Numero)){
            System.out.println("El numero "+ Numero + "es primo.");
        }else { 
            System.out.println("El numero "+ Numero + "no es primo.");
        }
        scanner.close();
    }
    public static boolean Primo(int Numero){
        if (Numero <= 1){
            return false;

        }
        for (int i = 2; i= Math.sqrt(Numero); i++){
            if (Numero % i == 0){
                return false;

        }

    }
return true;
    }
}


