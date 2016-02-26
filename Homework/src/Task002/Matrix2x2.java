package Task002;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task002
 */
public class Matrix2x2 {
    double[][] m = new double[2][2];

    public Matrix2x2() {
        this (0);
    }

    public Matrix2x2(double a) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = a;
            }
        }
    }

    public Matrix2x2(double[][] m) {
        this.m = m;
    }

    public Matrix2x2(double m00, double m01, double m10, double m11) {
        m[0][0] = m00;
        m[0][1] = m01;
        m[1][0] = m10;
        m[1][1] = m11;
    }

    public double[][] getM() {
        return m;
    }

    public Matrix2x2 add (Matrix2x2 m) {
        Matrix2x2 m1 = new Matrix2x2();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m1.m[i][j] = this.m[i][j] + m.m[i][j];
            }
        }
        return m1;
    }

    public void add2 (Matrix2x2 m) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.m[i][j] = this.m[i][j] + m.m[i][j];
            }
        }
    }

    public Matrix2x2 sub (Matrix2x2 m) {
        Matrix2x2 m1 = new Matrix2x2();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m1.m[i][j] = this.m[i][j] - m.m[i][j];
            }
        }
        return m1;
    }

    public void sub2 (Matrix2x2 m) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.m[i][j] = this.m[i][j] - m.m[i][j];
            }
        }
    }

    public Matrix2x2 multNumber(double a) {
        Matrix2x2 m1 = new Matrix2x2();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m1.m[i][j] = this.m[i][j] * a;
            }
        }
        return m1;
    }

    public void multNumber2(double a) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = m[i][j] * a;
            }
        }
    }

    public Matrix2x2 mult(Matrix2x2 m) {
        Matrix2x2 m1 = new Matrix2x2();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m1.m[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    m1.m[i][j] += (this.m[i][k] * m.m[k][j]);
                }
            }
        }
        return m1;
    }

    public void mult2(Matrix2x2 m3) {
        Matrix2x2 m0 = new Matrix2x2();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m0.m[i][j] = this.m[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    m[i][j] = m[i][j] + (m0.m[i][k] * m3.m[k][j]);
                }
            }
        }
    }

    public double det() {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public void transpon() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (j > i) {
                    double a = this.m[i][j];
                    this.m[i][j] = this.m[j][i];
                    this.m[j][i] = a;
                }
            }
        }
    }

    public Matrix2x2 inverseMatrix() {
        Matrix2x2 m = new Matrix2x2();

        double a = this.m[0][0];
        double b = this.m[0][1];
        double c = this.m[1][0];
        double d = this.m[1][1];

        double det = a * d - b * c;

        if (det != 0) {
            m.m[0][0] = d / det;
            m.m[0][1] = -b / det;
            m.m[1][0] = -c / det;
            m.m[1][1] = a / det;

            return m;
        }
        else {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m.m[i][j] = 0;
                }
            }
            //System.out.println("Обратной матрицы не существует");
            return m;

        }
    }

    public Matrix2x2 equivalentDiagonal() {
        Matrix2x2 m = new Matrix2x2();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m.m[i][j] = this.m[i][j];
            }
        }

        double t = m.m[1][0] / m.m[0][0];
        for (int k = 0; k < 2; k++) {
            m.m[1][k] = m.m[1][k] - t * m.m[0][k];
        }

        t = m.m[0][1] / m.m[1][1];
        m.m[0][1] = m.m[0][1] - t * m.m[1][1];

        return m;
    }

    public Vector2D multVector(Vector2D v) {
        return new Vector2D(v.getX() * this.m[0][0 ] + v.getX() * this.m[0][1], v.getY() * this.m[1][0] + v.getY() * this.m[1][1]);
    }
}