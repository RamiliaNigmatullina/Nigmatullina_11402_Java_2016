package Task003;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task003
 */

public class ComplexMatrix2x2Test {
    private final double EPS = 1e-9;

    //ComplexMatrix2x2() - конструктор для нулевой матрицы
    @Test
    public void defaultMatrixShouldHaveZeroValue00CheckX() {
        ComplexMatrix2x2 cm = new ComplexMatrix2x2();
        Assert.assertEquals(0, (cm.getCm()[0][0]).getX(), EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroValue00CheckY() {
        ComplexMatrix2x2 cm = new ComplexMatrix2x2();
        Assert.assertEquals(0, (cm.getCm()[0][0]).getY(), EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroValue01CheckX() {
        ComplexMatrix2x2 cm = new ComplexMatrix2x2();
        Assert.assertEquals(0, (cm.getCm()[0][1]).getX(), EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroValue01CheckY() {
        ComplexMatrix2x2 cm = new ComplexMatrix2x2();
        Assert.assertEquals(0, (cm.getCm()[0][1]).getY(), EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroValue10CheckX() {
        ComplexMatrix2x2 cm = new ComplexMatrix2x2();
        Assert.assertEquals(0, (cm.getCm()[1][0]).getX(), EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroValue10CheckY() {
        ComplexMatrix2x2 cm = new ComplexMatrix2x2();
        Assert.assertEquals(0, (cm.getCm()[1][0]).getY(), EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroValue11CheckX() {
        ComplexMatrix2x2 cm = new ComplexMatrix2x2();
        Assert.assertEquals(0, (cm.getCm()[1][1]).getX(), EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroValue11CheckY() {
        ComplexMatrix2x2 cm = new ComplexMatrix2x2();
        Assert.assertEquals(0, (cm.getCm()[1][1]).getY(), EPS);
    }

    //ComplexMatrix2x2(ComplexNumber) - конструктор для матрицы, у которой каждый элемент равен поданному числу
    @Test
    public void MatrixShouldHaveGivenValue00CheckX() {
        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn.getX()).thenReturn(4.0);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn);
        Assert.assertEquals(4, (cm.getCm()[0][0]).getX(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValue00CheckY() {
        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn.getY()).thenReturn(5.0);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn);
        Assert.assertEquals(5, (cm.getCm()[0][0]).getY(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValue01CheckX() {
        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn.getX()).thenReturn(4.0);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn);
        Assert.assertEquals(4, (cm.getCm()[0][1]).getX(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValue01CheckY() {
        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn.getY()).thenReturn(5.0);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn);
        Assert.assertEquals(5, (cm.getCm()[0][1]).getY(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValue10CheckX() {
        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn.getX()).thenReturn(4.0);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn);
        Assert.assertEquals(4, (cm.getCm()[1][0]).getX(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValue10CheckY() {
        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn.getY()).thenReturn(5.0);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn);
        Assert.assertEquals(5, (cm.getCm()[1][0]).getY(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValue11CheckX() {
        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn.getX()).thenReturn(4.0);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn);
        Assert.assertEquals(4, (cm.getCm()[1][1]).getX(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValue11CheckY() {
        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn.getY()).thenReturn(5.0);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn);
        Assert.assertEquals(5, (cm.getCm()[1][1]).getY(), EPS);
    }

    //ComplexMatrix2x2(ComplexNumber, ComplexNumber, ComplexNumber, ComplexNumber) - конструктор на 4 дробях
    @Test
    public void MatrixShouldHaveGivenValues00CheckX() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        when(cn1.getX()).thenReturn(1.0);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);

        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
        Assert.assertEquals(1, (cm.getCm()[0][0]).getX(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValues00CheckY() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        when(cn1.getY()).thenReturn(2.0);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);

        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
        Assert.assertEquals(2, (cm.getCm()[0][0]).getY(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValues01CheckX() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        when(cn2.getX()).thenReturn(2.0);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);

        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
        Assert.assertEquals(2, (cm.getCm()[0][1]).getX(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValues01CheckY() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        when(cn2.getY()).thenReturn(3.0);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);

        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
        Assert.assertEquals(3, (cm.getCm()[0][1]).getY(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValues10CheckX() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        when(cn3.getX()).thenReturn(3.0);
        ComplexNumber cn4 = mock(ComplexNumber.class);

        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
        Assert.assertEquals(3, (cm.getCm()[1][0]).getX(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValues10CheckY() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        when(cn3.getY()).thenReturn(4.0);
        ComplexNumber cn4 = mock(ComplexNumber.class);

        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
        Assert.assertEquals(4, (cm.getCm()[1][0]).getY(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValues11CheckX() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        when(cn4.getX()).thenReturn(4.0);

        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
        Assert.assertEquals(4, (cm.getCm()[1][1]).getX(), EPS);
    }

    @Test
    public void MatrixShouldHaveGivenValuesCheck11Y() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        when(cn4.getY()).thenReturn(5.0);

        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
        Assert.assertEquals(5, (cm.getCm()[1][1]).getY(), EPS);
    }

    //ComplexMatrix2x2 add(ComplexMatrix2x2) - сложение матрицы с другой
    @Test
    public void element00ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixCheckX() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexNumber cn7 = mock(ComplexNumber.class);
        ComplexNumber cn8 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn5, cn6, cn7, cn8);

        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn1.add(cn5)).thenReturn(cn);
        when(cn.getX()).thenReturn(6.0);

        Assert.assertEquals(6, ((cm1.add(cm2)).getCm()[0][0]).getX(), EPS);
    }

    @Test
    public void element00ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixCheckY() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexNumber cn7 = mock(ComplexNumber.class);
        ComplexNumber cn8 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn5, cn6, cn7, cn8);

        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn1.add(cn5)).thenReturn(cn);
        when(cn.getY()).thenReturn(8.0);

        Assert.assertEquals(8, ((cm1.add(cm2)).getCm()[0][0]).getY(), EPS);
    }

    @Test
    public void element01ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixCheckX() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexNumber cn7 = mock(ComplexNumber.class);
        ComplexNumber cn8 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn5, cn6, cn7, cn8);

        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn2.add(cn6)).thenReturn(cn);
        when(cn.getX()).thenReturn(8.0);

        Assert.assertEquals(8, ((cm1.add(cm2)).getCm()[0][1]).getX(), EPS);
    }

    @Test
    public void element01ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixCheckY() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexNumber cn7 = mock(ComplexNumber.class);
        ComplexNumber cn8 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn5, cn6, cn7, cn8);

        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn2.add(cn6)).thenReturn(cn);
        when(cn.getY()).thenReturn(10.0);

        Assert.assertEquals(10, ((cm1.add(cm2)).getCm()[0][1]).getY(), EPS);
    }

    @Test
    public void element10ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixCheckX() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexNumber cn7 = mock(ComplexNumber.class);
        ComplexNumber cn8 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn5, cn6, cn7, cn8);

        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn3.add(cn7)).thenReturn(cn);
        when(cn.getX()).thenReturn(10.0);

        Assert.assertEquals(10, ((cm1.add(cm2)).getCm()[1][0]).getX(), EPS);
    }

    @Test
    public void element10ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixCheckY() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexNumber cn7 = mock(ComplexNumber.class);
        ComplexNumber cn8 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn5, cn6, cn7, cn8);

        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn3.add(cn7)).thenReturn(cn);
        when(cn.getY()).thenReturn(12.0);

        Assert.assertEquals(12, ((cm1.add(cm2)).getCm()[1][0]).getY(), EPS);
    }

    @Test
    public void element11ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixCheckX() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexNumber cn7 = mock(ComplexNumber.class);
        ComplexNumber cn8 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn5, cn6, cn7, cn8);

        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn4.add(cn8)).thenReturn(cn);
        when(cn.getX()).thenReturn(12.0);

        Assert.assertEquals(12, ((cm1.add(cm2)).getCm()[1][1]).getX(), EPS);
    }

    @Test
    public void element11ShouldBeSumOfFirstElementOfMatrixAndSecondElementOfMatrixCheckY() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexNumber cn7 = mock(ComplexNumber.class);
        ComplexNumber cn8 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn5, cn6, cn7, cn8);

        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn4.add(cn8)).thenReturn(cn);
        when(cn.getY()).thenReturn(14.0);

        Assert.assertEquals(14, ((cm1.add(cm2)).getCm()[1][1]).getY(), EPS);
    }

    //ComplexMatrix2x2 mult(ComplexMatrix2x2) - умножение матрицы с другой
    @Test
    public void element00ShouldBeEqualSumOfElement00OfFirstMatrixMultipliedByElement00OfSecondMatrixAndElement10OfFirstMatrixMultipliedByElement10OfSecondMatrixCheckX() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexNumber cn7 = mock(ComplexNumber.class);
        ComplexNumber cn8 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn5, cn6, cn7, cn8);

