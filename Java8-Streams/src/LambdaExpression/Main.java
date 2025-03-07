package LambdaExpression;

//interface MyInterface {
//    void show();
//}
//public class Main {
//    public static void main(String[] args) {
//        MyInterface obj = new MyInterface() {
//            @Override
//            public void show() {
//                System.out.println("Hello from Anonymous Class");
//            }
//        };
//        obj.show();
//    }
//}

interface MyInterface {
    void show();
}

public class Main {
    public static void main(String[] args) {
    	
        MyInterface obj = () -> System.out.println("Hello from Lambda");
        obj.show();
    }
}
