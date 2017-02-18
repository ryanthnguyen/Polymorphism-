//Ryan Nguyen
//Computer abstract class
public abstract class Computer
{
   private String kindOfComputer = "";
   protected String processor = "";
   protected double RAM = 0;
   protected double hardDrive = 0;
   protected double videoRam = 0;
   protected double screenSize = 0;
   protected abstract double getCost();
   public Computer(String kind, String typeProcessor, double ram, double hhd)
   {
       processor = typeProcessor;
       RAM = ram;
       hardDrive = hhd;
   }
   }