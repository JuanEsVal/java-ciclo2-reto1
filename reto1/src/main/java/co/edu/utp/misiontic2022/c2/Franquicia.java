package co.edu.utp.misiontic2022.c2;

public class Franquicia{

    private int tiempo;
    private double capital;
    private double interes;

    public Franquicia(){
    }

    public Franquicia(int tiempo, double capital, double interes){
        this.tiempo = tiempo;
        this.capital = capital;
        this.interes = interes;
    }

    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getCapital() {
        return capital;
    }
    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double calcularInteresCompuesto(){

        return  getCapital() *( Math.pow( (1 + getInteres()), getTiempo()) - 1);
    }
    
    public double calcularInteresSimple(){
        return getCapital() * getInteres() * getTiempo();
    }

    public String compararFranquicia(int pTiempo, double pCapital, double pInteres){
        
        setTiempo(pTiempo);
        setCapital(pCapital);
        setInteres(pInteres);

        double respuesta = calcularInteresCompuesto() - calcularInteresSimple();

        if(calcularInteresCompuesto() == 0){
            return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        }
        return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + respuesta;
    }       

    public String compararFranquicia(){

        double respuesta = calcularInteresCompuesto() - calcularInteresSimple();

        if(calcularInteresCompuesto() == 0){
            return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        }
        return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + respuesta;
    }
}