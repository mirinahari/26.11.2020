package com.company;

public class Main
{
    public static void main(String[] args)
    {
        // [type] [invented-name] = [value];
        // int x = 1;
        // [type] [invented-name];
        // int y;

        String name = "Itay";
        String user_name = "I";
        System.out.println(name);

        // create variable "first_name" and put inside it your first name
        // create variable "last_name" and put inside it your last name
        // print your full name in the SAME line! (hint: use print)
        // don't forget to add space between (3 prints) ...

        String first_name = "Danny";
        String last_name = "Shovenani";
        System.out.print(first_name);
        System.out.print(" ");
        System.out.println(last_name);
        String full_name_1 = "Danny" + " " + "Shovevani";
        String full_name_2 = first_name + " " + last_name;
        System.out.println(full_name_1);
        System.out.println(full_name_2);
        int x = 2 + 3; // 5
        String number = "5";
        // int number_y = number * 5; // ERROR
        int number_x = 5;


        String city = "Tel aviv";
        System.out.println("city: " + city);
    }
}
