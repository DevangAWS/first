package NovemberProblems;

public class November16th2025 {
    public int numSub(String s) {
        int a=0;
        int b=s.length();
        for(int i=0;i<b;i++){
            if(s.charAt(i)=='1')a++;
        }
        return (a*(a+1))/2;
    }
}
