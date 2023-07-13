
package Prefixsum;
public class AddBinary {

    public static void main(String[] arg){
        String A="1011";
        String B ="11";
        int s=0;
        String ans ="";
        int i=A.length()-1,j=B.length()-1;
        while(i>=0 || j>=0 || s==1){
            s+=(i>=0)?(A.charAt(i)-'0'):0;
            s+=(j>=0)?(B.charAt(j)-'0'):0;
            ans = (char)(s%2 +'0')+ans;
            s/=2;
            i--;j--;
        }
        System.out.print(ans);
    }
    
}
