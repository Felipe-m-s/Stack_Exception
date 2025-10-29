public class Main {
    public static void main(String[] args) {
        Stack a = new Stack();

        try {
            a.push(10);
            a.push(20);
            a.push(30);
    
            while (!a.isEmpty()) {
                System.out.println(a.top());
                a.pop();
            }
            a.pop();
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }
}
