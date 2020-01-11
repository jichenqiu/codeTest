/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceltest;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author  纪晨秋
 * @date    2019-5-30 11:01:14
 * @version V1.0
 * @desc    
 */
public class paintTest extends JFrame{
     //定义组件
    MyPanel mp=null;
    public static void main(String[] args) {
        paintTest th=new paintTest();
    }
    public paintTest (){
        //创建组件
        mp=new MyPanel();
        //加入组件
        this.add(mp);
        //设置窗体
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
//定义一个MyPanel(我自己的面板是用于绘图和显示绘图的区域)
class MyPanel extends JPanel{
    //重写(覆盖)JPanel的paint方法
    public void paint(Graphics g){//Graphics是绘图的重要类，可以把它理解成一只画笔
        //1、调用父类函数，完成初始化任务
        super.paint(g);//super.paint(g);这句话不能少
        System.out.println("Paint被调用");//用于测试绘图原理2paint调用
        //先画一个圆
        g.drawOval(10, 10, 30, 30);//drawOval方法是画圆
    }
}
