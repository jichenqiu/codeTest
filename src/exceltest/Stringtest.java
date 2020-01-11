/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceltest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author  纪晨秋
 * @date    2019-3-29 14:57:50
 * @version V1.0
 * @desc    
 */
public class Stringtest {
    static String b1="00D00";
    static String b2="01J03";
    static String b3="123G90213";
    static String bg;
    
    static String time="2019/4/6 20:35:00";
    static SimpleDateFormat df=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
    static String execu_test[]={"张1","张2","张3","张4","张5","张6","张7","张8","张9","张10"};
    
    long t=5;
    long[] ti={1,2,5,8,10};
    
    public void timeTest(){
        
        for (int i = 0; i < ti.length; i++) {
            Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                System.out.println("运行了");//To change body of generated lambdas, choose Tools | Templates.
            }, ti[i], TimeUnit.SECONDS);
        }
        

//        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new Runnable() {
//            @Override
//            public void run() {
//                int i=(int) (10*Math.random());
//                System.out.println("抽到了"+execu_test[i]);
//                
//            }
//        }, 0, t, TimeUnit.SECONDS);
        
    }
    
    public void ChaseCal(String optime) throws ParseException{
        double time =(new Date().getTime() - df.parse(optime).getTime())/(1000*60);
        for (; time > 0; time--) {
            optime=df.format(df.parse(optime).getTime()+1000*60);
            System.out.println(time);
            System.out.println(optime);
        }
        
    }
    
    public static void main(String[] args) throws ParseException {
//        if (b1.contains("D00")) {
//            bg=bg+"D00";
//        }else if (b1.contains("J03")) {
//            bg=bg+"J03";
//        }else if (b1.contains("G90")) {
//            bg=bg+"G90";
//        }
//        System.out.println("bg="+bg);
//        if (b2.contains("D00")) {
//            bg=bg+"/D00";
//        }else if (b2.contains("J03")) {
//            bg=bg+"/J03";
//        }else if (b2.contains("G90")) {
//            bg=bg+"/G90";
//        }
//        System.out.println("bg="+bg);
//        
//        StringBuffer temp=new StringBuffer(b3);        
//        temp.replace(1, 2, ""+0);
//        b3=temp.toString();
//        System.out.println("b3="+b3);
//        
//        System.out.println(b3.charAt(1)=='2');
//        System.out.println(b3.startsWith("3", 2));
        
//        double a;
//        try {
//            a=new Date().getTime()-df.parse(time).getTime();
//            System.out.println("时间相差"+a/1000);
//        } catch (ParseException ex) {
//            Logger.getLogger(Stringtest.class.getName()).log(Level.SEVERE, null, ex);
//        }

//        new Stringtest().ChaseCal("2019/6/24 20:24:00");
          
//        System.out.println(bg==null);
//        System.out.println(b1==null);
//        
//        System.out.println("b3="+b3);
//        System.out.println(b3.charAt(1));
//        System.out.println(5-Integer.parseInt(""+b3.charAt(1)));
    String a = null ;
        if (a==null) {
            System.out.println("a是空的");
        }else{
            System.out.println("a是不空的");
        }
        a="ccad2wq";
        if (a==null) {
            System.out.println("a是空的");
        }else{
            System.out.println("a是不空的");
        }
            
    }

}
