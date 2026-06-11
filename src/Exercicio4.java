public class Exercicio4 {

    public static int baseExpoente(int base, int expoente){
        if(expoente == 0){
            return 1;
        }

        return base * baseExpoente(base, expoente-1);
    }

    static void main(String[] args) {
        System.out.println(baseExpoente(2,5));
    }
}
