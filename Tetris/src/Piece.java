import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public interface Piece {



    public void draw(Graphics g);
    public void move(Direction direction);
    public Point[] getLocations();
    public Color getColor();
    public boolean canMove(Direction direction);
    public abstract void rotate();
    public void hardDrop(Direction down);
    //public void drawInHold(Graphics g);
    public void holdPiece();







}
