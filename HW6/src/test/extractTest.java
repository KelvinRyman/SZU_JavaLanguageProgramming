package test;

import extractAmount.TotalAmountCalculator;

public class extractTest {
    public static void main(String[] args) {
        TotalAmountCalculator tac = new TotalAmountCalculator("明礼德教育科技集团有限公司1000万元；心里程控股集团1亿元；工勘岩土集团4000万元；正中集团5000万元；海岸集团6000万元；腾讯公益慈善基金会2亿元；平安集团5000万元，点维文化传播1000万元，叶晓彬校友1000万元");
        tac.extract();
    }
}
