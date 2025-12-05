import java.util.*;
import java.io.*;

public class RobotMove{
    public static String moveRobot(int xMax, int yMax, String startPos, String instructions) {
        String[] parts = startPos.split("-");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        char dir = parts[2].charAt(0);
        boolean error = false;

        // Process each instruction
        String[] cmds = instructions.split(" ");
        for (String cmd : cmds) {
            if (cmd.equals("L")) {
                dir = turnLeft(dir);
            } else if (cmd.equals("R")) {
                dir = turnRight(dir);
            } else if (cmd.equals("M")) {
                int newX = x;
                int newY = y;
                switch (dir) {
                    case 'E': newX++; break;
                    case 'W': newX--; break;
                    case 'N': newY++; break;
                    case 'S': newY--; break;
                }

                // Check grid bounds
                if (newX < 0 || newX > xMax || newY < 0 || newY > yMax) {
                    error = true;
                    break;
                }
                x = newX;
                y = newY;
            }
        }
        String result = x + "-" + y + "-" + dir;
        if (error) result += "-ER";
        return result;
    }

    // Turning left
    private static char turnLeft(char d) {
        switch (d) {
            case 'E': return 'N';
            case 'N': return 'W';
            case 'W': return 'S';
            case 'S': return 'E';
        }
        return d;
    }

    // Turning right
    private static char turnRight(char d) {
        switch (d) {
            case 'E': return 'S';
            case 'S': return 'W';
            case 'W': return 'N';
            case 'N': return 'E';
        }
        return d;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xMax = sc.nextInt();
        int yMax = sc.nextInt();
        sc.nextLine();
        String startPos = sc.nextLine();
        String instructions = sc.nextLine();
        String result = moveRobot(xMax, yMax, startPos, instructions);
        System.out.println(result);
    }
}
