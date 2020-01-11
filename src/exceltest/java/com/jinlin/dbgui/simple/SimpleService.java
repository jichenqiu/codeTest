package exceltest.java.com.jinlin.dbgui.simple;

import com.jinlin.dbgui.anno.AutoCreate;

/**
 * 服务类
 *
 * @author SunYuLin
 * @date Created on 2018/4/19
 */
public class SimpleService {
    @AutoCreate
    private SimpleDao simpleDao;

    public void printAllSimple() {
        System.out.println(simpleDao.getAllSimple());
    }

    public void addNewSimple(String name) {
        SimpleModel model = new SimpleModel();
        model.setSimple_name(name);
        simpleDao.addSimple(model);
    }
}
