package Task009;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task009
 */

public class ComplexMatrix2x2Test {
    private static ComplexMatrix2x2 simpleComplexMatrix2x2;
    private static ComplexMatrix2x2 notSimpleComplexMatrix2x2_1;
    private static ComplexMatrix2x2 notSimpleComplexMatrix2x2_2;
    private static ComplexMatrix2x2 notSimpleComplexMatrix2x2_3;
    private static ComplexMatrix2x2 notSimpleComplexMatrix2x2_4;
    private static ComplexVector2D complexVector2D;
    private final double EPS = 1e-9;

    @BeforeClass
    public static void beforeClass(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        simpleComplexMatrix2x2 = (ComplexMatrix2x2) ac.getBean("simpleComplexMatrix2x2");
        notSimpleComplexMatrix2x2_1 = (ComplexMatrix2x2) ac.getBean("notSimpleComplexMatrix2x2_1");
        notSimpleComplexMatrix2x2_2 = (ComplexMatrix2x2) ac.getBean("notSimpleComplexMatrix2x2_2");
        notSimpleComplexMatrix2x2_3 = (ComplexMatrix2x2) ac.getBean("notSimpleComplexMatrix2x2_3");
        notSimpleComplexMatrix2x2_4 = (ComplexMatrix2x2) ac.getBean("notSimpleComplexMatrix2x2_4");
        complexVector2D = (ComplexVector2D) ac.getBean("complexVector2D");

    }

