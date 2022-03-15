import java.util.Scanner;

public class Atividade3 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Em que ano estamos?");
        int Ano1 = sc.nextInt();

        System.out.print("Quantos anos você tem?");
        int Ano2 = sc.nextInt();

        

        int AnoNascimento = Ano1 - Ano2;

        System.out.print("Você nasceu em: " + AnoNascimento);


    }
 }
