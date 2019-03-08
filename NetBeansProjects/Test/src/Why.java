
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.Album;
import com.restfb.types.Photo;
import com.restfb.types.User;
import static java.lang.System.out;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lenovo i3
 */
public class Why {

    public static void main(String[] args) {
        FacebookClient fbc = new DefaultFacebookClient("EAAeSfOapxTYBAHlM7H4xG3y3G4eMKOjjJa9g85J73lTYVfqnpGmMj7Fh3yZAMi8opQoa9Wg6rxZAZApOr0TzkussjEKNHzf6lZBztGNN8jzeW7q1ZAXZCWK8VN8YlwRZAZBIO4d67UCh3rh6wUA1XdA6i6e7baOCvKZAZBKtikdefpP4EgbRAzvF9sjT1SjHTrETkZD");
        //nut la trang ca nhan
        // canh la lay cac doi tuong anh tren trang ca nhan >> tap hop cac doi tuong la anh tran trang ca nhan
        // truong la du lieu cu the cua cac canh anh (doi tuong anh trong list)
        User user = fbc.fetchObject("me/photos", User.class);
        Connection<Photo> cp = fbc.fetchConnection("me/photos",Photo.class);
        List<Photo> listphoto = cp.getData();
        for(int i = 0 ; i < listphoto.size() ; i++){
            out.println("fb.com/" + listphoto.get(i).getId());
        }
        // Connection<Photo> cp = fbc.fetchObject("me/feed", Photo.class);
        Connection<Album> al = fbc.fetchConnection("me/albums",Album.class);
        List<Album> ab = al.getData();
        for(Album a : ab){
            out.println("fb.com/" + a.getId());
        }
        
    }
}
