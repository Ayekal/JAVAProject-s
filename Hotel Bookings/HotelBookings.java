import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class HotelBookings extends JFrame {
    private JButton button1, button2, exit;

    public HotelBookings() {
        super("HotelBookings");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Image imageIcon = new ImageIcon("hotel.jpg").getImage();
        Image resizedImage = imageIcon.getScaledInstance(450, 300, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        JLabel imageLabel = new JLabel(resizedIcon);
        imageLabel.setBounds(5, 0, 450, 300);
        add(imageLabel);

        button1 = new JButton("Book a room");
        button1.setIcon(new ImageIcon("back.jpg"));
        button1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        button1.setHorizontalTextPosition(SwingConstants.CENTER);
        button1.setIconTextGap(-250);
        button1.setForeground(Color.blue);
        button1.setBackground(new Color(35, 161, 116));
        button1.setFocusPainted(false);
        button1.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        button1.setPreferredSize(new Dimension(150, 50));
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoomsWindow();
            }
        });

        button2 = new JButton("Details");
        button2.setIcon(new ImageIcon("back.jpg"));
        button2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        button2.setHorizontalTextPosition(SwingConstants.CENTER);
        button2.setIconTextGap(-250);
        button2.setForeground(Color.red);
        button2.setBackground(new Color(231, 76, 60));
        button2.setFocusPainted(false);
        button2.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        button2.setPreferredSize(new Dimension(150, 50));
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openDetailsWindow();
            }
        });

        exit = new JButton("EXIT");
        exit.setIcon(new ImageIcon("back.jpg"));
        exit.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        exit.setHorizontalTextPosition(SwingConstants.CENTER);
        exit.setIconTextGap(-250);
        exit.setForeground(Color.black);
        exit.setBackground(Color.white);
        exit.setFocusPainted(false);
        exit.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        exit.setPreferredSize(new Dimension(150, 50));
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JTextArea textArea = new JTextArea(5, 25);
        Font textFont = new Font("Helvetica Neue", Font.BOLD, 14);
        textArea.setFont(textFont);
        textArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setText("                        Welcome User!\n" +
                "   Click 'Book a Room' to reserve a room\n" +
                "                                    or\n " +
                "  Click 'Details' for rules and regulations\n");
        JScrollPane scrollPane = new JScrollPane(textArea);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(button1);
        panel.add(button2);
        panel.add(exit);
        panel.add(scrollPane);
        getContentPane().add(panel);

        setSize(477, 345);
        // setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoomsWindow() {
        JFrame rooms = new JFrame("Rooms");
        JPanel panel = new JPanel();

        Image imageIcon = new ImageIcon("front.jpg").getImage();
        Image resizedImage = imageIcon.getScaledInstance(500, 300, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        JLabel imageLabel = new JLabel(resizedIcon);
        imageLabel.setBounds(5, 0, 480, 275);

        rooms.add(imageLabel);

        // =======================================================================================================================
        JButton button3 = new JButton("Room 1");
        button3.setPreferredSize(new Dimension(90, 35));
        button3.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room1ButtonClicked = { false };

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom1Window();

                room1ButtonClicked[0] = true;

                button3.setEnabled(false);
                ;
                ;
                ;
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button3.setEnabled(true);
                }
            }
        });

        panel.add(button3);
        // =======================================================================================================================
        JButton button4 = new JButton("Room 2");
        button4.setPreferredSize(new Dimension(90, 35));
        button4.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room2ButtonClicked = { false };

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom2Window();
                room2ButtonClicked[0] = true;

                button4.setEnabled(false);
                ;
                ;
                ;

            }
        });
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button4.setEnabled(true);
                }
            }
        });
        panel.add(button4);
        // =======================================================================================================================
        JButton button5 = new JButton("Room 3");
        button5.setPreferredSize(new Dimension(90, 35));
        button5.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room3ButtonClicked = { false };

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom3Window();
                room3ButtonClicked[0] = true;

                button5.setEnabled(false);
                ;
                ;
                ;

            }
        });
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button5.setEnabled(true);
                }
            }
        });
        panel.add(button5);
        // =======================================================================================================================
        JButton button6 = new JButton("Room 4");
        button6.setPreferredSize(new Dimension(90, 35));
        button6.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room4ButtonClicked = { false };

        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom4Window();
                room4ButtonClicked[0] = true;

                button6.setEnabled(false);
                ;
                ;
                ;
                ;

            }
        });
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button6.setEnabled(true);
                }
            }
        });
        panel.add(button6);
        // =======================================================================================================================
        JButton button7 = new JButton("Room 5");
        button7.setPreferredSize(new Dimension(90, 35));
        button3.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room5ButtonClicked = { false };

        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom5Window();
                room5ButtonClicked[0] = true;

                button7.setEnabled(false);
                ;
                ;
                ;
                ;

            }
        });
        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button7.setEnabled(true);
                }
            }
        });
        panel.add(button7);
        // =======================================================================================================================
        JButton button8 = new JButton("Room 6");
        button8.setPreferredSize(new Dimension(90, 35));
        button3.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room6ButtonClicked = { false };

        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom6Window();
                room6ButtonClicked[0] = true;

                button8.setEnabled(false);
                ;
                ;
                ;
                ;

            }
        });
        button8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button8.setEnabled(true);
                }
            }
        });
        panel.add(button8);
        // =======================================================================================================================
        JButton button9 = new JButton("Room 7");
        button9.setPreferredSize(new Dimension(90, 35));
        button3.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room7ButtonClicked = { false };

        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom7Window();
                room7ButtonClicked[0] = true;

                button9.setEnabled(false);
                ;
                ;
                ;
                ;

            }
        });
        button9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button9.setEnabled(true);
                }
            }
        });
        panel.add(button9);
        // =======================================================================================================================
        JButton button10 = new JButton("Room 8");
        button10.setPreferredSize(new Dimension(90, 35));
        button3.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room8ButtonClicked = { false };

        button10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom8Window();
                room8ButtonClicked[0] = true;

                button10.setEnabled(false);
                ;
                ;
                ;
                ;

            }
        });
        button10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button10.setEnabled(true);
                }
            }
        });
        panel.add(button10);
        // =======================================================================================================================
        JButton button11 = new JButton("Room 9");
        button11.setPreferredSize(new Dimension(90, 35));
        button3.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room9ButtonClicked = { false };

        button11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom9Window();
                room9ButtonClicked[0] = true;

                button11.setEnabled(false);
                ;
                ;
                ;
                ;

            }
        });
        button11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button11.setEnabled(true);
                }
            }
        });
        panel.add(button11);
        // =======================================================================================================================
        JButton button12 = new JButton("Room 10");
        button12.setPreferredSize(new Dimension(90, 35));
        button3.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room10ButtonClicked = { false };

        button12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom10Window();
                room10ButtonClicked[0] = true;

                button12.setEnabled(false);
                ;
                ;
                ;
                ;

            }
        });
        button12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button12.setEnabled(true);
                }
            }
        });
        panel.add(button12);
        // =======================================================================================================================
        JButton button13 = new JButton("Room 11");
        button13.setPreferredSize(new Dimension(90, 35));
        button3.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room11ButtonClicked = { false };

        button13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom11Window();
                room11ButtonClicked[0] = true;

                button13.setEnabled(false);
                ;
                ;
                ;
                ;

            }
        });
        button13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button13.setEnabled(true);
                }
            }
        });
        panel.add(button13);
        // =======================================================================================================================
        JButton button14 = new JButton("Room 12");
        button14.setPreferredSize(new Dimension(90, 35));
        button3.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room12ButtonClicked = { false };

        button14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom12Window();
                room12ButtonClicked[0] = true;

                button14.setEnabled(false);
                ;
                ;
                ;
                ;

            }
        });
        button14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button14.setEnabled(true);
                }
            }
        });
        panel.add(button14);
        // =======================================================================================================================
        JButton button15 = new JButton("Room 13");
        button15.setPreferredSize(new Dimension(90, 35));
        button3.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room13ButtonClicked = { false };

        button15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom13Window();
                room13ButtonClicked[0] = true;

                button15.setEnabled(false);
                ;
                ;
                ;
                ;

            }
        });
        button15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button15.setEnabled(true);
                }
            }
        });
        panel.add(button15);
        // =======================================================================================================================
        JButton button16 = new JButton("Room 14");
        button16.setPreferredSize(new Dimension(90, 35));
        button3.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room14ButtonClicked = { false };

        button16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom14Window();
                room14ButtonClicked[0] = true;

                button16.setEnabled(false);
                ;
                ;
                ;
                ;

            }
        });
        button16.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button16.setEnabled(true);
                }
            }
        });
        panel.add(button16);
        // =======================================================================================================================
        JButton button17 = new JButton("Room 15");
        button17.setPreferredSize(new Dimension(90, 35));
        button3.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room15ButtonClicked = { false };

        button17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom15Window();
                room15ButtonClicked[0] = true;

                button17.setEnabled(false);
                ;
                ;
                ;
                ;

            }
        });
        button17.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button17.setEnabled(true);
                }
            }
        });
        panel.add(button17);
        // =======================================================================================================================
        JButton button18 = new JButton("Room 16");
        button18.setPreferredSize(new Dimension(90, 35));
        button3.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room16ButtonClicked = { false };

        button18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom16Window();
                room16ButtonClicked[0] = true;

                button18.setEnabled(false);
                ;
                ;
                ;
                ;

            }
        });
        button18.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button18.setEnabled(true);
                }
            }
        });
        panel.add(button18);
        // =======================================================================================================================
        JButton button19 = new JButton("Room 17");
        button19.setPreferredSize(new Dimension(90, 35));
        button19.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room17ButtonClicked = { false };

        button19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom17Window();
                room17ButtonClicked[0] = true;

                button19.setEnabled(false);
                ;
                ;
                ;
                ;

            }
        });
        button19.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button19.setEnabled(true);
                }
            }
        });
        panel.add(button19);
        // =======================================================================================================================
        JButton button20 = new JButton("Room 18");
        button20.setPreferredSize(new Dimension(90, 35));
        button20.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room18ButtonClicked = { false };

        button20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom18Window();
                room18ButtonClicked[0] = true;

                button20.setEnabled(false);
                ;
                ;
                ;
                ;

            }
        });
        button20.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button20.setEnabled(true);
                }
            }
        });
        panel.add(button20);
        // =======================================================================================================================
        JButton button21 = new JButton("Room 19");
        button21.setPreferredSize(new Dimension(90, 35));
        button21.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room19ButtonClicked = { false };

        button21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom19Window();
                room19ButtonClicked[0] = true;

                button21.setEnabled(false);
                ;
                ;
                ;
                ;

            }
        });
        button21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button21.setEnabled(true);
                }
            }
        });
        panel.add(button21);
        // =======================================================================================================================
        JButton button22 = new JButton("Room 20");
        button22.setPreferredSize(new Dimension(90, 35));
        button22.setBackground(new Color(0, 0, 0, 0.0f));

        final boolean[] room20ButtonClicked = { false };

        button22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRoom20Window();
                room20ButtonClicked[0] = true;

                button22.setEnabled(false);
                ;
                ;
                ;
                ;

            }
        });
        button22.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    button22.setEnabled(true);
                }
            }
        });
        panel.add(button22);

        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.setPreferredSize(new Dimension(90, 35));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rooms.dispose();
            }
        });

        panel.add(backButton);

        rooms.add(panel);
        rooms.setLocationRelativeTo(null);
        rooms.setResizable(false);
        rooms.setSize(505, 320);
        rooms.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom1Window() {
        JFrame room1 = new JFrame("Room 1");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 1 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text11 = new JTextField("Name: ", 20);
        JTextField text12 = new JTextField("Contact: ", 20);
        JTextField text13 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text11);
        innerPanel.add(text12);
        innerPanel.add(text13);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text11.getText();
                String contact = text12.getText();
                String address = text13.getText();

                try {
                    String filePath = "Room 1.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room1.dispose();
            }
        });

        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room1.add(panel);
        room1.setLocationRelativeTo(null);
        room1.setSize(300, 350);
        room1.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom2Window() {
        JFrame room2 = new JFrame("Room 2");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 2 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text21 = new JTextField("Name: ", 20);
        JTextField text22 = new JTextField("Contact: ", 20);
        JTextField text23 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text21);
        innerPanel.add(text22);
        innerPanel.add(text23);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text21.getText();
                String contact = text22.getText();
                String address = text23.getText();

                try {
                    String filePath = "Room 2.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room2.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room2.add(panel);
        room2.setLocationRelativeTo(null);
        room2.setSize(300, 350);
        room2.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom3Window() {
        JFrame room3 = new JFrame("Room 3");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 3 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text31 = new JTextField("Name: ", 20);
        JTextField text32 = new JTextField("Contact: ", 20);
        JTextField text33 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text31);
        innerPanel.add(text32);
        innerPanel.add(text33);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text31.getText();
                String contact = text32.getText();
                String address = text33.getText();

                try {
                    String filePath = "Room 3.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room3.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room3.add(panel);
        room3.setLocationRelativeTo(null);
        room3.setSize(300, 350);
        room3.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom4Window() {
        JFrame room4 = new JFrame("Room 4");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 4 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text41 = new JTextField("Name: ", 20);
        JTextField text42 = new JTextField("Contact: ", 20);
        JTextField text43 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text41);
        innerPanel.add(text42);
        innerPanel.add(text43);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text41.getText();
                String contact = text42.getText();
                String address = text43.getText();

                try {
                    String filePath = "Room 4.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room4.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room4.add(panel);
        room4.setLocationRelativeTo(null);
        room4.setSize(300, 350);
        room4.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom5Window() {
        JFrame room5 = new JFrame("Room 5");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 5 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text51 = new JTextField("Name: ", 20);
        JTextField text52 = new JTextField("Contact: ", 20);
        JTextField text53 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text51);
        innerPanel.add(text52);
        innerPanel.add(text53);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text51.getText();
                String contact = text52.getText();
                String address = text53.getText();

                try {
                    String filePath = "Room 5.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room5.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room5.add(panel);
        room5.setLocationRelativeTo(null);
        room5.setSize(300, 350);
        room5.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom6Window() {
        JFrame room6 = new JFrame("Room 6");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 6 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text61 = new JTextField("Name: ", 20);
        JTextField text62 = new JTextField("Contact: ", 20);
        JTextField text63 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text61);
        innerPanel.add(text62);
        innerPanel.add(text63);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text61.getText();
                String contact = text62.getText();
                String address = text63.getText();

                try {
                    String filePath = "Room 6.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room6.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room6.add(panel);
        room6.setLocationRelativeTo(null);
        room6.setSize(300, 350);
        room6.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom7Window() {
        JFrame room7 = new JFrame("Room 7");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 7 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text71 = new JTextField("Name: ", 20);
        JTextField text72 = new JTextField("Contact: ", 20);
        JTextField text73 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text71);
        innerPanel.add(text72);
        innerPanel.add(text73);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text71.getText();
                String contact = text72.getText();
                String address = text73.getText();

                try {
                    String filePath = "Room 7.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room7.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room7.add(panel);
        room7.setLocationRelativeTo(null);
        room7.setSize(300, 350);
        room7.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom8Window() {
        JFrame room8 = new JFrame("Room 8");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 8 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text81 = new JTextField("Name: ", 20);
        JTextField text82 = new JTextField("Contact: ", 20);
        JTextField text83 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text81);
        innerPanel.add(text82);
        innerPanel.add(text83);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text81.getText();
                String contact = text82.getText();
                String address = text83.getText();

                try {
                    String filePath = "Room 8.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room8.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room8.add(panel);
        room8.setLocationRelativeTo(null);
        room8.setSize(300, 350);
        room8.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom9Window() {
        JFrame room9 = new JFrame("Room 9");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 9 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text91 = new JTextField("Name: ", 20);
        JTextField text92 = new JTextField("Contact: ", 20);
        JTextField text93 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text91);
        innerPanel.add(text92);
        innerPanel.add(text93);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text91.getText();
                String contact = text92.getText();
                String address = text93.getText();

                try {
                    String filePath = "Room 9.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room9.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room9.add(panel);
        room9.setLocationRelativeTo(null);
        room9.setSize(300, 350);
        room9.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom10Window() {
        JFrame room10 = new JFrame("Room 10");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 10 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text101 = new JTextField("Name: ", 20);
        JTextField text102 = new JTextField("Contact: ", 20);
        JTextField text103 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text101);
        innerPanel.add(text102);
        innerPanel.add(text103);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text101.getText();
                String contact = text102.getText();
                String address = text103.getText();

                try {
                    String filePath = "Room 10.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room10.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room10.add(panel);
        room10.setLocationRelativeTo(null);
        room10.setSize(300, 350);
        room10.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom11Window() {
        JFrame room11 = new JFrame("Room 11");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 11 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text111 = new JTextField("Name: ", 20);
        JTextField text112 = new JTextField("Contact: ", 20);
        JTextField text113 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text111);
        innerPanel.add(text112);
        innerPanel.add(text113);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text111.getText();
                String contact = text112.getText();
                String address = text113.getText();

                try {
                    String filePath = "Room 11.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room11.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room11.add(panel);
        room11.setLocationRelativeTo(null);
        room11.setSize(300, 350);
        room11.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom12Window() {
        JFrame room12 = new JFrame("Room 12");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 12 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text121 = new JTextField("Name: ", 20);
        JTextField text122 = new JTextField("Contact: ", 20);
        JTextField text123 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text121);
        innerPanel.add(text122);
        innerPanel.add(text123);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text121.getText();
                String contact = text122.getText();
                String address = text123.getText();

                try {
                    String filePath = "Room 12.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room12.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room12.add(panel);
        room12.setLocationRelativeTo(null);
        room12.setSize(300, 350);
        room12.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom13Window() {
        JFrame room13 = new JFrame("Room 13");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 13 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text131 = new JTextField("Name: ", 20);
        JTextField text132 = new JTextField("Contact: ", 20);
        JTextField text133 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text131);
        innerPanel.add(text132);
        innerPanel.add(text133);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text131.getText();
                String contact = text132.getText();
                String address = text133.getText();

                try {
                    String filePath = "Room 13.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room13.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room13.add(panel);
        room13.setLocationRelativeTo(null);
        room13.setSize(300, 350);
        room13.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom14Window() {
        JFrame room14 = new JFrame("Room 14");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 14 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text141 = new JTextField("Name: ", 20);
        JTextField text142 = new JTextField("Contact: ", 20);
        JTextField text143 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text141);
        innerPanel.add(text142);
        innerPanel.add(text143);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text141.getText();
                String contact = text142.getText();
                String address = text143.getText();

                try {
                    String filePath = "Room 14.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room14.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room14.add(panel);
        room14.setLocationRelativeTo(null);
        room14.setSize(300, 350);
        room14.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom15Window() {
        JFrame room15 = new JFrame("Room 15");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 15 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text151 = new JTextField("Name: ", 20);
        JTextField text152 = new JTextField("Contact: ", 20);
        JTextField text153 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text151);
        innerPanel.add(text152);
        innerPanel.add(text153);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text151.getText();
                String contact = text152.getText();
                String address = text153.getText();

                try {
                    String filePath = "Room 15.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room15.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room15.add(panel);
        room15.setLocationRelativeTo(null);
        room15.setSize(300, 350);
        room15.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom16Window() {
        JFrame room16 = new JFrame("Room 16");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 16 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text161 = new JTextField("Name: ", 20);
        JTextField text162 = new JTextField("Contact: ", 20);
        JTextField text163 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text161);
        innerPanel.add(text162);
        innerPanel.add(text163);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text161.getText();
                String contact = text162.getText();
                String address = text163.getText();

                try {
                    String filePath = "Room 16.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room16.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room16.add(panel);
        room16.setLocationRelativeTo(null);
        room16.setSize(300, 350);
        room16.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom17Window() {
        JFrame room17 = new JFrame("Room 17");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 17 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text171 = new JTextField("Name: ", 20);
        JTextField text172 = new JTextField("Contact: ", 20);
        JTextField text173 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text171);
        innerPanel.add(text172);
        innerPanel.add(text173);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text171.getText();
                String contact = text172.getText();
                String address = text173.getText();

                try {
                    String filePath = "Room 17.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room17.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room17.add(panel);
        room17.setLocationRelativeTo(null);
        room17.setSize(300, 350);
        room17.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom18Window() {
        JFrame room18 = new JFrame("Room 18");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 18 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text181 = new JTextField("Name: ", 20);
        JTextField text182 = new JTextField("Contact: ", 20);
        JTextField text183 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text181);
        innerPanel.add(text182);
        innerPanel.add(text183);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text181.getText();
                String contact = text182.getText();
                String address = text183.getText();

                try {
                    String filePath = "Room 18.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room18.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room18.add(panel);
        room18.setLocationRelativeTo(null);
        room18.setSize(300, 350);
        room18.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom19Window() {
        JFrame room19 = new JFrame("Room 19");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 19 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text191 = new JTextField("Name: ", 20);
        JTextField text192 = new JTextField("Contact: ", 20);
        JTextField text193 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text191);
        innerPanel.add(text192);
        innerPanel.add(text193);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text191.getText();
                String contact = text192.getText();
                String address = text193.getText();

                try {
                    String filePath = "Room 19.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room19.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room19.add(panel);
        room19.setLocationRelativeTo(null);
        room19.setSize(300, 350);
        room19.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    private void openRoom20Window() {
        JFrame room20 = new JFrame("Room 20");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("                  Room 20 details");
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0, 1, 10, 2));

        JTextField text201 = new JTextField("Name: ", 20);
        JTextField text202 = new JTextField("Contact: ", 20);
        JTextField text203 = new JTextField("Address: ", 20);

        innerPanel.add(Box.createVerticalGlue());
        innerPanel.add(label);
        innerPanel.add(Box.createVerticalStrut(10));
        innerPanel.add(text201);
        innerPanel.add(text202);
        innerPanel.add(text203);
        innerPanel.add(Box.createVerticalGlue());

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = text201.getText();
                String contact = text202.getText();
                String address = text203.getText();

                try {
                    String filePath = "Room 20.txt";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact: " + contact);
                    writer.newLine();
                    writer.write("Address: " + address);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                room20.dispose();
            }
        });
        innerPanel.add(saveButton);
        innerPanel.add(backButton);

        panel.add(innerPanel);
        room20.add(panel);
        room20.setLocationRelativeTo(null);
        room20.setSize(300, 350);
        room20.setVisible(true);
    }

    // =======================================================================================================================
    // =======================================================================================================================
    // =======================================================================================================================
    private void openDetailsWindow() {
        JFrame details = new JFrame("Details");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Rules and Regulations:");
        Font labelFont = new Font("Helvetica Neue", Font.BOLD, 16);
        label.setFont(labelFont);
        panel.add(label);
        JTextArea textArea = new JTextArea(13, 30);
        Font textFont = new Font("Helvetica Neue", Font.BOLD, 14);
        textArea.setFont(textFont);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setText("                                      Policies:\n" +
                "1. This is a first come first serve booking. Each individual must book early to get a room\n" +
                "2. Please avoid loud noise that may disturb the neighbors\n" +
                "3. Strictly no inviting of guests to the dormitory or hotel\n" +
                "4. Enjoy your stay!\n\n" +
                "                                       Booking:\n" +
                "1. Individual will click on a designated room\n" +
                "2. Input name, contact, address\n" +
                "3. Click \"save\" then exit the window\n" +
                "4. Pay for your stay");
        JScrollPane scrollPane = new JScrollPane(textArea);
        JButton backButton = new JButton("BACK");
        backButton.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        backButton.setPreferredSize(new Dimension(75, 25));
        backButton.setLocation(10, 340);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                details.dispose();
            }
        });
        panel.add(scrollPane);
        panel.add(backButton);
        details.add(panel);
        details.setSize(420, 400);
        details.setLocationRelativeTo(null);
        details.setResizable(false);
        details.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new HotelBookings();
    }
}