        ComplexNumber res1 = mock(ComplexNumber.class);
        ComplexNumber res2 = mock(ComplexNumber.class);
        ComplexNumber res3 = mock(ComplexNumber.class);
        when(cn1.mult(cn5)).thenReturn(res1);
        when(cn2.mult(cn7)).thenReturn(res2);
        when(res1.add(res2)).thenReturn(res3);
        when(res3.getX()).thenReturn(-17.0);

        ComplexNumber res4 = mock(ComplexNumber.class);
        ComplexNumber res5 = mock(ComplexNumber.class);
        ComplexNumber res6 = mock(ComplexNumber.class);
        when(cn1.mult(cn6)).thenReturn(res4);
        when(cn2.mult(cn8)).thenReturn(res5);
        when(res4.add(res5)).thenReturn(res6);

        ComplexNumber res7 = mock(ComplexNumber.class);
        ComplexNumber res8 = mock(ComplexNumber.class);
        ComplexNumber res9 = mock(ComplexNumber.class);
        when(cn3.mult(cn5)).thenReturn(res7);
        when(cn4.mult(cn7)).thenReturn(res8);
        when(res7.add(res8)).thenReturn(res9);

        ComplexNumber res10 = mock(ComplexNumber.class);
        ComplexNumber res11 = mock(ComplexNumber.class);
        ComplexNumber res12 = mock(ComplexNumber.class);
        when(cn3.mult(cn6)).thenReturn(res10);
        when(cn4.mult(cn8)).thenReturn(res11);
        when(res10.add(res11)).thenReturn(res12);

