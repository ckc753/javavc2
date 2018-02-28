package test3;

import java.util.StringTokenizer;

public class StringTonkenizerEx {
	public static void main(String[] args) {
		//String str="학교,집,학원#게임방$도서관,술집";
		//StringTokenizer token=new StringTokenizer(str,",#$");
		
		String str="학교		집	학원		게임방	도서관	술집";
		StringTokenizer token=new StringTokenizer(str,"\t");
		
		System.out.println("파싱된 문자열의 수:" + token.countTokens()+"개");
		while(token.hasMoreTokens())
		{
			System.out.println(token.nextToken());
		}
	}
}
