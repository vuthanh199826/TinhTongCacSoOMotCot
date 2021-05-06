package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ban muon mang co bao nhieu dong ???");
        int row = sc.nextInt();
        System.out.println("ban muon mang co bao nhieu cot???");
        int col = sc.nextInt();
        int [][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("nhap phan tu thu "+i+" "+j+" vao day");
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("ban muon tinh tong của cot bao nhieu");
        int num = sc.nextInt();
        int sum = 0;
        if(num<=col){
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if(j==num) {
                        sum += array[i][num];
                    }
                }
            }
            System.out.println("sum = " + sum);
        }else {
            System.out.println("khong co cot nay trong mang");
        }
    }
}


