
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.FacebookClient.AccessToken;


/**
 *
 * @author DangVanTu
 */
public class AcessToken {
    public static void main(String [] args){
        FacebookClient fc = new DefaultFacebookClient();
        AccessToken at = fc.obtainExtendedAccessToken("2131389980460342", "f77b4126515cbc1055857b5bcccbc432");
        String ac = at.getAccessToken();
        System.out.println(ac);
        
    }
}
