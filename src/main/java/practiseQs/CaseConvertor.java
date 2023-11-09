package practiseQs;

import java.util.Scanner;

public class CaseConvertor {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        String emp="";

        for(int i=0;i<ch.length;i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                String s = String.valueOf(ch[i]).toUpperCase();
                emp = emp + s;
            } else {
                emp = emp + " ";
                String a = String.valueOf(ch[i]).toLowerCase();
                emp = emp + a;
            }
        }

        String[] sol=emp.split(" ");
        for(String ans:sol){
            System.out.println(ans);
        }
    }
}
