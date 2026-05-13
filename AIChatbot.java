import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class AIChatbot extends JFrame implements ActionListener {

    JTextField inputField;
    JTextArea chatArea;
    JButton sendButton;

    AIChatbot() {

        setTitle("AI Chatbot");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        chatArea = new JTextArea(20, 45);
        chatArea.setEditable(false);

        inputField = new JTextField(30);

        sendButton = new JButton("Send");

        add(new JScrollPane(chatArea));
        add(inputField);
        add(sendButton);

        sendButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String input = inputField.getText().toLowerCase();

        chatArea.append("You: " + input + "\n");

        if (input.contains("hello") || input.contains("hi")) {

            chatArea.append("Bot: Hello!\n\n");
        }

        else if (input.contains("your name")) {

            chatArea.append(
                    "Bot: I am Java AI Chatbot.\n\n");
        }

        else if (input.contains("time")) {

            chatArea.append(
                    "Bot: Current time is "
                    + new Date() + "\n\n");
        }

        else if (input.contains("java")) {

            chatArea.append(
                    "Bot: Java is an object-oriented programming language.\n\n");
        }

        else if (input.contains("help")) {

            chatArea.append(
                    "Bot: Ask me about java, time or greetings.\n\n");
        }

        else if (input.contains("bye")) {

            chatArea.append("Bot: Goodbye!\n\n");
        }

        else {

            chatArea.append(
                    "Bot: Sorry, I don't understand.\n\n");
        }

        inputField.setText("");
    }

    public static void main(String[] args) {
        new AIChatbot();
    }
}
