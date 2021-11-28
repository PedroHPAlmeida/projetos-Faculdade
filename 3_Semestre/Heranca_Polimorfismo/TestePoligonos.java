public class TestePoligonos {
    public static void main(String[] args) {
        PoligonoRegular[] poligonos = new PoligonoRegular[4];

        poligonos[0] = new Quadrado(5);
        poligonos[1] = new Triangulo(4);
        poligonos[2] = poligonos[1];
        poligonos[3] = new Quadrado(5);

        for (PoligonoRegular p : poligonos) {
            System.out.println(p.getClass().getName());
            System.out.println("Area = " + String.format("%.3f", p.calculoArea()));
            System.out.println("Perimetro = " + String.format("%.3f", p.calculoPerimetro()) + "\n");
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(
                    "HashCode do objeto poligonos[" + i + "]: " + Integer.toHexString(poligonos[i].hashCode()));
            if (poligonos[0].equals(poligonos[i])) {
                System.out.println("Figuras 0 e " + i + " iguais");
            } else {
                System.out.println("Figuras 0 e " + i + " diferentes");
            }
        }
    }
}