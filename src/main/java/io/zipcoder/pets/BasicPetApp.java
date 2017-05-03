package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicPetApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> petList = new ArrayList<Pet>();

        System.out.println("How many pets you got?");
        int numPets = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numPets; i++) {
            Pet pet = new Pet();
            System.out.println("What kind of pet is pet number " + (i+1) + "?");
            pet.type = scanner.nextLine();
            System.out.println("What's your pet's name?");
            pet.name = scanner.nextLine();
            petList.add(pet);
        }

        for(Pet p : petList) {
            System.out.println(p.petToString());
        }

    }
}

class Pet {
    String type;
    String name;

    String petToString() {
        return name + " is a " + type;
    }
}