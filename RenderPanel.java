import java.awt.Dimension;
import java.awt.*;
import javax.swing.JPanel;

public class RenderPanel extends JPanel implements Runnable{

    final int FPS = 60;

    Thread runR;
    Ball ball = new Ball(this);

    RenderPanel(){
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(new Color(80,80,80));

    }

    public void start(){
        runR = new Thread(this);
        runR.start();
    }



    @Override
    public void run() {
        double darwInt = 1000000000/FPS;
        double nextdraw = System.nanoTime() + darwInt;

            while(runR!= null){


                update();// this will update the information in the screen
    
    
                repaint();// this will repaint the updated information in the screen
    
                
    
                try {
                    double remTime = nextdraw - System.nanoTime();
                    remTime = remTime /1000000;
    
                    if(remTime < 0){
                        remTime = 0;
                    }
    
                    Thread.sleep((long) remTime);
    
                    nextdraw += darwInt;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    
            }

        
    }

    public void update(){
        ball.update();
    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        ball.draw(g2d);
        g2d.setColor(new Color(17,17,17));
        g2d.fillRect(0, 400,500, 100);



    }
}
