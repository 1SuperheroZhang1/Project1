package com.at.guigu.java;

import java.util.Scanner;
/*Utility������:
  ����ͬ�Ĺ��ܷ�װ�ɷ��������ǿ���ֱ��ͨ�����÷���ʹ�����Ĺ��ܣ������迼�Ǿ���Ĺ���ʵ��ϸ�ڡ�
*/
public class Utility {
    private static Scanner scanner=new Scanner(System.in);
    /**
     * ���ڽ���˵���ѡ�񡣸÷�����ȡ���̣�����û�����'1'-'4'�е������ַ����򷽷����ء�����ֵΪ�û������ַ�
     * */
    public static char readMenuSelection()
    {
        char c;
        for(;;){
            String str=readKeyBoard(1);
            c=str.charAt(0);
            if(c!='1'&&c!='2'&&c!='3'&&c!='4'){
                System.out.printf("ѡ���������������:");
            }else{
                break;
            }
        }
        return c;
    }
    /**
     * ���������֧���������롣�÷������ڴӼ��̶�ȡһ����������λ���ȵ���������������Ϊ�����ķ���ֵ��
     * */
    public static int readNumber(){
        int n=0;
        for(;;) {
            String str = readKeyBoard(4);
            try {
                n = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.printf("���������������������:");
            }
            return n;
        }
    }
    /**
     * ���������֧��˵�������롣�÷����Ӽ��̶�ȡһ��������8λ���ȵ��ַ�������������Ϊ�����ķ���ֵ��
     * */
    public static String readString()
    {
        String str=readKeyBoard(8);
        return str;
    }
    /**
     * ����ȷ��ѡ������롣�÷����Ӽ��̶�ȡ'Y'��'N'����������Ϊ�����ķ���ֵ��
     * */
    public static char readConfirmSelection(){
        char c;
        for(;;){
            String str=readKeyBoard(1).toUpperCase();
            c=str.charAt(0);
            if(c=='Y'||c=='N'){
                break;
            }else{
                System.out.println("ѡ���������������:");
            }
        }
        return  c;
    }
    public static String readKeyBoard(int limit){
        String line="";

        while(scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("���볤��(������" + limit + ")��������������");
                continue;
            }
            break;
        }
        return line;
    }
}




