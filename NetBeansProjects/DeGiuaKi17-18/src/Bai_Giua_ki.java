
import java.util.ArrayList;
import java.util.Scanner;

public class Bai_Giua_ki {

    //tim kiem ky tu xuat hien nhieu nhat trong chuoi da cho
    // in ra ky tu xuat hien nhieu nhat trong chuoi
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = "abbbss2342AFSFsreutrffffssbbb3333";
        String s = sc.nextLine();
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.substring(i));
        }
        System.out.println(list.size());
        int[] a = new int[s.length()];
        int count = 1;
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (s.substring(i).equals(s.substring(j))) {
                    list.remove(s.substring(j));
                    count += 1;
                }
            }
            System.out.println(count);
        }
        for(int i = 0; i < list.size() ; i++){
            System.out.println(list.get(i));
        }
    }
}
