public class Circulo extends FiguraGeometrica {
    private double raio;

    public Circulo(String nome) {
        super(nome);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String getDescricao() {
        return "Círculo com raio = " + raio;
    }
}