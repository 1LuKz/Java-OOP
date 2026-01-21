package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double areaTriangle(){
        double heronForm = (a + b + c) / 2.0;
        double areaFirstTriangle = Math.sqrt(heronForm * (heronForm - a) * (heronForm - b) * (heronForm - c));
        return areaFirstTriangle;
    }
}
