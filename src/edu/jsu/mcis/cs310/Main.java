package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        StringBuilder sb = new StringBuilder();
        String reversed_message;
        sb.append(message);
        sb.reverse();
        reversed_message=sb.toString();
        return reversed_message;
    }
    
}