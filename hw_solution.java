package com.company;

public class Main
{
    public static void main(String[] args)
    {

        //Targil:
        //1. create an int variable which will have the value of:
        //785 * 231
        int tar1 = 785 * 231;
        System.out.println("1");
        System.out.println(tar1);

        // 2. create a float variable with the value of 4.3 * 7.8
        float targ2 = 4.3f * 7.8f;
        System.out.println("2");
        System.out.println(targ2);

        // 3. create char named "lettx" with 'x'
        char lettx = 'x';
        System.out.println("3");
        System.out.println(lettx);

        // 4. create char named "letty" with 'y'
        char letty = 'y';
        System.out.println("4");
        System.out.println(letty);

        // 5. create in one line short xs,ys,zs
        //short xs = 1, ys = 2, zs = 3;
        int xs = 1; // changed for etgar
        short ys = 2, zs = 3;
        System.out.println("5");
        System.out.println("xs:" + xs + " ys:" + ys + " zs:" + zs);


        // *etgar: then in the next line put in xs the sum of ys and zs
        xs = ys + zs;
        System.out.println("5 etgar");
        System.out.println(xs);

    }
}
