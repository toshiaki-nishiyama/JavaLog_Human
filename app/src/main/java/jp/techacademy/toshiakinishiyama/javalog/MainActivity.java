package jp.techacademy.toshiakinishiyama.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 自分
        Human human = new Human("西山", 34, "野球");
        human.say();
        human.think();

        // 長男
        Human human2 = new Human("リョウ", 5, "カブトムシ");
        human2.say();
        human2.think();

        // 次男
        Human human3 = new Human("サトシ", 2, "ジュウオウジャー");
        human3.say();
        human3.think();
    }
}
