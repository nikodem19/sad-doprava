/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sad;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 4a_babirad_n
 */
public class SadZvolen {

    private final List<Linka> zoznamLiniek = new ArrayList();

    public SadZvolen() {
    }

    public void pridajLinku(String zMiesta, String doMiesta, LocalTime o, int cislo, int miesta) {
        zoznamLiniek.add(new Linka(zMiesta, doMiesta, o, cislo, miesta));
    }

    public void kupListok(LocalTime cas, int cislo, int pocetListkov) {
        for (Linka linka : zoznamLiniek) {
            double celkovaCena;
            if (cislo == linka.getCislo()) {
                if (linka.getO().compareTo(cas) == 0) {
                    int volneMiesta = linka.getvMiesta();
                    if ((volneMiesta - pocetListkov) >= 0) {
                        volneMiesta = linka.getvMiesta() - pocetListkov;
                        linka.setvMiesta(volneMiesta);
                        System.out.println("Kupil si si listok na autobus cislo " + cislo + ". Volnych miest je: " + volneMiesta);
                        celkovaCena = linka.getCenaListka() * pocetListkov;
                        System.out.println("Za " + pocetListkov + " zaplatíš " + celkovaCena + "€");
                        System.out.println("");
                    } else {
                        System.out.println("Autobus nemá dostatok miest");
                        System.out.println("Volných miest je: " + volneMiesta);
                        System.out.println(" ");
                    }
                }
            }
        }
    }

    List dispecing(LocalTime odTime, LocalTime doTime) {
        List<Linka> vytriedeneLinky = zoznamLiniek;
        for (Linka linka : zoznamLiniek) {
            if (linka.getO().compareTo(odTime) < 1) {
                vytriedeneLinky.remove(linka);
            }
            if (linka.getO().compareTo(doTime) > 1) {
                vytriedeneLinky.remove(linka);
            }
        }
        return vytriedeneLinky;
    }

    public void vratListok(LocalTime cas, int cislo, int pocetListkov) {
        for (Linka linka : zoznamLiniek) {
            double vratitPenazi;
            if (cislo == linka.getCislo()) {
                if (linka.getO().compareTo(cas) == 0) {
                    int volneMiesta = linka.getvMiesta() + pocetListkov;
                    linka.setvMiesta(volneMiesta);
                    vratitPenazi = (linka.getCenaListka() * pocetListkov) * 0.8;
                    System.out.println("Listky boli zrusene");
                    System.out.println("Za " + pocetListkov + " dostaneš naspäť " + vratitPenazi + "€");
                    System.out.println("" + linka.getvMiesta());
                    System.out.println("");
                }
            }
        }
    }

}
