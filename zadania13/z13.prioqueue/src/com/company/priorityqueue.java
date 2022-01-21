package com.company;

import java.util.PriorityQueue;
import java.util.*;

public class priorityqueue {
    public static void main(String[] args){

        PriorityQueue<List> pq = new
                PriorityQueue<List>(5, new ListComparator());

        List l1 = new List("zrobic platki", 3);
        pq.add(l1);
        List l2 = new List("zjesc platki",1);
        pq.add(l2);
        List l3 = new List("umyc sie",4);
        pq.add(l3);
        List l4 = new List("pojechać autem",1);
        pq.add(l4);
        nastepne(pq);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll().getTodo());
        }
    }
    public static void nastepne(PriorityQueue<List> pq)
    {
        pq.poll();
    }
}
class ListComparator implements Comparator<List>{
    public int compare(List l1, List l2) {
        if (l1.n < l2.n)
            return -1;
        else if (l1.n > l2.n)
            return 1;
        return 0;
    }
}

class List {
    public String todo;
    public int n;
    public List(String todo, int n) {

        this.todo = todo;
        this.n = n;
    }

    public String getTodo() {
        return todo;
    }
}