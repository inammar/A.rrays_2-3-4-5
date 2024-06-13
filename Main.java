package org.example;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        //No.1. Create array containing 10 titles of plants.
        System.out.println("____First task____");
        String[] plants = {"Liepa", "Klevas", "Obelis", "Egle", "Pusis", "Berzas", "Azuolas", "Vysnia", "Tuja", "Slyva"};
        System.out.println(Arrays.toString(plants));
        System.out.println();

        //No.2. Print each plant, starting with the last and ending with the first (reverse cycle).
        System.out.println("____Second task____");
        for (int i = plants.length - 1; i >= 0; i--) {
            System.out.println(plants[i]);
        }
        System.out.println();

        //No.3. Count how many words are shorter than 5 characters and how many are longer than 7 characters.
        System.out.println("____Third task____");
        int shorterCount = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i].length() < 5) shorterCount++;
        }

        System.out.println("There are " + shorterCount + " words, shorter than 5 characters.");

        int longerCount = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i].length() > 7) longerCount++;
        }
        System.out.println("There are " + longerCount + " words, longer than 7 characters.");
        System.out.println();

        //No.4. Count how many words are longer than 5 characters but shorter than 10 characters.
        System.out.println("____Fourth task____");
        int charCount = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i].length() > 5 && plants[i].length() < 10) charCount++;
        }
        System.out.println("There are " + charCount + " words, longer than 5 characters, but shorter than 10 characters");
    }
}
