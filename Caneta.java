package GeteSet;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    private boolean destampada;
    public Caneta(String m, String c, float p) {//esse é o metodo construct
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.destampada = false;
    }
    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: "+getModelo());//para usar o c1.status() o get tem que ser this
        System.out.println("Ponta: "+getPonta());
        System.out.println("Cor: "+this.cor);
        System.out.println("Tampada: "+this.tampada);
    }
}
