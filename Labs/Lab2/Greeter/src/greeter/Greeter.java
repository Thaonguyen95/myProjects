/**
   A class for producing simple greetings.
*/
package greeter;

public class Greeter
{
   /**
      Constructs a Greeter object that can greet a person or 
      entity.
      @param aName the name of the person or entity who should
      be addressed in the greetings.
   */
   public Greeter(String aName)
   {
      name = aName;
   }

   /**
      Greet with a "Hello" message.
      @return a message containing "Hello" and the name of
      the greeted person or entity.
   */
   public String sayHello()
   {
      return "Hello, " + name + "!";
   }

   private String name;
   
   /**
      Changes the name of the Greeter object.
      @param newName the new name to change to.
   */
   public void setName(String newName)
   {
       this.name = newName;
   }
   
   /**
      Swaps the names of this Greeter object and another.
      @param other the other Greeter object.
   */
   public void swapNames(Greeter other)
   {
       String name1 = this.name;
       this.name = other.name;
       other.name = name1;
   }
   
   public static void main(String[] args)
   {
       Greeter G = new Greeter("Juleen");
       Greeter H = G;
       H.setName("Thao");
       System.out.println(G.sayHello());
       
       Greeter A = new Greeter("Hello");
       Greeter B = new Greeter("Goodbye");
       System.out.println("Greeter A's name is: "+A.name);
       System.out.println("Greeter B's name is: "+B.name);
       A.swapNames(B);
       System.out.println("Greeter A's name is: "+A.name);
       System.out.println("Greeter B's name is: "+B.name);    
   }
}