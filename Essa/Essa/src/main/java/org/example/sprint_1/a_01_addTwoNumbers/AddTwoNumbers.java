package org.example.sprint_1.a_01_addTwoNumbers;

public class AddTwoNumbers {

        public int add(int a, int b){
            while (b != 0){
                int carry = (a & b);

                a = a ^ b;

                b = carry << 1;
            }
            return a;
        }
}
