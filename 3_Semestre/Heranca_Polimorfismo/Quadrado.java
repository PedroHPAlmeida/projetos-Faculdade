public class Quadrado extends PoligonoRegular{
    // constructor
    public Quadrado(double lado){
        super(4, lado);
    }

    // abstract methods
    public double calculoArea(){
        return super.getLado() * super.getLado();
    }
}
