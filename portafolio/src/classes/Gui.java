package classes;

import java.awt.*;
import java.awt.event.*;

public class Gui extends Frame {
  public Gui() {
    // creating a button
    Button b = new Button("Click Me!!");
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        b.setBackground(new Color(0, 255, 0));
      }
    });

    // setting button position on screen
    b.setBounds(30, 100, 80, 30);

    // adding button into frame
    add(b);

    // frame size 300 width and 300 height
    setSize(300, 300);

    // setting the title of Frame
    setTitle("This is our basic AWT example");

    // no layout manager
    setLayout(null);

    // now frame will be visible, by default it is not visible
    setVisible(true);
  }

  public static void main(String[] args) {
    Gui gui = new Gui();
  }
}
