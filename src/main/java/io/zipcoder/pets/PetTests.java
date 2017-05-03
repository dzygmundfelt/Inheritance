package io.zipcoder.pets;
import org.junit.*;

public class PetTests {

    @Test
    public void dogSpeakTest() {
        //Given
        Pet dog = new Dog();
        String expected = "Doggie says woof woof";
        //When
        String actual = "Doggie says " + dog.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catSpeakTest() {
        //Given
        Pet cat = new Cat();
        String expected = "Cat says meow";
        //When
        String actual = "Cat says " + cat.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void roosterSpeakTest() {
        //Given
        Pet rooster = new Rooster();
        String expected = "Rooster says Shut up, Rooster.";
        //When
        String actual = "Rooster says " + rooster.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void goldishSpeakTest() {
        //Given
        Pet goldfish = new Goldfish();
        String expected = "Goldfish says glub glub";
        //When
        String actual = "Goldfish says " + goldfish.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
