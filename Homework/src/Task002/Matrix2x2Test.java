package Task002;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task002
 */

public class Matrix2x2Test {
    private final double EPS = 1e-9;

    //Matrix2x2() - конструктор для нулевой матрицы
    @Test
    public void defaultMatrixShouldHaveZeroValue00() {
        Matrix2x2 m = new Matrix2x2();
        Assert.assertEquals(0, m.getM()[0][0], EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroValue01() {
        Matrix2x2 m = new Matrix2x2();
        Assert.assertEquals(0, m.getM()[0][1], EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroValue10() {
        Matrix2x2 m = new Matrix2x2();
        Assert.assertEquals(0, m.getM()[1][0], EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroValue11() {
        Matrix2x2 m = new Matrix2x2();
        Assert.assertEquals(0, m.getM()[1][1], EPS);
    }

    //Matrix2x2(double) - конструктор для матрицы, у которой каждый элемент равен поданному числу
    @Test
    public void matrixWhichIsGivenBySingleNumberShouldHaveAllValuesEqualsToThisNumber00() {
        Matrix2x2 m = new Matrix2x2(5);
        Assert.assertEquals(5, m.getM()[1][1], EPS);
    }

    @Test
    public void matrixWhichIsGivenBySingleNumberShouldHaveAllValuesEqualsToThisNumber01() {
        Matrix2x2 m = new Matrix2x2(5);
        Assert.assertEquals(5, m.getM()[1][1], EPS);
    }

    @Test
    public void matrixWhichIsGivenBySingleNumberShouldHaveAllValuesEqualsToThisNumber10() {
        Matrix2x2 m = new Matrix2x2(5);
        Assert.assertEquals(5, m.getM()[1][1], EPS);
    }

    @Test
    public void matrixWhichIsGivenBySingleNumberShouldHaveAllValuesEqualsToThisNumber11() {
        Matrix2x2 m = new Matrix2x2(5);
        Assert.assertEquals(5, m.getM()[1][1], EPS);
    }

    //Matrix2x2(double [][]) - конструктор для матрицы, содержимое подается на вход в виде массива
    @Test
    public void valuesOfMatrixShouldBeEqualToGivenValues00() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Assert.assertEquals(1, m.getM()[0][0], EPS);
    }

    @Test
    public void valuesOfMatrixShouldBeEqualToGivenValues01() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Assert.assertEquals(2, m.getM()[0][1], EPS);
    }

    @Test
    public void valuesOfMatrixShouldBeEqualToGivenValues10() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Assert.assertEquals(3, m.getM()[1][0], EPS);
    }

    @Test
    public void valuesOfMatrixShouldBeEqualToGivenValues11() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Assert.assertEquals(4, m.getM()[1][1], EPS);
    }

    //Matrix2x2(double, double, double, double)
    @Test
    public void valueOfMatrixShouldBeEqualToGivenValue00() {
        Matrix2x2 m = new Matrix2x2(1, 2, 3, 4);
        Assert.assertEquals(1, m.getM()[0][0], EPS);
    }

    @Test
    public void valueOfMatrixShouldBeEqualToGivenValue01() {
        Matrix2x2 m = new Matrix2x2(1, 2, 3, 4);
        Assert.assertEquals(2, m.getM()[0][1], EPS);
    }

    @Test
    public void valueOfMatrixShouldBeEqualToGivenValue10() {
        Matrix2x2 m = new Matrix2x2(1, 2, 3, 4);
        Assert.assertEquals(3, m.getM()[1][0], EPS);
    }

    @Test
    public void valueOfMatrixShouldBeEqualToGivenValue11() {
        Matrix2x2 m = new Matrix2x2(1, 2, 3, 4);
        Assert.assertEquals(4, m.getM()[1][1], EPS);
    }

    //Matrix2x2 add(Matrix2x2) - сложение матрицы с другой
    @Test
    public void element00ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrix() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Assert.assertEquals(6, (m1.add(m2)).getM()[0][0], EPS);
    }

    @Test
    public void element01ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrix() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Assert.assertEquals(8, (m1.add(m2)).getM()[0][1], EPS);    }

