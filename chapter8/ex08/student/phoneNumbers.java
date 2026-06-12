import java.util.Scanner;

public class phoneNumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int MAX_ENTRIES = 30;
        String[] names = new String[MAX_ENTRIES];
        String[] phoneNumbers = new String[MAX_ENTRIES];

        names[0] = "Brielle";
        phoneNumbers[0] = "(808) 444 6666";

        names[1] = "June";
        phoneNumbers[1] = "(868) 999 7878";

          names[2] = "Osean";
        phoneNumbers[2] = "5619786565";

          names[3] = "Kandel";
        phoneNumbers[3] = "5616963345";

          names[4] = "Eldine";
        phoneNumbers[4] = "5612661244";

          names[5] = "Marucha";
        phoneNumbers[5] = "4745663636";

          names[6] = "Berryl";
        phoneNumbers[6] = "7894561230";

          names[7] = "Jean";
        phoneNumbers[7] = "1234567890";

           names[8] = "Dania";
        phoneNumbers[8] = "4567891230";

         names[9] = "Rahj";
        phoneNumbers[9] = "1654513566";

        int count = 10;
        boolean keepGoing = true;
        boolean firstPrompt = true;
        while (keepGoing && count < MAX_ENTRIES) {
            if (firstPrompt) {
                System.out.print(
                    "Enter name to look up.Type 'quit' to quit. >> " );
                firstPrompt = false;
               } else{
                System.out.print( "Enter new name to look up. Type 'quit' to quit. >> ");
               }
               String searchName = input.nextLine();
               
               if(searchName.equalsIgnoreCase("quit")) {
                keepGoing = false;
               } else {
                int foundIndex = -1;
                
                for(int i = 0; i < count; i++) {
                    if (names[i].equalsIgnoreCase(searchName)) {
                        foundIndex = i;
                        i = count;
                    }
                }
                if (foundIndex = -1) {
                    System.out.println(searchName + 
                        "'s Phone number is" + phoneNumbers[foundIndex]
                    );
                } else {
                    System.out.println(searchName + " not found in current list");
                    
                    System.out.print(" Enter Phone number for " + searchName + ">> ");
                    String newNumber = input.nextLine();

                    names[count] = searchName;
                    phoneNumbers[count] = newNumber;
                    count++;
                }
               }
        }
        if (count >= MAX_ENTRIES) {
            System.out.println( "Directory is full. No additional entried may be added.");
        }
        input.close();
        
    }
        
}
