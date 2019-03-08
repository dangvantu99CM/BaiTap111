
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.Comment;
import com.restfb.types.Post;
import static java.lang.System.out;
import java.util.List;

/**
 *
 * @author lenovo i3
 */
public class listComments {

    public static void main(String[] args) {
        FacebookClient fbc = new DefaultFacebookClient("EAAeSfOapxTYBAIUlJ6sXK3YICFXhzSFZCEbj0unThrVoeCt7bNqg9ZCs1ZCLCoHHgOiY4kAX7ZAbwzMxG1ePO51KR5XQ7AGcZAxQnfLDYWZAtFSY57eOUtSnpP8JyExRcBpPnelM2BfOUvMIUTWzUpwi8ArTohZBRuCJuY3ykZB19Ipuk0vovb0FDyXVFrIRiocZD");

        String postId = "306247420101932_307193226674018";
        Connection<Comment> connectComment = fbc.fetchConnection(postId + "/comments", Comment.class);
        for (List<Comment> listComent : connectComment) {
            for (Comment c : listComent) {
                out.println(c.getMessage());
            }
        }
        Post post = fbc.fetchObject("306247420101932_307193226674018",
                Post.class,
                Parameter.with("fields", "from,to,likes.limit(0).summary(true),comments.limit(0).summary(true),shares.limit(0).summary(true)"));

        out.println("Likes count: " + post.getLikesCount());
        out.println("Shares count: " + post.getSharesCount());
        out.println("Comments count: " + post.getCommentsCount());
    }
}
