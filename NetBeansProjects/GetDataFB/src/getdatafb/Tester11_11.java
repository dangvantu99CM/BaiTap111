package getdatafb;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.scope.ScopeBuilder;
import com.restfb.types.DeviceCode;
import com.restfb.types.User;
import static java.lang.System.out;
import java.util.Scanner;
import static sun.rmi.transport.TransportConstants.Version;

/**
 *
 * @author DangVanTu
 */
public class Tester11_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.lang.String s = sc.nextLine();
        //AcessToken at = new DefaultFacebookClient().obtainExtendedAccessToken();
        FacebookClient facebookClient = new DefaultFacebookClient("EAAeSfOapxTYBACbPLiwZAHzRX7cTF4ZCUccAxOwyteyUwBIexGt4eFJnOeVDGVtV6UL1xXZA9Wx8JdxJunmrvh1qWkgG1HHy46T6M5SRhGPk8L7rZAZBNJEKw8GDz8BLU89Cvu0M47WZBsd2GU04rEZAnj4UEwUJwrZBdOGG2V7q0vgXbTLOmjhWZAKcI1K1HSiSyNLrSX12B3gZDZD");
        User user = facebookClient.fetchObject("me",User.class,Parameter.with("fields","AgeRange"));
        out.println(user.getAgeRange());
    }
}