        Assert.assertEquals(-17, ((cm1.mult(cm2)).getCm()[0][0]).getX(), EPS);
    }

    @Test
    public void element00ShouldBeEqualSumOfElement00OfFirstMatrixMultipliedByElement00OfSecondMatrixAndElement10OfFirstMatrixMultipliedByElement10OfSecondMatrixCheckY() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexNumber cn7 = mock(ComplexNumber.class);
        ComplexNumber cn8 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn5, cn6, cn7, cn8);

        ComplexNumber res1 = mock(ComplexNumber.class);
        ComplexNumber res2 = mock(ComplexNumber.class);
        ComplexNumber res3 = mock(ComplexNumber.class);
        when(cn1.mult(cn5)).thenReturn(res1);
        when(cn2.mult(cn7)).thenReturn(res2);
        when(res1.add(res2)).thenReturn(res3);
        when(res3.getY()).thenReturn(53.0);

        ComplexNumber res4 = mock(ComplexNumber.class);
        ComplexNumber res5 = mock(ComplexNumber.class);
        ComplexNumber res6 = mock(ComplexNumber.class);
        when(cn1.mult(cn6)).thenReturn(res4);
        when(cn2.mult(cn8)).thenReturn(res5);
        when(res4.add(res5)).thenReturn(res6);

        ComplexNumber res7 = mock(ComplexNumber.class);
        ComplexNumber res8 = mock(ComplexNumber.class);
        ComplexNumber res9 = mock(ComplexNumber.class);
        when(cn3.mult(cn5)).thenReturn(res7);
        when(cn4.mult(cn7)).thenReturn(res8);
        when(res7.add(res8)).thenReturn(res9);

        ComplexNumber res10 = mock(ComplexNumber.class);
        ComplexNumber res11 = mock(ComplexNumber.class);
        ComplexNumber res12 = mock(ComplexNumber.class);
        when(cn3.mult(cn6)).thenReturn(res10);
        when(cn4.mult(cn8)).thenReturn(res11);
        when(res10.add(res11)).thenReturn(res12);

        Assert.assertEquals(53, ((cm1.mult(cm2)).getCm()[0][0]).getY(), EPS);
    }

    @Test
    public void element01ShouldBeEqualSumOfElement00OfFirstMatrixMultipliedByElement01OfSecondMatrixAndElement10OfFirstMatrixMultipliedByElement11OfSecondMatrixCheckX() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexNumber cn7 = mock(ComplexNumber.class);
        ComplexNumber cn8 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn5, cn6, cn7, cn8);

        ComplexNumber res1 = mock(ComplexNumber.class);
        ComplexNumber res2 = mock(ComplexNumber.class);
        ComplexNumber res3 = mock(ComplexNumber.class);
        when(cn1.mult(cn5)).thenReturn(res1);
        when(cn2.mult(cn7)).thenReturn(res2);
        when(res1.add(res2)).thenReturn(res3);

        ComplexNumber res4 = mock(ComplexNumber.class);
        ComplexNumber res5 = mock(ComplexNumber.class);
        ComplexNumber res6 = mock(ComplexNumber.class);
        when(cn1.mult(cn6)).thenReturn(res4);
        when(cn2.mult(cn8)).thenReturn(res5);
        when(res4.add(res5)).thenReturn(res6);
        when(res6.getX()).thenReturn(-19.0);

        ComplexNumber res7 = mock(ComplexNumber.class);
        ComplexNumber res8 = mock(ComplexNumber.class);
        ComplexNumber res9 = mock(ComplexNumber.class);
        when(cn3.mult(cn5)).thenReturn(res7);
        when(cn4.mult(cn7)).thenReturn(res8);
        when(res7.add(res8)).thenReturn(res9);

        ComplexNumber res10 = mock(ComplexNumber.class);
        ComplexNumber res11 = mock(ComplexNumber.class);
        ComplexNumber res12 = mock(ComplexNumber.class);
        when(cn3.mult(cn6)).thenReturn(res10);
        when(cn4.mult(cn8)).thenReturn(res11);
        when(res10.add(res11)).thenReturn(res12);

        Assert.assertEquals(-19, ((cm1.mult(cm2)).getCm()[0][1]).getX(), EPS);
    }

    @Test
    public void element01ShouldBeEqualSumOfElement00OfFirstMatrixMultipliedByElement01OfSecondMatrixAndElement10OfFirstMatrixMultipliedByElement11OfSecondMatrixCheckY() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexNumber cn7 = mock(ComplexNumber.class);
        ComplexNumber cn8 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn5, cn6, cn7, cn8);

        ComplexNumber res1 = mock(ComplexNumber.class);
        ComplexNumber res2 = mock(ComplexNumber.class);
        ComplexNumber res3 = mock(ComplexNumber.class);
        when(cn1.mult(cn5)).thenReturn(res1);
        when(cn2.mult(cn7)).thenReturn(res2);
        when(res1.add(res2)).thenReturn(res3);

        ComplexNumber res4 = mock(ComplexNumber.class);
        ComplexNumber res5 = mock(ComplexNumber.class);
        ComplexNumber res6 = mock(ComplexNumber.class);
        when(cn1.mult(cn6)).thenReturn(res4);
        when(cn2.mult(cn8)).thenReturn(res5);
        when(res4.add(res5)).thenReturn(res6);
        when(res6.getY()).thenReturn(61.0);

        ComplexNumber res7 = mock(ComplexNumber.class);
        ComplexNumber res8 = mock(ComplexNumber.class);
        ComplexNumber res9 = mock(ComplexNumber.class);
        when(cn3.mult(cn5)).thenReturn(res7);
        when(cn4.mult(cn7)).thenReturn(res8);
        when(res7.add(res8)).thenReturn(res9);

        ComplexNumber res10 = mock(ComplexNumber.class);
        ComplexNumber res11 = mock(ComplexNumber.class);
        ComplexNumber res12 = mock(ComplexNumber.class);
        when(cn3.mult(cn6)).thenReturn(res10);
        when(cn4.mult(cn8)).thenReturn(res11);
        when(res10.add(res11)).thenReturn(res12);

        Assert.assertEquals(61, ((cm1.mult(cm2)).getCm()[0][1]).getY(), EPS);
    }

    @Test
    public void element10ShouldBeEqualSumOfElement10OfFirstMatrixMultipliedByElement00OfSecondMatrixAndElement11OfFirstMatrixMultipliedByElement10OfSecondMatrixCheckX() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexNumber cn7 = mock(ComplexNumber.class);
        ComplexNumber cn8 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn5, cn6, cn7, cn8);

        ComplexNumber res1 = mock(ComplexNumber.class);
        ComplexNumber res2 = mock(ComplexNumber.class);
        ComplexNumber res3 = mock(ComplexNumber.class);
        when(cn1.mult(cn5)).thenReturn(res1);
        when(cn2.mult(cn7)).thenReturn(res2);
        when(res1.add(res2)).thenReturn(res3);

        ComplexNumber res4 = mock(ComplexNumber.class);
        ComplexNumber res5 = mock(ComplexNumber.class);
        ComplexNumber res6 = mock(ComplexNumber.class);
        when(cn1.mult(cn6)).thenReturn(res4);
        when(cn2.mult(cn8)).thenReturn(res5);
        when(res4.add(res5)).thenReturn(res6);

        ComplexNumber res7 = mock(ComplexNumber.class);
        ComplexNumber res8 = mock(ComplexNumber.class);
        ComplexNumber res9 = mock(ComplexNumber.class);
        when(cn3.mult(cn5)).thenReturn(res7);
        when(cn4.mult(cn7)).thenReturn(res8);
        when(res7.add(res8)).thenReturn(res9);
        when(res9.getX()).thenReturn(-21.0);

        ComplexNumber res10 = mock(ComplexNumber.class);
        ComplexNumber res11 = mock(ComplexNumber.class);
        ComplexNumber res12 = mock(ComplexNumber.class);
        when(cn3.mult(cn6)).thenReturn(res10);
        when(cn4.mult(cn8)).thenReturn(res11);
        when(res10.add(res11)).thenReturn(res12);

        Assert.assertEquals(-21, ((cm1.mult(cm2)).getCm()[1][0]).getX(), EPS);
    }

    @Test
    public void element10ShouldBeEqualSumOfElement10OfFirstMatrixMultipliedByElement00OfSecondMatrixAndElement11OfFirstMatrixMultipliedByElement10OfSecondMatrixCheckY() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexNumber cn7 = mock(ComplexNumber.class);
        ComplexNumber cn8 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn5, cn6, cn7, cn8);

        ComplexNumber res1 = mock(ComplexNumber.class);
        ComplexNumber res2 = mock(ComplexNumber.class);
        ComplexNumber res3 = mock(ComplexNumber.class);
        when(cn1.mult(cn5)).thenReturn(res1);
        when(cn2.mult(cn7)).thenReturn(res2);
        when(res1.add(res2)).thenReturn(res3);

        ComplexNumber res4 = mock(ComplexNumber.class);
        ComplexNumber res5 = mock(ComplexNumber.class);
        ComplexNumber res6 = mock(ComplexNumber.class);
        when(cn1.mult(cn6)).thenReturn(res4);
        when(cn2.mult(cn8)).thenReturn(res5);
        when(res4.add(res5)).thenReturn(res6);

        ComplexNumber res7 = mock(ComplexNumber.class);
        ComplexNumber res8 = mock(ComplexNumber.class);
        ComplexNumber res9 = mock(ComplexNumber.class);
        when(cn3.mult(cn5)).thenReturn(res7);
        when(cn4.mult(cn7)).thenReturn(res8);
        when(res7.add(res8)).thenReturn(res9);
        when(res9.getY()).thenReturn(105.0);

        ComplexNumber res10 = mock(ComplexNumber.class);
        ComplexNumber res11 = mock(ComplexNumber.class);
        ComplexNumber res12 = mock(ComplexNumber.class);
        when(cn3.mult(cn6)).thenReturn(res10);
        when(cn4.mult(cn8)).thenReturn(res11);
        when(res10.add(res11)).thenReturn(res12);

        Assert.assertEquals(105, ((cm1.mult(cm2)).getCm()[1][0]).getY(), EPS);
    }

    @Test
    public void element11ShouldBeEqualSumOfElement10OfFirstMatrixMultipliedByElement01OfSecondMatrixAndElement11OfFirstMatrixMultipliedByElement11OfSecondMatrixCheckX() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexNumber cn7 = mock(ComplexNumber.class);
        ComplexNumber cn8 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn5, cn6, cn7, cn8);

        ComplexNumber res1 = mock(ComplexNumber.class);
        ComplexNumber res2 = mock(ComplexNumber.class);
        ComplexNumber res3 = mock(ComplexNumber.class);
        when(cn1.mult(cn5)).thenReturn(res1);
        when(cn2.mult(cn7)).thenReturn(res2);
        when(res1.add(res2)).thenReturn(res3);

        ComplexNumber res4 = mock(ComplexNumber.class);
        ComplexNumber res5 = mock(ComplexNumber.class);
        ComplexNumber res6 = mock(ComplexNumber.class);
        when(cn1.mult(cn6)).thenReturn(res4);
        when(cn2.mult(cn8)).thenReturn(res5);
        when(res4.add(res5)).thenReturn(res6);

        ComplexNumber res7 = mock(ComplexNumber.class);
        ComplexNumber res8 = mock(ComplexNumber.class);
        ComplexNumber res9 = mock(ComplexNumber.class);
        when(cn3.mult(cn5)).thenReturn(res7);
        when(cn4.mult(cn7)).thenReturn(res8);
        when(res7.add(res8)).thenReturn(res9);

        ComplexNumber res10 = mock(ComplexNumber.class);
        ComplexNumber res11 = mock(ComplexNumber.class);
        ComplexNumber res12 = mock(ComplexNumber.class);
        when(cn3.mult(cn6)).thenReturn(res10);
        when(cn4.mult(cn8)).thenReturn(res11);
        when(res10.add(res11)).thenReturn(res12);
        when(res12.getX()).thenReturn(-23.0);

        Assert.assertEquals(-23, ((cm1.mult(cm2)).getCm()[1][1]).getX(), EPS);
    }

    @Test
    public void element11ShouldBeEqualSumOfElement10OfFirstMatrixMultipliedByElement01OfSecondMatrixAndElement11OfFirstMatrixMultipliedByElement11OfSecondMatrixCheckY() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexNumber cn7 = mock(ComplexNumber.class);
        ComplexNumber cn8 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn5, cn6, cn7, cn8);

        ComplexNumber res1 = mock(ComplexNumber.class);
        ComplexNumber res2 = mock(ComplexNumber.class);
        ComplexNumber res3 = mock(ComplexNumber.class);
        when(cn1.mult(cn5)).thenReturn(res1);
        when(cn2.mult(cn7)).thenReturn(res2);
        when(res1.add(res2)).thenReturn(res3);

        ComplexNumber res4 = mock(ComplexNumber.class);
        ComplexNumber res5 = mock(ComplexNumber.class);
        ComplexNumber res6 = mock(ComplexNumber.class);
        when(cn1.mult(cn6)).thenReturn(res4);
        when(cn2.mult(cn8)).thenReturn(res5);
        when(res4.add(res5)).thenReturn(res6);

        ComplexNumber res7 = mock(ComplexNumber.class);
        ComplexNumber res8 = mock(ComplexNumber.class);
        ComplexNumber res9 = mock(ComplexNumber.class);
        when(cn3.mult(cn5)).thenReturn(res7);
        when(cn4.mult(cn7)).thenReturn(res8);
        when(res7.add(res8)).thenReturn(res9);

        ComplexNumber res10 = mock(ComplexNumber.class);
        ComplexNumber res11 = mock(ComplexNumber.class);
        ComplexNumber res12 = mock(ComplexNumber.class);
        when(cn3.mult(cn6)).thenReturn(res10);
        when(cn4.mult(cn8)).thenReturn(res11);
        when(res10.add(res11)).thenReturn(res12);
        when(res12.getY()).thenReturn(121.0);

        Assert.assertEquals(121, ((cm1.mult(cm2)).getCm()[1][1]).getY(), EPS);
    }

    //ComplexNumber det() - определитель матрицы
    @Test
    public void detShouldBeEqualsElem00MultElem11SubElem01MultElem10CheckX() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber res1 = mock(ComplexNumber.class);
        ComplexNumber res2 = mock(ComplexNumber.class);
        ComplexNumber res3 = mock(ComplexNumber.class);
        when(cn1.mult(cn4)).thenReturn(res1);
        when(cn2.mult(cn3)).thenReturn(res2);
        when(res1.sub(res2)).thenReturn(res3);
        when(res3.getX()).thenReturn(0.0);

        Assert.assertEquals(0, cm.det().getX(), EPS);
    }

    @Test
    public void detShouldBeEqualsElem00MultElem11SubElem01MultElem10CheckY() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber res1 = mock(ComplexNumber.class);
        ComplexNumber res2 = mock(ComplexNumber.class);
        ComplexNumber res3 = mock(ComplexNumber.class);
        when(cn1.mult(cn4)).thenReturn(res1);
        when(cn2.mult(cn3)).thenReturn(res2);
        when(res1.sub(res2)).thenReturn(res3);
        when(res3.getY()).thenReturn(-4.0);

        Assert.assertEquals(-4, cm.det().getY(), EPS);
    }

    //ComplexVector2D multVector(ComplexVector2D) - умнжить матрицу на двумерный комплекснозначный вектор
    //(считая его столбцом) и возвратить получившийся столбец в виде вектора
    @Test
    public void xShouldBeEqualsElem00AddElem01MultCoordinateXOfVectorVCheckX() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexVector2D cv = mock(ComplexVector2D.class);
        when(cv.getCn1()).thenReturn(cn5);
        when(cv.getCn2()).thenReturn(cn6);

        ComplexNumber res1 = mock(ComplexNumber.class);
        ComplexNumber res2 = mock(ComplexNumber.class);
        ComplexNumber res3 = mock(ComplexNumber.class);

        when(cn1.mult(cn5)).thenReturn(res1);
        when(cn2.mult(cn6)).thenReturn(res2);
        when(res1.add(res2)).thenReturn(res3);
        when(res3.getX()).thenReturn(-8.0);

        ComplexNumber res4 = mock(ComplexNumber.class);
        ComplexNumber res5 = mock(ComplexNumber.class);
        ComplexNumber res6 = mock(ComplexNumber.class);

        when(cn3.mult(cn5)).thenReturn(res4);
        when(cn4.mult(cn6)).thenReturn(res5);
        when(res4.add(res5)).thenReturn(res6);

        Assert.assertEquals(-8, (cm.multVector(cv)).getCn1().getX(), EPS);
    }

    @Test
    public void xShouldBeEqualsElem00AddElem01MultCoordinateXOfVectorVCheckY() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexVector2D cv = mock(ComplexVector2D.class);
        when(cv.getCn1()).thenReturn(cn5);
        when(cv.getCn2()).thenReturn(cn6);

        ComplexNumber res1 = mock(ComplexNumber.class);
        ComplexNumber res2 = mock(ComplexNumber.class);
        ComplexNumber res3 = mock(ComplexNumber.class);

        when(cn1.mult(cn5)).thenReturn(res1);
        when(cn2.mult(cn6)).thenReturn(res2);
        when(res1.add(res2)).thenReturn(res3);
        when(res3.getY()).thenReturn(16.0);

        ComplexNumber res4 = mock(ComplexNumber.class);
        ComplexNumber res5 = mock(ComplexNumber.class);
        ComplexNumber res6 = mock(ComplexNumber.class);

        when(cn3.mult(cn5)).thenReturn(res4);
        when(cn4.mult(cn6)).thenReturn(res5);
        when(res4.add(res5)).thenReturn(res6);

        Assert.assertEquals(16, (cm.multVector(cv)).getCn1().getY(), EPS);
    }

    @Test
    public void yShouldBeEqualsElem10AddElem11MultCoordinateYOfVectorVCheckX() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexVector2D cv = mock(ComplexVector2D.class);
        when(cv.getCn1()).thenReturn(cn5);
        when(cv.getCn2()).thenReturn(cn6);

        ComplexNumber res1 = mock(ComplexNumber.class);
        ComplexNumber res2 = mock(ComplexNumber.class);
        ComplexNumber res3 = mock(ComplexNumber.class);

        when(cn1.mult(cn5)).thenReturn(res1);
        when(cn2.mult(cn6)).thenReturn(res2);
        when(res1.add(res2)).thenReturn(res3);

        ComplexNumber res4 = mock(ComplexNumber.class);
        ComplexNumber res5 = mock(ComplexNumber.class);
        ComplexNumber res6 = mock(ComplexNumber.class);

        when(cn3.mult(cn5)).thenReturn(res4);
        when(cn4.mult(cn6)).thenReturn(res5);
        when(res4.add(res5)).thenReturn(res6);
        when(res6.getX()).thenReturn(-12.0);

        Assert.assertEquals(-12, (cm.multVector(cv)).getCn2().getX(), EPS);
    }

    @Test
    public void yShouldBeEqualsElem10AddElem11MultCoordinateYOfVectorVCheckY() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);

        ComplexNumber cn5 = mock(ComplexNumber.class);
        ComplexNumber cn6 = mock(ComplexNumber.class);
        ComplexVector2D cv = mock(ComplexVector2D.class);
        when(cv.getCn1()).thenReturn(cn5);
        when(cv.getCn2()).thenReturn(cn6);

        ComplexNumber res1 = mock(ComplexNumber.class);
        ComplexNumber res2 = mock(ComplexNumber.class);
        ComplexNumber res3 = mock(ComplexNumber.class);

        when(cn1.mult(cn5)).thenReturn(res1);
        when(cn2.mult(cn6)).thenReturn(res2);
        when(res1.add(res2)).thenReturn(res3);

        ComplexNumber res4 = mock(ComplexNumber.class);
        ComplexNumber res5 = mock(ComplexNumber.class);
        ComplexNumber res6 = mock(ComplexNumber.class);

        when(cn3.mult(cn5)).thenReturn(res4);
        when(cn4.mult(cn6)).thenReturn(res5);
        when(res4.add(res5)).thenReturn(res6);
        when(res6.getY()).thenReturn(32.0);

        Assert.assertEquals(32, (cm.multVector(cv)).getCn2().getY(), EPS);
    }
}