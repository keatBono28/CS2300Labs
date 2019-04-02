/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2300.lab11;


import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author kybon
 */
public final class Title extends JPanel{

    // user defined parameters. Adjust as needed or desired
    private final int fontSize = 36;
    private final String fontName = "Arial";
    private final String titleString = "Model - View - Controller";
    private final Color titleFontColor = new Color(15, 15, 255);
    private final Font font = new Font(fontName, Font.BOLD, fontSize);
    private final JLabel jlTitle = new JLabel(titleString);
    
    public Title() {
        setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        jlTitle.setFont(font);
        jlTitle.setForeground(titleFontColor);
        add(jlTitle);
    }
    
}
