public abstract class PoligonoRegular {
    // attributes
    private int nLados;
    private double lado;

    // constructor
    public PoligonoRegular(int nLados, double lado) {
        this.setNLados(nLados);
        this.setLado(lado);
    }

    // getters
    public int getNLados() {
        return this.nLados;
    }

    public double getLado() {
        return this.lado;
    }

    // setters
    public void setNLados(int nLados) {
        this.nLados = nLados;
    }

    public void setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
        } else {
            this.lado = 1;
        }
    }

    // abstract methods
    public abstract double calculoArea();

    // methods
    public double calculoPerimetro() {
        return this.getNLados() * this.getLado();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof PoligonoRegular){
            PoligonoRegular pol = (PoligonoRegular)obj;
            if(this.lado != pol.lado){
                return false;
            }
            if(this.nLados != pol.nLados){
                return false;
            }
        }
        return true;
    }
}