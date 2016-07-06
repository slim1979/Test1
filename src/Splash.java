import java.awt.Graphics;

import com.sun.java.swing.plaf.motif.MotifInternalFrameTitlePane.FrameButton;

private class SystemButton extends FrameButton {
        public boolean isFocusTraversable() { return false; }
        public void requestFocus() {}

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(highlight);
            g.drawLine(4, 8, 4, 11);
            g.drawLine(4, 8, BUTTON_SIZE - 5, 8);
            g.setColor(shadow);
            g.drawLine(5, 11, BUTTON_SIZE - 5, 11);
            g.drawLine(BUTTON_SIZE - 5, 9, BUTTON_SIZE - 5, 11);
        }
    }


