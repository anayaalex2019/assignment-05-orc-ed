import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //designate intelligence
        float Intelligence = 10;
        //float Intelligence = 21;

        //designate static damage
        float staticDamageMod = 12;
        //float staticDamageMod = 5;


        //designate random damage mod
        Random rand =  new Random();
        float randomDamageMod = rand.nextFloat() + (float) 0.5;

        //math(damage per turn)
        float a = Intelligence * staticDamageMod * randomDamageMod;
        float b = Intelligence * staticDamageMod * randomDamageMod;
        float c = Intelligence * staticDamageMod * randomDamageMod;
        float d = Intelligence * staticDamageMod * randomDamageMod;
        float e = Intelligence * staticDamageMod * randomDamageMod;
        float f = Intelligence * staticDamageMod * randomDamageMod;
        float g = Intelligence * staticDamageMod * randomDamageMod;
        float h = Intelligence * staticDamageMod * randomDamageMod;
        float i = Intelligence * staticDamageMod * randomDamageMod;
        float j = Intelligence * staticDamageMod * randomDamageMod;

        //more math(total damage)
        float totalDamage = a + b + c + d + e + f + g + h + i + j;

        System.out.println("Total damage: " + totalDamage);


    }
}
