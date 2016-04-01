package Task009;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task009
 */

public class ComplexNumber {
    private double x,y;

    public ComplexNumber() {
        this(0,0);
    }

    public ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public ComplexNumber add(ComplexNumber cn){
        return new ComplexNumber(x + cn.x, y + cn.y);
    }

    public ComplexNumber sub(ComplexNumber cn){
        return new ComplexNumber(x - cn.x, y - cn.y);
    }

    public ComplexNumber mult (ComplexNumber cn) {
        return new ComplexNumber(x * cn.x - y * cn.y, x * cn.y + y * cn.x);
    }
}
