import java.awt.*;
public class FrameDemo
{
FrameDemo()
{
Frame fm = new Frame();
fm.setTitle("MY First Frame");
Label lb= new Label("Welcome to GUI Programming");
fm.add(lb);
fm.setSize(7770,6969);
fm.setVisible(true);
}
public static void main(String args[])
{
FrameDemo f1 = new FrameDemo();
}
}