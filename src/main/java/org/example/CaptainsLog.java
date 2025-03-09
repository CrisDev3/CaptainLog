package org.example;

import java.util.Random;

public class CaptainsLog {
    Random random = new Random();

    //Generate a random planet
    public char randomPlanetClass(){
        char [] planetClasses = {'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
        char randomClass = planetClasses[random.nextInt(planetClasses.length)];
        return randomClass;
    }

    // Generate a random starsip registry number
    public String randomShipRegistryNumber(){
        int randomNumber = random.nextInt(1000, 9999);
        return "NCC-"+randomNumber;
    }

    // Generate a random stardate
    public double randomStardate(){
        double starDate = random.nextDouble(41000.0, 42000.0);
        return starDate;
    }
}
