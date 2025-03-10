package fundamentos.Semana4.caneta;
//Usa-se Alt Insert
public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String cor, String modelo, float ponta) {
        this.cor = cor;
        this.modelo = modelo;
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}
