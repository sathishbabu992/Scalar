package OverrideEx;

public class ThreedPoint extends Point{
    private int z;

    public void setZ(int t){
        this.z=t;
    }
    @Override
    public void display(){
        System.out.println("["+x+","+y+","+z+"]");
    }
}
