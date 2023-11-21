package assignment4;

import java.util.Scanner;

public class Planet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);// Scanner Object
		System.out.println("Enter your weight on Earth");
		double weightOnEarth = in.nextDouble();// getting user's input as double for weight on Earth
		System.out.println("type your planet Name");
		String choicePlanet = in.next();// getting planet name in the form of String
		double weightOnOtherPlanet = seeYourWeightOnOtherPlanet(weightOnEarth, choicePlanet);
		System.out.println("Your Weight On " + choicePlanet + " is : " + weightOnOtherPlanet + " lbs");
		in.close();
	}

	public static double seeYourWeightOnOtherPlanet(double weightOnEarth, String planetChoice) {
		switch (planetChoice) {
		case "Mercury":
			double weightOnMercury = weightOnEarth * 0.38;
			// System.out.println("Your weight on Mercury : " + weightOnMercury);
		case "Venus":
			double weightOnVenus = weightOnEarth * 0.91;
			// System.out.println("Your weight on Venus : " + weightOnVenus);
		case "Mars":
			double weightOnMars = weightOnEarth * 0.991;
			// System.out.println("Your weight On Mars :" + weightOnMars);

		case "Jupiter":
			double weightOnJupiter = weightOnEarth * 0.71;
			// System.out.println("Your weight on Jupiter : " + weightOnJupiter);
		case "Saturn":
			double weightOnSaturn = weightOnEarth * 0.89;
			// System.out.println("Your weight on Saturn :" + weightOnSaturn);
		case "Uranus":
			double weightOnUranus = weightOnEarth * 1.13;
			// System.out.println(weightOnUranus);
		case "Neptune": // Neptune
			double weightOnNeptune = weightOnEarth * 1.39;
			// System.out.println("Your weight on neptune : " + weightOnNeptune);
		default:
			// System.out.println("Invalid choice .using Earth as default");
			return weightOnEarth;
		}

	}

}
