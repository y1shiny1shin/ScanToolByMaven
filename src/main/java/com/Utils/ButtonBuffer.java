package com.Utils;

import com.GuiMain;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;

public class ButtonBuffer extends GuiMain {
    public JButton getButton(String content ,String className ,String methodName){
        JButton button = new JButton(content);
        button.setPreferredSize(new Dimension(150 ,30));

        button.addActionListener(e -> reflectExec(className ,methodName));
        return button;

    }

    private void reflectExec(String className ,String methodName){
        try {
            Class<?> clazz = Class.forName(className);
            Object instance = clazz.getConstructor().newInstance();
            clazz.getMethod(methodName).invoke(instance);

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(super.frame , e.toString());
        } catch (NoSuchMethodException e) {
            JOptionPane.showMessageDialog(super.frame , e.toString());
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            JOptionPane.showMessageDialog(super.frame , e.toString());
        }
    }
}
