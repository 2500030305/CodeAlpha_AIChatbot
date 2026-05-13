import java.util.*;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("        JAVA AI CHATBOT");
        System.out.println("================================");
        System.out.println("Type 'bye' to exit.\n");

        while (true) {

            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            // Exit
            if (input.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            }

            // Greetings
            else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello! Welcome to the chatbot.");
            }

            // Name
            else if (input.contains("your name")) {
                System.out.println("Bot: My name is Java AI Chatbot.");
            }

            // How are you
            else if (input.contains("how are you")) {
                System.out.println("Bot: I am doing great!");
            }

            // College
            else if (input.contains("college")) {
                System.out.println("Bot: I can help with basic college information.");
            }

            // Java
            else if (input.contains("java")) {
                System.out.println("Bot: Java is a powerful object-oriented programming language.");
            }

            // Internship
            else if (input.contains("internship")) {
                System.out.println("Bot: Internships help students gain practical experience.");
            }

            // Hotel rooms
            else if (input.contains("room")) {
                System.out.println("Bot: Available rooms are Standard, Deluxe and Suite.");
            }

            // Price
            else if (input.contains("price")) {
                System.out.println("Bot: Room prices start from 2000 rupees.");
            }

            // Booking
            else if (input.contains("book")) {
                System.out.println("Bot: You can book rooms through the hotel reservation system.");
            }

            // Food
            else if (input.contains("food")) {
                System.out.println("Bot: The hotel provides breakfast, lunch and dinner.");
            }

            // Time
            else if (input.contains("time")) {
                Date d = new Date();
                System.out.println("Bot: Current time is " + d);
            }

            // Thank you
            else if (input.contains("thank")) {
                System.out.println("Bot: You're welcome!");
            }

            // Help
            else if (input.contains("help")) {
                System.out.println("Bot: Try asking about rooms, booking, food, java, internship or price.");
            }

            // Default
            else {
                System.out.println("Bot: Sorry, I don't understand that.");
            }
        }

        sc.close();
    }
}