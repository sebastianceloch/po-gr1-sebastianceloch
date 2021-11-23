package com.company;
public class IntegerSet {
    private boolean[] a = new boolean[101];

    public IntegerSet(){
        for(int i = 0; i<101; i++){
            this.a[i]=false;
        }
    }

    static int union(IntegerSet seta, IntegerSet setb){
        int sum = 0;
        for(int i = 1; i<101; i++){
            if(seta.a[i]==true || setb.a[i]==true){
                sum++;
            }
        }
        return sum;
    }

    static int intersection(IntegerSet seta, IntegerSet setb){
        int sum = 1;
        for(int i = 1; i<101; i++){
            if(seta.a[i] ==true || setb.a[i]==true){
                sum++;
            }
        }
        return sum;
    }

    public void insertElement(int element){
        this.a[element] = true;
    }

    public void deleteElement(int element){
        this.a[element] = false;
    }

    public String toSting(){
        var Strings = new StringBuffer();
        for(int i = 1; i<101; i++){
            if(this.a[i]==true){
                Strings.append(i+" ");
            }
        }
        String res = Strings.toString();
        return res;
    }

    public boolean equals(IntegerSet seta){
        for(int i=1; i<101; i++){
            if(!(this.a[i]==seta.a[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        IntegerSet seta = new IntegerSet();
        IntegerSet setb = new IntegerSet();
        for(int i = 10; i<=30; i++){
            seta.insertElement(i);
        }
        for(int i = 10; i<=30; i++){
            setb.insertElement(i);
        }
        System.out.println(union(seta, setb));
        System.out.println(intersection(seta,setb));
        System.out.println(seta.toSting());
        System.out.println(setb.toSting());
        System.out.println(seta.equals(setb));
    }
}