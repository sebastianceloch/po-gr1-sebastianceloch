package com.company;

import java.util.Stack;
import java.util.Scanner;

public class stackk {
    public static void main(String[] args)
    {

        Stack<Integer> stack = new Stack<>();
        Scanner in = new Scanner(System.in);
        int number=in.nextInt();
        System.out.println(number%10);
        while(number!=0)
        {
            stack.push(number%10);
            number=number/10;
        }
        for(int i=0;i<stack.size();i++)
            System.out.print(stack.pop());
        in.close();
    }

}