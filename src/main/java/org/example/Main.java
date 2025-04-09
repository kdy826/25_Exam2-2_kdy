package org.example;
import java.util.Scanner;

  public class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //스캐너 입력받음

    new App(sc).run(); //App클래스에게 스캐너 전달 & 새로운 App클래스 작동
    sc.close();
        }
    }
