package Task009;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task009
 */

@Configuration
@ComponentScan(basePackages = {"Task007"})
public class Config {
    private ComplexNumber cn = mock(ComplexNumber.class);
    private ComplexNumber cn1 = mock(ComplexNumber.class);
    private ComplexNumber cn2 = mock(ComplexNumber.class);
    private ComplexNumber cn3 = mock(ComplexNumber.class);
    private ComplexNumber cn4 = mock(ComplexNumber.class);
    private ComplexNumber cn5 = mock(ComplexNumber.class);
    private ComplexNumber cn6 = mock(ComplexNumber.class);
    private ComplexNumber cn7 = mock(ComplexNumber.class);
    private ComplexNumber cn8 = mock(ComplexNumber.class);
    private ComplexNumber cn9 = mock(ComplexNumber.class);
    private ComplexNumber cn10 = mock(ComplexNumber.class);
    private ComplexNumber cn11 = mock(ComplexNumber.class);
    private ComplexNumber cn12 = mock(ComplexNumber.class);

    @Bean
    ComplexMatrix2x2 simpleComplexMatrix2x2() {
        return new ComplexMatrix2x2();
    }

    @Bean
    ComplexMatrix2x2 notSimpleComplexMatrix2x2_1() {
        when(cn.getX()).thenReturn(4.0);
        when(cn.getY()).thenReturn(5.0);
        return new ComplexMatrix2x2(cn);
    }

    @Bean
    ComplexMatrix2x2 notSimpleComplexMatrix2x2_2() {
        ComplexNumber det = mock(ComplexNumber.class);

        ComplexNumber res1 = mock(ComplexNumber.class);
        ComplexNumber res2 = mock(ComplexNumber.class);


        //ComplexMatrix2x2(ComplexNumber, ComplexNumber, ComplexNumber, ComplexNumber) - конструктор на 4 дробях
        when(cn1.getX()).thenReturn(1.0);
        when(cn1.getY()).thenReturn(2.0);
        when(cn2.getX()).thenReturn(2.0);
        when(cn2.getY()).thenReturn(3.0);
        when(cn3.getX()).thenReturn(3.0);
        when(cn3.getY()).thenReturn(4.0);
        when(cn4.getX()).thenReturn(4.0);
        when(cn4.getY()).thenReturn(5.0);

        //ComplexNumber det() - определитель матрицы
        when(cn1.mult(cn4)).thenReturn(res1);
        when(cn2.mult(cn3)).thenReturn(res2);
        when(res1.sub(res2)).thenReturn(det);
        when(det.getX()).thenReturn(0.0);
        when(det.getY()).thenReturn(-4.0);

        return new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
    }

