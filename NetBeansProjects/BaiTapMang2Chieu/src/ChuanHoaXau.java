
public class ChuanHoaXau {

    public static void main(String[] args) {
        String S = new String(" Nguyen Thi  Binh ");
        String S1, S2 = new String();
        S = S.trim();
        for (int k = 0; k < S.length(); k++) {
            S1 = S.substring(k, k + 1);
            if (S1.equals(" ")) {
                S1 = S.substring(k + 1, k + 2);// kiem tra xen co 2 dau cach lien tiep hay k    
                if (S1.equals(" ")) {
                    continue;   // tiep tuc kiem tra
                } else {
                    S2 = S2 + S.substring(k, k + 1);
                }
            } else {
                S2 = S2 + S1;
            }
        }
        System.out.print(S2);
    }
}
