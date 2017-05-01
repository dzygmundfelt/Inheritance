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

    }
}


