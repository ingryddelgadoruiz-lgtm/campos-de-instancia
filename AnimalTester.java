public class AnimalTester {
   public AnimalTester() {
   }

   public static void main(String[] var0) {
      Dog var1 = new Dog("Bailey", "Boerboel", 80.2, "brown");
      Dog var2 = new Dog("Bailey", "Boerboel", "arf-arf", 80.2, "brown");
      Fish var3 = new Fish("Goldfish", "cold", "red");
      System.out.println("Dog name: " + var1.getName());
      System.out.println("Dog breed: " + var1.getBreed());
      System.out.print("Bark noise: ");
      var1.bark();
      System.out.println("Dog weight: " + var1.getWeight());
      System.out.println("Dog colour: " + var1.getColour());
      System.out.println();
      System.out.println("Dog name: " + var2.getName());
      System.out.println("Dog breed: " + var2.getBreed());
      System.out.print("Bark noise: ");
      var2.bark();
      System.out.println("Dog weight: " + var2.getWeight());
      System.out.println("Dog colour: " + var2.getColour());
      System.out.println();
      System.out.println("Fish breed: " + var3.getBreed());
      System.out.println("Water type: " + var3.getWaterType());
      System.out.println("Fish colour: " + var3.getColour());
   }
}
