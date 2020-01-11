package exceltest.java.com.jinlin.dbgui.simple;

import com.jinlin.dbgui.anno.ListItemHeight;
import com.jinlin.dbgui.anno.ListTitle;
import com.jinlin.dbgui.anno.View;
import com.jinlin.dbgui.gui.AbsolutelyPanel;
import com.jinlin.dbgui.view.AdapterTableList;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 列表示例
 *
 * @author SunYuLin
 * @date Created on 2018/4/19
 */
@ListTitle({"第一列", "中间列", "结尾列"})
@ListItemHeight(40)
public class SimpleList extends AdapterTableList<SimpleList.SimpleViewHolder> {
    private List<String> items = new ArrayList<>();

    public SimpleList() {
        for (int i = 0; i < 10; i++) {
            items.add("数字" + i);
        }
    }

    @Override
    protected void bindViewHolder(SimpleViewHolder holder, int position) {
        //bind your data here.//and your event dealer.
        holder.label.setText(String.valueOf(position));
        holder.textField.setEditable(position % 2 == 0);
        holder.textField.setText(items.get(position));
        holder.button.setText("确定");
    }

    @Override
    public int getDataCount() {
        return items.size();
    }

    public static class SimpleViewHolder extends AbsolutelyPanel {
        @View(index = 0)
        JLabel label;
        @View(index = 1, padding = {2, 10, 2, 10})
        JTextField textField;
        @View(index = 2, padding = {80, 30})
        JButton button;
    }
}
