public class Dog extends Animal {
   private String name;
   private String barkNoise = "Woof";
   private double weight;

   public Dog(String var1, String var2, double var3, String var5) {
      super(var2, var5);
      this.name = var1;
      this.weight = var3;
   }

   public Dog(String var1, String var2, String var3, double var4, String var6) {
      super(var2, var6);
      this.name = var1;
      this.barkNoise = var3;
      this.weight = var4;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public String getBarkNoise() {
      return this.barkNoise;
   }

   public void setBarkNoise(String var1) {
      this.barkNoise = var1;
   }

   public double getWeight() {
      return this.weight;
   }

   public void setWeight(double var1) {
      this.weight = var1;
   }

   public void bark() {
      System.out.println(this.barkNoise);
   }

   public void bark(String var1) {
      System.out.println(var1);
   }
}
