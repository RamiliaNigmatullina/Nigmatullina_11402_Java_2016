package Task011;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    @Around("execution(* *..CityRepository.getCities())")
    public void findTimeForGettingCities(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Getting a list of all cities.");

        long start = System.currentTimeMillis();
        jp.proceed();
        long end = System.currentTimeMillis();

        System.out.println("The getting cities took " + (end - start) + " milliseconds.");
    }

    @Before("execution(* *..WantToVisitRepository.getWantToVisit())")
    public void userDecidedVisitPerformance(JoinPoint jp) throws Throwable {
        System.out.println("User decided visit performance.");
    }
}
