package game;

import java.util.Random;

public class randomFood {
	
	Window game = new Window();
	Random rand = new Random();
	
	public String foodName = null;
	public int foodNumber = rand.nextInt((11 - 1) + 1) + 1;
	public int foodCount = rand.nextInt((5 - 1) + 1) + 1;
	
	void generateFood() {
		
		switch (foodNumber) {
			
			case 1 : {
				foodName = "meat";
				game.level++;
				break;
			}
			case 2 : {
				
				if (foodCount > 1) 
				{
					foodName = "fruits";
				}
				else 
				{
					foodName = "fruit";
				}
				break;
			}
			case 3 : {
				
				if (foodCount > 1) 
				{
					foodName = "cherries";
				}
				else 
				{
					foodName = "cherry";
				}
				break;
			}
			case 4 : {
				foodName = "fish";
				game.level++;
				break;
			}
			case 5 : {
				
				if (foodCount > 1) 
				{
					foodName = "strawberries";
				}
				else 
				{
					foodName = "strawberry";
				}
				
				break;
			}
			case 6 : {

				if (foodCount > 1) 
				{
					foodName = "blueberries";
				}
				else 
				{
					foodName = "blueberry";
				}
				break;
			}
			case 7 : {
				
				if (foodCount > 1) 
				{
					foodName = "pears";
				}
				else
				{
					foodName = "pear";
				}
				break;
			}
			case 8 : {
				
				if (foodCount > 1) 
				{
					foodName = "bananas";
				}
				else 
				{
					foodName = "banana";
				}
				break;
			}
			case 9 : {
		
				if (foodCount > 1)
				{
					foodName = "peaches";
				}
				else
				{
					foodName = "peach";
				}
				break;
			}
			case 10 : {
				foodName = "fish";
				game.level++;
				break;
			}
			case 11 : {
				foodName = null;
				break;
			}
		}
	}
}
