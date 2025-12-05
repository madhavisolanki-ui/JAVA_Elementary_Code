package Practice;
import java.util.*;
import java.io.*;

public class weight_of_hill_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt(); // total levels
        int input2 = sc.nextInt(); // head level weight
        int input3 = sc.nextInt(); // increment

        int totalLevels = input1;
        int headWeight = input2;
        int increment = input3;

        int totalWeight = 0;
        int currentWeight = headWeight;

        for (int level = 1; level <= totalLevels; level++) {
            // each row has "level" number of stars
            totalWeight += currentWeight * level;

            // increase the weight for next level
            currentWeight += increment;
            }
            System.out.println(totalWeight);
        }
}
