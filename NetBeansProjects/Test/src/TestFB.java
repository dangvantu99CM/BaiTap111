
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.FacebookClient.AccessToken;
import com.restfb.Parameter;
import com.restfb.types.Comment;
import com.restfb.types.Group;
import com.restfb.types.Page;
import com.restfb.types.Photo;
import com.restfb.types.Post;
import com.restfb.types.User;
import com.sun.org.apache.bcel.internal.Constants;
import static java.lang.System.out;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DangVanTu
 */
public class TestFB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accessToken = "";
        //String accessToken = "EAAeSfOapxTYBAPZCDRxtdMJaLtsBkip6E5WQaKdUn2OZB38kI32vcoQVwOzWyBysMQXE1M7SVNVnJgEQNeIRmY0U84JZCHHNvYR7SRKPyOBBriia0e93dVyvlyBfzFyUiWRWUBCb2X7RCf5jb4aWspRcxGmFOrOwa4ZBZBXacStKU2eXPBCd96PrlDbrLHAkZD";
        FacebookClient fbc = new DefaultFacebookClient("EAAAAAYsX7TsBAI2hSj9JDHIXCe8VPrKgRz0ziO6Q79nZBMOfkTpZAOByzFYHzgGT8NgvaLXlM7fhdIaZBwwYkmySUmnYZCNyz8tr9sFZCB90yosO2TbPAOl3w5GPXqw82T8VBPA2oVf1ejbIraB4ZB1SB5pj8mKLp4GhHklBQVVwZDZD");
        // AccessToken at = fbc.obtainExtendedAccessToken("2131389980460342", "f77b4126515cbc1055857b5bcccbc432");
        // out.println(at.getAccessToken());
        //  FacebookClient fbclient = new DefaultFacebookClient(at.getAccessToken());

        Connection<Post> post = fbc.fetchConnection("me/feed", Post.class);
        List<Post> mylistPost = post.getData();

        int count = 0;
        for (int i = 0; i < mylistPost.size(); i++) {
            out.println(i + 1 + ". Post : " + mylistPost.get(i));

            out.println("fb.com/" + mylistPost.get(i).getId());
            out.println("PostName : " + mylistPost.get(i).getMessage());
            out.println("Comments of post: ");
            Connection<Comment> comentConnection = fbc.fetchConnection(mylistPost.get(i).getId() + "/comments", Comment.class);

            for (List<Comment> listComent : comentConnection) {
                for (Comment c : listComent) {
                    out.println(c.getMessage());
                }
            }

            out.println("CommentCount By Post: " + mylistPost.get(i).getCommentsCount());
            count += 1;
        }
        System.out.println(count);
        count = 0;

        // Connection<Page> page1 = fbc.fetchConnection(accessToken, type, prmtrs)
        //Connection<Page> page = fbc.fetchConnection("me/accounts",Page.class); // 
        //Connection<Page> page = fbc.fetchConnection("me/likes", Page.class); // danh sach cac trang me likes
        Connection<Page> page = fbc.fetchConnection("me/accounts", Page.class);
        List<Page> listPage = page.getData();

        for (int i = 0; i < listPage.size(); i++) {
            out.println(i + 1 + ".Page : " + listPage.get(i));
            out.println("PageName " + listPage.get(i).getName());
            out.println("Page photos : " + listPage.get(i).getPicture());
            out.println("get like in a page : " + listPage.get(i).getLikes());
            out.println("URL page : " + "fb.com/" + listPage.get(i).getId());
            count += 1;
        }
        out.println(count);
        Connection<Group> myGroup = fbc.fetchConnection("me/groups", Group.class);
        List<Group> listGroup = myGroup.getData();
        for (int i = 0; i < listGroup.size(); i++) {
            System.out.println("Group Name : ");
            out.println(i + 1 + "." + listGroup.get(i).getName());
            out.println("Group URL: \n" + "fb.com/" + listGroup.get(i).getId());

        }

//        Connection<Group> myGroupad = fbc.fetchConnection("me/admined_groups",Group.class);
//        List<Group> listadGroup = myGroup.getData();
//        for(int i = 0; i < listadGroup.size(); i++){
//            System.out.println("Group Name : ");
//            out.println(i+1 + "."+ listadGroup.get(i).getName());
//            
//        }
//get mumber of group
        /* for (int i = 0; i < listGroup.size(); i++) {
            out.println("You want to get members in Group " + listGroup.get(i).getName() + " ?YES/NO");
            String input = sc.nextLine();
             if(input.equals("YES")){
            Connection<User> userNumber = fbc.fetchConnection(listGroup.get(i).getId() + "/members", User.class);
            List<User> listNumber = userNumber.getData();
            out.println("ListNumberOfGroup : ");
            for (int j = 0; j < listNumber.size(); j++) {

                out.println("NameUser: " + listNumber.get(j).getName());
                out.println("fb.com/" + listNumber.get(j).getId());
            }
            }
         */
        // get post of group
        for (int k = 0; k < listGroup.size(); k++) {
            out.println("You want to get posts in Group " + listGroup.get(k).getName() + " ?YES/NO");
            String in = sc.nextLine();
            if (in.equals("YES")) {
                Connection<Post> postGroup = fbc.fetchConnection(listGroup.get(k).getId() + "/feed", Post.class);
                List<Post> listPostGroup = postGroup.getData();
                for (int i = 0; i < listPostGroup.size(); i++) {
                    // get user name of post
                    System.out.println("postName: " + listPostGroup.get(i).getFrom().getName());

                    System.out.println("PostMessage : " + listPostGroup.get(i).getMessage());
                    Connection<Comment> ResultComment = fbc.fetchConnection(listPostGroup.get(i).getId() + "/comments", Comment.class);
                    List<Comment> listComment = ResultComment.getData();
                    for (Comment lc : listComment) {
                        out.println("Coments of post : " + lc.getMessage());
                    }

                    System.out.println("fb.com/" + listPostGroup.get(i).getId());
                }
            }

        }

//        
    }
}
