package assignment;

import static assignment.GUI.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowValueAllActionListener implements MouseListener
{
    JLabel showValueAllLabel1;
    JLabel showValueAllLabel2;
    
    public ShowValueAllActionListener(JLabel label1, JLabel label2)
    {
        showValueAllLabel1 = label1;
        showValueAllLabel2 = label2;
    }
    
    public void mouseClicked(MouseEvent evt)
    {
        showValueAllButtonMouseClicked(evt);
    }

    public void mouseEntered(MouseEvent evt) {}
    public void mouseExited(MouseEvent evt) {}
    public void mousePressed(MouseEvent evt) {}
    public void mouseReleased(MouseEvent evt) {}
    
    // Get the total value for all cards
    private void showValueAllButtonMouseClicked(MouseEvent evt)
    {
        // Check if there are cards
        if(cards.size() < 1)
        {
            showValueAllLabel1.setText("No cards found!");
            return;
        }
        
        // Get the value of all cards
        double total = 0;
        
        // Loop through each card and get its balance
        for(Card card : cards)
        {
            total += card.getBalance();
        }
        
        showValueAllLabel1.setText("Total value of all cards found!");
        showValueAllLabel2.setText(String.format("Total Value of Cards: $%.2f AUD", total));
    }
}
