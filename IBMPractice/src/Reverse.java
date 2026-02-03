public class Reverse {
    public boolean rev(String orig){
        int l=orig.length();
        char[] c=orig.toCharArray();
        for (int i = 0;i<l/2; i++) {
            char tem=c[i];
            c[i]=c[l-i-1];
            c[l-i-1]=tem;
        }
        String s=new String(c);
        return orig.equals(s);
    }

    public boolean rev0(String orig){
        int l=orig.length();
        for (int i = 0; i < l/2; i++) {
            if (orig.charAt(i)!=orig.charAt(l-1-i))return false;
        }
        return true;
    }

    public String display(String orig){
        StringBuilder s=new StringBuilder(orig.length());
        s.append(orig);
        s.reverse();
        return s.toString();
    }

    public String display0(String orig){
        return new StringBuilder(orig.length()).append(orig).reverse().toString();
    }
}