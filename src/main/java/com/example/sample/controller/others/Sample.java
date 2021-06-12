package com.example.sample.controller.others;

import com.example.sample.model.Address;
import com.example.sample.model.Employee;
import com.example.sample.model.PinCode;
import com.example.sample.model.PrimaryAddress;

import java.time.LocalDate;
import java.util.*;

//[6,8,9,10,5,12,20,40]
//        square each element …check squared value is greater than 100 and then average using java8
// spring cloud bus
public class Sample {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Address address = new Address();
        PrimaryAddress primaryAddress = new PrimaryAddress();

        List<PinCode> pinCodes = List.of(new PinCode(560098), new PinCode(560001));
        primaryAddress.setPinCodes(pinCodes);

        List<PrimaryAddress> primaryAddresses = List.of(primaryAddress);
        address.setPrimaryAddresses(primaryAddresses);

        List<Address> addressList = List.of(address);
        employee.setId(123456);
        employee.setName("Suhas");
        employee.setSalary(10000);
        employee.setAddressList(addressList);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);

        System.out.println("Employee List: "+employeeList);
//        JSONPObject jsonpObject
        Optional<PinCode> pinCode = employeeList.stream()
                .flatMap(employee1 -> employee1.getAddressList().stream())
                .flatMap(address1 -> address1.getPrimaryAddresses().stream())
                .flatMap(primaryAddress1 -> primaryAddress1.getPinCodes().stream())
//                .forEach(System.out::println);
                .findFirst();

        System.out.println(pinCode.isPresent() ? pinCode.get().getPinCode() : null);

        calculate(0, 2, 10);

        LocalDate localDate = LocalDate.of(2021, 5, 30);
        System.out.println(localDate.getDayOfWeek().toString());

//        String A="java";
//        String B="java";
//        /* Enter your code here. Print output to STDOUT. */
//        System.out.println(A.length()+B.length());
//        Set<String> set = new TreeSet();
//        set.add(A);
//        set.add(B);
//
//
//        System.out.println(set.iterator().next().equals(A) ? "No" : "Yes");
//        char[] Aarray = A.toCharArray();
//        char[] Barray = B.toCharArray();
//        String[] strings = {A,B};
//        for(String str : strings) {
//            char[] newAarr = str.toCharArray();
//            for(int i=0; i<newAarr.length; i++) {
//                if(i!=0){
//                    newAarr[i] = newAarr[i];
//                } else {
//                    newAarr[i] = Character.toUpperCase(newAarr[i]);
//                }
//            }
//            System.out.print(new String(newAarr)+" ");
//        }

//        subStrComp();

        isAnagram("anagramm", "marganaa");
    }



    private static void calculate(int a, int b, int size) {
        if(size>0){
            int sum = a+1*b;
            System.out.print(sum+" ");
            int count = 0;
            for(int i=2; count<size-1; i=i*2) {
                sum = sum+i*b;
                System.out.print(sum+" ");
                count++;
            }
        }
    }

    private static void subStrComp() {
        String s = "welcometojava";

        TreeSet set = new TreeSet();
        for (int i=0; i<s.length()-2; i++) {
            set.add(s.substring(i, 3+i));
        }
        System.out.println(set.first());
        set.stream().sorted(Comparator.reverseOrder());
        System.out.println(set.last());

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        System.out.println(sb.toString().equals(s) ? "Yes" : "No");

    }

    private static boolean isAnagram(String a, String b) {
        if(a.length() == b.length()) {
            char[] aCh = a.toLowerCase().toCharArray();
            char[] bCh = b.toLowerCase().toCharArray();

            Arrays.sort(aCh);
            Arrays.sort(bCh);

            return Arrays.equals(aCh, bCh);
        }

        return false;
    }

    private static void addSum() {
        for(int i=1; i<6;i++) {

            int first = i;
            int second = i+1;
            int sum = first+second;
            System.out.println(first+" + "+second+" = "+sum);
        }
    }
    //to find number of occurrences of string passed
    //ex: input: occurrences, output: o1c3u1r2e2n1s1
    private static void noOfOccurrences(String str) {
        char[] input = Objects.nonNull(str) ? str.toCharArray() : "".toCharArray();
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
        if(Objects.nonNull(input)) {
            for (int i=0; i<input.length; i++){
                if(lhm.containsKey(input[i])) {
                    lhm.put(input[i], lhm.get(input[i])+1);
                } else {
                    lhm.put(input[i], 1);
                }
            }
//            System.out.println(lhm);
            Set<Map.Entry<Character, Integer>> set = lhm.entrySet();
            for(Map.Entry<Character, Integer> entry : set) {
                System.out.print(entry.getKey()+""+entry.getValue());
            }
        }
    }

    private static int noOfSwaps(int[] input) {
        int count = 0;

        int[] in = input;
        Arrays.sort(in);

        if (!Arrays.equals(in, input)) {
            for (int i = 1; i <= in.length; i++) {

                if (in[i - 1] > in[i]) {

                    int temp = in[i - 1];
                    in[i - 1] = in[i];
                    in[i] = temp;
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(in));
        System.out.println("no of swaps to sort the array: "+count);
        return count;
    }
}
