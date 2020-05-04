package Lesson_8.TicTacToe_HW;

import javax.swing.*;
import java.awt.*;

public class Result extends JFrame {
    private static final int WIN_HEIGHT = 80;
    private static final int WIN_WIDTH  = 300;
    private static final int WIN_POS_X  = 450;
    private static final int WIN_POS_Y  = 350;

    private BattleMap battleMap;

    public Result(BattleMap battleMap) {
        this.battleMap = battleMap;

        setBounds(WIN_POS_X, WIN_POS_Y, WIN_WIDTH, WIN_HEIGHT);
        setTitle("Game result");
        setBackground(Color.white);
        setResizable(false);
        setVisible(false);
    }


}
