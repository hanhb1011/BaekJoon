import java.util.*;
public class Main{
	public static void main(String[] args){
		String s=new Scanner(System.in).next();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++) {
			int n=(int)s.charAt(i)-48;
			sb.append(n==0?"000":n==1?"001":n==2?"010":n==3?"011":n==4?"100":n==5?"101":n==6?"110":n==7?"111":"");
		}
		sb.replace(0, sb.charAt(0)=='0'?sb.charAt(1)=='0'?2:1:0, "");
		System.out.println(sb);
	}
}