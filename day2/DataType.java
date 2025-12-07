public class DataType{
    public static void main(String[] args) {

int number = 1234567890;

String StringVariable = "Hello";

char charVariable = 'h';

short shortVariable = 12345;

long longVariable = 17345678900000000L;
byte byteVariable = (byte) 3444;

// floating point

float temperature = 36.667f;

double gravity = 9.80665;

// Integers


long worldPopulation = 8_000_000_000L; // Correct

// Boxes

int binary = 0b1010;

int octal = 012;

int hex = 0xA;

byte small = (byte) 127;
char grade = 'A';
boolean isValid = true;
String message = "literals demo";
System.out.println("Integer is " + number);
System.out.println("String is " + StringVariable);
System.out.println("Character is " + charVariable);
System.out.println("Short is " + shortVariable);
System.out.println("Long is " + longVariable);
System.out.println("Byte is " + byteVariable);
System.out.println("Float is " + temperature);
System.out.println("Double is " + gravity);
System.out.println("World Population is " + worldPopulation);
System.out.println("Binary is " + binary);
System.out.println("Octal is " + octal);
System.out.println("Hex is " + hex);
System.out.println("Small is " + small);
System.out.println("Grade is " + grade);
System.out.println("Is Valid is " + isValid);
System.out.println("Message is " + message);
    }
}