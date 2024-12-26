package _11_Arrays;

public class Arrays1 {
    public static void main(String[] args) {

        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter"};

        if (planets[0].length() == planets[4].length()) {

            String PS = planets[0];

            planets[0] = planets[planets.length - 1];
            planets[planets.length - 1] = PS;
        }

        planets[1] = new StringBuilder(planets[1]).reverse().toString();

        String shortPlanet = planets[0];
        for (String planet : planets) {
            if (planet.length() < shortPlanet.length()) {
                shortPlanet = planet;
            }
        }

        char[] shortPlanetCharArrayChars = shortPlanet.toCharArray();

        for (String planet : planets) {
            System.out.println(planet);
        }

        System.out.println("Самый короткий элемент преобразован в символы:");
        for (char ch : shortPlanetCharArrayChars) {
            System.out.print(ch + " ");
        }
    }
}


