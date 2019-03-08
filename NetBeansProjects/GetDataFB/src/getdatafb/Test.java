package getdatafb;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.Album;
import com.restfb.types.Comment;
import com.restfb.types.Post;
import com.restfb.types.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DangVanTu
 */
public class Test {

    public static void main(String[] args) {
        FacebookClient fbc = new DefaultFacebookClient("EAAeSfOapxTYBAMOZBddXEkV4QXLUJnOABiblvISjEgngW3anffrnJ68E7z79EeVZAAWJ3hCwmrDX7xLhcDfnyXWnpfpFrgwwed2ZBBJwjqX0yeYbZBTRoipuSkuAZAwrASdx3bZAV9U9iVVeX3rLZC4KULprMr2jl8yNOBxyEXxmdPDZBXEWdhUyHSyS85ZBZCnK8ZD");
//        User user = fbc.fetchObject("me", User.class);
//        System.out.println("User : " + user);
//        System.out.println("user_id : " + user.getId());
//        System.out.println("user_name : " + user.getName());
        //Connection<Post> post = fbc.fetchConnection("100021500295420/feed", Post.class);
        

//        List<Post> posts = post.getData();
//        for (int i = 0; i < posts.size(); i++) {
//            System.out.println("NamePost : " + posts.get(i).getMessage());
//        }
        
        Connection<Album> album = fbc.fetchConnection("me/albums", Album.class);
        Connection<Album> albumConnection = fbc.fetchConnection(
                "me/albums", Album.class);
        List<Album> albums = albumConnection.getData();

       for(int  i = 0; i < albums.size(); i++){
           System.out.println(i+1 + " " + "NameAlbum : " + albums.get(i).getLink() + " " + albums.get(i).getName());
       }
       
       Connection<Post> resultPost = fbc.fetchConnection("official.sonyvietnam/feed",Post.class);
       for(List<Post> posts:resultPost){
           for(Post post:posts){
               System.out.println("Post : " );
               System.out.println("Text : " + post.getMessage());
               Connection<Comment> resultComment = fbc.fetchConnection(post.getId() + "/comments",Comment.class);
               for(List<Comment>comments:resultComment){
               for(Comment comment:comments){
                   System.out.println("Comment: ");
                   System.out.println("Text : " + comment.getMessage());
               }
           }
           }

    }
}
}
