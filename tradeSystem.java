package game;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class trade {
	
	int i, i2, n, n2, dialog;
	public boolean fItemAvailable = false;
	public boolean sItemAvailable = false;
	
	public void tradeItem() {
		
		Random rand = new Random(); 
		Window game = new Window();
		UIManager.put("OptionPane.messageForeground", Color.blue);
		n = rand.nextInt((15 - 1) + 1) + 1;
		n2 = rand.nextInt((15 - 1) + 1) + 1;
		i = rand.nextInt((7 - 1) + 1) + 1;
		i2 = rand.nextInt((7 - 1) + 1) + 1;
			
		if (i == i2) {
			n = rand.nextInt((15 + 1) + 1) + 1;
			n2 = rand.nextInt((15 + 1) + 1) + 1;
			i = rand.nextInt((7 + 1) + 1) + 1;
			i2 = rand.nextInt((7 + 1) + 1) + 1;
		}
		
		switch (i) {
			case 1 : game.name = " coal";
				break;
			case 2 : game.name = " wood";
				break;
			case 3 : game.name = " iron";
				break;
			case 4 : if (n > 1) game.name = " saplings"; else game.name = " sapling";
				break;
			case 5 : if (n > 1) game.name = " apples"; else game.name = " apple";
				break;
			case 6 : if (n > 1) game.name = " seeds"; else game.name = " seed";
				break;
			case 7 : game.name = " food";
				break;
		}
		
		switch (i2) {
			case 1 : game.name2 = " coal";
				break;
			case 2 : game.name2 = " wood";
				break;
			case 3 : game.name2 = " iron";
				break;
			case 4 : if (n > 1) game.name2 = " saplings"; else game.name2 = " sapling";
				break;
			case 5 : if (n > 1) game.name2 = " apples"; else game.name2 = " apple";
				break;
			case 6 : if (n > 1) game.name2 = " seeds"; else game.name2 = " seed";
				break;
			case 7 : game.name2 = " food";
				break;
		}
		dialog = JOptionPane.showConfirmDialog(null, "Trade " + n + game.name + " for " + n2 + game.name2 + "?", game.gameName, JOptionPane.YES_NO_OPTION);
		
		if (dialog == JOptionPane.YES_OPTION) {
			
			switch (i) {
				case 1 : {
					if (game.coal > n) {
						fItemAvailable = true;
					}
					else fItemAvailable = false;
					break;
				}
				case 2 : {
					if (game.wood > n) {
						fItemAvailable = true;
					}
					else fItemAvailable = false;
					break;
				}
				case 3 : {
					if (game.iron > n) {
						fItemAvailable = true;
					}
					else fItemAvailable = false;
					break;
				}
				case 4 : {
					if (game.saplingsCount > n) {
						fItemAvailable = true;
					}
					else fItemAvailable = false;
					break;
				}
				case 5 : {
					if (game.apples > n) {
						fItemAvailable = true;
					}
					else fItemAvailable = false;
					break;
				}
				case 6 : {
					if (game.seeds > n) {
						fItemAvailable = true;
					}
					else fItemAvailable = false;
					break;
				}
				case 7 : {
					if (game.food > n) {
						fItemAvailable = true;
					}
					else fItemAvailable = false;
					break;
				}
			}
			
			switch (i) {
				case 1 : {
					if (game.coal > n) {
						sItemAvailable = true;
					}
					else sItemAvailable = false;
					break;
				}
				case 2 : {
					if (game.wood > n) {
						sItemAvailable = true;
					}
					else sItemAvailable = false;
					break;
				}
				case 3 : {
					if (game.iron > n) {
						sItemAvailable = true;
					}
					else sItemAvailable = false;
					break;
				}
				case 4 : {
					if (game.saplingsCount > n) {
						sItemAvailable = true;
					}
					else sItemAvailable = false;
					break;
				}
				case 5 : {
					if (game.apples > n) {
						sItemAvailable = true;
					}
					else sItemAvailable = false;
					break;
				}
				case 6 : {
					if (game.seeds > n) {
						game.saplingsCount += n;
					}
					else sItemAvailable = false;
					break;
				}
				case 7 : {
					if (game.food > n) {
						game.saplingsCount += n;
					}
					else sItemAvailable = false;
					break;
				}
			}
		}
	}
}
