package agh.po.lab3;

public class CodingBat {
    public String firstHalf(String str){
        if(str==null){
            return null;

        }
        return str.substring(0,str.length()/2);
    }

}
