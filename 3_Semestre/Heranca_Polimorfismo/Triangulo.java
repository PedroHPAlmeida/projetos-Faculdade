public class Triangulo extends PoligonoRegular {
    // attributes
    private double base;
    private double altura;

    // constructor
    public Triangulo(double lado) {
        super(3, lado);
        this.setBase(lado);
        this.setAltura(lado * Math.sqrt(3) / 2);
    }

    // getters
    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    // setters
    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            this.base = 1;
        }
    }

    public void setAltura(double altura) {
        if (base > 0) {
            this.altura = altura;
        } else {
            this.altura = 1;
        }
    }

    // abstract methods
    public double calculoArea() {
        return this.getBase() * this.getAltura() / 2;
    }
}
