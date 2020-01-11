package exceltest.java.com.jinlin.dbgui.simple;

import com.jinlin.dbgui.Dbgui;

/**
 * 主方法示例
 *
 * @author SunYuLin
 * @date Created on 2018/4/19
 */
public class SimpleMain {

    public static void main(String[] args) {
        mainDbSimple("test","root","root");
        mainGuiSimple();
    }

    public static void mainDbSimple(String dbName, String userName, String passWord) {
        Dbgui.initDatabase(dbName, userName, passWord);
        SimpleService service = new SimpleService();
        Dbgui.processAutoCreate(service);
        service.addNewSimple("HELLO");
        service.printAllSimple();
    }

    public static void mainGuiSimple() {
        new SimpleFrame().setVisible(true);
    }
}
