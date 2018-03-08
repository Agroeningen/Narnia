package nl.narnia.holder;

/**
 * Hello world!
 *
 */
public class App {
    //private int power;
    //private int exp;

    public static void main(String[] args) {
        Kast closet;
        Material material;
        int matStrength;
        boolean succes = false;
        int attempt = 1;

      do {
            closet = new Kast(Material.getRandomMaterial());
            material = closet.getMaterial();
            matStrength = Material.getMaterialStrength(material);
//
           System.out.println("Material is " + material + " sterkte is "+ matStrength );
//            succes = canIEnterTheCloset(Randomizer.didIBreakTheDoor(matStrength));
//
//            if(succes){
//                if(Randomizer.didIEnterNarnia()){
//                    System.out.println("I have entered Narnia !!! Sweet mother of God spank my ass and call me Jesus");
//                }else{
//                    System.out.println("Dammit..... no Narnia....... Maybe i can enter Narnia in the next closet! ");
//                    succes = false;
//                }
  //        }
//
//
//
          System.out.println("this was attempt "+ attempt);
//
//            System.out.println("-------------------------------------------------------");
           attempt++;
      } while (!succes);
//
  }

//    private static boolean canIEnterTheCloset(boolean b) {
//        if(b){
//            System.out.println("I broke the door...... cant enter beceause reasons");
//            return false;
//        }
//        System.out.println("The door didnt break! I can enter the closet now ( why did i kicked the door -.- )");
//        return true;
    }
//}