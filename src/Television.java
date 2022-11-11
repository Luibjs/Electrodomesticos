public class Television extends Electrodomestico{
    
    private double resolucion ;
    private boolean sincronizadorTdt;
    private double precioSOlo;
    private final double RESOLUCION_DEF = 20;

    
    //constructors

    public Television() {
        this.resolucion = RESOLUCION_DEF;
        this.sincronizadorTdt = false;
    }


    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_DEF;
        this.sincronizadorTdt = false;
    }


    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion,
            boolean sincronizadorTdt) {
        super(precioBase, color, consumoEnergetico, peso);
        precioSOlo = precioBase;
        this.resolucion = resolucion;
        this.sincronizadorTdt = sincronizadorTdt;
    }

    //getter

    public double getResolucion() {
        return resolucion;
    }


    public boolean isSincronizadorTdt() {
        return sincronizadorTdt;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        double porPrecio;
        if (resolucion > 40) {
            porPrecio = precioSOlo*30/100;
            precioBase += porPrecio;
        }if (sincronizadorTdt == true){
            precioBase += 50;
        }
    }

   

}
