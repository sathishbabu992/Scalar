package SingletonDesignPattern;

public final class Singleton {
    
    static Singleton s;
    private Singleton(){}
    public static Singleton getSingleton(){
        if(s==null){
            s=new Singleton();
        }
        return s;
    }
}
