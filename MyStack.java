import java.util.LinkedList;

// 根據 Lab-8 PDF 建議，繼承 LinkedList 來實作
public class MyStack<T> extends LinkedList<T> {

    // 建構子
    public MyStack() {
        super();
    }

    // 將項目推入 Stack 頂端
    // LinkedList 的 push() 等同於 addFirst()
    @Override
    public void push(T item) {
        super.push(item);
    }

    // 取出並移除 Stack 頂端的項目
    // LinkedList 的 pop() 等同於 removeFirst()
    @Override
    public T pop() {
        return super.pop();
    }

    // 判斷 Stack 是否為空
    // 直接使用繼承自 LinkedList (Collection) 的 isEmpty()
    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    // 取得 Stack 大小
    // 直接使用繼承自 LinkedList 的 size()
    @Override
    public int size() {
        return super.size();
    }
}