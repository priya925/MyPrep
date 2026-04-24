package org.example;

public class Employee {


        private int id;

        private String name;

        public int getId(){
            return this.id;
        }

        public String getName(){
            return this.name;
        }

    public boolean equals(Employee obj1) {
        if(obj1 == null){
            return false;
        }
        return this.getId() == obj1.getId() && this.getName().equals(obj1.getName());
    }

}
