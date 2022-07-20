/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sad;

import java.time.LocalTime;
import java.util.List;
/**
 *
 * @author 4a_babirad_n
 */
public class Bbsk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SadZvolen SadZv = new SadZvolen();
        SadZv.pridajLinku("BB", "BS", LocalTime.of(12, 50), 3, 50);
        SadZv.pridajLinku("BB", "ZV", LocalTime.of(15, 38), 2, 45);
        SadZv.kupListok(LocalTime.of(12, 50), 3, 2);
        SadZv.kupListok(LocalTime.of(15, 38), 3, 2);
        SadZv.kupListok(LocalTime.of(12, 50), 3, 50);
        SadZv.kupListok(LocalTime.of(15, 38), 2, 5);
        SadZv.kupListok(LocalTime.of(15, 38), 2, 50);
        SadZv.vratListok(LocalTime.of(15, 38), 2, 1);
        List<Linka> dispecing = SadZv.dispecing(LocalTime.of(12, 0), LocalTime.of(16, 0));
        for (Linka linka : dispecing) {
            System.err.println(linka.toString());
        }
    }

}
