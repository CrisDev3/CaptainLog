package org.example;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean bandera = true;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to the starShip commands");

        while(bandera){

            try {
                System.out.println("Select your task:");
                System.out.println("1. check the planet class ");
                System.out.println("2. Log the registry number of the ally starShip ");
                System.out.println("3. Log the starDate");
                String result = buff.readLine();
                switch (result){
                    case "1":
                        var planetClass = new CaptainsLog().randomPlanetClass();
                        System.out.println(planetClass);
                        break;
                    case "2":
                        var registryNumber = new CaptainsLog().randomShipRegistryNumber();
                        System.out.println(registryNumber);
                        break;
                    case "3":
                        var starDate = new CaptainsLog().randomStardate();
                        System.out.println(starDate);
                        break;
                    default:
                        System.out.println("Invalid option");
                }
                    System.out.println("Want to continue? (S/N)");
                    String option = buff.readLine();
                    if (option.equalsIgnoreCase("n")) {
                        bandera = false;
                }

            }catch (Exception ex){
                System.out.println("Se produjo un error"+ex.getMessage());
            }
        }
    }
}
