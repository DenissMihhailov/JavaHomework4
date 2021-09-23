/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomework4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author krasa
 */
public class JavaHomework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*ПРОГРАММА-ТЕСТ ДЛЯ ПРОВЕРКИ ЗНАНИЯ ТАБЛИЦЫ УНОЖЕНИЯ*");
        System.out.println("------------------------------------------------------");
        int max=1, min=10, attempt=0;
        Random random = new Random();
        for(int i=0;i<5;i++){
            int testNum1 = random.nextInt(max - min + 1)+min;
            int testNum2 = random.nextInt(max - min + 1)+min;
            int example=testNum1*testNum2;
            System.out.printf("%d*%d=",testNum1,testNum2);
            int answer= scanner.nextInt();
            if(answer==example){
                System.out.println("*ПРАВИЛЬНО*");
                attempt++;
                continue;
            }else{
                System.out.println("*ОШИБКА*");
                continue;
            }
               
                
            
        }
    }
    
}
