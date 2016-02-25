/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.desertEscapeGame.view;

import java.util.Scanner;

/**
 *
 * @author Paez &
 */
public class FuelUse {

    private String planetLevel;
    private double radiusTank;
    private double lenghtTank;
    private double volumeTank;

    // public FuelUse(Integer CurrentFuelLevel) {
    public void fuelUse() {

        //Display a banner when view is created
        this.displayBanner();

        this.doAction();
    }

    private void displayBanner() {
        System.out.println(
                "\n*****************************************************************"
                + "\n*                                                               *"
                + "\n*    XXX  X    XXXX  X  X XXXX XXXXX  XXX        XX-XXXX        *"
                + "\n*    X  X X    X  X  X  X X      X   X          XXXXX-XXX       *"
                + "\n*    XXX  X    XXXX  XX X XXX    X    XX       XX-XXXXXXXX      *"
                + "\n*    X    X    X  X  X XX X      X      X       XXX-XXXXX       *"
                + "\n*    X    XXXX X  X  X  X XXXX   X   XXX         XXXX-XX        *"
                + "\n*                                                               *"
                + "\n* Your Star Fighter requires the following fuel volumes:       *"
                + "\n*                                                               *"
                + "\n* PLANET            DESCRIPTION                 VOLUME   LEVEL  *"
                + "\n* Ar3this     Stop and destry your stones       100 Gal    1    *"
                + "\n* BrOnChTis   Infection contagion expander      500 Gal    2    *"
                + "\n* CrampMusc   Muscle Cramp in all body         1000 Gal    3    *"
                + "\n* DermTiTis   Skin destroy without return      2000 Gal    4    *"
                + "\n*                                                               *"
                + "\n* Each destroyed planet gives you 10 times their GGal required  *"
                + "\n* and you win 100GGal in each war win.                          *"
                + "\n*                                                               *"
                + "\n*****************************************************************"
        );

        boolean valid = false;

        while (!valid) {
            planetLevel = "\nLevel of the Planet to visit";
            System.out.println(planetLevel);
            planetLevel = this.getInput();

            switch (planetLevel) {
                case "1":
                    System.out.println("YOU GOING TO Ar3this");
                    System.out.println("REMEMBER IT: Stop and destry your stones");
                    System.out.println("YOU NEED: 100 Giga Gallons");
                    valid = true;
                    break;
                case "2":
                    System.out.println("YOU GOING TO BrOnChTis");
                    System.out.println("REMEMBER IT: Infection contagion expander");
                    System.out.println("YOU NEED: 500 Giga Gallons");
                    valid = true;
                    break;
                case "3":
                    System.out.println("YOU GOING TO CrampMusc");
                    System.out.println("REMEMBER IT: Muscle Cramp in all body");
                    System.out.println("YOU NEED: 1000 Giga Gallons");
                    valid = true;
                    break;
                case "4":
                    System.out.println("YOU GOING TO DermTiTis");
                    System.out.println("REMEMBER IT: Skin destroy without return");
                    System.out.println("YOU NEED: 2000 Giga Gallons");
                    valid = true;
                    break;
                default:
                    System.out.println("Invalid level selection");
            }

        }

    }

    private String getInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;

        while (!valid) {
            selection = keyboard.nextLine();
            selection = selection.trim();

            if (selection.length() < 1) {
                System.out.println("\n*** Invalid value, try again ***");
                continue;
            }
            break;
        }
        return selection;
    }

    private double getValueInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        double selection = 10;

        while (!valid) {
            selection = keyboard.nextDouble();

            if (selection < 10) {
                System.out.println("\n*** Value less than 10, try again ***");
                continue;
            }
            break;
        }
        return selection;
    }

    private void doAction() {

        boolean valid = false;

        while (!valid) {
            System.out.println("Lenght of Tank (in meters)");
            radiusTank = this.getValueInput();

            System.out.println("Wide of Tank (in meters)");
            lenghtTank = this.getValueInput();

            System.out.println("Volume of Tank (in Giga Gallons)");
            volumeTank = Math.PI * Math.pow(radiusTank, 2) * lenghtTank;
            System.out.println(volumeTank);

            switch (planetLevel) {
                case "1":
                    if (volumeTank < 100) {
                        System.out.println("You need 100 gallons at least");
                    } else {
                        valid = true;
                        System.out.println("GOOD TRAVEL!!!");
                    }
                    break;
                case "2":
                    if (volumeTank < 500) {
                        System.out.println("You need 500 gallons at least");
                    } else {
                        valid = true;
                        System.out.println("GOOD TRAVEL!!!");
                    }
                    break;
                case "3":
                    if (volumeTank < 1000) {
                        System.out.println("You need 1000 gallons at least");
                    } else {
                        valid = true;
                        System.out.println("GOOD TRAVEL!!!");
                    }
                    break;
                case "4":
                    if (volumeTank < 2000) {
                        System.out.println("You need 2000 gallons at least");
                    } else {
                        valid = true;
                        System.out.println("GOOD TRAVEL!!!");
                    }
                    break;
                default:
                    valid = true;
                    System.out.println("GOOD TRAVEL!!!");
            }
        }
    }

}