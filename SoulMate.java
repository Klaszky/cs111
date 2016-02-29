//SoulMate.java

public class SoulMate{

        public static void main(String[] args){

                int userFavNum;

                String genderPref, match;

                System.out.print("Enter your favorite number: ");
                userFavNum = IO.readInt();

                System.out.println();

                System.out.print("Enter F to be matched with a Female or ");
                System.out.print("enter M to be matched with a Male: ");
                genderPref = IO.readString();

                while (genderPref.length() != 1 || (!( genderPref.equalsIgnoreCase("M") || genderPref.equalsIgnoreCase("F") ) ) ){

                        System.out.println();
                        System.out.println("Sorry, I didn't understand that input.");
                        System.out.print("Try again: ");
                        genderPref = IO.readString();
                } 

                System.out.println();

                if(genderPref.equalsIgnoreCase("F")){
                        if(userFavNum > 8){
                                match = "Alice";
                        }else if(userFavNum <= 8 && userFavNum > 0){
                                match = "Samantha";
                        }else if(userFavNum < 0){ 
                                match = "Cathy";
                        }else{
                                match = "Forever alone";
                        }
                }else{
                        if(userFavNum % 2 == 0){
                                match = "Bob";
                        }else if(userFavNum % 3 == 0){
                                match = "Sam";
                        }else{
                                match = "Richard";
                        }
                }

                System.out.println("Your match is: " + match +"!");
        }
}
