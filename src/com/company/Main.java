package com.company;

public class Main {

    public static void main(String[] args) {
        //write your code here

        //второй пункт дополнительного задания
        generateRandomAge();
    }


    // первый пункт дополнительного задания
    public static int generateRandomAge(){
        int age = (int)(Math.random() * (41 - 1) + 1);
        if (age > 18){
            System.out.println(age + " Гулять можно!");
        } else {
            System.out.println(age + " Гулять нельзя!");
        }

            return age;
        }

}
