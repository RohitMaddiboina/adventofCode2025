import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int current = 50;
        int pwd = 0;

        while (sc.hasNextLine()) {
            String rotation = sc.nextLine().trim();
            if (rotation.isEmpty()) continue;

            char dir = rotation.charAt(0);
            int distance = Integer.parseInt(rotation.substring(1));

            if (dir == 'L') {

                // I wrote bruteForce, need to check for an optimised version.
                int i = distance;
                while (i > 0) {
                    current = ((current - 1) + 100) % 100;
                    if (current == 0) {
                        pwd++;
                    }
                    i--;
                }

            } else {
                pwd = pwd + (current + distance) / 100;
                current = (current + (distance % 100)) % 100;
            }


        }

        System.out.println(pwd);

        sc.close();
    }
}
