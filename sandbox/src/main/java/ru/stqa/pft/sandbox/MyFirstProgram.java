package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world"); // здесь обращаемся к функции 'hello' и даем значение параметру 'somebody'
    hello("user");
    hello("Aleksei");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }

  public static void hello(String somebody) { // объявление внутри переменной нужно для того, чтобы была возможность менять параметр извне. void - функция не возвращает никакое значение

    System.out.println("Hello," + somebody + "!");
  }

}