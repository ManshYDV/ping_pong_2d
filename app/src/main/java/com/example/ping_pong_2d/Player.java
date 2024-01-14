package com.example.ping_pong_2d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class Player {

    private int racketWidht;
    private int racketHeight;
    public int score;
    private Paint paint;
    public RectF bounds;

    public Player(int racketWidht, int racketHeight, Paint paint) {
        this.racketWidht = racketWidht;
        this.racketHeight = racketHeight;
        this.paint = paint;
        score=0;
        bounds=new RectF(0,0,racketWidht,racketHeight);
    }

    public void draw(Canvas canvas){
        canvas.drawRoundRect(bounds,5,5,paint);
    }

    public int getRacketWidht() {
        return racketWidht;
    }

    public int getRacketHeight() {
        return racketHeight;
    }

    @Override
    public String toString() {
        return " Width = " + racketWidht+" Height = "+racketHeight+" Score = " +score+" Top = "+bounds.top+" Left = "+bounds.left;
    }
}
