package com.day2;
import java.util.*;
public class Sample {

        public static void main(String args[]){

            ArrayList al=new ArrayList();
            al.add("Sai");
            al.add("Prakash");
            Iterator itr=al.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
}



