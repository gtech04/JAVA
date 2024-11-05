import javax.swing.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {
    private JTextField t1;
    private JButton[] numberButtons = new JButton[10];
    private JButton bAdd, bSub, bMul, bDiv, bEq, bClear;
    private Integer res = 0;
    private String operation;
    public Calculator() {
        setLayout(null);
        setSize(400, 400);
        t1 = new JTextField();
        t1.setBounds(50, 40, 230, 30);
        add(t1);
        int x = 50, y = 100;
        for (int i = 1; i <= 9; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setBounds(x, y, 50, 30);
            add(numberButtons[i]);
            numberButtons[i].addActionListener(this);
            
            x += 60;
            if (i % 3 == 0) {
                x = 50;
                y += 40;
            }
        }
        numberButtons[0] = new JButton("0");
        numberButtons[0].setBounds(50, y + 0, 50, 30);
        add(numberButtons[0]);
        numberButtons[0].addActionListener(this);
        bAdd = new JButton("+"); bAdd.setBounds(230, 100, 50, 30);
        bSub = new JButton("-"); bSub.setBounds(230, 140, 50, 30);
        bMul = new JButton("*"); bMul.setBounds(230, 180, 50, 30);
        bDiv = new JButton("/"); bDiv.setBounds(230, 220, 50, 30);
        bEq = new JButton("="); bEq.setBounds(170, y + 0, 50, 30);
        bClear = new JButton("C"); bClear.setBounds(110, y + 0, 50, 30);
        add(bAdd); add(bSub); add(bMul); add(bDiv);
        add(bEq); add(bClear);
        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);
        bEq.addActionListener(this);
        bClear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void doAction(String op) {
        if (operation == null) {
            operation = op;
            res = Integer.parseInt(t1.getText());
            t1.setText("");
        } else {
            int currentValue = Integer.parseInt(t1.getText());
            switch (operation) {
                case "+" -> res += currentValue;
                case "-" -> res -= currentValue;
                case "*" -> res *= currentValue;
                case "/" -> {
                    try {
                        if (currentValue == 0) throw new ArithmeticException("Divide by Zero");
                        res /= currentValue;
                    } catch (ArithmeticException e) {
                        t1.setText(e.getMessage());
                        res = 0;
                        operation = null;
                        return;
                    }
                }
            }
            if (op.equals("=")) {
                t1.setText(res.toString());
                res = 0;
                operation = null;
            } else {
                operation = op;
                t1.setText("");
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                t1.setText(t1.getText() + i);
                return;
            }
        }

        if (e.getSource() == bAdd) doAction("+");
        else if (e.getSource() == bSub) doAction("-");
        else if (e.getSource() == bMul) doAction("*");
        else if (e.getSource() == bDiv) doAction("/");
        else if (e.getSource() == bEq) doAction("=");
        else if (e.getSource() == bClear) { 
            t1.setText("");
            res = 0;
            operation = null;
        }
    }

    public static void main(String[] args) {
        new Calculator().setVisible(true);
    }
}
