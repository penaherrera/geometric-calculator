import javax.swing.*;

public class Figure {
    String geometric_figure;
    float major_base;
    float minor_base;
    float height;
    float radius;
    float result;

    public Figure(String geometric_figure, float major_base, float minor_base, float height, float radius,
    float result){
        this.geometric_figure = geometric_figure;
        this.major_base = major_base;
        this.minor_base = minor_base;
        this.height = height;
        this.radius = radius;
        this.result = result;
    }

    public void setGeometric_figure(String geometric_figure) {
        this.geometric_figure = geometric_figure;
    }

    public void setMajor_base(float major_base) {
        this.major_base = major_base;
    }

    public void setMinor_base(float minor_base) {
        this.minor_base = minor_base;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public void calculateSquareArea() {
        JOptionPane.showMessageDialog(null, "You selected: Calculate area of a Square");
    }
    public void calculateRectangleArea() {
        JOptionPane.showMessageDialog(null, "You selected: Calculate area of a Square");
    }
    public void calculateTrapezoidArea() {
        JOptionPane.showMessageDialog(null, "You selected: Calculate area of a Square");
    }
    public void calculateCircleArea() {
        JOptionPane.showMessageDialog(null, "You selected: Calculate area of a Square");
    }
    public void calculateRhomboidArea() {
        JOptionPane.showMessageDialog(null, "You selected: Calculate area of a Square");
    }
}
