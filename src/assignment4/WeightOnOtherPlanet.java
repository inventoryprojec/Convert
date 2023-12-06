package assignment4;

import java.util.Scanner;

public class WeightOnOtherPlanet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your weight on Earth");
		double weightOnEarth = in.nextDouble();
		printListOfPlannet();//
		System.out.println("type a planet Name where you want to see your weight" + "(note:Case sensitive)");
		String choicePlanet = in.next();
		double weightOnOtherPlanet = checkYourWeightONOtherPLanet(choicePlanet, weightOnEarth);
		System.out.println("Your Weight On " + choicePlanet + " is " + weightOnOtherPlanet + " lbs");
		in.close();
	}

	public static void printListOfPlannet() {
		System.out.println("List Of Plennet here : ");
		String listOfPlannet[] = { "Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
		for (int i = 0; i < listOfPlannet.length; i++) {
			System.out.println(listOfPlannet[i]);

		}

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
			return weightOnSaturn;

		}
		case "Uranus": {
			double weightOnUranus = yourWeightOnEarth * 0.89;
			return weightOnUranus;
		}
		case "Neptune": {

			double weightOnNeptune = yourWeightOnEarth * 1.13;
			return weightOnNeptune;// missing return
		}

		default: {
			System.out.println("Enter Valid Planet");
			return yourWeightOnEarth;
		}
		}

	}

}
