package exceltest.java.com.jinlin.dbgui.simple;

import com.jinlin.dbgui.anno.DialogSuccess;
import com.jinlin.dbgui.anno.View;
import com.jinlin.dbgui.anno.ViewBinder;
import com.jinlin.dbgui.gui.AbsolutelyModelDialog;
import lombok.Data;

import javax.swing.*;

/**
 * @author SunYuLin
 * @date Created on 2018/4/21
 */
@View({"示例对话框", "400,300"})
public class SimpleDialog extends AbsolutelyModelDialog<SimpleDialog.SimpleDialogModel> {
    @View({"标题：", "50,20,40,40"})
    private JLabel tvTitle;
    @View({"内容：", "50,60,40,40"})
    private JLabel tvText;
    @View(value = {"100,25,240,30"}, index = 1)
    private JTextField etTitle;
    @View(value = {"100,75,240,125"}, index = 2, scroll = true)
    private JTextArea etText;
    @View({"确定", "160,220,80,30"})
    @DialogSuccess
    private JButton btnSure;

    @Data
    public static class SimpleDialogModel {
        @ViewBinder(index = 1)
        private String title;
        @ViewBinder(index = 2)
        private String text;
    }
}
