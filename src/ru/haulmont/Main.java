package ru.haulmont;

import ru.haulmont.daoclasses.DataSource;
import ru.haulmont.daoclasses.DerbyDataSource;
import ru.haulmont.gui.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, InterruptedException {
        EventQueue.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                DataSource data = new DerbyDataSource();
                data.loadDatabase("jdbc:derby:studdb;", null, null);
                JFrame frame = new MainWindow(data);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
