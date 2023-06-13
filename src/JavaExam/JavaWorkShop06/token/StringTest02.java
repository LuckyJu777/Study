package token;

import java.util.StringTokenizer;

public class StringTest2 {
    public static void main(String[] args) {
        String str= "I am second to none";
        StringTokenizer stoken = new StringTokenizer(str," ");

        int wordCount = 0;
        while (stoken.hasMoreElements()!=false) {
            wordCount++;
            System.out.println(stoken.nextToken());
        }
        System.out.println("단어개수 : "+wordCount);

        //문자개수
        char[] s = str.toCharArray();
        int charCount = 0;

        for(int i=0; i<s.length; i++) {	//for문
            if(s[i] == ' ') {
                continue;
            }//공백이 있을 시 밑의 코드를 진행하지 않고 계속 if실행

            System.out.println(s[i]+" ");
            charCount++;
        }

        System.out.println("문자개수 : " + charCount);
    }
}