
public class InTen {

    public static void main(String[] args) {
        String S = new String(" Nguyen Van VAn Anh  ");
        String S1 = new String();
        S = S.trim();
        int k;
        for (k = S.length() - 1; k >= 0; k--) {
            S1 = S.substring(k, k + 1);
            if (S1.equals(" ")) {
                break;
            }
        }
        System.out.print("Ten cua nguoi do la:" + S.substring(k));
    }
}
