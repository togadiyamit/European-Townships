import java.util.*;

public class EuropeanTownships
{
    public static int wall[] = {3,4,6};
    public static float accent(int roof,int standard,int hall){
        float r = (float)(roof*wall[0])/3;
        float s = (float)(standard*wall[1])/3;
        float h = (float)(hall*wall[2])/3;
        
        float ans = r+h+s;
        ans*=1.5;
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		float ac = 0;
		float reg = 0;
		float hr = 0;
		String op[] = new String[t];
		String out = "";
		for(int i = 1; i<= t; i++){
		    int n = sc.nextInt();
		    for(int j = 1; j <= n; j++){
    		    int total = sc.nextInt();
    		    int roof = sc.nextInt();
    		    int standard = sc.nextInt();
    		    int hall = sc.nextInt();
    		    ac += accent(roof,standard,hall);
		    }
		    reg = (ac * 3);
		    hr = (float)Math.ceil((reg - ac)*3);
		    out+="case#"+i +":" +" "+ String.format("%.02f", hr) +","+ String.format("%.02f", ac)+","+ String.format("%.02f", reg);
		    op[i-1] = out;
		    out = "";
		    reg = 0;
		    hr = 0;
		    ac = 0;
	     }
    		for(int i = 0; i < op.length; i++){
    		   System.out.println(op[i]); 
    		}
	}
}
