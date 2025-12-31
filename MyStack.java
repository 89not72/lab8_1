import java.util.LinkedList;

// 這是主要的 Stack 類別，必須是 public
public class MyStack<T> extends LinkedList<T> {

    public MyStack() {
        super();
    }

    @Override
    public void push(T item) {
        super.push(item);
    }

    @Override
    public T pop() {
        return super.pop();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public int size() {
        return super.size();
    }
}

// --- Person 類別寫在這裡 (MyStack 的大括號之外) ---
// 注意：這裡不能加 public，因為一個檔案只能有一個 public class
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
