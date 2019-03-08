package baitapblog;
// Lap trinh huong doi tuong 
// bai 1
public class BaiTapBlog {

    String letter;
    double value;

    public BaiTapBlog(String letter, double value) {
        this.letter = letter;
        this.value = value;
    }

    public static void printTile(BaiTapBlog title) {
        System.out.print("Chu cai tuong ung : " + title.letter + "Chu so tuong ung: " + title.value);
    }

    public static void main(String[] args) {
        BaiTapBlog title = new BaiTapBlog("Z", 10);
        System.out.println(title);
        printTile(title);
    }
}
