/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sad;

import java.time.LocalTime;

/**
 *
 * @author 4a_babirad_n
 */
public class Linka {

    private final String zMiesta;
    private final String doMiesta;
    private final LocalTime o;
    private final int cislo;
    private final int miesta;
    private int vMiesta;
    private final double cenaListka;

    public Linka(String zMiesta, String doMiesta, LocalTime o, int cislo, int miesta) {
        this.cenaListka = 2.5;
        this.zMiesta = zMiesta;
        this.doMiesta = doMiesta;
        this.o = o;
        this.cislo = cislo;
        this.miesta = miesta;
        this.vMiesta = miesta;
    }

    @Override
    public String toString() {
        return "Linka{" + "zMiesta=" + zMiesta + ", doMiesta=" + doMiesta + ", o=" + o + ", cislo=" + cislo + ", miesta=" + miesta + ", vMiesta=" + vMiesta + '}';
    }

    public double getCenaListka() {
        return cenaListka;
    }

    
    public void setvMiesta(int vMiesta) {
        this.vMiesta = vMiesta;
    }

    public int getvMiesta() {
        return vMiesta;
    }

    public int getMiesta() {
        return miesta;
    }

    public String getzMiesta() {
        return zMiesta;
    }

    public String getDoMiesta() {
        return doMiesta;
    }

    public LocalTime getO() {
        return o;
    }

    public int getCislo() {
        return cislo;
    }

}
