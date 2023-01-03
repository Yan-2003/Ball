import java.awt.*;


public class Ball {
    int x;
    int y;
    int speed;
    boolean up = false;
    boolean down = true;
    

    RenderPanel render;

    Ball(RenderPanel render){
        this.render = render;
        setLocation();
    }
    public void setLocation(){
        x = 200;
        y = 100;
        speed = 2;

    }
    public void update(){

       if(down == true){
           y+=speed;
           if(y > 100){
               speed++;
           }
           if(y >= 320){
               down = false;
               up = true;
            
           }
       }
       if(up == true){

            y-=speed;
            if(y > 100){
                speed++;
            }
            if(y < 100){
                down = true;
                up = false;
                speed = 2;
            }
       }

        

    }


    public void draw(Graphics2D g2){
    
        g2.setColor(new Color(60,60,60));
        g2.fillOval(x+3, y+5, 100, 100);
        g2.setColor(new Color(255,100,100));
        g2.fillOval(x, y, 100, 100);
    }

}
