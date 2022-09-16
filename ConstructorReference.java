interface Messageable{  
    String getMessage(String msg);  
}  

public class ConstructorReference {  
    public static void main(String[] args) {  
        Messageable hello = (msg) -> "Good Morning "  + msg;
        System.out.println(hello.getMessage("Hello Pk"));  
    }  
} 