/**
 * Created by danzygmund-felt on 5/1/17.
 *
 * Create a 'Human' class that has fields for: name, age, gender, occupation, and address.
 * Also create methods for retrieving and outputting this data to screen.Then create a
 * SuperHuman class that subclasses the first with fields for good or bad, hero name, super
 * ability. As before, create methods for retrieving field data and printing to screen.
 */
public class SuperHuman extends Human {
    private String goodOrBad;
    private String heroName;
    private String superAbility;

    public String getGoodOrBad() {
        return goodOrBad;
    }

    public void setGoodOrBad(String goodOrBad) {
        this.goodOrBad = goodOrBad;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    public String toString() {
        return super.toString() + "Goodness level: " + this.goodOrBad + "\n"
                + "Hero Name: " + this.heroName + "\n"
                + "Super ability: " + this.superAbility + "\n";

    }
}
