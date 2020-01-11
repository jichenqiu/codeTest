package exceltest.java.com.jinlin.dbgui.simple;

import com.jinlin.dbgui.anno.Modify;
import com.jinlin.dbgui.anno.Query;

import java.util.List;

/**
 * 数据库操作
 *
 * @author SunYuLin
 * @date Created on 2018/4/19
 */
public interface SimpleDao {

    @Query(table = SimpleModel.class)
    List<SimpleModel> getAllSimple();

    @Query("select * from simplemodel where simple_id = ?1")
    List<SimpleModel> getSimpleById(int id);

    @Modify(table = SimpleModel.class)
    boolean addSimple(SimpleModel simpleModel);

    @Modify("delete from simplemodel where simple_name = ?1")
    boolean deleteSimpleByName(String name);

}
