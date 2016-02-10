//Party.java
public class Party{

 public static void main(String[] args){

  System.out.println("java Party\n");

  double peopleAtParty, numSlicesPerPerson, numSodasPerPerson;
  double costOfPizza, numSlicesPerPizza, costOfSoda, numSodaPerCase;

  int pizzaToBuy, sodaToBuy;

  double totalCost;

  System.out.print("Enter number of people attening the party: ");
  peopleAtParty = IO.readDouble();
  System.out.print("\nHow many slices of pizza will each person eat: ");
  numSlicesPerPerson = IO.readDouble();
  System.out.print("\nHow many cans of soda will each person drink: ");
  numSodasPerPerson = IO.readDouble();
  System.out.print("\nHow much will each pizza pie cost: ");
  costOfPizza = IO.readDouble();
  System.out.print("\nHow many slices does each pie contain: ");
  numSlicesPerPizza = IO.readDouble();
  System.out.print("\nHow much does a case of soda cost: ");
  costOfSoda = IO.readDouble();
  System.out.print("\nHow many cans of soda are in each case: ");
  numSodaPerCase = IO.readDouble();

  pizzaToBuy = (int)((peopleAtParty * numSlicesPerPerson) / numSlicesPerPizza);

  if (pizzaToBuy < ((peopleAtParty * numSlicesPerPerson) / numSlicesPerPizza)){
   pizzaToBuy += 1;
  }

  sodaToBuy = (int)((peopleAtParty * numSodasPerPerson) / numSodaPerCase);

  if (sodaToBuy < ((peopleAtParty * numSodasPerPerson) / numSodaPerCase)){
   sodaToBuy += 1;
  }

  totalCost = (pizzaToBuy * costOfPizza) + (sodaToBuy * costOfSoda);


  // System.out.println(pizzaToBuy);
  // System.out.println(pizzaToBuy * costOfPizza);

  // System.out.println(sodaToBuy);
  // System.out.println(sodaToBuy * costOfSoda);

  // System.out.println(totalCost);
  // System.out.println(0.62 + 0.97);

  System.out.println("");

  IO.outputDoubleAnswer(totalCost);

 }
}