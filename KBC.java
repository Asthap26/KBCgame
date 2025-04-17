import java.util.*;
class KBC
{
    public static void main(String[] args)
	{
        String RESET = "\u001B[0m";
String GREEN = "\u001B[32m";
 String RED = "\033[31m";
 String DARK_BLUE = "\033[38;5;18m";
          Scanner scanner=new Scanner(System.in);
        // Create a new Game object and start the game
        Game obj = new Game();
        System.out.println("Enter Your Details  ");
        System.out.println("Enter Your Age : ");
        int age =scanner.nextInt();
        System.out.println("Enter Your Yearly Income : ");
        double income = scanner.nextDouble();
        //if person earn more than 4 lakh and more than 8 then they can play game.
        if(income<400000 && age>8)
        {
        System.out.println(GREEN+"Congratulations! You have been selected to play the game."+RESET);
        obj.rule(); // Display the game rules
                String[] questions = {
                    "1. What is the currency of the United Kingdom?",                   
                    "2. Who was the first President of the United States?",              
                    "3. Which company created the iPhone?",                              
                    "4. What is the capital of Australia?",                              
                    "5. What is the main ingredient in guacamole?",                      
                    "6. What is the largest planet in our solar system?",                
                    "7. Who is credited with inventing the first airplane?",             
                    "8. Who was the first woman to win a Nobel Prize?",                  
                    "9. What is the smallest country in the world?",                     
                    "10. Which continent is known as the 'Dark Continent'?",             
                    "11. What is the capital of Canada?",                                
                    "12. Who discovered gravity?",                                       
                    "13. In which year did the Berlin Wall fall?",                       
                    "14. What is the chemical symbol for gold?",                         
                    "15. What is the longest river in the world?",                       
                    "16. Who wrote the play 'Hamlet'?"                                    
                };
                //question array.
                String[] optionA = {
                    "Pound Sterling", "George Washington", "Microsoft", "Sydney", "Avocado", 
                    "Jupiter", "Orville Wright", "Marie Curie", "Vatican City", "Africa", 
                    "Ottawa", "Isaac Newton", "1989", "Au", "Amazon","William Shakespeare"
                };
        
                String[] optionB = {
                    "Euro", "Abraham Lincoln", "Apple", "Melbourne", "Tomato", 
                    "Saturn", "Wilbur Wright", "Rosalind Franklin", "Monaco", "Asia", 
                    "Toronto", "Albert Einstein", "1991", "Ag", "Nile", "Anton Chekhov"
                };
        
                String[] optionC = {
                    "Yen", "Thomas Jefferson", "Google", "Canberra", "Lemon", 
                    "Earth", "Leonardo da Vinci", "Dorothy Crowfoot Hodgkin", "Liechtenstein", "Europe", 
                    "Quebec", "Galileo Galilei", "1990", "Pb", "Yangtze", "Arthur Miller"
                };
        
                String[] optionD = {
                    "Dollar", "John Adams", "Facebook", "Adelaide", "Onion", 
                    "Neptune", "Nikola Tesla", "Ada Lovelace", "San Marino", "Antarctica", 
                    "Vancouver", "Stephen Hawking", "1995", "Ag", "Mississippi", "William Blake"
                };
        //options array.
                String[] correctAns = {
                    "A", "A", "B", "C", "A", 
                    "A", "A", "A", "A", "B", 
                    "A", "B", "A", "A", "A", "A"
                };
                //correct ans.
        String[] userAns = new String[17]; // Array to store user answers
        int[] PriceValue={1000,2000,3000,5000,10000,20000,40000,80000,160000,320000,640000,1250000,2500000,7500000,10000000,75000000,80000000,90000000};
        obj.askQuestions(questions, optionA, optionB, optionC, optionD, correctAns, userAns,PriceValue); 
        // Start asking questions
        obj.Lastt();
    }
    else if(income>400000&&age>8)
    {
     System.out.println(RED+"You have earned more than 4 lakh and are not eligible to participate in the game."+RESET);
    }
    else if(income<400000&&age<8)
    {
     System.out.println(RED+"You are under 8 years old and are not eligible to participate in the game."+RESET);
    }
    else
    {
     System.out.println(RED+"You have earned more than 4 lakh or are under 8 years old, so you are not eligible to participate in the game."+RESET);
    }
   
   System.out.println(DARK_BLUE+"╔═══════════════════════════════════════════════╗"+RESET);
   System.out.println(DARK_BLUE+"║ THANK YOU FOR JOINING KAUN BANEGA CROREPATI!  ║"+RESET);  
   System.out.println(DARK_BLUE+"╚═══════════════════════════════════════════════╝"+RESET);
}
}

