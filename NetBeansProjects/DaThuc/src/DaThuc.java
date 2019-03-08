

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class DaThuc {

    private static int bac;
    private static double[] dsheso;

    public DaThuc() {

    }

    public DaThuc(int bac, double[] dsheso) {
        super();
        this.bac = bac;
        this.dsheso = dsheso;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public double[] getDsheso() {
        return dsheso;
    }

    public void setDsheso(double[] dsheso) {
        this.dsheso = dsheso;
    }

    public static DaThuc readByFile(String fileName) {
        DaThuc dt = new DaThuc();
        try {
            Scanner read = new Scanner(new File(fileName));
            bac = read.nextInt();
            dsheso = new double[bac + 1];
            for (int i = 0; i < bac + 1; i++) {
                dsheso[i] = read.nextDouble();
            }
            dt.setBac(bac);
            dt.setDsheso(dsheso);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return dt;
    }

    public static void printToFile(DaThuc dt) {
        try {
            Formatter printer = new Formatter(new File("output.txt"));
            printer.format("%d\n", dt.getBac());
            for (int i = 0; i < dt.getBac() + 1; i++) {
                printer.format("%f", dt.getDsheso()[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static DaThuc tongDaThuc() {
        DaThuc dtSum = new DaThuc();

        if (readByFile("input1.txt").getBac() > readByFile("input2.txt").getBac()) {
            dtSum.setBac(readByFile("input1.txt").getBac());
            double[] sumArray = new double[dtSum.bac + 1];
            double[] a = new double[dtSum.bac + 1];
            for (int i = 0; i < a.length; i++) {
                if (i < a.length - readByFile("input2.txt").getDsheso().length) {
                    a[i] = 0;
                } else {
                    a[i] = a[i - a.length + readByFile("input2.txt").getDsheso().length];
                }

            }

            for (int i = 0; i < dtSum.bac + 1; i++) {
                sumArray[i] = a[i] + readByFile("input1.txt").getDsheso()[i];
            }
            dtSum.setDsheso(sumArray);
        } else {
            if (readByFile("input1.txt").getBac() < readByFile("input2.txt").getBac()) {
                dtSum.setBac(readByFile("input2.txt").getBac());
                double[] sumArray = new double[dtSum.bac + 1];
                double[] a = new double[dtSum.bac + 1];
                for (int i = 0; i < a.length; i++) {
                    if (i < a.length - readByFile("input1.txt").getDsheso().length) {
                        a[i] = 0;
                    } else {
                        a[i] = a[i - a.length + readByFile("input1.txt").getDsheso().length];
                    }

                }
                for (int i = 0; i < dtSum.getBac() + 1; i++) {
                    sumArray[i] = a[i] + readByFile("input1.txt").getDsheso()[i];
                }
                dtSum.setDsheso(sumArray);
            } else {
                dtSum.setBac(readByFile("input2.txt").getBac());
                double[] sumArray = new double[dtSum.bac + 1];
                for (int i = 0; i < dtSum.getBac() + 1; i++) {
                    sumArray[i] = readByFile("input1.txt").getDsheso()[i] + readByFile("input2.txt").getDsheso()[i];
                }
                dtSum.setDsheso(sumArray);
            }
        }
        return dtSum;

    }

    /* public DaThuc daThucMultiply() {
        DaThuc dtM = new DaThuc();
        dtM.setBac(readByFile("input1.txt").getBac() + readByFile("input2.txt").getBac());
        double[] A = new double[dtM.getBac() + 1];
        double[][] B = new double[readByFile("input1.txt").getBac() + 1][readByFile("input2.txt").getBac() + 1];
        for (int i = 0; i < readByFile("input1.txt").getDsheso().length; i++) {
            for (int j = 0; j < readByFile("input2.txt").getDsheso().length; j++) {
                B[i][j] = readByFile("input1.txt").getDsheso()[i] * readByFile("input2.txt").getDsheso()[j];
            }
        }
        
    }*/
    public static void main(String[] args){
        
        printToScreen(tongDaThuc());
        printToFile(tongDaThuc());
    }
   public static void printToScreen(DaThuc dt){
       System.out.println(dt.getBac() + "\n" + dt.getDsheso());
   }

    public String toString() {
        return getBac() + "\n" + getDsheso();
    }

}
