package getdatafb;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import static java.lang.System.out;

/**
 *
 * @author lenovo i3
 */
public class getAcessToken {

    public static void main(String[] args) {
        FacebookClient.AccessToken accesstoken = new DefaultFacebookClient().obtainExtendedAccessToken(Constants.MY_APP_ID, Constants.MY_APP_SECRET);
        out.println("My access Token : " + accesstoken.getAccessToken());

    }
}
