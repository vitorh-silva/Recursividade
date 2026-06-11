void main(String[] args) {
    contagemRegressiva(10);
}

public static void contagemRegressiva(int n){
    if(n < 0) return;

    System.out.println(n);
    contagemRegressiva(n - 1);
}