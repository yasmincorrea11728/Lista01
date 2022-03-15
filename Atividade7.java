import java.util.Scanner;

public class Atividade7 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int NumeroInteiro1 = sc.nextInt();

        System.out.print("Digite outro numero inteiro: ");
        int NumeroInteiro2 = sc.nextInt();

        System.out.print("Digite mais um numero inteiro: ");
        int NumeroInteiro3 = sc.nextInt();

        int SomaDosValores = NumeroInteiro1 + NumeroInteiro2 + NumeroInteiro3;

        System.out.print("A soma dos valores é: " + SomaDosValores);

    }
 }
