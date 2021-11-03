package com.company;
import java.math.BigInteger;
public class Main {

    public static void main(String[] args) {
	int n = 10;

    BigInteger x = new BigInteger("1");
    BigInteger m = new BigInteger("2");
    for(int i=0;i<n*n;i++)
    {
        x = x.add(x.multiply(m));
    }
    System.out.println(x);


    }
}
