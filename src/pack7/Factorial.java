package pack7;

public class Factorial {
    public long getFact(int num){

        if(num>20){
            return -1;
        }
        long f=1;;
        int j;

        for(j=1;j<=num;j++) {
            f = f * j;
        }
        return f;
    }

}
