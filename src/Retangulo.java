public class Retangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Retangulo(String nome) {
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
        return base * altura;
    }

    @Override
    public String getDescricao() {
        return "Retângulo com base = " + base + " e altura = " + altura;
    }
} 
