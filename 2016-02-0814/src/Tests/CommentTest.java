package Tests;

import Classes.Comment;
import Classes.InternetUser;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task004
 */

public class CommentTest {
    @Test
    public void textOfDefaultCommentShouldBeNull() {
        Comment comment = new Comment();
        Assert.assertEquals(null, comment.getText());
    }

    @Test
    public void internetUserOfDefaultCommentShouldBeNull() {
        Comment comment = new Comment();
        Assert.assertEquals(null, comment.getInternetUser());
    }

    @Test
    public void dateOfDefaultCommentShouldNull() {
        Comment comment = new Comment();
        Assert.assertEquals(null, comment.getDate());
    }

    @Test
    public void constructorShouldSaveGivenText() {
        InternetUser internetUser = mock(InternetUser.class);
        Comment comment = new Comment("abc", internetUser, "05.02.14");
        Assert.assertEquals("abc", comment.getText());
    }

    @Test
    public void constructorShouldSaveGivenInternetUser() {
        InternetUser internetUser = mock(InternetUser.class);
        Comment comment = new Comment("abc", internetUser, "05.02.14");
        Assert.assertEquals(internetUser, comment.getInternetUser());
    }

    @Test
    public void constructorShouldSaveGivenDate() {
        InternetUser internetUser = mock(InternetUser.class);
        Comment comment = new Comment("abc", internetUser, "05.02.14");
        Assert.assertEquals("05.02.14", comment.getDate());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        InternetUser internetUser = mock(InternetUser.class);
        Comment comment = new Comment("abc", internetUser, "05.02.14");
        Assert.assertEquals("Comment: " + comment.getText() + ".", comment.toString());
    }
}
