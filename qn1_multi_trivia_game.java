import java.util.Scanner;
class the_game {
	  class Questions{
			String qn_1 = "Who is the president of the united states of America?";
			String qn1_choices = "1. Oprah Winfrey" + System.lineSeparator() + "2. Joe Biden" + System.lineSeparator() +  "3. Paul Kagame"
			                      + System.lineSeparator() + "4. Barack Obama" + System.lineSeparator() + "5. Donald Trump"; 
			int answer_1 = 2;
			String qn_2 = "Who founded ALU";
			String qn2_choices = "1. Gaidi Faraj " + System.lineSeparator() + "2. Lilian Muriithi-Ollows" + System.lineSeparator() +  
		                         "3. Patrick Awuah" + System.lineSeparator() + "4.  Fred Swaniker " + System.lineSeparator() + "5. Paul Kagame"; 
			int answer_2 = 4;
			String qn_3 = "Which is the smallest country in africa?";
			String qn3_choices = "1. Sao Tome" + System.lineSeparator() + "2. Comoros" + System.lineSeparator() +  "3. Mauritius"
			                      + System.lineSeparator() + "4. Burundi" + System.lineSeparator() + "5. Seychelles"; 
			int answer_3 = 5;
			String qn_4 = "The expression (8^3)*(27^-3) is equal to which of the following?";
			String qn4_choices = "1) 1,536" + System.lineSeparator() + "2) 648" + System.lineSeparator() +  "3) 275"
			                      + System.lineSeparator() + "4) 2,234" + System.lineSeparator() + "5) 981"; 
			int answer_4 = 1;
			String qn_5 = "How many colors are there on the Rwandan flag?";
			String qn5_choices = "1) 4" + System.lineSeparator() + "2) 1" + System.lineSeparator() +  "3) 3"
			                      + System.lineSeparator() + "4) 5" + System.lineSeparator() + "5) 2"; 
			int answer_5 = 3;
	  }
	}
    public class qn1_multi_trivia_game{
    	public static void main(String[] args){
    		the_game myOuter = new the_game();
    		the_game.Questions myInner = myOuter.new Questions();
			Scanner user_input = new Scanner(System.in);
			System.out.println("Let's play a Multiple Question Trivia");
			System.out.printf("A question will be presented and you have to choose the right answer %nby typing the number corresponding to the answer %n");
			System.out.printf("Each question has 20 points %nNB: Only integers are allowed %n");
			int choice_out = 0; 
			long start_time = System.currentTimeMillis();
			while(choice_out ==0){
					System.out.println("Are you interested?");
					System.out.println("1. Yes");
					System.out.println("2. No");
					String choice = user_input.next();
					try{
						int c = Integer.parseInt(choice);
						switch(c){
				        case 1:
				        	int score = 0;
						    System.out.println("Alright, Let's play.");
						    System.out.println("Your current score is, " + score);
						    choice_out = 1;
						    break;
				        case 2: 
				        	System.out.println("Bye Bye");
							System.exit(0);
				        default:
				        	System.out.println("Choose correctly");}
					}catch (Exception e) {
					      System.out.println("Choose correctly, only integers");}
			}
			/// The game
			int rounds = 1;
        	int score = 0;
			while(rounds <= 5){
				if(rounds == 1){System.out.println(myInner.qn_1); System.out.println(myInner.qn1_choices);}
				else{
					System.out.println("Would you like to play again?"); 
					System.out.println("1. Yes" + System.lineSeparator() + "2. No");
			    	int end_game = 0;
				    while(end_game ==0){
						String input = user_input.next();
						try{
							int int_input = Integer.parseInt(input);
						    if (int_input == 1){end_game = 1;}
						    if (int_input == 2){
						    	System.out.println("Bye Bye"); 
						        long end_time = System.currentTimeMillis();
						     	long time_difference = end_time - start_time;
							    System.out.println("The time taken to complete the game is " + time_difference/1000 + " seconds");
							    System.exit(1);
							    }
						    else {System.out.println("Choose correctly");}
						    }catch (Exception e) {System.out.println("Choose correctly, only integers");}
						}
				    }
				if (rounds == 2){ System.out.println(myInner.qn_2); System.out.println(myInner.qn2_choices );}
				if (rounds == 3){ System.out.println(myInner.qn_3); System.out.println(myInner.qn3_choices );}
				if (rounds == 4){ System.out.println(myInner.qn_4); System.out.println(myInner.qn4_choices );}
				if (rounds == 5){ System.out.println(myInner.qn_5); System.out.println(myInner.qn5_choices );}
				int choice_out1 = 0; 
				while(choice_out1 ==0){
					try{
						String choice1 = user_input.next();
						int int_choice = Integer.parseInt(choice1);
						if (rounds == 1){
					       if (int_choice == myInner.answer_1){System.out.println("Correct answer"); score = score + 20;choice_out1 = 1;}
					       else{System.out.println("The correct answer is " + myInner.answer_1);choice_out1 = 1;}}
						if (rounds == 2){
					       if (int_choice == myInner.answer_2){System.out.println("Correct answer");score = score + 20;choice_out1 = 1;}
					       else{System.out.println("The correct answer is " + myInner.answer_2); choice_out1 = 1;}}
						if (rounds == 3){
						    if (int_choice == myInner.answer_3){System.out.println("Correct answer");score = score + 20;choice_out1 = 1;}
						    else{System.out.println("The correct answer is " + myInner.answer_3); choice_out1 = 1;}}
						if (rounds == 4){
						    if (int_choice == myInner.answer_4){System.out.println("Correct answer");score = score + 20;choice_out1 = 1;}
						    else{System.out.println("The correct answer is " + myInner.answer_4); choice_out1 = 1;}}
						if (rounds == 5){
						    if (int_choice == myInner.answer_5){System.out.println("Correct answer");score = score + 20;choice_out1 = 1;}
						    else{System.out.println("The correct answer is " + myInner.answer_5);  System.out.println("Game over"); choice_out1 = 1;}}
						System.out.printf("Your have: " + score); System.out.println(" points out of " + rounds*20);
						}catch (Exception e) {System.out.println("Choose correctly, only integers");}
					}
				rounds = rounds + 1;
			}
			float time_difference = System.currentTimeMillis() - start_time;
			System.out.println("The time taken to complete the game is " + time_difference/1000 + " seconds");
	  }
}
