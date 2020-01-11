package exceltest.java.com.jinlin.dbgui.simple;

import com.jinlin.dbgui.GuiUtil;
import com.jinlin.dbgui.anno.Click;
import com.jinlin.dbgui.anno.View;
import com.jinlin.dbgui.gui.AbsolutelyFrame;
import com.jinlin.dbgui.util.DialogSuccessListener;

import javax.swing.*;

/**
 * @author SunYuLin
 * @date Created on 2018/4/19
 */
@View({"演示示例", "400,300"})
public class SimpleFrame extends AbsolutelyFrame {
    @View({"演示内容", "0,10,400,30"})
    private JLabel tvTitle;
    @View({"时间戳", "50,225,100,40"})
    private JButton btnIncrease;
    @View({"对话框", "250,225,100,40"})
    private JButton btnDialog;
    @View({"0,40,400,175"})
    private SimpleList list;

    public SimpleFrame() {
        //bind your list data here.
        list.notifyChanged();
    }

    @Click("btnIncrease")
    private void onIncreaseClick(JButton button) {
        tvTitle.setText(String.valueOf(System.currentTimeMillis()));
    }

    @Click("btnDialog")
    private void onDialogClick(JButton button) {
        new SimpleDialog().setSuccessListener(this::onSimpleDialogClosed).showSelf();
    }

    public void onSimpleDialogClosed(SimpleDialog.SimpleDialogModel info) {
        if (GuiUtil.hasEmptyStringField(info)) {
            showErrorDialog("提醒", "存在字段为空。");
            return;
        }
        System.out.println(info);
    }
}
