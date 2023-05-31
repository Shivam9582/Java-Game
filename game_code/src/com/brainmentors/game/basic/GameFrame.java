package com.brainmentors.game.basic;

import javax.swing.JFrame;

import com.brainmentors.game.settings.GameConstant;

public class GameFrame extends JFrame implements GameConstant {
          public GameFrame() throws Exception {
        	  setDefaultCloseOperation(EXIT_ON_CLOSE);
        	  setSize(BOARD_WIDTH, BOARD_HEIGHT);
              setLocationRelativeTo(null);
              setTitle(" Sumit's Game");
              Board board = new Board();
              add(board);
              setVisible(true); 
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
			GameFrame obj = new GameFrame();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
			
		}
         
	}

}
