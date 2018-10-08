import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //designate intelligence
        float Intelligence1 = 10;
        float Intelligence2 = 21;

        //designate static damage
        float staticDamageMod1 = 11;
        float staticDamageMod2 = 5;

        //create Random
        Random rand =  new Random();

        //designate random damage mod
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
        float a = Intelligence1 * staticDamageMod1 * randomDamageMod1;
        float b = Intelligence1 * staticDamageMod1 * randomDamageMod2;
        float c = Intelligence1 * staticDamageMod1 * randomDamageMod3;
        float d = Intelligence1 * staticDamageMod1 * randomDamageMod4;
        float e = Intelligence1 * staticDamageMod1 * randomDamageMod5;
        float f = Intelligence1 * staticDamageMod1 * randomDamageMod6;
        float g = Intelligence1 * staticDamageMod1 * randomDamageMod7;
        float h = Intelligence1 * staticDamageMod1 * randomDamageMod8;
        float i = Intelligence1 * staticDamageMod1 * randomDamageMod9;
        float j = Intelligence1 * staticDamageMod1 * randomDamageMod10;

//        float a = Intelligence2 * staticDamageMod2 * randomDamageMod1;
//        float b = Intelligence2 * staticDamageMod2 * randomDamageMod2;
//        float c = Intelligence2 * staticDamageMod2 * randomDamageMod3;
//        float d = Intelligence2 * staticDamageMod2 * randomDamageMod4;
//        float e = Intelligence2 * staticDamageMod2 * randomDamageMod5;
//        float f = Intelligence2 * staticDamageMod2 * randomDamageMod6;
//        float g = Intelligence2 * staticDamageMod2 * randomDamageMod7;
//        float h = Intelligence2 * staticDamageMod2 * randomDamageMod8;
//        float i = Intelligence2 * staticDamageMod2 * randomDamageMod9;
//        float j = Intelligence2 * staticDamageMod2 * randomDamageMod10;

        //more math(total damage)
        float totalDamage = a + b + c + d + e + f + g + h + i + j;

        System.out.println("total damage: " + totalDamage);



    }
}
