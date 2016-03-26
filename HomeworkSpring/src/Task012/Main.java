package Task012;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task012
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");

        PostRepository postRepository = ac.getBean(PostRepository.class);

        //Запрос с id, соответствующим всем требованиям.
        Post post = postRepository.getPostById("1");
        if (post != null) {
            System.out.println("ID: " + post.getId());
            System.out.println("Head: " + post.getHead());
            System.out.println("Body: " + post.getBody());
        }
        System.out.println();

        //Запрос с id, длина которого превышает 4 символа (известно, что статей не больше 9999).
        Post post2 = postRepository.getPostById("10000");
        if (post2 != null) {
            System.out.println("ID: " + post2.getId());
            System.out.println("Head: " + post2.getHead());
            System.out.println("Body: " + post2.getBody());
        }
        System.out.println();

        //Запрос с id, который не является числом.
        Post post3 = postRepository.getPostById("-1 OR 1=1");
        if (post3 != null) {
            System.out.println("ID: " + post3.getId());
            System.out.println("Head: " + post3.getHead());
            System.out.println("Body: " + post3.getBody());
        }
        System.out.println();

        //Запрос с правильным заголовком
        Post post4 = postRepository.getPostByHead("Ut enim");
        if (post4 != null) {
            System.out.println("ID: " + post4.getId());
            System.out.println("Head: " + post4.getHead());
            System.out.println("Body: " + post4.getBody());
        }
        System.out.println();

        //SQL-инъекция
        Post post5 = postRepository.getPostByHead("/?post_head=Lorem Ipsum union select name, null from users " +
                "limit 1 offset 0");
        if (post5 != null) {
            System.out.println("ID: " + post5.getId());
            System.out.println("Head: " + post5.getHead());
            System.out.println("Body: " + post5.getBody());
        }
        System.out.println();
    }
}
