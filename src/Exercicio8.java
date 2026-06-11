public class Exercicio8 {

    public static String inverter(String texto){
        if(texto.isEmpty()){
            return "";
        }
        return inverter(texto.substring(1)) + texto.charAt(0);
    }

    static void main(String[] args) {
        String palavra = "ola";
        System.out.println(inverter(palavra));
    }
}
