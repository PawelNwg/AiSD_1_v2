import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading
{
    public double[] reading() throws FileNotFoundException {

        Scanner sc = new Scanner(new File("in.txt"));

        String zmienna_pomString = sc.nextLine();
        int zmienna_pom = Integer.parseInt(zmienna_pomString);// ilosc liczb
        System.out.println(zmienna_pom);

        double[] tablica_bin = new double[zmienna_pom];
        System.out.println("=========");
        while (true) {
            for (int i = 0; i < zmienna_pom; i++) {

                double zmienna_pom2 = sc.nextDouble();

                tablica_bin[i] = zmienna_pom2;


                //System.out.println((int) tablica_bin[i]);


            }
            if (!sc.hasNext()) break;
            sc.nextLine();
        }
        sc.close();
        return tablica_bin;
    }
}
