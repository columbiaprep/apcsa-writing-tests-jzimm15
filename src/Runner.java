import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    @Test
    public void testBodyArmor() {
        BodyArmor ba1 = new BodyArmor("Iron");
        assertEquals(1, ba1.getStrMod());
        assertEquals(0, ba1.getDexMod());

        BodyArmor ba2 = new BodyArmor("Diamond", 150, 2);
        assertEquals(0, ba2.getIntMod());
        assertEquals(0, ba2.getWisMod());
    }

    @Test
    public void testBoots() {
        Boots b = new Boots(true, "Leather", false);
        b.setRevisedCharisma(16);
        assertEquals(2, b.getChaMod());
        b.setRevisedDexterity(14);
        assertEquals(2, b.getDexMod());
    }

    @Test
    public void testGauntlets() {
        Gauntlets g = new Gauntlets(1);
        assertEquals(1, g.getModifier("constitution"));
        assertEquals(0, g.getModifier("charisma"));
    }

    @Test
    public void testGloves() {
        Gloves gl = new Gloves("Common", "The Force", true, 20, 500, 10);
        assertEquals("Common", gl.getRarity());
        assertEquals("The Force", gl.getSpecialAbility());
    }

    @Test
    public void testHelemt() {
        Helmet h = new Helmet("Gold");
        assertEquals(1.5, h.getWeight(), .1);
        assertEquals("Gold", h.getRarity());
    }

    @Test
    public void testMeleWeapon() {
        MeleeWeapon m = new MeleeWeapon("Axe", 10, 15, 30.5, 2.5, 7);
        assertEquals("Axe", m.getType());
        assertEquals(10, m.getStrength());
    }

    @Test
    public void testRole() {
        Role r = new Role("Rogue");
        assertEquals(200, r.getChaMod());
    }

    @Test
    public void testShield() {
        Shield s = new Shield("steel");
        assertEquals(2, s.getStrMod());
        assertEquals(0, s.getIntMod());
    }

    @Test
    public void testSpecies() {
        Species e = new Species("Elf");
        assertEquals(1, e.getDexMod());
        assertEquals(2, e.getIntMod());

        Species d = new Species("Dwarf");
        assertEquals(1, d.getDexMod());
        assertEquals(2, d.getStrMod());
    }
}
