public class Lavadora extends Electrodomestico{
    
    private double carga;

    private final static double CARGA_DEF = 5;

    public Lavadora(){
        this.carga = CARGA_DEF;
    }

    public Lavadora(double precio,double peso){
        this.precioBase = precio;
        this.peso = peso;
        this.carga = CARGA_DEF;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga(){
        return this.carga;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga >30) {
            precioBase += 50;
        }else{

        }
    }
    
}
