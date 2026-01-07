public class NumberOfLaserBeamsInBank {
    public int numberOfBeams(String[] bank) {
        int i=0,count=0;
        if (bank.length==1)return 0;
        while (i<bank.length){
            int a=noOfSystems(bank[i]);
            if (a==0){
                i++;
            }
            else {
                int b=noOfSystems(bank[i+1]);
                int j=i;
                while (j<bank.length){

                }
            }
        }
        return count;
    }

    public int noOfSystems(String inputStringByUser){
        int count=0;
        for (int i = 0; i < inputStringByUser.length(); i++) {
            if (inputStringByUser.charAt(i)=='1')count++;
        }
        return count;
    }

}

class runAbove{
    static void main() {
        String[] bank ={"0000","000000","0000","00000"};
        NumberOfLaserBeamsInBank bank1=new NumberOfLaserBeamsInBank();
        int a=bank1.numberOfBeams(bank);
        System.out.println(a);
    }
}