package test3;

import java.util.StringTokenizer;

public class StringTonkenizerEx {
	public static void main(String[] args) {
		//String str="�б�,��,�п�#���ӹ�$������,����";
		//StringTokenizer token=new StringTokenizer(str,",#$");
		
		String str="�б�		��	�п�		���ӹ�	������	����";
		StringTokenizer token=new StringTokenizer(str,"\t");
		
		System.out.println("�Ľ̵� ���ڿ��� ��:" + token.countTokens()+"��");
		while(token.hasMoreTokens())
		{
			System.out.println(token.nextToken());
		}
	}
}
