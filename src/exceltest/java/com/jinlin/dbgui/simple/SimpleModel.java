package exceltest.java.com.jinlin.dbgui.simple;

import com.jinlin.dbgui.anno.AutoIncrement;
import lombok.Data;

/**
 * 请先在数据库创建好数据表
 * 数据表名字：simplemodel(与类名全小写对应)
 * 数据列两列，simple_id是自增的。
 *
 * @author SunYuLin
 * @date Created on 2018/4/19
 */
@Data
public class SimpleModel {
    @AutoIncrement
    private int simple_id;
    private String simple_name;
}