class Game
{
    String RESET = "\u001B[0m";
String CYAN = "\u001B[36m";
String BLUE = "\033[38;5;153m";
String GREEN = "\u001B[32m";
 String RED = "\033[31m";
 String DARK_BLUE = "\033[38;5;18m";
    Scanner sc = new Scanner(System.in); // Scanner for input
    int price = 0; // Track the price won by the player
    static boolean gameStatus = true; // Flag to check if the game is still ongoing
    static boolean L50_50 = true, Lexpert = true, Lvote = true, Lswitch = true; // Lifeline flags
void Lastt()
{
    if(gameStatus)
    {
    GetPaymentDetails();
    }
}
    // Method to display the rules of the game
    void rule()
    {   
        System.out.println(DARK_BLUE+"╔═══════════════════════════════════════════════╗"+RESET);
        System.out.println(DARK_BLUE+"║  WELCOME TO KAUN BANEGA CROREPATI GAME!!!     ║"+RESET);  
        System.out.println(DARK_BLUE+"╚═══════════════════════════════════════════════╝"+RESET);
        System.out.println(BLUE+"----- **Game Rules and Guidelines** -----"+RESET); 
                
                System.out.println(CYAN + BLUE+ "1. You will be presented with a total of sixteen questions." + RESET);
                System.out.println(CYAN + BLUE + "2. You will have access to four lifelines during the game: " + RESET);
                System.out.println("50/50: Two incorrect options will be eliminated." );
                System.out.println("Switch the Question: Swap the current question for a new one.");
                System.out.println("Audience Poll: Receive the opinions of the audience on the correct answer.");
                System.out.println( "Call an Expert: Seek assistance from a subject matter expert." );
                System.out.println("Each lifeline can only be used once throughout the game.");
                System.out.println(CYAN + BLUE + "3. Upon completion of the game, you will be offered a bonus question with three levels of difficulty:" + RESET);
                System.out.println("Easy" );
                System.out.println( "Medium" );
                System.out.println("Hard");
                System.out.println(BLUE + "Best of luck, and let's begin the game!" + RESET);
                System.out.println(DARK_BLUE+"===================================================="+RESET);

}
    void BonusQuestion()
    {
        int choice;
        String ans;
        System.out.println(BLUE+"==== Select a Level for the Bonus Question ===="+RESET); 
        System.out.println("1. Easy :~ [RS. 5000]");
        System.out.println("2. Medium :~ [RS. 15000]");
        System.out.println("3. Hard :~ [RS. 50000]");  
        //levels for bonus questions.
        int choice1;
        do 
        {
        choice1 = sc.nextInt();
        sc.nextLine(); // Consume any leftover new line character
        if(choice1!=1&&choice1!=2&&choice1!=3)
        {
        System.out.println(RED+"Invalid choice Enter Valid Number!"+RESET);
        }
    }
        while(choice1!=1&&choice1!=2&&choice1!=3);
    switch (choice1)
     {
            case 1:
            System.out.println("Who invented the light bulb?");
            System.out.println("A: Nikola Tesla");
            System.out.println("B: Thomas Edison");
            System.out.println("C: Alexander Graham Bell");
            System.out.println("D: Benjamin Franklin");
            ans = sc.nextLine(); // Read the answer
            if (ans.equalsIgnoreCase("b") || ans.equalsIgnoreCase("Thomas Edison"))
                {
                    price += 5000;//add money
                    System.out.println(GREEN+"CORRECT ANS"+RESET);
                    System.out.println(GREEN+"You won " + price + " rupees!"+RESET);
                }
                else
                {
                    gameStatus = false;//lost bonus.
                    System.out.println(RED+"Incorrect answer! You lost Bonus."+RESET);
                }
            break;
            case 2:
            System.out.println("What is the name of the first artificial satellite launched into space?");
            System.out.println("A. Apollo 11");
            System.out.println("B. Sputnik 1");
            System.out.println("C. Voyager 1");
            System.out.println("D. Hubble");
            ans = sc.nextLine(); // Read the answer
            if (ans.equalsIgnoreCase("b") || ans.equalsIgnoreCase("Sputnik 1"))
            {
                price += 15000;
                System.out.println(GREEN+"CORRECT ANS"+RESET);
                System.out.println(GREEN+"You won " + price + " rupees!"+RESET);
            }
            else
            {
                gameStatus = false;
                System.out.println(RED+"Incorrect answer! You lost Bonus."+RESET);
            }
            break;
            case 3:
            System.out.println("Who was the first woman to win a Nobel Prize?");
            System.out.println("A. Marie Curie");
            System.out.println("B. Rosalind Franklin");
            System.out.println("C. Dorothy Crowfoot Hodgkin");
            System.out.println("D. Ada Lovelace");
            ans=sc.nextLine();
            if (ans.equalsIgnoreCase("a") || ans.equalsIgnoreCase("Marie Curie"))
            {
                price += 50000;
                System.out.println(GREEN+"CORRECT ANS"+RESET);
                System.out.println(GREEN+"You won " + price + " rupees!"+RESET);
            }
            else
            {
                gameStatus = false;
                System.out.println(RED+"Incorrect answer! You lost Bonus."+RESET);
            }
            break;
    
        default: System.out.println(RED+"Invalid Choice"+RESET);
            break;
    }
    }
    // Method to ask questions and process the answers
    void askQuestions(String[] question, String[] optionA, String[] optionB, String[] optionC, String[] optionD, String[] correctAns, String[] userAns,int[] PriceValue)
    {
        for (int i = 0; i < question.length && gameStatus; i++)
        {
            // Displaying the current question and options
            System.out.println(question[i]);
            System.out.println("A. " + optionA[i]);
            System.out.println("B. " + optionB[i]);
            System.out.println("C. " + optionC[i]);
            System.out.println("D. " + optionD[i]);
            System.out.println(BLUE+"CHOOSE AMONG THIS"+RESET);
            System.out.println("1. Ans the question");
            System.out.println("2. Use Lifeline");
            System.out.println("3. Quit game");
            int choice;
            do 
        {
        choice = sc.nextInt();
        sc.nextLine(); // Consume any leftover new line character
        if(choice!=1&&choice!=2&&choice!=3)
        {
        System.out.println(RED+"Invalid choice Enter Valid Number!"+RESET);
        }
    }
        while(choice!=1&&choice!=2&&choice!=3);
            switch (choice)
            {
                case 1:
                    getAnswer(userAns, i, correctAns,PriceValue); // Get and check the answer
                    break;
                case 2:
                    useLifeline(question, optionA, optionB, optionC, optionD, correctAns, i, userAns,PriceValue); // Use lifeline
                    break;
                case 3:
                     if(lifelineCount==4)
                     {
                     gameStatus=false;
                     GetPaymentDetails();
                     }
                     else if(lifelineCount==0||lifelineCount==1||lifelineCount==2||lifelineCount==3||lifelineCount==4)
                     {
                        System.out.println(RED+"You still have a lifeline available. Would you like to use it?[true for yes] & [false for no]"+RESET);

                    boolean tempLifeLine=sc.nextBoolean();
                    if(tempLifeLine)
                    {
                        useLifeline(question, optionA, optionB, optionC, optionD, correctAns, i, userAns,PriceValue);
                    }
                    else
                    {
                        gameStatus=false;
                        GetPaymentDetails();   
                    }
                     }
                    break;
                default:
                    System.out.println(RED+"Invalid Choice"+RESET);
                    break;
            }
        }
    }
    void getAnswer(String[] userAns, int i, String[] correctAns,int[] PriceValue)
    {
        if (gameStatus)
        {
            System.out.println("Enter your answer (A/B/C/D): ");
            userAns[i] = sc.nextLine();
            if (userAns[i].equalsIgnoreCase(correctAns[i]))
            {
                price =PriceValue[i]; // Add prize money
                System.out.println(GREEN+"You won " + price + " rupees!"+RESET);
            }
            else
            {
                gameStatus = false; // End the game if answer is wrong
                System.out.println(GREEN+"You won " + price + " rupees!"+RESET);
                System.out.println(RED+"Incorrect answer! Game over."+RESET);
				GetPaymentDetails();
            }
        }
    }
    static int lifelineCount;
    // Method to use a lifeline
    void useLifeline(String[] question, String[] optionA, String[] optionB, String[] optionC, String[] optionD, String[] correctAns, int i, String[] userAns,int[] PriceValue)
    {
        int choice = 0;
        
        System.out.println(BLUE+"Choose a lifeline:"+RESET);
        //Display LifeLine
        if (Lswitch)
        {
            System.out.println("1. Switch Question");
            
        }
        if (L50_50)
        {
            System.out.println("2. 50/50");
        }
        if (Lexpert)
        {
            System.out.println("3. Call an Expert");
        }
        if (Lvote)
        {
            System.out.println("4. Audience Poll");
        }
        do 
        {
        choice = sc.nextInt();
        sc.nextLine(); // Consume any leftover new line character
        if(choice!=1&&choice!=2&&choice!=3&&choice!=4)
        {
        System.out.println(RED+"Invalid choice"+RESET);
        }
    }
        while(choice!=1&&choice!=2&&choice!=3&&choice!=4);
        switch (choice)
        {
            case 1:
                if (Lswitch)
                {
                    switchQuestion(PriceValue,i); // Switch question if allowed
                    lifelineCount++;//count of How many lifeLine is used.
                    Lswitch = false; // Disable the lifeline after use
                }
                else
                {
                    System.out.println("Switch Question :[ lifeline already used.]");
                }
                break;
            case 2:
                if (L50_50)
                {
                    fiftyFifty(question, optionA, optionB, optionC, optionD, correctAns, i, userAns,PriceValue); // Activate 50/50 lifeline
                    L50_50 = false;
                    lifelineCount++;
                    getAnswer(userAns, i, correctAns,PriceValue); // Get answer after 50/50
                }
                else
                {
                    System.out.println("50/50 :[ lifeline already used.]");
					 getAnswer(userAns, i, correctAns,PriceValue);
                }
                break;
            case 3:
                if (Lexpert)
                {
                    callExpert(correctAns, i); // Call an expert for help
                    Lexpert = false;
                    lifelineCount++;
                    getAnswer(userAns, i, correctAns,PriceValue); // Get answer after expert help
                }
                else
                {
                    System.out.println("Call an Expert :[ lifeline already used.]");
                }
                break;
            case 4:
                if (Lvote)
                {
                    audiencePoll(optionA, optionB, optionC, optionD, correctAns, i); // Show audience poll
                    Lvote = false;
                    lifelineCount++;
                    getAnswer(userAns, i, correctAns,PriceValue); // Get answer after audience poll
                }
                else
                {
                    System.out.println("Audience Poll :[ lifeline already used.]");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid lifeline.");
				
                break;
        }
    }

    // Method for the 50/50 lifeline (removes two incorrect options)
    void fiftyFifty(String[] question,String[] optionA, String[] optionB, String[] optionC, String[] optionD, String[] correctAns, int i,String[] userAns,int[] PriceValue)
    {
        System.out.println("50/50 lifeline activated!");
        if (correctAns[i].equals("A"))
        {
            System.out.println("A. " + optionA[i]);
            System.out.println("B. " + optionB[i]);
            //printing 2 lifeline.
        }
        else if (correctAns[i].equals("B"))
        {
            System.out.println("B. " + optionB[i]);
            System.out.println("C. " + optionC[i]);
        }
        else if (correctAns[i].equals("C"))
        {
            System.out.println("C. " + optionC[i]);
            System.out.println("D. " + optionD[i]);
        }
        else
        {
            System.out.println("A. " + optionA[i]);
            System.out.println("D. " + optionD[i]);
        }
        
    }

    // Method to call an expert for help
    void callExpert(String[] correctAns, int i)
    {
        System.out.println("Our expert says: The answer is " + correctAns[i]);
    }

    // Method to show the audience poll results
    void audiencePoll(String[] optionA, String[] optionB, String[] optionC, String[] optionD, String[] correctAns, int i)
    {
        System.out.println("Audience Poll:");
        if (correctAns[i].equals("A"))
        {
            System.out.println("A: 79%");
            System.out.println("B: 9%");
            System.out.println("C: 4%");
            System.out.println("D: 8%");
//printing vote
        }
        else if (correctAns[i].equals("B"))
        {
            System.out.println("A: 9%");
            System.out.println("B: 79%");
            System.out.println("C: 4%");
            System.out.println("D: 8%");
        }
        else if (correctAns[i].equals("C"))
        {
            System.out.println("A: 4%");
            System.out.println("B: 9%");
            System.out.println("C: 79%");
            System.out.println("D: 8%");
        }
        else
        {
            System.out.println("A: 8%");
            System.out.println("B: 9%");
            System.out.println("C: 4%");
            System.out.println("D: 79%");
        }
    }
    void GetPaymentDetails()
    {
        BonusQuestion();
        if(price!=0)
        {
         String Firstname="";
         String Middlename="";
         String Lastname="";
         String AccountNumber="";
        boolean forchange;
        boolean forchange2;
        //asking details 
        System.out.println("Enter Your First Name");
        Firstname=sc.nextLine();
        System.out.println("Enter Your Middle Name");
        Middlename=sc.nextLine();
        System.out.println("Enter Your Last Name");
        Lastname=sc.nextLine();
        System.out.println("Your Full Name :");
        System.out.println(""+Firstname+" "+Middlename+" "+Lastname);
        System.out.println("Enter Your Account Number");
        AccountNumber=sc.nextLine();
        while(AccountNumber.length()!=12)
        {
            System.out.println(RED+"Enter Your Account Number Again in 12 Digit Only"+RESET);
            AccountNumber=sc.nextLine();
        }
        System.out.println("ENTER MOBILE NUMBER");
		long Mobile_no = sc.nextLong();
		boolean b=true;
		String s1 = Mobile_no + "";
		 while (b)
         {
            s1 = Mobile_no + "";
            if (s1.length()!= 10&& (s1.startsWith("7") || s1.startsWith("8") || s1.startsWith("9"))) {
                System.out.println(RED+"PLEASE ENTER A 10-DIGIT MOBILE NUMBER"+RESET);
                Mobile_no = sc.nextLong();
			}
			else
			{
			b=false;
			}
		 }
        System.out.println(BLUE+"CHECK YOUR DETAILS ONCE"+RESET);
        System.out.println("Name : "+Firstname+" "+Middlename+" "+Lastname);
        System.out.println("Account Number : "+AccountNumber );
        System.out.println("Mobile no is : "+ Mobile_no);
        System.out.println("Price you won is : "+price);
        System.out.println("Do you want to change Anything?[true for yes] & [false for no]");
       //if person gave wrong details then they can change.
        forchange=sc.nextBoolean();
		if (forchange)
		{
		forchange2=false;
		}
		else 
		{
		forchange2=true;
		}
        while(!forchange2)
        {
            System.out.println("What would you like to change?");
            System.out.println("1. Name");
            System.out.println("2. Account Number");
            System.out.println("3. Mobile Number");
            
        int changemate=sc.nextInt();
		sc.nextLine();
        switch (changemate) 
        {
            case 1:
            System.out.println("Enter Your First Name");
            Firstname=sc.nextLine();
            System.out.println("Enter Your Middle Name");
            Middlename=sc.nextLine();
            System.out.println("Enter Your Last Name");
            Lastname=sc.nextLine();
            System.out.println("Your Full Name :");
            System.out.println(""+Firstname+" "+Middlename+" "+Lastname);
            break;
            case 2:
            System.out.println("Enter Your Account Number");
            AccountNumber=sc.nextLine();
            while(AccountNumber.length()!=12)
            {
            System.out.println(RED+"Enter Your Account Number Again in 12 Digit Only"+RESET);
            AccountNumber=sc.nextLine();
            }
            break;
            case 3:
            System.out.println("ENTER MOBILE NUMBER");
		Mobile_no = sc.nextLong();
		b=true;
		s1 = Mobile_no + "";
		 while (b)
         {
            s1 = Mobile_no + "";
            if (s1.length()!= 10) {
                System.out.println(RED+"PLEASE ENTER A 10-DIGIT MOBILE NUMBER"+RESET);
                Mobile_no = sc.nextLong();
			}
			else
			{
			b=false;
			}
		 }
            break;
            default:System.out.println(RED+"Invalid Choice"+RESET);
            break;
        }
        System.out.println(BLUE+"Please Review Your Details After the Changes"+RESET);
        System.out.println("Name: " + Firstname + " " + Middlename + " " + Lastname);
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Prize You Won: " + price);
        System.out.println("Mobile number : "+Mobile_no);
        System.out.println(BLUE+"Would you like to make any further changes?"+RESET);
        forchange=sc.nextBoolean();
		if (forchange)
		{
		forchange2=false;
		}
		else 
		{
		forchange2=true;
		}
        }
        System.out.println(GREEN+"We sent "+price+" in your Bank Account."+RESET);
        System.out.println(GREEN+"Congratulation"+RESET);
    }
    else
    {
        System.out.println(RED+"Unfortunately, no winnings this time. Better luck next time!");
    }
}
    // Method to switch to a new question
    void switchQuestion(int[] PriceValue,int i)
    {
        String ans;
        System.out.println(BLUE+"Enter Subject for your switched question"+RESET);
        System.out.println("1. Sports");
        System.out.println("2. History");
        System.out.println("3. Food");
        System.out.println("4. Space Science");
        System.out.println("5. Geography");
        System.out.println("6. Books and Authors");
        //provide options for switch question.
        int switchchoice;
        do 
        {
        switchchoice = sc.nextInt();
        sc.nextLine(); // Consume any leftover new line character
        if(switchchoice!=1&&switchchoice!=2&&switchchoice!=3&&switchchoice!=4&&switchchoice!=5&&switchchoice!=6)
        {
        System.out.println(RED+"Invalid choice"+RESET);
        }
    }
        while(switchchoice!=1&&switchchoice!=2&&switchchoice!=3&&switchchoice!=4&&switchchoice!=5&&switchchoice!=6);
        switch (switchchoice)
        {
            case 1:
                System.out.println("In which year did India win its first Olympic gold medal in field hockey?");
                System.out.println("A. 1928");
                System.out.println("B. 1932");
                System.out.println("C. 1936");
                System.out.println("D. 1948");
                ans = sc.nextLine(); // Read the answer
                if (ans.equalsIgnoreCase("a") || ans.equalsIgnoreCase("1928"))
                {
                    price = PriceValue[i]+price;
                    System.out.println(GREEN+"You won " + price + " rupees!"+RESET);
                }
                else
                {
                    gameStatus = false;
                    System.out.println(RED+"Incorrect answer! Game over."+RESET);
                    System.out.println(GREEN+"You won " + price + " rupees!"+RESET);
                    GetPaymentDetails();
                }
                break;

            case 2:
                System.out.println("Who was the last Mughal emperor of India?");
                System.out.println("A. Akbar");
                System.out.println("B. Shah Jahan");
                System.out.println("C. Aurangzeb");
                System.out.println("D. Bahadur Shah Zafar");
                ans = sc.nextLine();
                if (ans.equalsIgnoreCase("d") || ans.equalsIgnoreCase("Bahadur Shah Zafar"))
                {
                    price = PriceValue[i]+price;
                    System.out.println(GREEN+"You won " + price + " rupees!"+RESET);
                }
                else
                {
                    gameStatus = false;
                    System.out.println(RED+"Incorrect answer! Game over."+RESET);
                    System.out.println(GREEN+"You won " + price + " rupees!"+RESET);
                    GetPaymentDetails();
                }
                break;

            case 3:
                System.out.println("What is the main ingredient in the Indian dish 'Biryani'?");
                System.out.println("A. Pasta");
                System.out.println("B. Rice");
                System.out.println("C. Noodles");
                System.out.println("D. Potatoes");
                ans = sc.nextLine();
                if (ans.equalsIgnoreCase("B") || ans.equalsIgnoreCase("Rice"))
                {
                    price = PriceValue[i]+price;
                    System.out.println(GREEN+"You won " + price + " rupees!"+RESET);
                }
                else
                {
                    gameStatus = false;
                    System.out.println(RED+"Incorrect answer! Game over."+RESET);
                    System.out.println(GREEN+"You won " + price + " rupees!"+RESET);
                    GetPaymentDetails();
                }
                break;

            case 4:
                System.out.println("What is the name of the largest moon of Saturn?");
                System.out.println("A. Europa");
                System.out.println("B. Titan");
                System.out.println("C. Ganymede");
                System.out.println("D. Callisto");
                ans = sc.nextLine();
                if (ans.equalsIgnoreCase("B") || ans.equalsIgnoreCase("Titan"))
                {
                    price = PriceValue[i]+price;
                    System.out.println(GREEN+"You won " + price + " rupees!"+RESET);
                }
                else
                {
                    gameStatus = false;
                    System.out.println(RED+"Incorrect answer! Game over."+RESET);
                    System.out.println(GREEN+"You won " + price + " rupees!"+RESET);
                    GetPaymentDetails();
                }
                break;

            case 5:
                System.out.println("Which desert is located in the western part of India?");
                System.out.println("A. Thar Desert");
                System.out.println("B. Rann of Kutch");
                System.out.println("C. Deccan Plateau");
                System.out.println("D. Chota Nagpur Plateau");
                ans = sc.nextLine();
                if (ans.equalsIgnoreCase("A") || ans.equalsIgnoreCase("Thar Desert"))
                {
                    price = PriceValue[i]+price;
                    System.out.println(GREEN+"You won " + price + " rupees!"+RESET);
                }
                else
                {
                    gameStatus = false;
					 System.out.println(RED+"Incorrect answer! Game over."+RESET);
                    System.out.println(GREEN+"You won " + price + " rupees!"+RESET);
                    GetPaymentDetails();
                }
                break;
            case 6:
                System.out.println("Who is the author of 'Wings of Fire'?");
                System.out.println("A. Rabindranath Tagore");
                System.out.println("B. A.P.J. Abdul Kalam");
                System.out.println("C. Chetan Bhagat");
                System.out.println("D. Ruskin Bond");
                ans = sc.nextLine();
                if (ans.equalsIgnoreCase("B") || ans.equalsIgnoreCase("A.P.J. Abdul Kalam"))
                {
                    price = PriceValue[i]+price;
                    System.out.println(GREEN+"You won " + price + " rupees!"+RESET);
                }
                else
                {
                    gameStatus = false;
                    System.out.println(RED+"Incorrect answer! Game over."+RESET);
                    System.out.println(GREEN+"You won " + price + " rupees!"+RESET);
                    GetPaymentDetails();
                }
                break;
            default:
                System.out.println("====Invalid Choice====");
        }
    }
}