public class Triangle {
    private double lado1;
    private double lado2;
    private double lado3;
    public String tipoDoTriangle;
    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public double getLado3() {
        return lado3;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    public String getTipoDoTriangle() {
        return tipoDoTriangle;
    }
    public void setTipoDoTriangle(String tipoDoTriangle) {
        this.tipoDoTriangle = tipoDoTriangle;
    }
    public String type(double lado1, double lado2, double lado3 ) {
        if (lado1 == lado2 && lado2 == lado3) {
            return tipoDoTriangle = "Equilátero";
        }
        else if (lado1 == lado2 && lado3 != lado2 || lado3 == lado2 && lado3 != lado1 ||
         lado3 == lado1 && lado3 != lado2) {
            return tipoDoTriangle = "Isósciles";
        }
        else {
            return tipoDoTriangle = "Escaleno";
        }
    }
}