package Task003;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task003
 */

public class ComplexMatrix2x2 {
    private ComplexNumber[][] cm = new ComplexNumber[2][2];

    public ComplexMatrix2x2() {
        this(new ComplexNumber(), new ComplexNumber(), new ComplexNumber(), new ComplexNumber());
    }

    public ComplexMatrix2x2(ComplexNumber cn) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                cm[i][j] = cn;
            }
        }
    }

    public ComplexMatrix2x2(ComplexNumber cn1, ComplexNumber cn2, ComplexNumber cn3, ComplexNumber cn4) {
        cm[0][0] = cn1;
        cm[0][1] = cn2;
        cm[1][0] = cn3;
        cm[1][1] = cn4;
    }

    public ComplexNumber[][] getCm() {
        return cm;
    }

    public ComplexMatrix2x2 add (ComplexMatrix2x2 cm) {
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                cm1.cm[i][j] = this.cm[i][j].add(cm.cm[i][j]);
            }
        }
        return cm1;
    }

    public ComplexMatrix2x2 mult(ComplexMatrix2x2 cm) {
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                cm1.cm[i][j] = (this.cm[i][0].mult(cm.cm[0][j])).add(this.cm[i][1].mult(cm.cm[1][j]));
            }
        }
        return cm1;
    }

    public ComplexNumber det() {
        return (cm[0][0].mult(cm[1][1])).sub(cm[0][1].mult(cm[1][0]));
    }

    public ComplexVector2D multVector(ComplexVector2D cv) {
        return new ComplexVector2D((cm[0][0].mult(cv.getCn1())).add(cm[0][1].mult(cv.getCn2())),
                (cm[1][0].mult(cv.getCn1())).add(cm[1][1].mult(cv.getCn2())));
    }

    public void print(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(cm[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
