import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private boolean changePlayer = true;


    private Main() {
        setTitle("Tic Tac Toe");
        setSize(316, 339);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();

        button1.setBounds(0, 0, 100, 100);
        button2.setBounds(100, 0, 100, 100);
        button3.setBounds(200, 0, 100, 100);
        button4.setBounds(0, 100, 100, 100);
        button5.setBounds(100, 100, 100, 100);
        button6.setBounds(200, 100, 100, 100);
        button7.setBounds(0, 200, 100, 100);
        button8.setBounds(100, 200, 100, 100);
        button9.setBounds(200, 200, 100, 100);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);


        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);

        button1.setBackground(Color.WHITE);
        button2.setBackground(Color.WHITE);
        button3.setBackground(Color.WHITE);
        button4.setBackground(Color.WHITE);
        button5.setBackground(Color.WHITE);
        button6.setBackground(Color.WHITE);
        button7.setBackground(Color.WHITE);
        button8.setBackground(Color.WHITE);
        button9.setBackground(Color.WHITE);

        button1.setFont(new Font("Arial", Font.BOLD, 70));
        button2.setFont(new Font("Arial", Font.BOLD, 70));
        button3.setFont(new Font("Arial", Font.BOLD, 70));
        button4.setFont(new Font("Arial", Font.BOLD, 70));
        button5.setFont(new Font("Arial", Font.BOLD, 70));
        button6.setFont(new Font("Arial", Font.BOLD, 70));
        button7.setFont(new Font("Arial", Font.BOLD, 70));
        button8.setFont(new Font("Arial", Font.BOLD, 70));
        button9.setFont(new Font("Arial", Font.BOLD, 70));

        button1.setFocusPainted(false);
        button2.setFocusPainted(false);
        button3.setFocusPainted(false);
        button4.setFocusPainted(false);
        button5.setFocusPainted(false);
        button6.setFocusPainted(false);
        button7.setFocusPainted(false);
        button8.setFocusPainted(false);
        button9.setFocusPainted(false);
    }

    private void restartGame() {

        int playAgain = JOptionPane.showConfirmDialog(null, "Wanna play again?", "You won!", JOptionPane.YES_NO_OPTION);

        if (playAgain == JOptionPane.NO_OPTION) {
            System.exit(0);
        } else {

            button1.setText("");
            button2.setText("");
            button3.setText("");
            button4.setText("");
            button5.setText("");
            button6.setText("");
            button7.setText("");
            button8.setText("");
            button9.setText("");

            button1.setForeground(Color.black);
            button2.setForeground(Color.black);
            button3.setForeground(Color.black);
            button4.setForeground(Color.black);
            button5.setForeground(Color.black);
            button6.setForeground(Color.black);
            button7.setForeground(Color.black);
            button8.setForeground(Color.black);
            button9.setForeground(Color.black);


        }
    }

    private void restartGameNoWinner() {

        int playAgain = JOptionPane.showConfirmDialog(null, "Wanna play again?", "Draw!", JOptionPane.YES_NO_OPTION);

        if (playAgain == JOptionPane.NO_OPTION) {
            System.exit(0);
        } else {

            button1.setText("");
            button2.setText("");
            button3.setText("");
            button4.setText("");
            button5.setText("");
            button6.setText("");
            button7.setText("");
            button8.setText("");
            button9.setText("");

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            if (changePlayer) {
                button1.setText("X");
                changePlayer = false;


                if (button1.getText().equals(button2.getText()) && button2.getText().equals(button3.getText())) {
                    button1.setForeground(Color.RED);
                    button2.setForeground(Color.RED);
                    button3.setForeground(Color.RED);
                }

                if (button1.getText().equals(button4.getText()) && button4.getText().equals(button7.getText())) {
                    button1.setForeground(Color.RED);
                    button4.setForeground(Color.RED);
                    button7.setForeground(Color.RED);
                }

                if (button1.getText().equals(button5.getText()) && button5.getText().equals(button9.getText())) {
                    button1.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button9.setForeground(Color.RED);
                }
            } else {
                button1.setText("O");
                changePlayer = true;
                if (button1.getText().equals(button2.getText()) && button2.getText().equals(button3.getText())) {
                    button1.setForeground(Color.RED);
                    button2.setForeground(Color.RED);
                    button3.setForeground(Color.RED);
                }

                if (button1.getText().equals(button4.getText()) && button4.getText().equals(button7.getText())) {
                    button1.setForeground(Color.RED);
                    button4.setForeground(Color.RED);
                    button7.setForeground(Color.RED);
                }

                if (button1.getText().equals(button5.getText()) && button5.getText().equals(button9.getText())) {
                    button1.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button9.setForeground(Color.RED);
                }
            }

        }
        if (e.getSource() == button2) {
            if (changePlayer) {
                button2.setText("X");
                changePlayer = false;

                if (button2.getText().equals(button5.getText()) && button5.getText().equals(button8.getText())) {
                    button2.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button8.setForeground(Color.RED);
                }

                if (button1.getText().equals(button2.getText()) && button2.getText().equals(button3.getText())) {
                    button1.setForeground(Color.RED);
                    button2.setForeground(Color.RED);
                    button3.setForeground(Color.RED);
                }

            } else {
                button2.setText("O");
                changePlayer = true;

                if (button2.getText().equals(button5.getText()) && button5.getText().equals(button8.getText())) {
                    button2.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button8.setForeground(Color.RED);
                }

                if (button1.getText().equals(button2.getText()) && button2.getText().equals(button3.getText())) {
                    button1.setForeground(Color.RED);
                    button2.setForeground(Color.RED);
                    button3.setForeground(Color.RED);
                }

            }
        }
        if (e.getSource() == button3) {
            if (changePlayer) {
                button3.setText("X");
                changePlayer = false;

                if (button3.getText().equals(button5.getText()) && button5.getText().equals(button7.getText())) {
                    button3.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button7.setForeground(Color.RED);
                }

                if (button1.getText().equals(button2.getText()) && button2.getText().equals(button3.getText())) {
                    button1.setForeground(Color.RED);
                    button2.setForeground(Color.RED);
                    button3.setForeground(Color.RED);
                }

                if (button3.getText().equals(button6.getText()) && button6.getText().equals(button9.getText())) {
                    button3.setForeground(Color.RED);
                    button6.setForeground(Color.RED);
                    button9.setForeground(Color.RED);
                }

            } else {
                button3.setText("O");
                changePlayer = true;

                if (button3.getText().equals(button5.getText()) && button5.getText().equals(button7.getText())) {
                    button3.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button7.setForeground(Color.RED);
                }

                if (button1.getText().equals(button2.getText()) && button2.getText().equals(button3.getText())) {
                    button1.setForeground(Color.RED);
                    button2.setForeground(Color.RED);
                    button3.setForeground(Color.RED);
                }
                if (button3.getText().equals(button6.getText()) && button6.getText().equals(button9.getText())) {
                    button3.setForeground(Color.RED);
                    button6.setForeground(Color.RED);
                    button9.setForeground(Color.RED);
                }
            }
        }
        if (e.getSource() == button4) {
            if (changePlayer) {
                button4.setText("X");
                changePlayer = false;

                if (button1.getText().equals(button4.getText()) && button4.getText().equals(button7.getText())) {
                    button1.setForeground(Color.RED);
                    button4.setForeground(Color.RED);
                    button7.setForeground(Color.RED);
                }
                if (button4.getText().equals(button5.getText()) && button5.getText().equals(button6.getText())) {
                    button4.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button6.setForeground(Color.RED);
                }


            } else {
                button4.setText("O");
                changePlayer = true;

                if (button1.getText().equals(button4.getText()) && button4.getText().equals(button7.getText())) {
                    button1.setForeground(Color.RED);
                    button4.setForeground(Color.RED);
                    button7.setForeground(Color.RED);
                }

                if (button4.getText().equals(button5.getText()) && button5.getText().equals(button6.getText())) {
                    button4.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button6.setForeground(Color.RED);
                }
            }
        }
        if (e.getSource() == button5) {
            if (changePlayer) {
                button5.setText("X");
                changePlayer = false;

                if (button4.getText().equals(button5.getText()) && button5.getText().equals(button6.getText())) {
                    button4.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button6.setForeground(Color.RED);
                }

                if (button2.getText().equals(button5.getText()) && button5.getText().equals(button8.getText())) {
                    button2.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button8.setForeground(Color.RED);
                }

                if (button3.getText().equals(button5.getText()) && button5.getText().equals(button7.getText())) {
                    button3.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button7.setForeground(Color.RED);
                }

            } else {
                button5.setText("O");
                changePlayer = true;

                if (button4.getText().equals(button5.getText()) && button5.getText().equals(button6.getText())) {
                    button4.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button6.setForeground(Color.RED);
                }

                if (button2.getText().equals(button5.getText()) && button5.getText().equals(button8.getText())) {
                    button2.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button8.setForeground(Color.RED);
                }

                if (button3.getText().equals(button5.getText()) && button5.getText().equals(button7.getText())) {
                    button3.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button7.setForeground(Color.RED);
                }
            }
        }
        if (e.getSource() == button6) {
            if (changePlayer) {
                button6.setText("X");
                changePlayer = false;

                if (button3.getText().equals(button6.getText()) && button6.getText().equals(button9.getText())) {
                    button3.setForeground(Color.RED);
                    button6.setForeground(Color.RED);
                    button9.setForeground(Color.RED);
                }

                if (button4.getText().equals(button5.getText()) && button5.getText().equals(button6.getText())) {
                    button4.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button6.setForeground(Color.RED);
                }

            } else {
                button6.setText("O");
                changePlayer = true;

                if (button3.getText().equals(button6.getText()) && button6.getText().equals(button9.getText())) {
                    button3.setForeground(Color.RED);
                    button6.setForeground(Color.RED);
                    button9.setForeground(Color.RED);
                }

                if (button4.getText().equals(button5.getText()) && button5.getText().equals(button6.getText())) {
                    button4.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button6.setForeground(Color.RED);
                }
            }
        }
        if (e.getSource() == button7) {
            if (changePlayer) {
                button7.setText("X");
                changePlayer = false;

                if (button7.getText().equals(button8.getText()) && button8.getText().equals(button9.getText())) {
                    button7.setForeground(Color.RED);
                    button8.setForeground(Color.RED);
                    button9.setForeground(Color.RED);
                }

                if (button7.getText().equals(button5.getText()) && button5.getText().equals(button3.getText())) {
                    button3.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button7.setForeground(Color.RED);
                }

                if (button1.getText().equals(button4.getText()) && button4.getText().equals(button7.getText())) {
                    button1.setForeground(Color.RED);
                    button4.setForeground(Color.RED);
                    button7.setForeground(Color.RED);
                }

            } else {
                button7.setText("O");
                changePlayer = true;

                if (button7.getText().equals(button8.getText()) && button8.getText().equals(button9.getText())) {
                    button7.setForeground(Color.RED);
                    button8.setForeground(Color.RED);
                    button9.setForeground(Color.RED);
                }

                if (button7.getText().equals(button5.getText()) && button5.getText().equals(button3.getText())) {
                    button3.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button7.setForeground(Color.RED);


                }

                if (button1.getText().equals(button4.getText()) && button4.getText().equals(button7.getText())) {
                    button1.setForeground(Color.RED);
                    button4.setForeground(Color.RED);
                    button7.setForeground(Color.RED);


                }
            }
        }
        if (e.getSource() == button8) {
            if (changePlayer) {
                button8.setText("X");
                changePlayer = false;

                if (button7.getText().equals(button8.getText()) && button8.getText().equals(button9.getText())) {
                    button4.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button6.setForeground(Color.RED);


                }

                if (button8.getText().equals(button5.getText()) && button5.getText().equals(button2.getText())) {
                    button2.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button8.setForeground(Color.RED);


                }

            } else {
                button8.setText("O");
                changePlayer = true;

                if (button7.getText().equals(button8.getText()) && button8.getText().equals(button9.getText())) {
                    button4.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button6.setForeground(Color.RED);


                }

                if (button8.getText().equals(button5.getText()) && button5.getText().equals(button2.getText())) {
                    button8.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button2.setForeground(Color.RED);


                }

            }
        }
        if (e.getSource() == button9) {
            if (changePlayer) {
                button9.setText("X");
                changePlayer = false;

                if (button7.getText().equals(button8.getText()) && button8.getText().equals(button9.getText())) {
                    button7.setForeground(Color.RED);
                    button8.setForeground(Color.RED);
                    button9.setForeground(Color.RED);


                }

                if (button9.getText().equals(button6.getText()) && button6.getText().equals(button3.getText())) {
                    button9.setForeground(Color.RED);
                    button6.setForeground(Color.RED);
                    button3.setForeground(Color.RED);


                }

                if (button9.getText().equals(button5.getText()) && button5.getText().equals(button1.getText())) {
                    button1.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button9.setForeground(Color.RED);


                }

            } else {
                button9.setText("O");
                changePlayer = true;

                if (button7.getText().equals(button8.getText()) && button8.getText().equals(button9.getText())) {
                    button7.setForeground(Color.RED);
                    button8.setForeground(Color.RED);
                    button9.setForeground(Color.RED);


                }

                if (button9.getText().equals(button6.getText()) && button6.getText().equals(button3.getText())) {

                    button9.setForeground(Color.RED);
                    button6.setForeground(Color.RED);
                    button3.setForeground(Color.RED);

                }

                if (button9.getText().equals(button5.getText()) && button5.getText().equals(button1.getText())) {
                    button1.setForeground(Color.RED);
                    button5.setForeground(Color.RED);
                    button9.setForeground(Color.RED);

                }
            }
        }


        if ((button1.getForeground() == Color.RED && button2.getForeground() == Color.RED && button3.getForeground() == Color.RED) || (button1.getForeground() == Color.RED && button4.getForeground() == Color.RED && button7.getForeground() == Color.RED) || (button1.getForeground() == Color.RED && button5.getForeground() == Color.RED && button9.getForeground() == Color.RED) || (button2.getForeground() == Color.RED && button5.getForeground() == Color.RED && button8.getForeground() == Color.RED) || (button3.getForeground() == Color.RED && button6.getForeground() == Color.RED && button9.getForeground() == Color.RED) || (button4.getForeground() == Color.RED && button5.getForeground() == Color.RED && button6.getForeground() == Color.RED) || (button7.getForeground() == Color.RED && button8.getForeground() == Color.RED && button9.getForeground() == Color.RED) || (button3.getForeground() == Color.RED && button5.getForeground() == Color.RED && button7.getForeground() == Color.RED)) {
            restartGame();
        } else if (!button1.getText().equals("") && !button2.getText().equals("") && !button3.getText().equals("") && !button4.getText().equals("") && !button5.getText().equals("") && !button6.getText().equals("") && !button7.getText().equals("") && !button8.getText().equals("") && !button9.getText().equals("")) {
            restartGameNoWinner();
        }


    }

    public static void main(String[] args) {
        Main aplikacja = new Main();
        aplikacja.setDefaultCloseOperation(EXIT_ON_CLOSE);
        aplikacja.setVisible(true);
    }

}
