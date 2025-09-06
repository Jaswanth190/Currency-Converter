# Currency-Converter
Developed a desktop application in Java Swing for converting multiple predefined currencies (USD, EUR, GBP, INR). Features a user-friendly GUI with input fields, dropdowns, convert/clear buttons, and dynamic result display. Demonstrates skills in Java programming, Swing GUI design, event handling, and currency conversion logic.


# Features
Convert amounts between predefined currencies: USD, EUR, GBP, INR

Input validation to ensure numeric values

Clear button to reset inputs and results

Interactive GUI built with JFrame, JComboBox, JTextField, and JButton

Organized layout using GridBagLayout for professional design

## **Getting Started**

### **Prerequisites**

* Java JDK 8 or higher
* Any IDE (IntelliJ, Eclipse, NetBeans) or command line to run Java programs

### **Running the Application**

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/currency-converter.git
   ```
2. Open the project in your IDE or compile using terminal:

   ```bash
   javac CurrencyConverter.java
   java CurrencyConverter
   ```
3. The application window will open, allowing you to:

   * Enter an amount
   * Select the "From" and "To" currencies
   * Click **Convert** to see the converted amount
   * Click **Clear** to reset fields

---

## **Code Structure**

* `CurrencyConverter.java` – Main Java class containing the GUI and conversion logic
* Uses **GridBagLayout** for arranging components in a structured layout
* **Static currency rates** stored in a 2D array

---

## **Future Improvements**

* Add more currencies with updated exchange rates
* Integrate real-time currency conversion via APIs
* Add icons for currencies to enhance the GUI
* Apply custom styles and themes for a modern look

---

## **License**

This project is **open source** and available under the MIT License.
