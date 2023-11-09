package designPatterns.types.factory;

public class Factory {
    public OS getInstance(String s){
        if(s.equals("open")){
            return new Android();
        }
        else if(s.equals("closed")){
            return new IOS();
        }
        else return new Other_os();
    }
}
