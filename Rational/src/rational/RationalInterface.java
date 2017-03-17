
package rational;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class RationalInterface {

       public static void main(String[] args) {
              JFrame frame = new JFrame("FRACTIONS"); // The main window
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This tells the
              frame.getContentPane().setBackground(Color.GREEN);                                                                                              // program to
                                                                                                              // exit when the
                                                                                                              // frame is
                                                                                                              // closed
              frame.setBounds(0, 0, 400, 400); // First two numbers set position,
                                                                            // second two set size

              Rational one = new Rational(1,2);
              Rational two = new Rational(1,3);

              JPanel north = new JPanel(); // JPanels allow me to place the buttons
              north.setBackground(Color.GREEN);                                                                                              // program to
              
              
              JLabel numLabel1 = new JLabel("Numerator1: ");
              JLabel denLabel1 = new JLabel("Denominator1: ");
              JLabel numLabel2 = new JLabel("Numerator2: ");
              JLabel denLabel2 = new JLabel("Denominator2: ");
              final int FIELD_WIDTH = 5;
              final JTextField numField1 = new JTextField(FIELD_WIDTH);
              numField1.setText("1");
              final JTextField denField1 = new JTextField(FIELD_WIDTH);
              denField1.setText("2");
              final JTextField numField2 = new JTextField(FIELD_WIDTH);
              numField2.setText("1");
              final JTextField denField2 = new JTextField(FIELD_WIDTH);
              denField2.setText("3");

              // The button to trigger the calculation
              int num1 = Integer.parseInt(numField1.getText());
              int den1 = Integer.parseInt(denField1.getText());
              int num2 = Integer.parseInt(numField2.getText());
              int den2 = Integer.parseInt(denField2.getText());
              JLabel ratio1 = new JLabel("" + new Rational(num1, den1));
              JLabel ratio2 = new JLabel("" + new Rational(num2, den2));
              JLabel add = new JLabel("");
              JLabel subtract = new JLabel("");
              JLabel multiply = new JLabel("");
              JLabel divide = new JLabel("");

              JButton reduceButton1 = new JButton(" Reduce x");
              reduceButton1.setBackground(Color.YELLOW);     
              JButton reduceButton2 = new JButton(" Reduce y");
              reduceButton2.setBackground(Color.YELLOW);
              JButton addbutton = new JButton(" Add");
              addbutton.setBackground(Color.YELLOW);
              JButton subtractbutton = new JButton(" Subtract");
              subtractbutton.setBackground(Color.YELLOW);
              JButton multiplybutton = new JButton(" Multiply");
              multiplybutton.setBackground(Color.YELLOW);
              JButton dividebutton = new JButton(" Divide");
              dividebutton.setBackground(Color.YELLOW);

              // The panel that holds the input components
              north.setLayout(new GridLayout(6, 2));

              north.add(numLabel1);
              north.add(numField1);
              north.add(denLabel1);
              north.add(denField1);
              north.add(numLabel2);
              north.add(numField2);
              north.add(denLabel2);
              north.add(denField2);
              north.add(reduceButton1);
              north.add(ratio1);
              north.add(reduceButton2);
              north.add(ratio2);
              north.add(addbutton);
              north.add(add);
              north.add(subtractbutton);
              north.add(subtract);
              north.add(multiplybutton);
              north.add(multiply);
              north.add(dividebutton);
              north.add(divide);
              

              frame.getContentPane().add(north, BorderLayout.NORTH);

              frame.getContentPane().add(BorderLayout.NORTH, north); // BorderLayout
                                                                                                              // allows me to
                                                                                                              // attach the
                                                                                                              // JPanel to the
                                                                                                              // border of the
                                                                                                              // frame

              frame.setVisible(true); // Makes the frame visible

              // This makes the button work. all of the code is the parameter of the
              // method
              reduceButton1.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent evt) {
                           int num1 = Integer.parseInt(numField1.getText());
                           int den1 = Integer.parseInt(denField1.getText());

                           one.setNumerator(num1);
                           one.setDenominator(den1);
                           ratio1.setText("" + one.reduced());
                     }
              });

              
              reduceButton2.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent evt) {
                        int num2 = Integer.parseInt(numField2.getText());
                        int den2 = Integer.parseInt(denField2.getText());

                        two.setNumerator(num2);
                        two.setDenominator(den2);
                        ratio2.setText("" + two.reduced());
                  }
           });
              
              
              addbutton.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent evt) {
                	  	int num1 = Integer.parseInt(numField1.getText());
                	  	int den1 = Integer.parseInt(denField1.getText());
                        int num2 = Integer.parseInt(numField2.getText());
                        int den2 = Integer.parseInt(denField2.getText());
                        
                        one.setNumerator(num1);
                        one.setDenominator(den1);
                        two.setNumerator(num2);
                        two.setDenominator(den2);
                        add.setText("" + (one.add(two)));
                  }
           });
              
              subtractbutton.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent evt) {
                	  	int num1 = Integer.parseInt(numField1.getText());
                	  	int den1 = Integer.parseInt(denField1.getText());
                        int num2 = Integer.parseInt(numField2.getText());
                        int den2 = Integer.parseInt(denField2.getText());
                        
                        one.setNumerator(num1);
                        one.setDenominator(den1);
                        two.setNumerator(num2);
                        two.setDenominator(den2);
                        subtract.setText("" + (one.subtract(two)));
                  }
           });
              
              
              multiplybutton.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent evt) {
                	  	int num1 = Integer.parseInt(numField1.getText());
                	  	int den1 = Integer.parseInt(denField1.getText());
                        int num2 = Integer.parseInt(numField2.getText());
                        int den2 = Integer.parseInt(denField2.getText());
                        
                        one.setNumerator(num1);
                        one.setDenominator(den1);
                        two.setNumerator(num2);
                        two.setDenominator(den2);
                        multiply.setText("" + (one.multiply(two)));
                  }
           });
              
              
              dividebutton.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent evt) {
                	  	int num1 = Integer.parseInt(numField1.getText());
                	  	int den1 = Integer.parseInt(denField1.getText());
                        int num2 = Integer.parseInt(numField2.getText());
                        int den2 = Integer.parseInt(denField2.getText());
                        
                        one.setNumerator(num1);
                        one.setDenominator(den1);
                        two.setNumerator(num2);
                        two.setDenominator(den2);
                        divide.setText("" + (one.divide(two)));
                  }
           });
              
              reduceButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            	    public void mouseEntered(java.awt.event.MouseEvent evt) {
            	        reduceButton1.setBackground(Color.ORANGE);
            	    }
            	    public void mouseExited(java.awt.event.MouseEvent evt) {
            	        reduceButton1.setBackground(Color.YELLOW);
            	    }
            	});
              
              reduceButton2.addMouseListener(new java.awt.event.MouseAdapter() {
          	    public void mouseEntered(java.awt.event.MouseEvent evt) {
          	        reduceButton2.setBackground(Color.ORANGE);
          	    }
          	    public void mouseExited(java.awt.event.MouseEvent evt) {
          	        reduceButton2.setBackground(Color.YELLOW);
          	    }
          	});
              
              
              addbutton.addMouseListener(new java.awt.event.MouseAdapter() {
          	    public void mouseEntered(java.awt.event.MouseEvent evt) {
          	    	addbutton.setBackground(Color.ORANGE);
          	    }
          	    public void mouseExited(java.awt.event.MouseEvent evt) {
          	    	addbutton.setBackground(Color.YELLOW);
          	    }
          	});
              
              subtractbutton.addMouseListener(new java.awt.event.MouseAdapter() {
          	    public void mouseEntered(java.awt.event.MouseEvent evt) {
          	    	subtractbutton.setBackground(Color.ORANGE);
          	    }
          	    public void mouseExited(java.awt.event.MouseEvent evt) {
          	    	subtractbutton.setBackground(Color.YELLOW);
          	    }
          	});
              
              multiplybutton.addMouseListener(new java.awt.event.MouseAdapter() {
          	    public void mouseEntered(java.awt.event.MouseEvent evt) {
          	    	multiplybutton.setBackground(Color.ORANGE);
          	    }
          	    public void mouseExited(java.awt.event.MouseEvent evt) {
          	    	multiplybutton.setBackground(Color.YELLOW);
          	    }
          	});
              
              
              dividebutton.addMouseListener(new java.awt.event.MouseAdapter() {
          	    public void mouseEntered(java.awt.event.MouseEvent evt) {
          	    	dividebutton.setBackground(Color.ORANGE);
          	    }
          	    public void mouseExited(java.awt.event.MouseEvent evt) {
          	    	dividebutton.setBackground(Color.YELLOW);
          	    }
          	});
              
              
              
              
       }
}


