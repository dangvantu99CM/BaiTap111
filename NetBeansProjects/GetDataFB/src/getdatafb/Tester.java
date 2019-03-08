package getdatafb;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.FacebookClient.AccessToken;
import com.restfb.Parameter;
import com.restfb.exception.FacebookOAuthException;
import com.restfb.scope.ScopeBuilder;
import com.restfb.types.Page;
import com.restfb.types.Post;
import com.restfb.types.User;
import static java.lang.System.out;
import java.util.List;
import static sun.rmi.transport.TransportConstants.Version;

/**
 *
 * @author DangVanTu
 */
public class Tester {

    public static void main(String[] args) {
//        etUserCode);DefaultFacebookClient client = new DefaultFacebookClient(Version.VERSION_2_5);
//        ScopeBuilder scope = new ScopeBuilder();
//
//        DeviceCode deviceCode = client.fetchDeviceCode(MY_APP_ID, scope);
//
//        out.println("Open in a browser: " + deviceCode.getVerificationUri);
//        out.println("Enter this Code: " + deviceCode.g
        AccessToken accesstoken = new DefaultFacebookClient().obtainExtendedAccessToken(Constants.MY_APP_ID, Constants.MY_APP_SECRET);
        out.println("My access Token : " + accesstoken);
       // String myToken = acesstoken.getAccessToken();
        FacebookClient facebookClient = new DefaultFacebookClient();
        try {
            Connection<User> myFriends = facebookClient.fetchConnection("me/friends", User.class);

// Page page = facebookClient.fetchObject("me",Page.class,Parameter.with("fields", "fan_count"));
            User user = facebookClient.fetchObject("me", User.class);
            System.out.println(user.getId());
            System.out.println(user.getName());
            System.out.println(user.getBirthday());
            System.out.println(user.getAgeRange());
            Connection<Post> myFeed = facebookClient.fetchConnection("me/feed", Post.class, Parameter.with("Fields", "comment"));
// Connections support paging and are iterable

// Iterate over the feed to access the particular pages
            for (List<Post> myFeedPage : myFeed) {

                // Iterate over the list of contained data 
                // to access the individual object
                for (Post post : myFeedPage) {
                    out.println("Post: " + post);
                }
            }
//        System.out.println("User : " + user);
//        System.out.println("User_birthday : " + user.getBirthday() );
            // System.out.println("Page_IF : " + page.getFanCount() );

        } catch (FacebookOAuthException e) {
            e.printStackTrace();

        }
    }
}
