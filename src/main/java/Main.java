/**
 * Created by danzygmund-felt on 5/1/17.
 */
public class Main {

    public static void main(String[] args) {

        Human clarkKent = new Human();
        clarkKent.setName("Clark Kent");
        clarkKent.setAge(44);
        clarkKent.setGender("Male");
        clarkKent.setOccupation("Newspaper Reporter");
        clarkKent.setAddress("The Daily Planet");

        SuperHuman superMan = new SuperHuman();
        superMan.setName("Kal-El");
        superMan.setAge(100);
        superMan.setGender("An alien one");
        superMan.setOccupation("Saving the world from General Zod");
        superMan.setAddress("The Fortress of Solitude");
        superMan.setGoodOrBad("Boringly good");
        superMan.setHeroName("Superman");
        superMan.setSuperAbility("Flight, super strength ice vision, blows air really hard...\nI mean, you name it he does it.");

        System.out.println(clarkKent.toString() + "\n" + superMan.toString());

        SuperHuman theIncredibleHulk = new SuperHuman();
        theIncredibleHulk.setName("Bruce Banner");
        theIncredibleHulk.setAge(35);
        theIncredibleHulk.setGender("Male");
        theIncredibleHulk.setOccupation("Careless physicist");
        theIncredibleHulk.setAddress("He wakes up in a new place every morning");
        theIncredibleHulk.setGoodOrBad("Depends if you're on his good side");
        theIncredibleHulk.setHeroName("The Incredible Hulk");
        theIncredibleHulk.setSuperAbility("Being really strong and green");

        System.out.println(theIncredibleHulk.toString());

        theIncredibleHulk.setName("HULK SMASH");
        theIncredibleHulk.setAge(35);
        theIncredibleHulk.setGender("HULK SMASH");
        theIncredibleHulk.setOccupation("HULK SMASH");
        theIncredibleHulk.setAddress("HULK SMASH");
        theIncredibleHulk.setGoodOrBad("HULK SMASH");
        theIncredibleHulk.setHeroName("HULK SMASH");
        theIncredibleHulk.setSuperAbility("HULK SMASH");

        System.out.println(theIncredibleHulk.toString());

    }
}


