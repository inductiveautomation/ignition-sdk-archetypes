package ${package}.client;

import java.awt.*;

import com.inductiveautomation.vision.api.client.components.model.AbstractVisionComponent;

public class HelloWorldComponent extends AbstractVisionComponent {

    private String text = "Hello, world!";

    public HelloWorldComponent() {
        setFont(new Font("Dialog", Font.PLAIN, 16));
        setPreferredSize(new Dimension(250, 100));
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Set the font to our component's font property
        g.setFont(getFont());
        FontMetrics fm = g.getFontMetrics();

        // Calculate the x,y for the String's baseline in order to center it
        int stringWidth = fm.stringWidth(getText());
        int stringX = (getWidth() - stringWidth) / 2;
        int stringY = (getHeight() / 2);

        g.setColor(Color.BLACK);
        g.drawString(getText(), stringX, stringY);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        String oldText = this.text;
        this.text = text;

        // Firing property changes like this is required for any
        // property that has the BOUND_MASK set on it.
        firePropertyChange("text", oldText, text);

        repaint();
    }

}
