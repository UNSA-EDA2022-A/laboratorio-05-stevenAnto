//package com.example.project;

import java.util.Scanner;

public class Exercise1 {

  public static void main(String[] args) {
    Exercise1 obj = new Exercise1();
    Scanner sc = new Scanner(System.in);
    while (true) {
      String s = sc.nextLine();
      System.out.println(obj.esBalanceado(s));
    }
  }

  public boolean esBalanceado(String s) {
    MyStack<Character> stack = new LinkedListStack<Character>();
    for (int i= 0; i< s.length(); i++){
      //System.out.println("este es el top "+stack.top());
      //System.out.println("el char a ser evaluado "+s.charAt(i));
      Character a = new Character('(');
      Character b = new Character('[');
      Character c = new Character('{');
      //System.out.println(a.equals(null));
      /*System.out.println("primera "+a.equals(stack.top()));
      System.out.println("primera "+b.equals(stack.top()));
      System.out.println("primera "+c.equals(stack.top()));
      System.out.println("segunda "+(s.charAt(i)==')'));
      System.out.println("segunda "+(s.charAt(i)==']'));
      System.out.println("segunda "+(s.charAt(i)=='}'));*/
      
      if(a.equals(stack.top())&&(s.charAt(i)==')')) stack.pop();
      else if(b.equals(stack.top())&&(s.charAt(i)==']')) stack.pop();
      else if(c.equals(stack.top())&&(s.charAt(i)=='}')) stack.pop();
      else {
	stack.push(s.charAt(i));
      }
    }
    System.out.println(stack);

    return stack.isEmpty();
  }
}
