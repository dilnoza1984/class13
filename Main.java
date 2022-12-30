class Main {
  
  public static void main(String[] args) {
    printAgeAppropriateMassege(24);
    

       // printAgeAppropriateMessage(17);
  }

  //Create your method here called printAgeAppropriateMessage() that takes an age and prints the corresponding message

  public static void printAgeAppropriateMassege(int age){

  if (age < 16)
    System.out.println("You cannot drive");
    if (age < 18)
      System.out.println("You cannot vote");
    if(age <= 25)
     System.out.println("You cannot rent a car");
    if (age>=25)
       System.out.println("You can do anything thats iegal");
    
  }
  
}