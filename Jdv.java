

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.sound.sampled.Line;
import javax.swing.ImageIcon;
import java.io.*;

public class Jdv extends JPanel {

    //logic of the game
    boolean Playerx;
    boolean gamerdone = false;
    int winner = -1;
    int player1wins = 0, player2wins = 0;
    int [][] board = new int[3][3];
    //paint variables
    int lineWidth = 5;
    int lineLength = 270;
    int x = 15, y =270;//location fo the first line
    int offset = 100; //square width
    int a = 0;
    int b = 5;
    int selX = 0, selY = 0;
    //cores
    Color turtle = new Color(0x80bdab);
    Color orange = new Color(0xfdcb9e);
    Color offwhite = new Color(0xf7f7f7);
    Color darkgray = new Color(0x3f3f44);

    //Components
    JButton jButton;

    prompt entrada = new prompt();


    public Jdv(){
        Dimension size = new Dimension(520,400);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        jButton = new JButton("Play again?");
        jButton.addActionListener(null);
        jButton.setVisible(false);
    } 

    public static void main(String[] args) {
        JFrame frame = new JFrame("Jdv");
        frame.getContentPane();

        Jdv tpanel = new Jdv();
        frame.add(tpanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        reset();  
    }
    public JButton getJButtion(){
        return jButton;
    }
    public void setPlayer1wins(int a ){
        player1wins = a;
    }
    public void setPlayer2wins(int a){
        player2wins = a;
    }

    public void reset(){
        Playerx = true;
        winner = -1;
        gamerdone = false;
        for(int j=0; j<3;j++){
            for(int i=0;i<3;i++){
                board[j][i] = 0;
            }
        }
        getJButtion().setVisible(false);
    }
    public void paintComponent(Graphics page){
        super.paintComponent(page); 
        drawBoard(page);
       // drawUI(page);
       // drawGame(page);
    }
    public void drawBoard(Graphics page){
        setBackground(turtle);
        page.setColor(darkgray);
        page.fillRoundRect(x+26, y-70,lineLength, lineWidth,5,30);
        page.fillRoundRect(x+26, y-170,lineLength, lineWidth,5,30);
        page.fillRoundRect(y-40,x,lineWidth,lineLength,30,5);
        page.fillRoundRect((y-offset)-60,x,lineWidth,lineLength,30,5);
    }
}
