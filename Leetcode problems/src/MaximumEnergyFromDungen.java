public class MaximumEnergyFromDungen {
//    public int maximumEnergy(int[] energy, int k) {
//        int max=0,sum=0;
//        for(int i=0; i<energy.length; i++){
//            for(int j=k; j<energy.length; j+=k){
//                if(i+j<energy.length){
//                    sum+=energy[i+j];
//                }
//                else break;
//            }
//            if(sum>max)max=sum;
//            sum=0;
//            if(i+k>energy.length)break;
//        }
//        return max;
//    }

    public int maximumEnergy(int[] energy, int k) {
        int sum=0,start=k;
        for(int i=0; i<energy.length; i++){
            sum+=energy[i];
            if(k<energy.length){
                for(int j=start; j<energy.length; j+=k){
                    sum+=energy[j];
                }
            }
            energy[i]=sum;
            if(i>=1){energy[0]=Math.max(energy[0],energy[i]);}
            sum=0;
            start+=1;
        }
        return energy[0];
    }
}

class runThis{
    static void main() {
        int[] energy={2,1,-2,-1,4,1,-10,4};
        MaximumEnergyFromDungen lol=new MaximumEnergyFromDungen();
        int a=lol.maximumEnergy(energy,3);
        System.out.println(a);
    }
}
