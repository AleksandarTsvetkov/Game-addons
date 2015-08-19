package game;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class menu extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	public static final int max = 6;
	public static final int min = 1;
	String display = null;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				menu frame = new menu();
				frame.setVisible(true);
			}
		});
	}

	public menu() {
		setResizable(false);
		Random rand = new Random(); 
		Window game = new Window();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 267);
		contentPane = new JPanel();
		menu.contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setTitle(game.gameName);
		
		JButton newGame = new JButton("New game");
		newGame.setFocusable(false);
		newGame.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Window window = new Window();
				window.gameWindow.setVisible(true);
				JOptionPane.showMessageDialog(null, "Firstly, you need to build a house", game.gameName, JOptionPane.INFORMATION_MESSAGE);
			}
		});
		newGame.setBounds(95, 75, 99, 23);
		contentPane.add(newGame);
		
		JButton info = new JButton("Info");
		info.setFocusable(false);
		info.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UIManager.put("OptionPane.messageForeground", Color.BLUE);
				JOptionPane.showMessageDialog(null, "The goal of this game is to fill the\n progress bar by completing\n achievements and some other\n hidden stuff :)\n\n"
												  + " Good luck!", game.gameName, JOptionPane.INFORMATION_MESSAGE);
				UIManager.put("OptionPane.messageForeground", Color.black);
			}
		});
		info.setBounds(95, 109, 99, 23);
		contentPane.add(info);
		
		JLabel name = new JLabel(game.gameName.toUpperCase());
		name.setForeground(Color.WHITE);
		name.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		name.setBounds(33, 11, 260, 40);
		contentPane.add(name);
		
		JLabel version = new JLabel(game.gameVersion);
		version.setFont(new Font("Tahoma", Font.BOLD, 11));
		version.setForeground(Color.WHITE);
		version.setBounds(199, 50, 69, 14);
		contentPane.add(version);
		
		JLabel copyright = new JLabel("Copyright (C) 2015 " + game.gameAuthor);
		copyright.setFont(new Font("Tahoma", Font.BOLD, 11));
		copyright.setForeground(Color.WHITE);
		copyright.setBounds(31, 211, 237, 14);
		contentPane.add(copyright);
		
		JButton exit = new JButton("Exit");
		exit.setFocusable(false);
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 dispose();
			}
		});
		exit.setBounds(95, 177, 99, 23);
		contentPane.add(exit);
		
		int randString = rand.nextInt((max - min) + 1) + min;
		
		switch (randString) {
			case 1 : {
				this.display = "More than 1100 lines of code!";
				break;
			}
			case 2 : {
				this.display = "Java :)";
				break;
			}
			case 3 : {
				this.display = "Not the final name?";
				break;
			}
			case 4 : {
				this.display = "BETA!";
				break;
			}
			case 5 : {
				this.display = "Thank you for downloading!";
				break;
			}
			case 6 : {
				this.display = "*caugh*";
				break;
			}
		}
		JLabel lblNewLabel = new JLabel(display);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(21, 50, 171, 14);
		contentPane.add(lblNewLabel);
		
		JButton credits = new JButton("Credits");
		credits.setFocusable(false);
		credits.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				UIManager.put("OptionPane.messageForeground", Color.blue);
				JOptionPane.showMessageDialog(null, "Code and Graphics\n" + game.gameAuthor, game.gameName, JOptionPane.INFORMATION_MESSAGE);
				UIManager.put("OptionPane.messageForeground", Color.black);
			}
		});
		credits.setBounds(95, 143, 99, 23);
		contentPane.add(credits);
	}
}
