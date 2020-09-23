package ITC315;

import java.util.Scanner;

public class Calculator {
  
  public void main(String[] args) {
    
    do{
      Scanner input = new Scanner(System.in);
      System.out.println("0. END\n1. addition\n2. subtraction\n3. multiplication\n4. division\n\nEnter number of a function you want to do: ");
      int choice = input.nextInt();

      decision(choice);
    }
    while(choice != 0);
    
    
  }
  
  
  public void decision(int a) {
    switch(a) {
      case 1:
        addition();
        break;
      case 2:
        subtraction();
        break;
      case 3:
        multiplication();
        break;
      case 4:
        division();
        break;
      default:
        System.out.println("Invalid input");
    }
  }
  
  
  public double addition() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    double first = input.nextDouble();
    System.out.println("Enter the second number: ");
    double second = input.nextDouble();
    
    return first + second;
  }
  
  
  public double subtraction() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    double first = input.nextDouble();
    System.out.println("Enter the second number: ");
    double second = input.nextDouble();
    
    return first - second;
  }
  
  
  public double multiplication() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    double first = input.nextDouble();
    System.out.println("Enter the second number: ");
    double second = input.nextDouble();
    
    return first * second;
  }
  
  
  public double division() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    double first = input.nextDouble();
    System.out.println("Enter the second number: ");
    double second = input.nextDouble();
    
    return first / second;
  }
  
  
}

