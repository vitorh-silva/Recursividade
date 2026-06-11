public class Exercicio6 {

    public static int somaVetor(int[] vetor, int indice){
        if(indice == vetor.length){
            return 0;
        }
        return vetor[indice] + somaVetor(vetor, indice +1);
    }

    static void main(String[] args) {
        int[] numero = {1,2,3,4,5};
        System.out.println(somaVetor(numero, 0));
    }

}