    //ComplexMatrix2x2() - конструктор для нулевой матрицы
    @Test
    public void defaultMatrixShouldHaveZeroValue00CheckX() {
        Assert.assertEquals(0, (simpleComplexMatrix2x2.getCm()[0][0]).getX(), EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroValue00CheckY() {
        Assert.assertEquals(0, (simpleComplexMatrix2x2.getCm()[0][0]).getY(), EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroValue01CheckX() {
        Assert.assertEquals(0, (simpleComplexMatrix2x2.getCm()[0][1]).getX(), EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroValue01CheckY() {
        Assert.assertEquals(0, (simpleComplexMatrix2x2.getCm()[0][1]).getY(), EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroValue10CheckX() {
        Assert.assertEquals(0, (simpleComplexMatrix2x2.getCm()[1][0]).getX(), EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroValue10CheckY() {
        Assert.assertEquals(0, (simpleComplexMatrix2x2.getCm()[1][0]).getY(), EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroValue11CheckX() {
        Assert.assertEquals(0, (simpleComplexMatrix2x2.getCm()[1][1]).getX(), EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroValue11CheckY() {
        Assert.assertEquals(0, (simpleComplexMatrix2x2.getCm()[1][1]).getY(), EPS);
    }

    //ComplexMatrix2x2(ComplexNumber) - конструктор для матрицы, у которой каждый элемент равен поданному числу
    @Test
    public void MatrixShouldHaveGivenValue00CheckX() {
        Assert.assertEquals(4, (notSimpleComplexMatrix2x2_1.getCm()[0][0]).getX(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValue00CheckY() {
        Assert.assertEquals(5, (notSimpleComplexMatrix2x2_1.getCm()[0][0]).getY(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValue01CheckX() {
        Assert.assertEquals(4, (notSimpleComplexMatrix2x2_1.getCm()[0][1]).getX(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValue01CheckY() {
        Assert.assertEquals(5, (notSimpleComplexMatrix2x2_1.getCm()[0][1]).getY(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValue10CheckX() {
        Assert.assertEquals(4, (notSimpleComplexMatrix2x2_1.getCm()[1][0]).getX(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValue10CheckY() {
        Assert.assertEquals(5, (notSimpleComplexMatrix2x2_1.getCm()[1][0]).getY(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValue11CheckX() {
        Assert.assertEquals(4, (notSimpleComplexMatrix2x2_1.getCm()[1][1]).getX(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValue11CheckY() {
        Assert.assertEquals(5, (notSimpleComplexMatrix2x2_1.getCm()[1][1]).getY(), EPS);
    }

    //ComplexMatrix2x2(ComplexNumber, ComplexNumber, ComplexNumber, ComplexNumber) - конструктор на 4 дробях
    @Test
    public void MatrixShouldHaveGivenValues00CheckX() {
        Assert.assertEquals(1, (notSimpleComplexMatrix2x2_2.getCm()[0][0]).getX(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValues00CheckY() {
        Assert.assertEquals(2, (notSimpleComplexMatrix2x2_2.getCm()[0][0]).getY(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValues01CheckX() {
        Assert.assertEquals(2, (notSimpleComplexMatrix2x2_2.getCm()[0][1]).getX(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValues01CheckY() {
        Assert.assertEquals(3, (notSimpleComplexMatrix2x2_2.getCm()[0][1]).getY(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValues10CheckX() {
        Assert.assertEquals(3, (notSimpleComplexMatrix2x2_2.getCm()[1][0]).getX(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValues10CheckY() {
        Assert.assertEquals(4, (notSimpleComplexMatrix2x2_2.getCm()[1][0]).getY(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValues11CheckX() {
        Assert.assertEquals(4, (notSimpleComplexMatrix2x2_2.getCm()[1][1]).getX(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValuesCheck11Y() {
        Assert.assertEquals(5, (notSimpleComplexMatrix2x2_2.getCm()[1][1]).getY(), EPS);
    }

    //ComplexMatrix2x2 add(ComplexMatrix2x2) - сложение матрицы с другой
    @Test
    public void element00ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixCheckX() {
        Assert.assertEquals(6, ((notSimpleComplexMatrix2x2_2.add(notSimpleComplexMatrix2x2_3)).getCm()[0][0]).getX(), EPS);
    }

    @Test
    public void element00ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixCheckY() {
        Assert.assertEquals(8, ((notSimpleComplexMatrix2x2_2.add(notSimpleComplexMatrix2x2_3)).getCm()[0][0]).getY(), EPS);
    }

    @Test
    public void element01ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixCheckX() {
        Assert.assertEquals(8, ((notSimpleComplexMatrix2x2_2.add(notSimpleComplexMatrix2x2_3)).getCm()[0][1]).getX(), EPS);
    }

    @Test
    public void element01ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixCheckY() {
        Assert.assertEquals(10, ((notSimpleComplexMatrix2x2_2.add(notSimpleComplexMatrix2x2_3)).getCm()[0][1]).getY(), EPS);
    }

    @Test
    public void element10ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixCheckX() {
        Assert.assertEquals(10, ((notSimpleComplexMatrix2x2_2.add(notSimpleComplexMatrix2x2_3)).getCm()[1][0]).getX(), EPS);
    }

    @Test
    public void element10ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixCheckY() {
        Assert.assertEquals(12, ((notSimpleComplexMatrix2x2_2.add(notSimpleComplexMatrix2x2_3)).getCm()[1][0]).getY(), EPS);
    }

    @Test
    public void element11ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixCheckX() {
        Assert.assertEquals(12, ((notSimpleComplexMatrix2x2_2.add(notSimpleComplexMatrix2x2_3)).getCm()[1][1]).getX(), EPS);
    }

    @Test
    public void element11ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixCheckY() {
        Assert.assertEquals(14, ((notSimpleComplexMatrix2x2_2.add(notSimpleComplexMatrix2x2_3)).getCm()[1][1]).getY(), EPS);
    }

    //ComplexMatrix2x2 mult(ComplexMatrix2x2) - умножение матрицы с другой
    @Test
    public void element00ShouldBeEqualSumOfElement00OfFirstMatrixMultipliedByElement00OfSecondMatrixAndElement10OfFirstMatrixMultipliedByElement10OfSecondMatrixCheckX() {
        Assert.assertEquals(-17, ((notSimpleComplexMatrix2x2_2.mult(notSimpleComplexMatrix2x2_3)).getCm()[0][0]).getX(), EPS);
    }

    @Test
    public void element00ShouldBeEqualSumOfElement00OfFirstMatrixMultipliedByElement00OfSecondMatrixAndElement10OfFirstMatrixMultipliedByElement10OfSecondMatrixCheckY() {
        Assert.assertEquals(53, ((notSimpleComplexMatrix2x2_2.mult(notSimpleComplexMatrix2x2_3)).getCm()[0][0]).getY(), EPS);
    }

    @Test
    public void element01ShouldBeEqualSumOfElement00OfFirstMatrixMultipliedByElement01OfSecondMatrixAndElement10OfFirstMatrixMultipliedByElement11OfSecondMatrixCheckX() {
        Assert.assertEquals(-19, ((notSimpleComplexMatrix2x2_2.mult(notSimpleComplexMatrix2x2_3)).getCm()[0][1]).getX(), EPS);
    }

    @Test
    public void element01ShouldBeEqualSumOfElement00OfFirstMatrixMultipliedByElement01OfSecondMatrixAndElement10OfFirstMatrixMultipliedByElement11OfSecondMatrixCheckY() {
        Assert.assertEquals(61, ((notSimpleComplexMatrix2x2_2.mult(notSimpleComplexMatrix2x2_3)).getCm()[0][1]).getY(), EPS);
    }

    @Test
    public void element10ShouldBeEqualSumOfElement10OfFirstMatrixMultipliedByElement00OfSecondMatrixAndElement11OfFirstMatrixMultipliedByElement10OfSecondMatrixCheckX() {
        Assert.assertEquals(-21, ((notSimpleComplexMatrix2x2_2.mult(notSimpleComplexMatrix2x2_3)).getCm()[1][0]).getX(), EPS);
    }

    @Test
    public void element10ShouldBeEqualSumOfElement10OfFirstMatrixMultipliedByElement00OfSecondMatrixAndElement11OfFirstMatrixMultipliedByElement10OfSecondMatrixCheckY() {
        Assert.assertEquals(105, ((notSimpleComplexMatrix2x2_2.mult(notSimpleComplexMatrix2x2_3)).getCm()[1][0]).getY(), EPS);
    }

    @Test
    public void element11ShouldBeEqualSumOfElement10OfFirstMatrixMultipliedByElement01OfSecondMatrixAndElement11OfFirstMatrixMultipliedByElement11OfSecondMatrixCheckX() {
        Assert.assertEquals(-23, ((notSimpleComplexMatrix2x2_2.mult(notSimpleComplexMatrix2x2_3)).getCm()[1][1]).getX(), EPS);
    }

    @Test
    public void element11ShouldBeEqualSumOfElement10OfFirstMatrixMultipliedByElement01OfSecondMatrixAndElement11OfFirstMatrixMultipliedByElement11OfSecondMatrixCheckY() {
        Assert.assertEquals(121, ((notSimpleComplexMatrix2x2_2.mult(notSimpleComplexMatrix2x2_3)).getCm()[1][1]).getY(), EPS);
    }

    //ComplexNumber det() - определитель матрицы
    @Test
    public void detShouldBeEqualsElem00MultElem11SubElem01MultElem10CheckX() {
        Assert.assertEquals(0, notSimpleComplexMatrix2x2_2.det().getX(), EPS);
    }

    @Test
    public void detShouldBeEqualsElem00MultElem11SubElem01MultElem10CheckY() {
        Assert.assertEquals(-4, notSimpleComplexMatrix2x2_2.det().getY(), EPS);
    }

    //ComplexVector2D multVector(ComplexVector2D) - умнжить матрицу на двумерный комплекснозначный вектор
    //(считая его столбцом) и возвратить получившийся столбец в виде вектора
    @Test
    public void xShouldBeEqualsElem00AddElem01MultCoordinateXOfVectorVCheckX() {
        Assert.assertEquals(-8, (notSimpleComplexMatrix2x2_4.multVector(complexVector2D)).getCn1().getX(), EPS);
    }

    @Test
    public void xShouldBeEqualsElem00AddElem01MultCoordinateXOfVectorVCheckY() {
        Assert.assertEquals(16, (notSimpleComplexMatrix2x2_4.multVector(complexVector2D)).getCn1().getY(), EPS);
    }

    @Test
    public void yShouldBeEqualsElem10AddElem11MultCoordinateYOfVectorVCheckX() {
        Assert.assertEquals(-12, (notSimpleComplexMatrix2x2_4.multVector(complexVector2D)).getCn2().getX(), EPS);
    }

    @Test
    public void yShouldBeEqualsElem10AddElem11MultCoordinateYOfVectorVCheckY() {
        Assert.assertEquals(32, (notSimpleComplexMatrix2x2_4.multVector(complexVector2D)).getCn2().getY(), EPS);
    }
}