import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sort
{
    private double zapis_bin;

    public sort() { }

    public sort(double zapis_bin)
    {
        this.zapis_bin = zapis_bin;
    }

    public void reading() throws FileNotFoundException {

        int licznik_operacji = 0;

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


                System.out.println((int) tablica_bin[i]);


            }
            if (!sc.hasNext()) break;
            sc.nextLine();
        }
        sc.close();


        /// WSZYSTKO OK WCZYTYWANIE ^^

        /// PLAN :
        /// PRZEJSC PO TABLICY I ZLICZYC POWTORZENIA

        int max_t = 0;
        for (int i = 0; i < zmienna_pom; i++)
        {
            int max = 0;
            for(int j = 0; j < zmienna_pom; j++)
            {
                if(tablica_bin[i]==tablica_bin[j])
                {
                    max = max + 1;
                }
                licznik_operacji++;
            }

            if(max_t <= max)
            {
                max_t = max;
            }

        }
        System.out.println("licznik operacji : " + licznik_operacji);
        System.out.println("WYNIK : " + max_t);
    }

}
