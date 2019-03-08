package trochoixucsac;

/**
 *
 * @author VanTuPro
 */
// cho 2 con xuc sac
// if points == 7 or 11 in the first >> player win
// if points == 3 2 12 in the first >> player lost
// if points == 4 5 6 8 9 10 in the first >> player se quang tiep tuc 2 con xuc sac den khi tong day den diem toi thi win else khi bang 7 lost
public class TroChoiXucSac {

    public static void main(String[] args) {

        int k = tinhPoints();
        System.out.println(k);
        if (k == 7 || k == 11) {
            System.out.println("Player Win");
        } else {
            if (k == 2 || k == 3 || k == 12) {
                System.out.println("Player Lost");
            } else {
                int n = 0;
                while (true) {
                    if (k == 4 || k == 5 || k == 6 || k == 8 || k == 9 || k == 10) {
                        n = tinhPoints();
                        
                        if (k == n) {
                            System.out.println(n);
                            System.out.println("Player Win");
                            break;
                        } else {
                            if (n == 7) {
                                System.out.println(n);
                                System.out.println("Player lost");
                                break;
                            }
                        }

                    }
                   

                }

            }
        }

    }

    public static int tinhPoints() {
        int point1 = 1 + (int) (Math.random() * 6);
        int point2 = 1 + (int) (Math.random() * 6);
        int sumPoints = point1 + point2;
        return sumPoints;
    }

}
