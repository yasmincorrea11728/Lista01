import java.util.Scanner;

public class Atividade4 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma velocidade (Km/h) para ser convertida em m/s: ");
        int kmh = sc.nextInt();

        

        double mps = kmh/36; 

        System.out.print("A velocidade em M/s é: " + mps);

    }
 }
