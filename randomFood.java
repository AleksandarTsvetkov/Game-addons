package game;

import java.util.Random;

public class randomFood {
	
	Window game = new Window();
	Random rand = new Random();
	
	public String foodName = null;
	public int foodNumber = rand.nextInt((15 - 1) + 1) + 1;
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
					foodName = "lettuce";
				}
				else 
				{
					foodName = "lettuces";
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

				if (foodCount > 1) 
				{
					foodName = "tomatoes";
				}
				else
				{
					foodName = "tomato";
				}
				break;
			}
			case 12 : {

				if (foodCount > 1)
				{
					foodName = "potatoes";
				}
				else
				{
					foodName = "potato";
				}
				break;
			}
			case 13 : {
				foodName = "cabbage";
				break;
			}
			case 14 : {

				if (foodCount > 1)
				{
					foodName = "cucumbers";
				}
				else
				{
					foodName = "cucumber"
				}
			}
			case 15 : {
				foodName = null;
				break;
			}
		}
	}
}
