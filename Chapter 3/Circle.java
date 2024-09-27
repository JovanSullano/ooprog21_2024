public class Circle {
    
    private double radius;
    private double diameter;
    private double area;

    public Circle() {
        this.radius = 1;
        updateProperties();
    }

    public Circle(double radius) {
        this.radius = radius;
        updateProperties();
    }
    private void updateProperties() {
        this.diameter = 2 * radius;
        this.area = Math.PI * radius * radius;
    }

    public void setRadius(double rad) {
        this.radius = rad;
        updateProperties();
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }
}
