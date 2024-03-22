package GeteSet;
public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("bic", "amarela", 0.5f);
        c1.modelo = "BIC"; //possível já  que modelo esta publico
        c1.setPonta(0.5f); //tem que chamar o set pois ponta esta privado
        c1.status();
        System.out.println("tenho uma caneta "+c1.getModelo()+ "de ponta "+c1.getPonta());
        Caneta c2 = new Caneta("faber", "preta", 1.5f);
        c2.status();
    }
}
