package generics;

class Shape { /* ... */ }
class Circle extends Shape { /* ... */ }
class Rectangle extends Shape { /* ... */ }

public class Node<T> {

	public static void main(String[] args) {
		Node<? extends Shape> nc = new Node<Circle>();
		Node<Shape>  ns = nc;

	}

}
