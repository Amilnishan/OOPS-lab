import java.awt.*;
import java.awt.event.*;

public class Housedoor extends Frame implements MouseListener, MouseMotionListener {
    Color br = new Color(Color.blue.getRGB());

    public Housedoor() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    // Corrected method name to lowercase 'mouseClicked'
    public void mouseClicked(MouseEvent e) {
        br = new Color(Color.red.getRGB());
        repaint();
    }

    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseDragged(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}

    public void paint(Graphics g) {
        g.setColor(Color.green);
        int[] x = {100, 160, 220};
        int[] y = {100, 50, 100};
        g.fillPolygon(x, y, 3);
        g.setColor(Color.yellow);
        g.fillRect(100, 100, 120, 120);
        g.setColor(br);
        g.fillRect(145, 160, 30, 60);
    }

    public static void main(String args[]) {
        Housedoor appwin = new Housedoor();
        appwin.setSize(new Dimension(500, 500));
        appwin.setTitle("House Door");
        appwin.setVisible(true);
    }
}

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

