package br.edu.uricer;

public class CalculoIMC {

    private String sexo;
    private double altura;
    private double peso;

    public CalculoIMC() {
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calcular() {
        int resultado = 0;
        double indice = calcularIndiceGeral();
        if (sexo.equals("M")) {
            resultado = buscarResultadoMasculino(indice);
        } else {
            resultado = buscarResultadoFeminino(indice);
        }
        return resultado;
    }

    private double calcularIndiceGeral() {
        double imc = peso / (altura * altura);
        return imc;
    }

    private int buscarResultadoFeminino(double indice) {
        int resultado = 1;
        if (indice <= 19.1) {
            resultado = 0;
        } else if (indice > 25.8) {
            resultado = 2;
        }
        return resultado;
    }

    private int buscarResultadoMasculino(double indice) {
        int resultado = 1;
        if (indice <= 20.7) {
            resultado = 0;
        } else if (indice > 26.4) {
            resultado = 2;
        }
        return resultado;
    }

}
