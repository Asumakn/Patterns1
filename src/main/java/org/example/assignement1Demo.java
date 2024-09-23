package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class assignement1Demo {

    public void runArrayPipeline(int[] array){
        Scanner lp  = new Scanner(System.in);

        System.out.println("1. Add an element at a specific index\n" +
                "2. Find all repeated elements\n" +
                "3. Find the size of the array\n" +
                "4. Display which element has repeatd the most number of times\n" +
                "5. Remove all appearances of a value\n" +
                "6. Sort the array\n" +
                "7. Display the array\n" +
                "0. Exit");
        int answer = lp.nextInt();
        switch (answer){
            case 1:{
                System.out.println("enter index");
                answer = lp.nextInt();
                System.out.println("please enter the value");
                int answer2 = lp.nextInt();
                int[] n = new int[array.length+1];
for (int i = 0;i<n.length;i++){
    if(i<answer){
        n[i]=array[i];
    } else if (i==answer) {
        n[i] = answer2;
    }else {
        n[i]=array[i+1];
    }
}
                break;
            }
            case 2:{
                int[] n = new int[array.length];
                int[] r = new int[array.length];
                int m=0;
                for (int i = 0;i<array.length;i++){
                    for (int j = 0;j<n.length;j++){
                        if(n[j]==array[i]){
                            r[m] = array[i];
                            m++;
                           for (int k = 0;k<array.length;k++) {
                               if(n[j]==array[k]) {
                                   array[k]=Integer.parseInt(null);
                               }
                             }
                           }


                        }


                    array[i] = n[i];
                    }
                array = n;
                for(int i = 0; i<array.length;i++){
                    System.out.print(array[i]+" ");

                }
                break;
            }
            case 3:{
                System.out.println(array.length+1);
                break;
            }
            case 4:{
                break;
            }
            case 5:{
                System.out.println("please enter the value");
                answer = lp.nextInt();
                int j =0;
                int[] n = new int[array.length];
                for (int i = 0;i<array.length;i++){
                    if(array[i]!=answer){
                        n[j] = array[i];
                                j++;
                    }
                }
                array = n;
                for(int i = 0; i<array.length;i++){
                    System.out.print(array[i]+" ");

                }
                break;
            }
            case 6:{
                ArrayList<Integer> array2 = new ArrayList<Integer>();
                for(int i = 0; i<array.length;i++){
                    array2.add(array[i]);

                }
                Collections.sort(array2);
                for(int i = 0; i<array.length;i++){
                    array[i] = array2.get(i);

                }
                for(int i = 0; i<array.length;i++){
                    System.out.print(array[i]+" ");

                }
                break;
            }
            case 7:{
                for (int i=0;i<array.length;i++){
                    System.out.print(array[i]+" ");
                }
                break;
            }
            case 0:{
                System.exit(0);
            break;
            }
        }
    }

    public void combine(int[] array1,int[] array2){
     int[] comb = new int[array1.length+array2.length];
     int counter=0;
     int m = 0;
     for (int i = 0;i<array1.length;i++){
         counter = 0;
        for (int j = 0 ; j<comb.length;j++){
            if(comb[j]==array1[i]){
                counter++;
            }
        }
        if(counter==0){
          comb[m] = array1[i];
          m++;
        }
     }
        for (int i = 0;i<array2.length;i++){
            counter = 0;
            for (int j = 0 ; j<comb.length;j++){
                if(comb[j]==array2[i]){
                    counter++;
                }
            }
            if(counter==0){
                comb[m] = array2[i];
                m++;
            }
        }

        for (int i=0;i<comb.length;i++){
            if(comb[i]!=0) {
                System.out.print(comb[i]+" ");
            }
            }


    }


public static class Bank implements Comparable {

    String id;
    static name name;
    static branch branch;
    int NoCustomers;
    int revenue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Bank.name getName() {
        return name;
    }

    public void setName(Bank.name name) {
        this.name = name;
    }

    public Bank.branch getBranch() {
        return branch;
    }

    public void setBranch(Bank.branch branch) {
        this.branch = branch;
    }

    public int getNoCustomers() {
        return NoCustomers;
    }

    public void setNoCustomers(int noCustomers) {
        if(noCustomers<=250 && noCustomers>=200){
       NoCustomers = noCustomers;
        }
       else {
        NoCustomers = 200;}
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        if(revenue<=500000&& revenue>=100000) {
       this.revenue = revenue;
        }
        else{
        this.revenue =100000;}
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    enum name {

        TD,
        RBC,
        CIBC
    }

    enum branch {
        CDG,
        StMichel,
        StLaurent

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(id, bank.id) && Objects.equals(name, bank.name) && Objects.equals(branch, bank.branch);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id='" + id + '\'' +
                ", name=" + name +
                ", branch=" + branch +
                ", NoCustomers=" + NoCustomers +
                ", revenue=" + revenue +
                '}';
    }

    public Bank(name name, branch branch) {
        this.name = name;
        this.branch = branch;
        switch (name) {
            case CIBC -> {
                id = "01";
            }
            case RBC -> {
                id = "02";
            }
            case TD -> {
                id = "03";
            }

        }
        switch (branch) {
            case CDG -> {
                id = id + "001";
            }
            case StMichel -> {
                id = id + "002";
            }
            case StLaurent -> {
                id = id + "003";
            }
        }
    }


    public int compareTo(Bank o) {
        if (id.substring(0, 1).compareTo(o.id.substring(0, 1)) != 0) {
            return id.substring(0, 1).compareTo(o.id.substring(0, 1));

        } else if (id.substring(2).compareTo(o.id.substring(2)) != 0) {
            return id.substring(2).compareTo(o.id.substring(2));
        } else {
            return 0;
        }
    }

    public int avgCutsomerRevenue() {

 return revenue/NoCustomers;
    }


public static class BankComparator{
        public int compare(Bank one,Bank two){
            if(one.revenue>two.revenue){
                return 1;
            }else if(one.revenue<two.revenue){
                return -1;
            }else{

                return 0;
            }


        }


}

}

    public static void main(String[] args) {
        assignement1Demo lp = new assignement1Demo();
        int[] array = new int[]{1,1,15,4};
        int[] array2 = new int[]{1,1,15,4};
        lp.combine(array,array2);

        Bank one  =new Bank(Bank.name.TD, Bank.branch.CDG);
        Bank two  =new Bank(Bank.name.TD, Bank.branch.StMichel);
        Bank three  =new Bank(Bank.name.TD, Bank.branch.StLaurent);
        Bank four  =new Bank(Bank.name.CIBC, Bank.branch.CDG);
        Bank five  =new Bank(Bank.name.CIBC, Bank.branch.StMichel);
        Bank six  =new Bank(Bank.name.CIBC, Bank.branch.StLaurent);
        Bank seven  =new Bank(Bank.name.RBC, Bank.branch.StMichel);
        Bank eight  =new Bank(Bank.name.RBC, Bank.branch.StLaurent);
        Bank nine  =new Bank(Bank.name.RBC, Bank.branch.CDG);
        ArrayList<Bank> mp= new ArrayList<>();
        mp.add(one);
        mp.add(two);
        mp.add(three);
        mp.add(four);
        mp.add(five);
        mp.add(six);
        mp.add(seven);
        mp.add(eight);
        mp.add(nine);


    }
}






