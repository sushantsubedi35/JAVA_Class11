package day_4;

public class car {
  String model;
  int year;

  Car( String model , int year){
    this.model = model;
    this.year = year;
 }

void display(){
    System.out.println("Car model:" + model);
       System.out.println("year;"+ year);
}

public static void main(String[] args){
    Car myCar = new Car(" benz", 2025);

    myCar.display(); 
}
}