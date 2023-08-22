package org.example;

public class Main {
    public static void main(String[] args) {
        Person[] meet = new Person[] {
                new Person("tim", 0),
                new Person("jim", 2),
                new Person("randy", 0),
                new Person("sandy", 7),
                new Person("andy", 0),
                new Person("katie", 5),
                new Person("laura", 1),
                new Person("saajid", 2),
                new Person("alex", 3),
                new Person("john", 2),
                new Person("mr", 0)
        };
        System.out.println(outed(meet, "laura"));
    }

    public static String outed(Person[] meet, String boss) {
        int sum = 0;
        for(int i = 0; i < meet.length;i++) {
            if(meet[i].name.equals(boss)) {
                sum+= (2 * meet[i].happiness);
            }else {
                sum+= meet[i].happiness;
            }
        }
        double total = (double) sum / meet.length;
        if(total > 5) {
            return "Nice Work Champ!";
        }else {
            return  "Get Out Now!";
        }
    }

    static class Person {
        final String name;    // team memnber's name
        final int happiness;  // happiness rating out of 10

        Person(String name, int happiness) {
            this.name = name;
            this.happiness = happiness;
        }
    }
}