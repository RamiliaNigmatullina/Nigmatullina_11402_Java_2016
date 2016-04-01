package Task010.Tests;

import Task010.Classes.Comment;
import Task010.Classes.InternetUser;
import Task010.Config;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task010
 */

public class CommentTest {
    private static Comment defaultComment;
    private static Comment comment;
    private static InternetUser internetUser;

    @BeforeClass
    public static void beforeClass(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        defaultComment = (Comment) ac.getBean("defaultComment");
        comment = (Comment) ac.getBean("comment");
        internetUser = (InternetUser) ac.getBean("internetUser");
    }

    @Test
    public void textOfDefaultCommentShouldBeNull() {
        Assert.assertEquals(null, defaultComment.getText());
    }

    @Test
    public void internetUserOfDefaultCommentShouldBeNull() {
        Assert.assertEquals(null, defaultComment.getInternetUser());
    }

    @Test
    public void dateOfDefaultCommentShouldNull() {
        Assert.assertEquals(null, defaultComment.getDate());
    }

    @Test
    public void constructorShouldSaveGivenText() {
        Assert.assertEquals("Bla", comment.getText());
    }

    @Test
    public void constructorShouldSaveGivenInternetUser() {
        Assert.assertEquals(internetUser, comment.getInternetUser());
    }

    @Test
    public void constructorShouldSaveGivenDate() {
        Assert.assertEquals("12.02.2016", comment.getDate());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        Assert.assertEquals("Comment: " + comment.getText() + ".", comment.toString());
    }
}
