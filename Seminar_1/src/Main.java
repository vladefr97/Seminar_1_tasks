import java.awt.event.PaintEvent;
import java.util.Comparator;

import seminar1.collections.ArrayPriorityQueue;
import seminar1.collections.ArrayStack;
import seminar1.collections.CyclicArrayDeque;
import seminar1.collections.CyclicArrayQueue;
import seminar1.collections.LinkedDeque;
import seminar1.collections.TwoStackQueue;
import seminar1.iterators.IncreasingIterator;
import seminar1.iterators.MergingIncreasingIterator;
import seminar1.iterators.MergingPeekingIncreasingIterator;
import seminar1.iterators.PeekingIncreasingIterator;

/**
 * Created by Влад on 08.10.2017.
 */
public class Main {

    public static void main(String[]args){
        //----------------LinkedQueue
//        LinkedQueue<String> linkedQueue=new LinkedQueue<>();
//        linkedQueue.enqueue("Первый");
//        linkedQueue.enqueue("Второй");
//        linkedQueue.enqueue("Третий");
//
//        System.out.println(linkedQueue.size());
//
//        System.out.println(linkedQueue.dequeue()+" извелечен");
//        System.out.println(linkedQueue.size());


       /* -------------------LinkedStack--------------------
       LinkedStack<String>linkedStack=new LinkedStack<>();
        linkedStack.push("Первый");
        linkedStack.push("Второй");
        linkedStack.push("Третий");
        System.out.println(linkedStack.size());

        System.out.println(linkedStack.pop()+" извелечен");
        System.out.println(linkedStack.size());
        System.out.println(linkedStack);*/


        /*IncreasingIterator increasingIterator=new IncreasingIterator(5,100,2);
        IncreasingIterator increasingIterator1=new IncreasingIterator(10,500000,10);
        while (increasingIterator.next()<500000)
        {
            System.out.println(increasingIterator.next());
        }
*/

/* -----------------------TwoStackQueue--------------------------
        TwoStackQueue<String> twoStackQueue=new TwoStackQueue<>();

        twoStackQueue.enqueue("Первый");
        twoStackQueue.enqueue("Второй");
        twoStackQueue.enqueue("Третий");
        twoStackQueue.enqueue("Четвертый");
        twoStackQueue.enqueue("Пятый");

        System.out.println(twoStackQueue.dequeue());
        System.out.println(twoStackQueue.dequeue());

        System.out.println(twoStackQueue.dequeue());
        System.out.println(twoStackQueue.dequeue());
        System.out.println(twoStackQueue.dequeue());

        System.out.println(twoStackQueue.dequeue());*/






       /* -------------ArrayStack---------------------
       ArrayStack<String> arrayStack=new ArrayStack<>();

        arrayStack.push("Первый");
        arrayStack.push("Второй");
        arrayStack.push("Третий");
        arrayStack.push("Новый элемент 1");
        arrayStack.push("Новый элемент 2");
        arrayStack.push("Новый элемент 3");
        arrayStack.push("Новый элемент 4");
        arrayStack.push("Новый элемент 5");
        arrayStack.push("Новый элемент 6");
        arrayStack.push("Новый элемент 7");
        arrayStack.push("Новый элемент 8");
        arrayStack.push("Новый элемент 9");
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.size());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.size());
        System.out.println(arrayStack.isEmpty());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.size());
        System.out.println(arrayStack.isEmpty());
*/


       /* -----------CyclicArrayQueue----------------------
       CyclicArrayQueue<String> cyclicArrayQueue=new CyclicArrayQueue<>(5);
        cyclicArrayQueue.enqueue("Первый");
        cyclicArrayQueue.enqueue("Второй");
        cyclicArrayQueue.enqueue("Третий");
        cyclicArrayQueue.enqueue("Четвертый");
        cyclicArrayQueue.enqueue("Пятый");
        cyclicArrayQueue.enqueue("Шестой");
        cyclicArrayQueue.enqueue("Седьмой");
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        cyclicArrayQueue.enqueue("Восьмой");
        cyclicArrayQueue.enqueue("Девятый");
        cyclicArrayQueue.enqueue("Десятый");
        cyclicArrayQueue.enqueue("Одинадцатый");
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        cyclicArrayQueue.enqueue("Двенадцатый");
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        cyclicArrayQueue.enqueue("Тринадцатый");
        cyclicArrayQueue.enqueue("Четырнадцатый");
        cyclicArrayQueue.enqueue("Пятнадцатый");
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
       */


       /* -----------LinkedDeque---------------
        LinkedDeque<String> linkedDeque=new LinkedDeque<>();
        linkedDeque.pushFront("Раз");
        linkedDeque.pushFront("Два");
        linkedDeque.pushBack("Три");
        linkedDeque.popBack();
        linkedDeque.popFront();
        linkedDeque.popFront();
        linkedDeque.pushFront("Два");
        linkedDeque.pushBack("Три");*/



       /*-------CyclicArrayDeque--------
        CyclicArrayDeque<String> cyclicArrayDeque = new CyclicArrayDeque<>();
        cyclicArrayDeque.pushFront("Раз");
        cyclicArrayDeque.pushBack("Два");
        cyclicArrayDeque.pushBack("Три");
        cyclicArrayDeque.pushBack("Четыре");
        cyclicArrayDeque.pushBack("Пять");
        cyclicArrayDeque.pushBack("Шесть");
        cyclicArrayDeque.pushFront("Семь");
        cyclicArrayDeque.pushFront("Восемь");

        cyclicArrayDeque.popFront();
        cyclicArrayDeque.popBack();
        cyclicArrayDeque.popFront();
        cyclicArrayDeque.popBack();
        cyclicArrayDeque.popFront();
        cyclicArrayDeque.popBack();//----
        cyclicArrayDeque.popFront();
        cyclicArrayDeque.popBack();
        cyclicArrayDeque.popBack();
*/

       /* ArrayPriorityQueue<String> arrayPriorityQueue=new ArrayPriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 == null) {
                    return -1;
                }
                if (o2 == null) {
                    return 1;
                }
                if (o1.equals( o2 )) {
                    return 0;
                }
                return o1.compareTo(o2);
            }
            });*/


       /*ArrayPriorityQueue<Integer> arrayPriorityQueue=new ArrayPriorityQueue<>(new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return o1.compareTo(o2);
           }
       });

        arrayPriorityQueue.add(1);
        arrayPriorityQueue.add(2);
        arrayPriorityQueue.add(55);
        arrayPriorityQueue.add(-5);
        arrayPriorityQueue.add(0);
        arrayPriorityQueue.add(-4);
        arrayPriorityQueue.add(11);
        arrayPriorityQueue.add(2);
        arrayPriorityQueue.add(-32);
        System.out.println(arrayPriorityQueue.extractMin());
        System.out.println(arrayPriorityQueue.extractMin());
        System.out.println(arrayPriorityQueue.extractMin());
        System.out.println(arrayPriorityQueue.extractMin());
        System.out.println(arrayPriorityQueue.extractMin());
        System.out.println(arrayPriorityQueue.extractMin());
        System.out.println(arrayPriorityQueue.extractMin());
        System.out.println(arrayPriorityQueue.extractMin());
        System.out.println(arrayPriorityQueue.extractMin());
        System.out.println(arrayPriorityQueue.extractMin());
*/



      /*------------------------Merging Increasing Iterator-------------------------
      IncreasingIterator increasingIterator=new IncreasingIterator(5,10,15);

        IncreasingIterator increasingIterator2=new IncreasingIterator(0,10,4);


        MergingIncreasingIterator mergingIncreasingIterator=new MergingIncreasingIterator(increasingIterator,increasingIterator2);
        while (mergingIncreasingIterator.hasNext()) {
            System.out.print(mergingIncreasingIterator.next()+" ");
        }
*/


        /*PeekingIncreasingIterator peekingIncreasingIterator=new PeekingIncreasingIterator(5,10,5);

        PeekingIncreasingIterator peekingIncreasingIterator1=new PeekingIncreasingIterator(0,144,6);
        MergingPeekingIncreasingIterator mergingPeekingIncreasingIterator=new MergingPeekingIncreasingIterator(peekingIncreasingIterator,peekingIncreasingIterator1,new PeekingIncreasingIterator(14,200,11));

        while (mergingPeekingIncreasingIterator.hasNext())
        {
            System.out.println(mergingPeekingIncreasingIterator.next());
        }*/


    }

}
