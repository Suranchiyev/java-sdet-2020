package day36;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZooDemo {
	public static void main(String[] args) {
		// Primate is parent class of Lemur
		Primate primate = new Lemur();
		primate.name = "Jack";
		primate.run();
		primate.eat();
		//primate.climb(); compile error
		
		//1. The methods and variables will be available from reference type
		//2. If actual object (child class) override methods from reference type (parent)
		//   method from actual object will be executed 
		
		// type casting
		Lemur lemur = (Lemur) primate;
		lemur.climb();
		
		Lemur lemur1 = new Lemur();
		// auto casting
		Primate primate1 = lemur1;
		
		Primate primate2 = new Primate();
		// Lemur lemur2 =  (Lemur)primate2; //Class Cast Exception parent class cannot go to child
		
		
		// Bird is interface
		// Eagle is class that implements Bird
		Bird eagle = new Eagle();
		eagle.fly();
		// eagle.hunt() will not work because methods will come
		// from reference type
		
		Eagle e2 = (Eagle) eagle;
		e2.hunt();
		
		
		// LinkedList can act as List and Queue as well because it does implement both interfaces	
		List<String> list = new LinkedList<>();
		list.add("apple");
		System.out.println(list.get(0));
		
		Queue<String> queue = new LinkedList<>();
		queue.add("apple");
		System.out.println(queue.poll());
	} 
}