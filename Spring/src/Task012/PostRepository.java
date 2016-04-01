package Task012;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task012
 */
public class PostRepository {
    // В поле вводится число, затем число (String) преобразуется в int
    public Post getPostById(String idS) {
        Post post = new Post();

        // Проверка на то, что idS действительно является числом в файле MyAspects
        int id = Integer.valueOf(idS);

        try {
            Connection conn = new MyConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement("select id, head, body from posts where id=" + id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            post.setId(rs.getInt("id"));
            post.setHead(rs.getString("head"));
            post.setBody(rs.getString("body"));
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return post;
    }

    public Post getPostByHead(String head) {
        Post post = new Post();
        try {
            Connection conn = new MyConnection().getConnection();
            PreparedStatement ps = conn.prepareStatement("select id, head, body from posts where head='" + head + "'");
            ResultSet rs = ps.executeQuery();
            rs.next();
            post.setId(rs.getInt("id"));
            post.setHead(rs.getString("head"));
            post.setBody(rs.getString("body"));
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return post;
    }
}
