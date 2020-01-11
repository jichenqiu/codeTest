/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceltest;

/**
 * @author  纪晨秋
 * @date    2019-6-11 16:27:53
 * @version V1.0
 * @desc    
 */
import java.awt.Color;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.DefaultXYDataset;

import util.ChartUtils;
import util.Serie;

/**
 * 
 * @author ccw
 * @date 2014-6-11
 *       <p>
 *       创建图表步骤：<br/>
 *       1：创建数据集合<br/>
 *       2：创建Chart：<br/>
 *       3:设置抗锯齿，防止字体显示不清楚<br/>
 *       4:对柱子进行渲染，<br/>
 *       5:对其他部分进行渲染<br/>
 *       6:使用chartPanel接收<br/>
 * 
 *       </p>
 */
public class LineChart {
	public LineChart() {
	}

	public DefaultCategoryDataset createDataset() {
		// 标注类别
		String[] categories = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		Vector<Serie> series = new Vector<Serie>();
		// 柱子名称：柱子所有的值集合
		series.add(new Serie("Tokyo", new Double[] { 49.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4 }));
		series.add(new Serie("New York", new Double[] { 83.6, 78.8, 98.5, 93.4, 106.0, 84.5, 105.0, 104.3, 91.2, 83.5, 106.6, 92.3 }));
		// 1：创建数据集合
		DefaultCategoryDataset dataset = ChartUtils.createDefaultCategoryDataset(series, categories);
//                DefaultXYDataset data = new DefaultXYDataset();
//                data.addSeries("混油信息",new double[][] {{5,10,20,40,55,65,80,95},{700,730,750,777,785,791,808,820}});
		return dataset;
	}

	public ChartPanel createChart() {
		// 2：创建Chart[创建不同图形]
		JFreeChart chart = ChartFactory.createLineChart("Monthly Average Rainfall", "", "Rainfall (mm)", createDataset());
		// 3:设置抗锯齿，防止字体显示不清楚
		ChartUtils.setAntiAlias(chart);// 抗锯齿
		// 4:对柱子进行渲染[[采用不同渲染]]
		ChartUtils.setLineRender(chart.getCategoryPlot(), false,true);//
		// 5:对其他部分进行渲染
		ChartUtils.setXAixs(chart.getCategoryPlot());// X坐标轴渲染
		ChartUtils.setYAixs(chart.getCategoryPlot());// Y坐标轴渲染
		// 设置标注无边框
		chart.getLegend().setFrame(new BlockBorder(Color.WHITE));
		// 6:使用chartPanel接收
		ChartPanel chartPanel = new ChartPanel(chart);
		return chartPanel;
	}

	public static void main(String[] args) {
		final JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1024, 420);
		frame.setLocationRelativeTo(null);

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// 创建图形
				ChartPanel chartPanel = new LineChart().createChart();
				frame.getContentPane().add(chartPanel);
				frame.setVisible(true);
			}
		});

	}

}
