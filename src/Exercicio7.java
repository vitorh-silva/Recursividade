public class Exercicio7 {

    public static int maiorVetor(int[] vetor, int indice){
        if(indice == vetor.length){
            return vetor[indice];
        }
        int maiorRestante = maiorVetor(vetor, indice +1);

        if(vetor[indice] > maiorRestante){
            return vetor[indice];
        } else{
            return maiorRestante;
        }
    }

    static void main(String[] args) {
        int[] numeros = {10,2,8,12};
        System.out.println(maiorVetor(numeros, 0));
    }
}
