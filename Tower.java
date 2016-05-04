import java.util.Scanner;

public class Tower {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("How many disks do you want?"); //ask user how many disks that user want?
		int number = console.nextInt();
		
		
		if (number >= 1){ //if the disk number is greater or equal to 1, it runs the move method.
		move(number, 'A', 'C', 'B');
		} else{ //if not, the program does not work vut quit
			System.out.println("Wrong number!!");
		}
		
	}
	
	/*
	 * Recursion method that moves disk in any numbers.
	 * int number -> number of disks
	 * from -> moving from. In this case, usually A
	 * through -> the empty storage. In this case, usually C
	 * to -> moving toward. In this case, usually B
	 */
	public static void move(int number, char from, char through, char to){
		if(number==1){ //if the number of disk is one or there is only one disk left todo,
			System.out.println("Move disk1 from "+from+" to "+to); //the final move.
		} else{ //if not,
			move(number-1,from,to,through); //reduce the number and move the disk.
			System.out.println("Move disk"+number+" from "+from+" to "+to);
			move(number-1,through,from,to); //reduce the number with the changed position.
		}
	}
}
