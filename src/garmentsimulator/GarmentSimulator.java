/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garmentsimulator;

/**
 *
 * @author Saira
 */
public class GarmentSimulator {
    public static void main(String[] args) {
        // Create a Professional garment factory
        GarmentFactory professionalFactory = new ProfessionalGarmentFactory();
        displayGarments("Professional", professionalFactory);

        // Create a Casual garment factory
        GarmentFactory casualFactory = new CasualGarmentFactory();
        displayGarments("Casual", casualFactory);

        // Create a Party garment factory
        GarmentFactory partyFactory = new PartyGarmentFactory();
        displayGarments("Party", partyFactory);
    }

    private static void displayGarments(String category, GarmentFactory factory) {
        // Create individual garments
        Top top = factory.createTop();
        Pants pants = factory.createPants();
        Shoes shoes = factory.createShoes();

        // Output the created garments
        System.out.println(category + " Garments:");
        System.out.println("Top: " + top.getDescription());
        System.out.println("Pants: " + pants.getDescription());
        System.out.println("Shoes: " + shoes.getDescription());
        System.out.println();
    }
}
