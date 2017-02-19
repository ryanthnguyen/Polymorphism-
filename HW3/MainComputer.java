//Ryan Nguyen
//Main Class to test two subclasses
import java.util.*;
public class MainComputer
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String kind = "";
        int RAM = 0;
        int hhd = 0;
        int videoCard = 0;
        double screenSize = 0.0;
        String computerProcessor = "";
        String laptopProcessor = "";
        Computer[] computers = new Computer[5];
        for (int i = 0;i < computers.length; i++)
        {
            int type = 0;
            System.out.println("1 for desktop and 2 for laptop");
            type = input.nextInt();
            if (type == 1)
            {
                kind = "Desktop";
                System.out.println("How much RAM would you like? ");
                RAM = input.nextInt();
                input.nextLine();
                System.out.println("What kind of processor would you like? ");
                computerProcessor = input.nextLine();
                System.out.println("how much memory would you like for your hard drive? ");
                hhd = input.nextInt();
                System.out.println("How much memory do you want your video card to have? ");
                videoCard = input.nextInt();
            }
            if (type == 2)
            {
               kind = "Laptop";
               System.out.println("How much RAM would you like? ");
               RAM = input.nextInt();
               input.nextLine();
               System.out.println("What kind of processor would you like? ");
               laptopProcessor = input.nextLine();
               System.out.println("How much memory would you like for your hard drive? ");
               hhd = input.nextInt();
               System.out.println("what screen size would you like to have?" );
               screenSize = input.nextDouble();
            }
            switch (type)
            {
               case 1: 
                        computers[i] = new PC(kind, computerProcessor, RAM, hhd, videoCard);
                        break;
               case 2:
                        computers[i] = new Laptop(kind, laptopProcessor, RAM, hhd, screenSize);
               
            }
    }
    for (int i = 0; i < computers.length;i++)
    {
        sorting(computers);
        System.out.println(computers[i]);
    } 
    System.out.println();
}
public static void sorting(Comparable[] computers)
{
    for (int i = 0; i < 2;i++)
    {
        for (int j = 0; j < 2 - 1;j++)
        {
            if (computers[i].compareTo(computers[i+1]) > 0)
            {
                Comparable temp = computers[i];
                computers[i] = computers[i+1];
                computers[i+1] = temp;
            }
        }
    }
    
}
}