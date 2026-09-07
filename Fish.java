public class Fish extends Animal {
   private String waterType;

   public Fish(String var1, String var2, String var3) {
      super(var1, var3);
      this.waterType = var2;
   }

   public String getWaterType() {
      return this.waterType;
   }

   public void setWaterType(String var1) {
      this.waterType = var1;
   }
}