    @Test
    public void element10ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrix() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Assert.assertEquals(10, (m1.add(m2)).getM()[1][0], EPS);
    }

    @Test
    public void element11ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrix() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Assert.assertEquals(12, (m1.add(m2)).getM()[1][1], EPS);
    }

    //void add(Matrix2x2) - сложение матрицы с другой
    @Test
    public void element00ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixVoidMethod() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        m1.add2(m2);
        Assert.assertEquals(6, m1.getM()[0][0], EPS);
    }

    @Test
    public void element01ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixVoidMethod() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        m1.add2(m2);
        Assert.assertEquals(8, m1.getM()[0][1], EPS);
    }

    @Test
    public void element10ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixVoidMethod() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        m1.add2(m2);
        Assert.assertEquals(10, m1.getM()[1][0], EPS);
    }

    @Test
    public void element11ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixVoidMethod() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        m1.add2(m2);
        Assert.assertEquals(12, m1.getM()[1][1], EPS);
    }

    //Matrix2x2 sub(Matrix2x2) - вычитание из матрицы другой матрицы
    @Test
    public void element00ShouldBeDifferenceBetweenFirstElementOfMatrixAndSecondElementOfMatrix() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 5},{4, 4}});
        Assert.assertEquals(0, (m1.sub(m2)).getM()[0][0], EPS);
    }

    @Test
    public void element01ShouldBeDifferenceBetweenFirstElementOfMatrixAndSecondElementOfMatrix() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 5},{4, 4}});
        Assert.assertEquals(1, (m1.sub(m2)).getM()[0][1], EPS);
    }

    @Test
    public void element10ShouldBeDifferenceBetweenFirstElementOfMatrixAndSecondElementOfMatrix() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 5},{4, 4}});
        Assert.assertEquals(3, (m1.sub(m2)).getM()[1][0], EPS);
    }

    @Test
    public void element11ShouldBeDifferenceBetweenFirstElementOfMatrixAndSecondElementOfMatrix() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 5},{4, 4}});
        Assert.assertEquals(4, (m1.sub(m2)).getM()[1][1], EPS);
    }

    //void sub(Matrix2x2) - вычитание из матрицы другой матрицы
    @Test
    public void element00ShouldBeDifferenceBetweenFirstElementOfMatrixAndSecondElementOfMatrixVoidMethod() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 5},{4, 4}});
        m1.sub2(m2);
        Assert.assertEquals(0, m1.getM()[0][0], EPS);
    }

    @Test
    public void element01ShouldBeDifferenceBetweenFirstElementOfMatrixAndSecondElementOfMatrixVoidMethod() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 5},{4, 4}});
        m1.sub2(m2);
        Assert.assertEquals(1, m1.getM()[0][1], EPS);
    }

    @Test
    public void element10ShouldBeDifferenceBetweenFirstElementOfMatrixAndSecondElementOfMatrixVoidMethod() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 5},{4, 4}});
        m1.sub2(m2);
        Assert.assertEquals(3, m1.getM()[1][0], EPS);
    }

    @Test
    public void element11ShouldBeDifferenceBetweenFirstElementOfMatrixAndSecondElementOfMatrixVoidMethod() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 5},{4, 4}});
        m1.sub2(m2);
        Assert.assertEquals(4, m1.getM()[1][1], EPS);
    }

    //Matrix2x2 multNumber(double) - умножение матрицы на вещественное число
    @Test
    public void element00ShouldBeEqualToTheProductOfElement00OfFirstMatrixToGivenNumber() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Assert.assertEquals(10, (m.multNumber(2)).getM()[0][0], EPS);
    }

    @Test
    public void element01ShouldBeEqualToTheProductOfElement01OfFirstMatrixToGivenNumber() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Assert.assertEquals(12, (m.multNumber(2)).getM()[0][1], EPS);
    }

    @Test
    public void element10ShouldBeEqualToTheProductOfElement10OfFirstMatrixToGivenNumber() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Assert.assertEquals(14, (m.multNumber(2)).getM()[1][0], EPS);
    }

    @Test
    public void element11ShouldBeEqualToTheProductOfElement11OfFirstMatrixToGivenNumber() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Assert.assertEquals(16, (m.multNumber(2)).getM()[1][1], EPS);
    }

    //void multNumber(double) - умножение матрицы на вещественное число
    @Test
    public void element00ShouldBeEqualToTheProductOfElement00OfFirstMatrixToGivenNumberVoidMethod() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        m.multNumber2(2);
        Assert.assertEquals(10, m.getM()[0][0], EPS);
    }

    @Test
    public void element01ShouldBeEqualToTheProductOfElement01OfFirstMatrixToGivenNumberVoidMethod() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        m.multNumber2(2);
        Assert.assertEquals(12, m.getM()[0][1], EPS);
    }

    @Test
    public void element10ShouldBeEqualToTheProductOfElement10OfFirstMatrixToGivenNumberVoidMethod() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        m.multNumber2(2);
        Assert.assertEquals(14, m.getM()[1][0], EPS);
    }

    @Test
    public void element11ShouldBeEqualToTheProductOfElement11OfFirstMatrixToGivenNumberVoidMethod() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        m.multNumber2(2);
        Assert.assertEquals(16, m.getM()[1][1], EPS);
    }

    //Matrix2x2 mult(Matrix2x2) - умножение матрицы на другую матрицу
    @Test
    public void element00ShouldBeEqualSumOfElement00OfFirstMatrixMultipliedByElement00OfSecondMatrixAndElement10OfFirstMatrixMultipliedByElement10OfSecondMatrix() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Assert.assertEquals(19, (m1.mult(m2)).getM()[0][0], EPS);
    }

    @Test
    public void element01ShouldBeEqualSumOfElement00OfFirstMatrixMultipliedByElement01OfSecondMatrixAndElement10OfFirstMatrixMultipliedByElement11OfSecondMatrix() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Assert.assertEquals(22, (m1.mult(m2)).getM()[0][1], EPS);
    }

    @Test
    public void element10ShouldBeEqualSumOfElement10OfFirstMatrixMultipliedByElement00OfSecondMatrixAndElement11OfFirstMatrixMultipliedByElement10OfSecondMatrix() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Assert.assertEquals(43, (m1.mult(m2)).getM()[1][0], EPS);
    }

    @Test
    public void element11ShouldBeEqualSumOfElement10OfFirstMatrixMultipliedByElement01OfSecondMatrixAndElement11OfFirstMatrixMultipliedByElement11OfSecondMatrix() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        Assert.assertEquals(50, (m1.mult(m2)).getM()[1][1], EPS);
    }

    //void mult(Matrix2x2) - умножение матрицы на другую матрицу
    @Test
    public void element00ShouldBeEqualSumOfElement00OfFirstMatrixMultipliedByElement00OfSecondMatrixAndElement10OfFirstMatrixMultipliedByElement10OfSecondMatrixVoidMethod() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        m1.mult2(m2);
        Assert.assertEquals(19, m1.getM()[0][0], EPS);
    }

    @Test
    public void element01ShouldBeEqualSumOfElement00OfFirstMatrixMultipliedByElement01OfSecondMatrixAndElement10OfFirstMatrixMultipliedByElement11OfSecondMatrixVoidMethod() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        m1.mult2(m2);
        Assert.assertEquals(22, m1.getM()[0][1], EPS);
    }

    @Test
    public void element10ShouldBeEqualSumOfElement10OfFirstMatrixMultipliedByElement00OfSecondMatrixAndElement11OfFirstMatrixMultipliedByElement10OfSecondMatrixVoidMethod() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        m1.mult2(m2);
        Assert.assertEquals(43, m1.getM()[1][0], EPS);
    }

    @Test
    public void element11ShouldBeEqualSumOfElement10OfFirstMatrixMultipliedByElement01OfSecondMatrixAndElement11OfFirstMatrixMultipliedByElement11OfSecondMatrixVoidMethod() {
        Matrix2x2 m1 = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Matrix2x2 m2 = new Matrix2x2(new double[][] {{5, 6},{7, 8}});
        m1.mult2(m2);
        Assert.assertEquals(50, m1.getM()[1][1], EPS);
    }

    //double det() - определитель матрицы
    @Test
    public void detShouldBeEqualsElem00MultElem11SubElem01MultElem10() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Assert.assertEquals(-2, m.det(), EPS);
    }

    //void transpon() - транспонировать матрицу
    @Test
    public void elem00ShouldRemainInPlace() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        m.transpon();
        Assert.assertEquals(1, m.getM()[0][0], EPS);
    }

    @Test
    public void elem01ShouldBeEqualsElem10() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        m.transpon();
        Assert.assertEquals(3, m.getM()[0][1], EPS);
    }

    @Test
    public void elem10ShouldBeEqualsElem01() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        m.transpon();
        Assert.assertEquals(2, m.getM()[1][0], EPS);
    }

    @Test
    public void elem11ShouldRemainInPlace() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        m.transpon();
        Assert.assertEquals(4, m.getM()[1][1], EPS);
    }

    //Matrix2x2 inverseMatrix() - возвратить обратную матрицу для заданной.
    // Если это невозможно, вывести сообщение об ошибке и вернуть нулевую матрицу.
    @Test
    public void elem00OfInverseMatrixShouldBeCorrect() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Assert.assertEquals(-2, (m.inverseMatrix()).getM()[0][0], EPS);
    }

    @Test
    public void elem01OfInverseMatrixShouldBeCorrect() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Assert.assertEquals(1, (m.inverseMatrix()).getM()[0][1], EPS);
    }

    @Test
    public void elem10OfInverseMatrixShouldBeCorrect() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Assert.assertEquals(1.5, (m.inverseMatrix()).getM()[1][0], EPS);
    }

    @Test
    public void elem11OfInverseMatrixShouldBeCorrect() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Assert.assertEquals(-0.5, (m.inverseMatrix()).getM()[1][1], EPS);
    }

    // Для вырожденной матрицы
    @Test
    public void elem00OfInverseMatrixShouldBeCorrect2() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{2, 2},{2, 2}});
        Assert.assertEquals(0, (m.inverseMatrix()).getM()[0][0], EPS);
    }

    @Test
    public void elem01OfInverseMatrixShouldBeCorrect2() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{2, 2},{2, 2}});
        Assert.assertEquals(0, (m.inverseMatrix()).getM()[0][1], EPS);
    }

    @Test
    public void elem10OfInverseMatrixShouldBeCorrect2() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{2, 2},{2, 2}});
        Assert.assertEquals(0, (m.inverseMatrix()).getM()[1][0], EPS);
    }

    @Test
    public void elem11OfInverseMatrixShouldBeCorrect2() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{2, 2},{2, 2}});
        Assert.assertEquals(0, (m.inverseMatrix()).getM()[1][1], EPS);
    }

    //Matrix2x2 equivalentDiagonal() - возвратить эквивалентную диагональную матрицу
    @Test
    public void elem00OfEquivalentDiagonalMatrixShouldBeCorrect2() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Assert.assertEquals(1, (m.equivalentDiagonal()).getM()[0][0], EPS);
    }

    @Test
    public void elem01OfEquivalentDiagonalMatrixShouldBeCorrect2() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Assert.assertEquals(0, (m.equivalentDiagonal()).getM()[0][1], EPS);
    }

    @Test
    public void elem10OfEquivalentDiagonalMatrixShouldBeCorrect2() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Assert.assertEquals(0, (m.equivalentDiagonal()).getM()[1][0], EPS);
    }

    @Test
    public void elem11OfEquivalentDiagonalMatrixShouldBeCorrect2() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Assert.assertEquals(-2, (m.equivalentDiagonal()).getM()[1][1], EPS);
    }

    // Vector2D multVector(Vector2D) - умножить матрицу на двумерный вектор (считая его столбцом)
    // и возвратить получившийся столбец в виде вектора
    @Test
    public void xShouldBeEqualsElem00AddElem01MultCoordinateXOfVectorV() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Vector2D v = new Vector2D(3,7);
        Assert.assertEquals(9, (m.multVector(v)).getX(), EPS);
    }

    @Test
    public void yShouldBeEqualsElem10AddElem11MultCoordinateYOfVectorV() {
        Matrix2x2 m = new Matrix2x2(new double[][] {{1, 2},{3, 4}});
        Vector2D v = new Vector2D(3,7);
        Assert.assertEquals(49, (m.multVector(v)).getY(), EPS);
    }
}
