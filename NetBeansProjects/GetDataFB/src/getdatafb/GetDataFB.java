
package getdatafb;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.FacebookClient.AccessToken;
import com.restfb.Parameter;
import com.restfb.types.Album;
import com.restfb.types.Post;
import com.restfb.types.User;
import java.util.List;

public class GetDataFB {

    public static void main(String[] args) {
        // TODO code application logic here
       //Tu tao 1 token moi cho minh va ma ung dung luon khong thay doi
        AccessToken accessToken = new DefaultFacebookClient().obtainExtendedAccessToken(Constants.MY_APP_ID, Constants.MY_APP_SECRET);
        String token = accessToken.getAccessToken();
        System.out.println(token);
        FacebookClient facebookClient = new DefaultFacebookClient(token);
        System.out.println();
//        User user = facebookClient.fetchObject("me",User.class);
//        System.out.println("User = " + user);
//        System.out.println("User_ID = " + user.getId());
//        System.out.println("UserName = " + user.getName());
//        System.out.println("Birthday = " + user.getBirthday());
//        System.out.println("Age = " + user.getAgeRange());
//        System.out.println("HomeTown = " + user.getHometownName());
//        MyDataFromFB getData  = facebookClient.fetchObject("me",MyDataFromFB.class,Parameter.with("field","id,firstname,lastname,name,email"));
//        System.out.println("User : " + getData.toString());
//        System.out.println("UserName : " + getData.getFullName());
//        System.out.println("UserEmail : " + getData.getEmail());
//        Connection<Album> albumConnection = facebookClient.fetchConnection(
//               "me/albums", Album.class);
//        Connection<Post> post = facebookClient.fetchConnection("FBSVietnam/feed",Post.class);
//    // List<Album> albums = albumConnection.getData();
//       List<Post> posts = post.getData();
//       for(Post p : posts){
//           System.out.println("Post : ");
//           System.out.println("Text : " + p.getMessage());
//       }
//// 
//       for (Album album : albums) {
//           System.out.println("Album name:" + album.getName() + " " + album.getLink());
//       }
//    }
//    
}

    private static void obtainExtendedAccessToken(String MY_APP_ID, String MY_APP_SECRET) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
