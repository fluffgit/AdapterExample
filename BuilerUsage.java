package TRENER3;

import TRENER3.Builder.Weapon;

import java.util.ArrayList;
import java.util.List;

public class BuilerUsage {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        Weapon.Builder w1 = new Weapon.Builder();

        Weapon weapon = w1
                .withName("Bow")
                .withType("Range")
                .withDamage(123)
                .withDurability(1204598734289576L)
                .withperks(list)
                .build();

        System.out.println(weapon);

    }
}
