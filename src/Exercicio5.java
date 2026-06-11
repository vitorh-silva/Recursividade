public class Exercicio5 {

    public static int fibonacci(int numero){
        if (numero == 0){
            return 0;
        }
        if(numero == 1){
            return 1;
        }
        return fibonacci(numero-1) + fibonacci(numero-2);
    }

    static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
}
