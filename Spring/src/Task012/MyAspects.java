package Task012;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task012
 */
@Aspect
public class MyAspects {
    @Around("execution(* *..PostRepository.getPostById(String))")
    public Object checkArgumentInt(ProceedingJoinPoint jp) throws Throwable {
        // В поле вводится число, затем число (String) преобразуется в int

        String idS = (String) jp.getArgs()[0];

        try {
            Integer id = Integer.valueOf(idS);
        } catch (NumberFormatException e) {
            System.out.println("ID \"" + idS + "\" is not a number.");
            return null;
        }

        // Известно, что статей не больше 9999. Следовательно, длина строки не должна превышать 4 символа
        if (idS.length() > 4) {
            System.out.println("ID \"" + idS + "\" is too long.");
            return null;
        }
        return jp.proceed();
    }

    @Around("execution(* *..PostRepository.getPostByHead(String))")
    public Object checkNumberOfReservedWords(ProceedingJoinPoint jp) throws Throwable {
        Pattern p = Pattern.compile("INFORMATION_SCHEMA|SELECT|ALTER|TABLE|UPDATE|CONCAT|FROM|WHERE|" +
                "SCHEMA|DELETE|INSERT|GROUP BY|UNION|AND|OR");
        String head = ((String) jp.getArgs()[0]).toUpperCase();
        String words[] = head.split(" ");
        int n = 0;
        for (String word : words) {
            Matcher m = p.matcher(word);
            if (m.matches()) n++;
            if (n == 3) {
                System.out.println("\"" + head + "\" is not a head of post.");
                return null;
            }
        }
        return jp.proceed();
    }
}
