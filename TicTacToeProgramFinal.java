package Sample;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeProgramFinal {
	
	public static void printBoard(char[][] gameBoard)
	{
		System.out.println(gameBoard[0][0] +" | "+gameBoard[0][1] +" | "+gameBoard[0][2]);
		System.out.println("- + - + -");
		System.out.println(gameBoard[1][0] +" | "+gameBoard[1][1] +" | "+gameBoard[1][2]);
		System.out.println("- + - + -");		
		System.out.println(gameBoard[2][0] +" | "+gameBoard[2][1] +" | "+gameBoard[2][2]);
	}
	
	public static char checkTurn(char[][] gameBoard,String user)
	{
		if(user.equals("player"))
		{
			return 'X';
		}
		else {
			return 'O';
		}
	}
	
    public static void playPositionForUser(char [][] gameBoard,char symbol,int pos,Scanner sc)
	{			
		
		switch(pos) {
		case 1:
			if(gameBoard[0][0] == ' ')
			{
				gameBoard[0][0] = symbol;
			}
			else {
				System.out.println("Invalid move..try again!");
				System.out.println("Choose the position again..");
				int userPlay = sc.nextInt();
				playPositionForUser(gameBoard, symbol, userPlay,sc);
			}
//			gameBoard[0][0] = symbol;

			break;
		case 2:		
			if(gameBoard[0][1] == ' ')
			{
				gameBoard[0][1] = symbol;
			}
			else {
				System.out.println("Invalid move..try again!");
				System.out.println("Choose the position again..");
				int userPlay = sc.nextInt();
				playPositionForUser(gameBoard, symbol, userPlay,sc);
			}
//			gameBoard[0][1] = symbol;
			break;
		case 3:		
			if(gameBoard[0][2] == ' ')
			{
				gameBoard[0][2] = symbol;
			}
			else {
				System.out.println("Invalid move..try again!");
				System.out.println("Choose the position again..");
				int userPlay = sc.nextInt();
				playPositionForUser(gameBoard, symbol, userPlay,sc);
			}
//			gameBoard[0][2] = symbol;
			break;
		case 4:
			if(gameBoard[1][0] == ' ')
			{
				gameBoard[1][0] = symbol;
			}
			else {
				System.out.println("Invalid move..try again!");
				System.out.println("Choose the position again..");
				int userPlay = sc.nextInt();
				playPositionForUser(gameBoard, symbol, userPlay,sc);
			}
//			gameBoard[1][0] = symbol;
			break;
		case 5:
			if(gameBoard[1][1] == ' ')
			{
				gameBoard[1][1] = symbol;
			}
			else {
				System.out.println("Invalid move..try again!");
				System.out.println("Choose the position again..");
				int userPlay = sc.nextInt();
				playPositionForUser(gameBoard, symbol, userPlay,sc);
			}
//			gameBoard[1][2] = symbol;
			break;
		case 6:
			if(gameBoard[1][2] == ' ')
			{
				gameBoard[1][2] = symbol;
			}
			else {
				System.out.println("Invalid move..try again!");
				System.out.println("Choose the position again..");
				int userPlay = sc.nextInt();
				playPositionForUser(gameBoard, symbol, userPlay,sc);
			}
//			gameBoard[1][2] = symbol;
			break;
		case 7:
			if(gameBoard[2][0] == ' ')
			{
				gameBoard[2][0] = symbol;
			}
			else {
				System.out.println("Invalid move..try again!");
				System.out.println("Choose the position again..");
				int userPlay = sc.nextInt();
				playPositionForUser(gameBoard, symbol, userPlay,sc);
			}
//			gameBoard[2][0] = symbol;
			break;
		case 8:
			if(gameBoard[2][1] == ' ')
			{
				gameBoard[2][1] = symbol;
			}
			else {
				System.out.println("Invalid move..try again!");
				System.out.println("Choose the position again..");
				int userPlay = sc.nextInt();
				playPositionForUser(gameBoard, symbol, userPlay,sc);
			}
//			gameBoard[2][1] = symbol;
			break;
		case 9:
			if(gameBoard[2][2] == ' ')
			{
				gameBoard[2][2] = symbol;
			}
			else {
				System.out.println("Invalid move..try again!");
				System.out.println("Choose the position again..");
				int userPlay = sc.nextInt();
				playPositionForUser(gameBoard, symbol, userPlay,sc);
			}
//			gameBoard[2][2] = symbol;
			break;
		default:			
			System.out.println("Sorry! Invalid move..choose between 1-9");
			System.out.println("Choose the position again..");
			int userPlay = sc.nextInt();
			playPositionForUser(gameBoard, symbol, userPlay,sc);
			break;
		}
		
	}
	
	public static void playPositionForCpu(char [][] gameBoard,char symbol,int pos,Random rand)
	{			
		
		switch(pos) {
		case 1:
			if(gameBoard[0][0] == ' ')
			{
				gameBoard[0][0] = symbol;
			}
			else {
				boolean ps = positionStatus(gameBoard);
				if(ps) {
					int userPlay = rand.nextInt(9)+1;
					playPositionForCpu(gameBoard, symbol, userPlay,rand);
				}
			}
//			gameBoard[0][0] = symbol;

			break;
		case 2:		
			if(gameBoard[0][1] == ' ')
			{
				gameBoard[0][1] = symbol;
			}
			else {
				boolean ps = positionStatus(gameBoard);
				if(ps) {
					int userPlay = rand.nextInt(9)+1;
					playPositionForCpu(gameBoard, symbol, userPlay,rand);
				}
			}
//			gameBoard[0][1] = symbol;
			break;
		case 3:		
			if(gameBoard[0][2] == ' ')
			{
				gameBoard[0][2] = symbol;
			}
			else {
				boolean ps = positionStatus(gameBoard);
				if(ps) {
					int userPlay = rand.nextInt(9)+1;
					playPositionForCpu(gameBoard, symbol, userPlay,rand);
				}
			}
//			gameBoard[0][2] = symbol;
			break;
		case 4:
			if(gameBoard[1][0] == ' ')
			{
				gameBoard[1][0] = symbol;
			}
			else {
				boolean ps = positionStatus(gameBoard);
				if(ps) {
					int userPlay = rand.nextInt(9)+1;
					playPositionForCpu(gameBoard, symbol, userPlay,rand);
				}
			}
//			gameBoard[1][0] = symbol;
			break;
		case 5:
			if(gameBoard[1][1] == ' ')
			{
				gameBoard[1][1] = symbol;
			}
			else {
				boolean ps = positionStatus(gameBoard);
				if(ps) {
					int userPlay = rand.nextInt(9)+1;
					playPositionForCpu(gameBoard, symbol, userPlay,rand);
				}
			}
//			gameBoard[1][2] = symbol;
			break;
		case 6:
			if(gameBoard[1][2] == ' ')
			{
				gameBoard[1][2] = symbol;
			}
			else {
				boolean ps = positionStatus(gameBoard);
				if(ps) {
					int userPlay = rand.nextInt(9)+1;
					playPositionForCpu(gameBoard, symbol, userPlay,rand);
				}
			}
//			gameBoard[1][2] = symbol;
			break;
		case 7:
			if(gameBoard[2][0] == ' ')
			{
				gameBoard[2][0] = symbol;
			}
			else {
				boolean ps = positionStatus(gameBoard);
				if(ps) {
					int userPlay = rand.nextInt(9)+1;
					playPositionForCpu(gameBoard, symbol, userPlay,rand);
				}
			}
//			gameBoard[2][0] = symbol;
			break;
		case 8:
			if(gameBoard[2][1] == ' ')
			{
				gameBoard[2][1] = symbol;
			}
			else {
				boolean ps = positionStatus(gameBoard);
				if(ps) {
					int userPlay = rand.nextInt(9)+1;
					playPositionForCpu(gameBoard, symbol, userPlay,rand);
				}
			}
//			gameBoard[2][1] = symbol;
			break;
		case 9:
			if(gameBoard[2][2] == ' ')
			{
				gameBoard[2][2] = symbol;
			}
			else {
				boolean ps = positionStatus(gameBoard);
				if(ps) {
					int userPlay = rand.nextInt(9)+1;
					playPositionForCpu(gameBoard, symbol, userPlay,rand);
				}
			}
//			gameBoard[2][2] = symbol;
			break;
		default:		
			boolean ps = positionStatus(gameBoard);
			if(ps) {
				int userPlay = rand.nextInt(9)+1;
				playPositionForCpu(gameBoard, symbol, userPlay,rand);
			}
			
			break;
		}
		
	}
	
	public static boolean positionStatus(char[][] gameBoard)
	{
		for(int row = 0;row<gameBoard.length;row++)
		{
			for(int col = 0;col<gameBoard.length;col++)
			{
				if(gameBoard[row][col] == ' ') {
					return true;				}				
			}
		}
		return false;
	}
	
	public static boolean X_Wins(char[][] gameBoard)
	{
		if(gameBoard[0][0] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][2] == 'X') {
			return true;
		}
		if(gameBoard[0][2] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][0] == 'X') {
			return true;
		}
		for(int row = 0;row<gameBoard.length;row++)
		{
			if(gameBoard[row][0] == 'X' && gameBoard[row][1] == 'X' && gameBoard[row][2] == 'X') {
				return true;
			}
		}
		for(int col = 0;col<gameBoard.length;col++)
		{
			if(gameBoard[0][col] == 'X' && gameBoard[1][col] == 'X' && gameBoard[2][col] == 'X') {
				return true;
			}
		}
		return false;
	}
	
	public static boolean O_Wins(char[][] gameBoard)
	{
		if(gameBoard[0][0] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][2] == 'O') {
			return true;
		}
		if(gameBoard[0][2] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][0] == 'O') {
			return true;
		}
		for(int row = 0;row<gameBoard.length;row++)
		{
			if(gameBoard[row][0] == 'O' && gameBoard[row][1] == 'O' && gameBoard[row][2] == 'O') {
				return true;
			}
		}
		for(int col = 0;col<gameBoard.length;col++)
		{
			if(gameBoard[0][col] == 'O' && gameBoard[1][col] == 'O' && gameBoard[2][col] == 'O') {
				return true;
			}
		}
		return false;
	}
	
	
	public static String hasWon(char[][] gameBoard)
	{
		    if(X_Wins(gameBoard))
		    {
		    	return "CONGO!!! YOU WON";
		    }
		    else if(O_Wins(gameBoard))
		    {
		    	return "OOPS!!! CPU WINS";
		    }
		    else if(!boardEmptyCheckStatus(gameBoard) && (!X_Wins(gameBoard) || !O_Wins(gameBoard)))
		    {
		    	return "SORRY!!! IT'S A DRAW";
		    }
		    else if (boardEmptyCheckStatus(gameBoard)){
		    	return "Yet to Be Seen...";
		    }
			return "SORRY!!! IT'S A DRAW";
		}
	
	public static boolean boardEmptyCheckStatus(char [][] gameBoard)
	{
		for(int row = 0;row<gameBoard.length;row++)
		{
			for(int col = 0;col<gameBoard.length;col++)
			{
				if(gameBoard[row][col] == ' ') {
					return true;
				}				
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] gameBoard = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
		
		printBoard(gameBoard);
		
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Yours Turn");
			System.out.println();
			System.out.println("choose the position:");
			int userPlay = sc.nextInt();
			char symbol = checkTurn(gameBoard, "player");
			playPositionForUser(gameBoard, symbol, userPlay,sc);
//			printStatus(gameBoard);
			printBoard(gameBoard);
			
			System.out.println("CPU's Turn");
			
			Random rand = new Random();
			int cpuPlay = rand.nextInt(9)+1;
			symbol = checkTurn(gameBoard, "cpu");
			playPositionForCpu(gameBoard, symbol, cpuPlay,rand);
			String status = hasWon(gameBoard);
			System.out.println();
			System.out.println(status);
			printBoard(gameBoard);
			
			if(boardEmptyCheckStatus(gameBoard) && (X_Wins(gameBoard) || O_Wins(gameBoard)) || !boardEmptyCheckStatus(gameBoard) && (!X_Wins(gameBoard) || !O_Wins(gameBoard)))
			{
				System.out.println();
				System.out.println("!!!GAME OVER!!!");
				break;
			}
			
			
		}

	}

}
