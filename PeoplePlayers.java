/**
 * The purpose of this program is to demonstrate of if-else statements can splinter off to 
 * create different outcomes and how to input int 
 * @author Ethan Steen
 * @version 1.0
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class PeoplePlayers {

	public static void main(String [] args) {
		

			int NumPlayers, NumPeople, GroupSize, TeamSize;
			GroupSize = 0;
			TeamSize = 0;
			
			String InputPlayers = JOptionPane.showInputDialog("Enter the number of players:");
			NumPlayers = Integer.parseInt(InputPlayers);
			
			String InputPeople = JOptionPane.showInputDialog("Enter the number of people:");
			NumPeople = Integer.parseInt(InputPeople);
			/*
			 * Declare a temporary String variable to allow input with JOptionPane then convert
			 * the variable into the desired integer variable using Integer.parseInt(...)
			 */
		
			
			if (NumPlayers < 55 && NumPlayers > 11){
				TeamSize = NumPlayers/5;
			}
				else if (NumPlayers>55){
					JOptionPane.showMessageDialog(null,"Number of players needs to be at most 55.");
			}
				else {
				TeamSize = 1;
			}
			//Parameters for TeamSize using NumPlayers as the independent factor.
			
			
			if (NumPeople > 10){
				GroupSize = NumPeople/2;
			}
			else if (NumPeople > 3 && NumPeople < 10){
				GroupSize = NumPeople/3;
			}
			else{
				JOptionPane.showMessageDialog(null, "Number of people needs to be at least3");
			}
			//Parameters for GroupSize using NumPeople as the independent factor.
			
			JOptionPane.showMessageDialog(null, "Number of players are " + NumPlayers + ".\n" +
												"Team size is " + TeamSize + ".\n\n" +												
												"Number of people are " + NumPeople + ".\n" +
												"Group size is " + GroupSize + "."
												);
												//JOptionPane message to show results of program. Using "\n" to keep everything in one box. 
				
	
			
}
}
