import javax.swing.*;

public class main{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        RenderPanel RPanel = new RenderPanel();

        frame.setTitle("Renderring");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(RPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        RPanel.start();


    }
}