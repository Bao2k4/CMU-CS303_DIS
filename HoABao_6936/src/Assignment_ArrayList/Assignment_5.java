/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_ArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author gamet
 */
public class Assignment_5 {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Random rd = new Random();

        for (int i = 0; i < 10; i++) {
            nums.add(rd.nextInt(100) + 1);
        }

        nums.remove(3);
        System.out.println(nums);
    }
}
