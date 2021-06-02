package ru.stqa.pft.sandbox;

public class Point {

  public double a;
  public double b;

  public Point(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double distance(Point d) {
    return Math.sqrt(Math.pow((this.a - d.a),2) + Math.pow((this.b - d.b),2));

  }
}
