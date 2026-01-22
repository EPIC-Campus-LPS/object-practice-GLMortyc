import java.util.Scanner;

public class Main {
    static void main(String[] args){
        planets planet1 = new planets("Mar", 0.38);
        planets planet2 = new planets("Venus", 0.9);
        planets planet3 = new planets("Jupiter", 2.4);

        String n = System.lineSeparator();
        double g = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("What's your weight on Earth?");
        Double weight = input.nextDouble();
        System.out.println("1." + planet1.getPlanet() + n + "2." + planet2.getPlanet() + n + "3." + planet3.getPlanet() + n + "Selection?");
        Double gravity = input.nextDouble();


        if (gravity == 1){
            g = planet1.getGravity();
        } else if (gravity == 2){
            g = planet2.getGravity();
        } else if (gravity == 3){
            g = planet3.getGravity();
        }

        System.out.println("Your weight on Mars is " + weight * g);

    }
}
