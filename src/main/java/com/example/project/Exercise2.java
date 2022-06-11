package com.example.project;

import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Exercise2 obj = new Exercise2();
    Scanner sc = new Scanner(System.in);
    while (true) {
      String s = sc.nextLine();
      System.out.println(obj.existenDuplicados(s));
    }
  }

  public boolean existenDuplicados(String str) {
    MyStack<Character> stack = new LinkedListStack<>();
    for (int i = 0; i<str.length();i++){
      Character a = new Character('(');
      if(str.charAt(i)!= ')'){
	stack.push(str.charAt(i));
	System.out.println(stack);
      }
      else{
	int contador = 0;
	while (!(stack.top().equals(a))){
	  stack.pop();
	  contador++;
	}
	stack.pop();//quito el parentesis de aperturar
	contador++;
	System.out.println("contador "+ contador);
	System.out.println(stack);
	if(contador==1)return true;
      }
    }
    // Colocar codigo aqui
    return false;
  }
}
