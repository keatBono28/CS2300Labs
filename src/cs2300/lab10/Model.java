/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2300.lab10;

import java.awt.Color;
import javax.swing.SwingUtilities;

/**
 *
 * @author kybon
 */
public class Model {
    private final Title title = new Title();
    private final Controller controller;
    private final View view;
    private final MvcFrame mvcFrame;
    private int xSize = 66;
    private int ySize = 44;
    private Color color = Color.BLUE;
    private boolean solid = true;

    public int getxSize() {
        return xSize;
    }

    public void setxSize(int xSize) {
        this.xSize = xSize;
    }

    public int getySize() {
        return ySize;
    }

    public void setySize(int ySize) {
        this.ySize = ySize;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isSolid() {
        return solid;
    }

    public void setSolid(boolean solid) {
        this.solid = solid;
    }

    public Model() {
        controller = new Controller(this);
        view = new View(this);
        mvcFrame = new MvcFrame(this);
        System.out.println("Model C-Tor");
    }

    public Title getTitle() {
        return title;
    }

    public Controller getController() {
        return controller;
    }

    public View getView() {
        return view;
    }

    public MvcFrame getMvcFrame() {
        return mvcFrame;
    }
    
    
    public static void main(String[] args) {
        System.out.println("Start MVC GUI Application");
        SwingUtilities.invokeLater(() -> {
            Model model = new Model();
        });
    }
}
