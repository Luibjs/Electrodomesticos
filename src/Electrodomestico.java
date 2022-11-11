public class Electrodomestico {
    
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    //valores por defecto

    protected final static String COLOR_DEF = "blanco";
    protected final static char CONSUMO_DEF = 'F';
    protected final static double PRECIO_DEF = 100;
    protected final static double PESO_DEF = 5;
    
    //constructores

    public Electrodomestico(){
        this.precioBase = PRECIO_DEF;
        this.color = COLOR_DEF;
        this.consumoEnergetico = CONSUMO_DEF;
        this.peso = PESO_DEF;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_DEF;
        this.consumoEnergetico= CONSUMO_DEF;
    }

    public Electrodomestico(double precioBase, String color, char consumo, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.peso = peso;
        comprobarConsumoEnergetico(consumo);
        comprobarColor(color);
    }

    //metodos 

    //get

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public static String getColorDef() {
        return COLOR_DEF;
    }

    public static char getConsumoDef() {
        return CONSUMO_DEF;
    }

    public static double getPrecioDef() {
        return PRECIO_DEF;
    }

    public static double getPesoDef() {
        return PESO_DEF;
    }

    private void comprobarConsumoEnergetico(char letra){
        char letraConsumo[] = {'A','B','C','D','F'};

        for (char u : letraConsumo) {
            if (u == letra) {
                consumoEnergetico = letra;
                break;
            }else{
                consumoEnergetico = CONSUMO_DEF;
            }
        }
    }

    private void comprobarColor(String color1){
        String colorElec[] = {"blanco","negro","rojo","azul","gris"};

        for (String string : colorElec) {
            if (string.equals(color1)) {
                color = color1;
                break;
            }else{
                color = COLOR_DEF;
            }
        }
    }

    public void precioFinal(){

        switch (consumoEnergetico) {
            case 'A':
                precioBase += 100;
                break;
        
            case 'B':
                precioBase += 80;
                break;
            
            case 'C':
                precioBase += 60;
                break; 
                
            case 'D':
                precioBase += 50;
                break;

            case 'E':
                precioBase +=30;
                break;
                
            case 'F':
                precioBase +=10;
                break;    
        }

        if (peso >= 0 && peso <= 19) {
            precioBase += 10;
        }else if (peso >= 20 && peso <= 49) {
            precioBase += 50;
        }else if (peso >= 50 && peso <= 79) {
            precioBase += 80;
        }else if (peso >= 80) {
            precioBase += 100;
        }else{
            System.out.println("¡Ingrese un peso valido!");
        }
    }
    
    
}
