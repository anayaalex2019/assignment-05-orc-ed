import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //designate intelligence
        //float Intelligence = 10;
        float Intelligence = 21;

        //designate static damage
        //float staticDamageMod = 11;
        float staticDamageMod = 5;

        //designate random damage mod
        Random rand =  new Random();
        float randomDamageMod1 = rand.nextFloat() + (float) 0.5;
        float randomDamageMod2 = rand.nextFloat() + (float) 0.5;
        float randomDamageMod3 = rand.nextFloat() + (float) 0.5;
        float randomDamageMod4 = rand.nextFloat() + (float) 0.5;
        float randomDamageMod5 = rand.nextFloat() + (float) 0.5;
        float randomDamageMod6 = rand.nextFloat() + (float) 0.5;
        float randomDamageMod7 = rand.nextFloat() + (float) 0.5;
        float randomDamageMod8 = rand.nextFloat() + (float) 0.5;
        float randomDamageMod9 = rand.nextFloat() + (float) 0.5;
        float randomDamageMod10 = rand.nextFloat() + (float) 0.5;

        //math(damage per turn)
        float a = Intelligence * staticDamageMod * randomDamageMod1;
        float b = Intelligence * staticDamageMod * randomDamageMod2;
        float c = Intelligence * staticDamageMod * randomDamageMod3;
        float d = Intelligence * staticDamageMod * randomDamageMod4;
        float e = Intelligence * staticDamageMod * randomDamageMod5;
        float f = Intelligence * staticDamageMod * randomDamageMod6;
        float g = Intelligence * staticDamageMod * randomDamageMod7;
        float h = Intelligence * staticDamageMod * randomDamageMod8;
        float i = Intelligence * staticDamageMod * randomDamageMod9;
        float j = Intelligence * staticDamageMod * randomDamageMod10;

        //more math(total damage)
        float totalDamage = a + b + c + d + e + f + g + h + i + j;

        System.out.println("total damage: " + totalDamage);



    }
}