    @Bean
    ComplexMatrix2x2 notSimpleComplexMatrix2x2_3() {
        ComplexNumber res_cn1 = mock(ComplexNumber.class);
        ComplexNumber res_cn2 = mock(ComplexNumber.class);
        ComplexNumber res_cn3 = mock(ComplexNumber.class);
        ComplexNumber res_cn4 = mock(ComplexNumber.class);

        ComplexNumber res1 = mock(ComplexNumber.class);
        ComplexNumber res2 = mock(ComplexNumber.class);
        ComplexNumber res3 = mock(ComplexNumber.class);
        ComplexNumber res4 = mock(ComplexNumber.class);
        ComplexNumber res5 = mock(ComplexNumber.class);
        ComplexNumber res6 = mock(ComplexNumber.class);
        ComplexNumber res7 = mock(ComplexNumber.class);
        ComplexNumber res8 = mock(ComplexNumber.class);
        ComplexNumber res9 = mock(ComplexNumber.class);
        ComplexNumber res10 = mock(ComplexNumber.class);
        ComplexNumber res11 = mock(ComplexNumber.class);
        ComplexNumber res12 = mock(ComplexNumber.class);

        //ComplexMatrix2x2 add(ComplexMatrix2x2) - сложение матрицы с другой
        when(cn1.add(cn5)).thenReturn(res_cn1);
        when(res_cn1.getX()).thenReturn(6.0);
        when(res_cn1.getY()).thenReturn(8.0);

        when(cn2.add(cn6)).thenReturn(res_cn2);
        when(res_cn2.getX()).thenReturn(8.0);
        when(res_cn2.getY()).thenReturn(10.0);

        when(cn3.add(cn7)).thenReturn(res_cn3);
        when(res_cn3.getX()).thenReturn(10.0);
        when(res_cn3.getY()).thenReturn(12.0);

        when(cn4.add(cn8)).thenReturn(res_cn4);
        when(res_cn4.getX()).thenReturn(12.0);
        when(res_cn4.getY()).thenReturn(14.0);

        //ComplexMatrix2x2 mult(ComplexMatrix2x2) - умножение матрицы с другой
        when(cn1.mult(cn5)).thenReturn(res1);
        when(cn2.mult(cn7)).thenReturn(res2);
        when(res1.add(res2)).thenReturn(res3);
        when(res3.getX()).thenReturn(-17.0);
        when(res3.getY()).thenReturn(53.0);

        when(cn1.mult(cn6)).thenReturn(res4);
        when(cn2.mult(cn8)).thenReturn(res5);
        when(res4.add(res5)).thenReturn(res6);
        when(res6.getX()).thenReturn(-19.0);
        when(res6.getY()).thenReturn(61.0);

        when(cn3.mult(cn5)).thenReturn(res7);
        when(cn4.mult(cn7)).thenReturn(res8);
        when(res7.add(res8)).thenReturn(res9);
        when(res9.getX()).thenReturn(-21.0);
        when(res9.getY()).thenReturn(105.0);

        when(cn3.mult(cn6)).thenReturn(res10);
        when(cn4.mult(cn8)).thenReturn(res11);
        when(res10.add(res11)).thenReturn(res12);
        when(res12.getX()).thenReturn(-23.0);
        when(res12.getY()).thenReturn(121.0);

        return new ComplexMatrix2x2(cn5, cn6, cn7, cn8);
    }

    @Bean
    ComplexMatrix2x2 notSimpleComplexMatrix2x2_4() {
        return new ComplexMatrix2x2(cn9, cn10, cn11, cn12);
    }

    @Bean
    ComplexVector2D complexVector2D() {
        //ComplexVector2D multVector(ComplexVector2D) - умнжить матрицу на двумерный комплекснозначный вектор
        //(считая его столбцом) и возвратить получившийся столбец в виде вектора
        ComplexNumber res_cv1 = mock(ComplexNumber.class);
        ComplexNumber res_cv2 = mock(ComplexNumber.class);
        ComplexNumber res_cv3 = mock(ComplexNumber.class);
        ComplexNumber res_cv4 = mock(ComplexNumber.class);
        ComplexNumber res_cv5 = mock(ComplexNumber.class);
        ComplexNumber res_cv6 = mock(ComplexNumber.class);

        ComplexVector2D cv = mock(ComplexVector2D.class);
        when(cv.getCn1()).thenReturn(cn5);
        when(cv.getCn2()).thenReturn(cn6);

        when(cn9.mult(cn5)).thenReturn(res_cv1);
        when(cn10.mult(cn6)).thenReturn(res_cv2);
        when(res_cv1.add(res_cv2)).thenReturn(res_cv3);
        when(res_cv3.getX()).thenReturn(-8.0);
        when(res_cv3.getY()).thenReturn(16.0);

        when(cn11.mult(cn5)).thenReturn(res_cv4);
        when(cn12.mult(cn6)).thenReturn(res_cv5);
        when(res_cv4.add(res_cv5)).thenReturn(res_cv6);
        when(res_cv6.getX()).thenReturn(-12.0);
        when(res_cv6.getY()).thenReturn(32.0);

        return cv;
    }
}
