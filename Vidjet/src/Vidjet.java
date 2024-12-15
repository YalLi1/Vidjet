import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Vidjet extends JFrame {

    private JLabel label;

    public Vidjet() {
        // Настройка фрейма
        setTitle("Vidjet");

        label = new JLabel("My first text", SwingConstants.CENTER);
        label.setForeground(Color.BLUE);

        // Создаем слайдер для изменения размера шрифта
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 5, 100, 20);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Обработчик событий слайдера
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int fontSize = slider.getValue();
                label.setFont(new Font(label.getFont().getName(), Font.PLAIN, fontSize));
            }
        });

        // Установка менеджера компоновки и добавление компонентов
        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
        add(slider, BorderLayout.SOUTH);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
