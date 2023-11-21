package assignment4;

import java.util.Scanner;

public class WeightOnOtherPlanet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your weight on Earth");
		double weightOnEarth = in.nextDouble();
		System.out.println("type your planet Name");
		String choicePlanet = in.next();
		double weightOnOtherPlanet = checkYourWeightONOtherPLanet(choicePlanet, weightOnEarth);
		System.out.println("Your Weight On " + choicePlanet + " is " + weightOnOtherPlanet + " lbs");
		in.close();
	}

	public static double checkYourWeightONOtherPLanet(String yourPlanet, double yourWeightOnEarth) {
		switch (yourPlanet) {
		case "Mercury": {
			double weightOnMercury = yourWeightOnEarth * 0.38;
			return weightOnMercury;
		}
		case "Venus": {
			double weightOnVenus = yourWeightOnEarth * 0.91;
			return weightOnVenus;
		}
		case "Mars": {
			double weightOnMars = yourWeightOnEarth * 0.38;
			return weightOnMars;
		}
		case "Jupiter": {
			double weightOnJupiter = yourWeightOnEarth * 2.36;
			return weightOnJupiter;
		}
		case "Saturn": {
			double weightOnSaturn = yourWeightOnEarth * 0.92;

		}
		case "Uranus": {
			double weightOnUranus = yourWeightOnEarth * 0.89;
			return weightOnUranus;
		}
		case "Neptune": {

			double weightOnNeptune = yourWeightOnEarth * 1.13;
			return weightOnNeptune;
		}

		default: {
			System.out.println("Enter Valid Planet");
			return yourWeightOnEarth;
		}
		}

	}

}
