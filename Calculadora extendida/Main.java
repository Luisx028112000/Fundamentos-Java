import javax.swing.*;
import java.awt.*;

/**
 * Aplicación de Calculadora Extendida y Conversor de Temperatura.
 * Contiene todos los módulos integrados en una misma interfaz gráfica.
 * 
 * @author Luis Ernesto Vargas
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame ventana = new JFrame("Calculadora Extendida & Conversor de Temperatura");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setLayout(new GridBagLayout());
            ventana.setResizable(false);

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.insets = new Insets(8, 12, 8, 12);
            gbc.gridx = 0;

            // Integración de los 3 paneles en la misma ventana
            gbc.gridy = 0;
            ventana.add(new Calculadora(), gbc);

            gbc.gridy = 1;
            ventana.add(new ConversorTemperatura(), gbc);

            gbc.gridy = 2;
            ventana.add(new Raizcuadrada_Exponente(), gbc);

            ventana.pack();
            ventana.setLocationRelativeTo(null); // Centrar en pantalla
            ventana.setVisible(true);
        });
    }

    // =========================================================================
    // 1. MÓDULO DE OPERACIONES BÁSICAS (+, -, *, /)
    // =========================================================================
    static class Calculadora extends JPanel {
        private JTextField txtNum1;
        private JTextField txtNum2;
        private JLabel lblResultado;

        public Calculadora() {
            setBorder(BorderFactory.createTitledBorder("1. Operaciones Aritméticas Básicas"));
            setLayout(new GridLayout(5, 2, 6, 6));

            add(new JLabel("Número 1:"));
            txtNum1 = new JTextField();
            add(txtNum1);

            add(new JLabel("Número 2:"));
            txtNum2 = new JTextField();
            add(txtNum2);

            JButton btnSuma = new JButton("Sumar (+)");
            JButton btnResta = new JButton("Restar (-)");
            JButton btnMulti = new JButton("Multiplicar (×)");
            JButton btnDiv = new JButton("Dividir (÷)");

            add(btnSuma);
            add(btnResta);
            add(btnMulti);
            add(btnDiv);

            add(new JLabel("Resultado:"));
            lblResultado = new JLabel("---");
            lblResultado.setFont(new Font("SansSerif", Font.BOLD, 13));
            add(lblResultado);

            btnSuma.addActionListener(e -> ejecutar('+'));
            btnResta.addActionListener(e -> ejecutar('-'));
            btnMulti.addActionListener(e -> ejecutar('*'));
            btnDiv.addActionListener(e -> ejecutar('/'));
        }

        private void ejecutar(char op) {
            try {
                double n1 = Double.parseDouble(txtNum1.getText().trim());
                double n2 = Double.parseDouble(txtNum2.getText().trim());
                double res = 0;

                if (op == '+') {
                    res = n1 + n2;
                } else if (op == '-') {
                    res = n1 - n2;
                } else if (op == '*') {
                    res = n1 * n2;
                } else if (op == '/') {
                    // Validación explícita de división entre cero mediante evaluación con IF
                    if (n2 == 0) {
                        JOptionPane.showMessageDialog(this,
                                "Error: No es posible dividir entre cero.",
                                "Error de División",
                                JOptionPane.ERROR_MESSAGE);
                        lblResultado.setText("Error: Div / 0");
                        return;
                    }
                    res = n1 / n2;
                }

                lblResultado.setText(String.format("%.2f", res));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Por favor, ingrese números válidos en la sección aritmética.",
                        "Entrada Inválida",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    // =========================================================================
    // 2. MÓDULO DE CONVERSIÓN DE TEMPERATURA (°F ↔ °C)
    // =========================================================================
    static class ConversorTemperatura extends JPanel {
        private JTextField txtTemp;
        private JLabel lblResultado;

        public ConversorTemperatura() {
            setBorder(BorderFactory.createTitledBorder("2. Conversor de Temperatura"));
            setLayout(new GridLayout(4, 2, 6, 6));

            add(new JLabel("Temperatura:"));
            txtTemp = new JTextField();
            add(txtTemp);

            JButton btnFtoC = new JButton("°F ➔ °C");
            JButton btnCtoF = new JButton("°C ➔ °F");

            add(btnFtoC);
            add(btnCtoF);

            add(new JLabel("Resultado:"));
            lblResultado = new JLabel("---");
            lblResultado.setFont(new Font("SansSerif", Font.BOLD, 13));
            add(lblResultado);

            btnFtoC.addActionListener(e -> convertir(true));
            btnCtoF.addActionListener(e -> convertir(false));
        }

        private void convertir(boolean esFtoC) {
            try {
                double val = Double.parseDouble(txtTemp.getText().trim());
                double res;

                if (esFtoC) {
                    // Formula: °C = (°F − 32) × 5/9
                    res = (val - 32.0) * (5.0 / 9.0);
                    lblResultado.setText(String.format("%.2f °C", res));
                } else {
                    // Formula: °F = (°C × 9/5) + 32
                    res = (val * (9.0 / 5.0)) + 32.0;
                    lblResultado.setText(String.format("%.2f °F", res));
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Ingrese un número válido para realizar la conversión.",
                        "Entrada Inválida",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    // =========================================================================
    // 3. MÓDULO DE RAÍZ CUADRADA Y EXPONENTE
    // =========================================================================
    static class Raizcuadrada_Exponente extends JPanel {
        private JTextField txtBase;
        private JTextField txtExp;
        private JLabel lblResultado;

        public Raizcuadrada_Exponente() {
            setBorder(BorderFactory.createTitledBorder("3. Raíz Cuadrada y Exponente"));
            setLayout(new GridLayout(5, 2, 6, 6));

            add(new JLabel("Número Base / Valor:"));
            txtBase = new JTextField();
            add(txtBase);

            add(new JLabel("Exponente (para Potencia):"));
            txtExp = new JTextField();
            add(txtExp);

            JButton btnRaiz = new JButton("√x (Raíz)");
            JButton btnPow = new JButton("x^y (Potencia)");

            add(btnRaiz);
            add(btnPow);

            add(new JLabel("Resultado:"));
            lblResultado = new JLabel("---");
            lblResultado.setFont(new Font("SansSerif", Font.BOLD, 13));
            add(lblResultado);

            btnRaiz.addActionListener(e -> calcularRaiz());
            btnPow.addActionListener(e -> calcularPotencia());
        }

        private void calcularRaiz() {
            try {
                double base = Double.parseDouble(txtBase.getText().trim());

                if (base < 0) {
                    JOptionPane.showMessageDialog(this,
                            "Error: No existe raíz cuadrada real para números negativos.",
                            "Error Matemático",
                            JOptionPane.ERROR_MESSAGE);
                    lblResultado.setText("Error: Raíz < 0");
                    return;
                }

                lblResultado.setText(String.format("%.4f", Math.sqrt(base)));

            } catch (NumberFormatException ex) {
                mostrarError();
            }
        }

        private void calcularPotencia() {
            try {
                double base = Double.parseDouble(txtBase.getText().trim());
                double exp = Double.parseDouble(txtExp.getText().trim());

                lblResultado.setText(String.format("%.4f", Math.pow(base, exp)));

            } catch (NumberFormatException ex) {
                mostrarError();
            }
        }

        private void mostrarError() {
            JOptionPane.showMessageDialog(this,
                    "Ingrese valores numéricos válidos en los campos requeridos.",
                    "Entrada Inválida",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
}