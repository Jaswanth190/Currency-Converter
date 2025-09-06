import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JFrame implements ActionListener {

    // Components
    JComboBox<String> fromCurrency, toCurrency;
    JTextField amountField;
    JButton convertButton, clearButton;
    JLabel resultLabel;

    // Currency rates (static for simplicity)
    double[][] rates = {
        {1, 0.013, 0.012},  // USD, EUR, GBP
        {76.0, 1, 0.92},    // INR, EUR, GBP
        {81.0, 1.09, 1}     // INR, EUR, GBP
    };

    String[] currencies = {"USD", "EUR", "GBP"};

    public CurrencyConverter() {
        setTitle("Currency Converter");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center the window

        // Layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);

        // Input amount
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Amount:"), gbc);
        amountField = new JTextField(10);
        gbc.gridx = 1;
        add(amountField, gbc);

        // From currency
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("From:"), gbc);
        fromCurrency = new JComboBox<>(currencies);
        gbc.gridx = 1;
        add(fromCurrency, gbc);

        // To currency
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("To:"), gbc);
        toCurrency = new JComboBox<>(currencies);
        gbc.gridx = 1;
        add(toCurrency, gbc);

        // Buttons
        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(convertButton, gbc);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        gbc.gridx = 1;
        add(clearButton, gbc);

        // Result
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        resultLabel = new JLabel("Result: ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(resultLabel, gbc);

        // Set visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {
            try {
                double amount = Double.parseDouble(amountField.getText());
                int fromIndex = fromCurrency.getSelectedIndex();
                int toIndex = toCurrency.getSelectedIndex();

                double convertedAmount = amount * rates[fromIndex][toIndex];
                resultLabel.setText("Result: " + String.format("%.2f", convertedAmount) + " " + currencies[toIndex]);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == clearButton) {
            amountField.setText("");
            resultLabel.setText("Result: ");
        }
    }

    public static void main(String[] args) {
        // Set look and feel for better UI
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new CurrencyConverter();
    }
}
