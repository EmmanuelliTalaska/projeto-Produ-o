package br.ulbra.classe;

/**
 * 17/03/2022
 *
 * @author Manu Talaska
 */
public class Producao {

    protected String peca;
    protected int segundos;
    protected int hora;
    protected int minuto;
    protected int segundo;

    public Producao(int hora) {
        this.peca = "teclado";
        this.segundos = 100;
        this.hora = hora;
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public void setSegundos(int segundos) {

        if (segundos < 0) {
            System.out.println(" número negativo ");

        } else {
            this.segundos = segundos;

        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void calcularHMS() {
        int ssegundos;
        ssegundos = 0;
        this.hora = segundos / 3600;
        ssegundos = segundos % 3600;
        this.minuto = ssegundos / 60;
        ssegundos %= 60;
        segundo = ssegundos;
    }

    @Override
    public String toString() {
        return " Producao "
                + " A peça: " + this.getPeca()
                + " que levou um total de " + segundos
                + " levou " + this.getHora()
                + " : " + this.getMinuto()
                + " : " + this.getSegundo() + " para ficar pronta! ";
    }
}
