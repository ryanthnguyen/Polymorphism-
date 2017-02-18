//Ryan Nguyen
//PC Class
public class PC extends Computer
{
   private double videoRam = 0;
   private double PCCost = 0;
   public PC(String s, String processor, int ram, int hardDrive, int vRam)
   {
    super(s,processor,ram,hardDrive);
    videoRam = vRam;
   }
   private void setPCCost()
   {
         PCCost = 150 + 6.50 * this.RAM + 0.15 * this.hardDrive + 0.48 * videoRam;
   }
   public String toString()
   {
       return ("Desktop:" + "\n" + "-------" + "\n" + "CPU: " + this.processor + "\n" + "RAM: " + this.RAM + "\n" + "HDD: " + this. hardDrive + "\n" + "VRAM: " + videoRam + "\n" + "Cost: " + this.getCost());
   }
   public double getCost()
   {
      return PCCost;
   }
}