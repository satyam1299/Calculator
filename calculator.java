import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class calculator {
    private double num1, num2, result;
    private String operator = ""; // Initialize operator
    private String answer; // 'answer' stores String 2 decimal float pointing result

    public static void main(String[] args) {
        new calculator().run();
    }

    public void run() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application on window close

        /*
         * 1ST ROW includes TextField
         */
        JTextField textField = new JTextField();
        textField.setBounds(20, 20, 300, 80);
        frame.add(textField);
        textField.setFont(new java.awt.Font("Arial", Font.BOLD, 23));
        textField.setForeground(Color.white);
        textField.setBackground(Color.BLACK);

        /*
         * 2ND ROW includes Clear, BackSpace, Percentage and Division button
         */
        JButton clrBtn = new JButton("C");
        clrBtn.setBounds(20, 120, 60, 60);
        frame.add(clrBtn);
        clrBtn.setFont(new Font("Arial", Font.BOLD, 20));
        clrBtn.setBackground(Color.RED);
        clrBtn.setForeground(Color.WHITE);
        // ActionListener for Clear button
        clrBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText("");
            }
        });

        JButton backBtn = new JButton("\u232B");
        backBtn.setBounds(100, 120, 60, 60);
        frame.add(backBtn);
        backBtn.setFont(new Font("Arial", Font.BOLD, 20));
        backBtn.setBackground(Color.RED);
        backBtn.setForeground(Color.WHITE);
        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String backspace = null;
                if (textField.getText().length() > 0) {
                    StringBuilder str = new StringBuilder(textField.getText());
                    str.deleteCharAt(textField.getText().length() - 1);
                    backspace = str.toString();
                    textField.setText(backspace);
                }
            }
        });

        JButton percent = new JButton("%");
        percent.setBounds(180, 120, 60, 60);
        frame.add(percent);
        percent.setFont(new Font("Arial", Font.BOLD, 20));
        percent.setBackground(Color.RED);
        percent.setForeground(Color.WHITE);
        percent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                num1 = Double.parseDouble(textField.getText());
                textField.setText("");
                operator = "%";
            }
        });

        JButton divBtn = new JButton("/");
        divBtn.setBounds(260, 120, 60, 60);
        frame.add(divBtn);
        divBtn.setFont(new Font("Arial", Font.BOLD, 20));
        divBtn.setBackground(Color.RED);
        divBtn.setForeground(Color.WHITE);
        // ActionListener for division button
        divBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                num1 = Double.parseDouble(textField.getText());
                textField.setText("");
                operator = "/";
            }
        });

        /*
         * 3RD ROW includes Num 7, 8 , 9 and Addition button
         */
        JButton seven = new JButton("7");
        seven.setBounds(20, 190, 60, 60);
        frame.add(seven);
        seven.setFont(new Font("Arial", Font.BOLD, 20));
        // seven.setBackground(Color.RED);
        seven.setForeground(Color.DARK_GRAY);
        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String input7 = textField.getText() + seven.getText();
                textField.setText(input7);
            }
        });

        JButton eight = new JButton("8");
        eight.setBounds(100, 190, 60, 60);
        frame.add(eight);
        eight.setFont(new Font("Arial", Font.BOLD, 20));
        // eight.setBackground(Color.RED);
        eight.setForeground(Color.DARK_GRAY);
        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String input8 = textField.getText() + eight.getText();
                textField.setText(input8);
            }
        });

        JButton nine = new JButton("9");
        nine.setBounds(180, 190, 60, 60);
        frame.add(nine);
        nine.setFont(new Font("Arial", Font.BOLD, 20));
        // nine.setBackground(Color.RED);
        nine.setForeground(Color.DARK_GRAY);
        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String input9 = textField.getText() + nine.getText();
                textField.setText(input9);
            }
        });

        JButton mulBtn = new JButton("\u00D7");
        mulBtn.setBounds(260, 190, 60, 60);
        frame.add(mulBtn);
        mulBtn.setFont(new Font("Arial", Font.BOLD, 20));
        mulBtn.setBackground(Color.RED);
        mulBtn.setForeground(Color.WHITE);
        mulBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                num1 = Double.parseDouble(textField.getText());
                textField.setText("");
                operator = "*";
            }
        });

        /*
         * 4TH ROW includes Num 4, 5, 6 and Subtraction button
         */
        JButton four = new JButton("4");
        four.setBounds(20, 260, 60, 60);
        frame.add(four);
        four.setFont(new Font("Arial", Font.BOLD, 20));
        // four.setBackground(Color.RED);
        four.setForeground(Color.DARK_GRAY);
        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String input4 = textField.getText() + four.getText();
                textField.setText(input4);
            }
        });

        JButton five = new JButton("5");
        five.setBounds(100, 260, 60, 60);
        frame.add(five);
        five.setFont(new Font("Arial", Font.BOLD, 20));
        // five.setBackground(Color.RED);
        five.setForeground(Color.DARK_GRAY);
        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String input5 = textField.getText() + five.getText();
                textField.setText(input5);
            }
        });

        JButton six = new JButton("6");
        six.setBounds(180, 260, 60, 60);
        frame.add(six);
        six.setFont(new Font("Arial", Font.BOLD, 20));
        // six.setBackground(Color.RED);
        six.setForeground(Color.DARK_GRAY);
        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String input6 = textField.getText() + six.getText();
                textField.setText(input6);
            }
        });

        JButton subBtn = new JButton("-");
        subBtn.setBounds(260, 260, 60, 60);
        frame.add(subBtn);
        subBtn.setFont(new Font("Arial", Font.BOLD, 20));
        subBtn.setBackground(Color.RED);
        subBtn.setForeground(Color.WHITE);
        subBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                num1 = Double.parseDouble(textField.getText());
                textField.setText("");
                operator = "-";
            }
        });

        /*
         * 5TH ROW includes Num 1, 2, 3 and Addition button
         */
        JButton one = new JButton("1");
        one.setBounds(20, 330, 60, 60);
        frame.add(one);
        one.setFont(new Font("Arial", Font.BOLD, 20));
        // one.setBackground(Color.RED);
        one.setForeground(Color.DARK_GRAY);
        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String input1 = textField.getText() + one.getText();
                textField.setText(input1);
            }
        });

        JButton two = new JButton("2");
        two.setBounds(100, 330, 60, 60);
        frame.add(two);
        two.setFont(new Font("Arial", Font.BOLD, 20));
        // two.setBackground(Color.RED);
        two.setForeground(Color.DARK_GRAY);
        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String input2 = textField.getText() + two.getText();
                textField.setText(input2);
            }
        });

        JButton three = new JButton("3");
        three.setBounds(180, 330, 60, 60);
        frame.add(three);
        three.setFont(new Font("Arial", Font.BOLD, 20));
        // three.setBackground(Color.RED);
        three.setForeground(Color.DARK_GRAY);
        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String input3 = textField.getText() + three.getText();
                textField.setText(input3);
            }
        });

        JButton addBtn = new JButton("+");
        addBtn.setBounds(260, 330, 60, 60);
        frame.add(addBtn);
        addBtn.setFont(new Font("Arial", Font.BOLD, 20));
        addBtn.setBackground(Color.RED);
        addBtn.setForeground(Color.WHITE);
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                num1 = Double.parseDouble(textField.getText());
                textField.setText("");
                operator = "+";
            }
        });

        /*
         * 6TH ROW includes Num 0, 00 and decimal and EqualsTo button
         */
        JButton zero = new JButton("0");
        zero.setBounds(20, 400, 60, 60);
        frame.add(zero);
        zero.setFont(new Font("Arial", Font.BOLD, 20));
        // zero.setBackground(Color.RED);
        zero.setForeground(Color.DARK_GRAY);
        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String input0 = textField.getText() + zero.getText();
                textField.setText(input0);
            }
        });

        JButton twoZero = new JButton("00");
        twoZero.setBounds(100, 400, 60, 60);
        frame.add(twoZero);
        twoZero.setFont(new Font("Arial", Font.BOLD, 20));
        // twoZero.setBackground(Color.RED);
        twoZero.setForeground(Color.DARK_GRAY);
        twoZero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String input00 = textField.getText() + twoZero.getText();
                textField.setText(input00);
            }
        });

        JButton decBtn = new JButton(".");
        decBtn.setBounds(180, 400, 60, 60);
        frame.add(decBtn);
        decBtn.setFont(new Font("Arial", Font.BOLD, 20));
        // decBtn.setBackground(Color.RED);
        decBtn.setForeground(Color.DARK_GRAY);
        decBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String inputDec = textField.getText() + decBtn.getText();
                textField.setText(inputDec);
            }
        });

        JButton equalBtn = new JButton("=");
        equalBtn.setBounds(260, 400, 60, 60);
        frame.add(equalBtn);
        equalBtn.setFont(new Font("Arial", Font.BOLD, 20));
        equalBtn.setBackground(Color.RED);
        equalBtn.setForeground(Color.WHITE);
        equalBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                num2 = Double.parseDouble(textField.getText());
                if (operator == "+") {
                    result = num1 + num2;
                    answer = String.format("%.2f", result); // format a floating-point number (result) as a string with
                                                            // two decimal places
                    textField.setText(answer);
                } else if (operator == "-") {
                    result = num1 - num2;
                    answer = String.format("%.2f", result); // format a floating-point number (result) as a string with
                                                            // two decimal places
                    textField.setText(answer);
                } else if (operator == "*") {
                    result = num1 * num2;
                    answer = String.format("%.2f", result); // format a floating-point number (result) as a string with
                                                            // two decimal places
                    textField.setText(answer);
                } else if (operator == "/") {
                    result = num1 / num2;
                    answer = String.format("%.2f", result); // format a floating-point number (result) as a string with
                                                            // two decimal places
                    textField.setText(answer);
                } else if (operator == "%") {
                    result = num1 % num2;
                    answer = String.format("%.2f", result); // format a floating-point number (result) as a string with
                                                            // two decimal places
                    textField.setText(answer);
                }

            }
        });

        frame.setSize(340, 480); // Adjusted size for better layout
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
