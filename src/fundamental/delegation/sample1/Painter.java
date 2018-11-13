package fundamental.delegation.sample1;

class Painter{
    private Graphics graphics;
    void setGraphics(Graphics g){
        graphics = g;
    }

    void draw(){
        graphics.draw();
    }
}
