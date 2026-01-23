/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author gamet
 */
public class Assignment_4 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Paris");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Hanoi");
        cities.add("Seoul");

        if (cities.contains("London")) {
            System.out.println("Có London trong danh sách");
        } else {
            System.out.println("Không có London");
        }
    }
}
