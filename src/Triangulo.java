public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nome) {
        super(nome);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (base * altura) / 2;
    }

    @Override
    public String getDescricao() {
        return "Triângulo com base = " + base + " e altura = " + altura;
    }
} 