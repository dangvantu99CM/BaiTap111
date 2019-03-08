
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.Group;
import com.restfb.types.User;
import static java.lang.System.out;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lenovo i3
 */
public class getMemberInGroup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FacebookClient fbc = new DefaultFacebookClient("EAAeSfOapxTYBALHXC8zfs0q0CS9ZBQ004fjG9jRIomP7jGBMEZCh6Kd0pxknmNu9ibcXWTJiDUoCGCaSUICUQy59yXvXhZCZCBHgkJ437swoEBrWNH0zaFpW5szbCmWIViPFJ1Fj1AFN9lwXTlk7jaR39ZBGW3xxC0ZAEL1GwUCZAYUjOpxxptGf7CPjj7mFuMZD");
        FacebookClient.AccessToken at = fbc.obtainExtendedAccessToken("2131389980460342", "f77b4126515cbc1055857b5bcccbc432");
        Connection<Group> myGroup = fbc.fetchConnection("me/groups", Group.class);
        List<Group> listGroup = myGroup.getData();
        for (int i = 0; i < listGroup.size(); i++) {
            out.println("You want to get members in Group " + listGroup.get(i).getName() + " ?YES/NO");
            String input = sc.nextLine();
            if (input.equals("YES")) {
                Connection<User> userNumber = fbc.fetchConnection(listGroup.get(i).getId() + "/members", User.class);
                List<User> listNumber = userNumber.getData();
                out.println("ListNumberOfGroup : ");
                for (int j = 0; j < listNumber.size(); j++) {

                    out.println("NameUser: " + listNumber.get(j).getName());
                    out.println("fb.com/" + listNumber.get(j).getId());
                }
            }
        }
    }
}
