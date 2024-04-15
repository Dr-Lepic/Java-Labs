package LAB.L5.Ex2;

public class Button implements Component
{
    private int x,y;
    private String name;
    public Button(String name)
    {
        this.name=name;
    }

    public void draw()
    {
        System.out.println("Button '" + name+"' is being drawn at position("+ x+ ","+y+")");
    }
    public void onClick()
    {
        System.out.println("Button '"+ name +"' was clicked");
    }

    public void setPosition(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public String getName(){
        return name;
    }
}
