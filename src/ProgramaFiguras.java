import java.util.ArrayList;
import java.util.List;

public class ProgramaFiguras {
    public static void main(String[] args) {
        // Cria objetos
        Retangulo retangulo = new Retangulo("Retângulo");
        retangulo.setBase(5.0);
        retangulo.setAltura(3.0);

        Triangulo triangulo = new Triangulo("Triângulo");
        triangulo.setBase(4.0);
        triangulo.setAltura(2.5);

        Circulo circulo = new Circulo("Círculo");
        circulo.setRaio(2.0);

        // Adiciona as figuras geométricas em uma lista
        List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>();
        listaFigurasGeometricas.add(retangulo);
        listaFigurasGeometricas.add(triangulo);
        listaFigurasGeometricas.add(circulo);

        // Mostra dados das figuras geométricas
        for (FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {
            System.out.println(figuraGeometrica.getDescricao());
            System.out.printf("Área da figura: %.2f \n", figuraGeometrica.getArea());
        }
    }
}