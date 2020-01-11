/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceltest;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author  纪晨秋
 * @date    2019-6-18 15:08:55
 * @version V1.0
 * @desc    
 */
public class JavaSwingTest {
    public static void main(String args[]){

    test1();

    }



    //设置JPanel

    public static void test1(){

    JFrame jFrame=new JFrame("Welcome to MichaelLee!");

//    JPanel panel=new JPanel();//如果不添加布局管理器，则默认为使用流布局管理器 

    JPanel panel=new JPanel(new GridLayout(3, 3));

    panel.add(new JLabel("标签-A"));

    panel.add(new JLabel("标签-B"));

    panel.add(new JLabel("标签-C"));

    panel.add(new JButton("按钮A"));

    panel.add(new JButton("按钮B"));

    panel.add(new JButton("按钮C"));

    jFrame.add(panel);

    jFrame.setSize(400,300);

    jFrame.setLocation(400,300);

    jFrame.setVisible(true);

    }
}
