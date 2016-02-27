package Task003;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task003
 */

public class ComplexVector2D {
    private ComplexNumber cn1,cn2;

    public ComplexVector2D(ComplexNumber cn1, ComplexNumber cn2) {
        this.cn1 = cn1;
        this.cn2 = cn2;
    }

    public ComplexNumber getCn1() {
        return cn1;
    }

    public ComplexNumber getCn2() {
        return cn2;
    }
}
