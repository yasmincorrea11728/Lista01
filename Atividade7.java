public class Exercicio7 {
    public static void main(String[] args) {
        double ValorTotal = 780000.00;
        double PrimeiroGanhador = (ValorTotal*46)/100;
        double SegundoGanhador = (ValorTotal*32)/100;
        double TerceiroGanhador = ValorTotal - (PrimeiroGanhador + SegundoGanhador)  ;
        System.out.println("Primeiro Ganhador: "+PrimeiroGanhador);
        System.out.println("Segundo Ganhador: "+SegundoGanhador);
        System.out.println("Terceiro Ganhador: "+TerceiroGanhador);
    
    }
    
}
