package ru.rhyme.generator.gui;// Браузер на основе редактора JEditorPane

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class MainWindow extends JFrame
{
    public static void main(String[] args) {
        JFrame jfrm = new JFrame("Test"); // Создаем контейнер верхнего уровня
        jfrm.setLayout(new FlowLayout()); // Устанавливаем диспетчек компоновки
        jfrm.setSize(300, 300); // Задаем размер окна
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField jtf = new JTextField(10); // Создаем поле для ввода текста 10 символов в ширину
        jtf.setHorizontalAlignment(JTextField.CENTER); // ВОТ ОНО! Текст вводится посередине
        jfrm.add(jtf); // Добавляем в контейнер

        jfrm.setLocationRelativeTo(null); // Размещаем окно в центре экрана
        jfrm.setVisible(true); // Делаем его видимым
    }
}
