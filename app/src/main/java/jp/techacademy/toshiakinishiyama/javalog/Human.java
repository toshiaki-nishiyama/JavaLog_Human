package jp.techacademy.toshiakinishiyama.javalog;

import android.util.Log;

/**
 * Created by Toshiaki.Nishiyama on 2016/08/25.
 */
class Human extends Animal implements Thinkable
{
    // 変数
    String name;        // 名前
    int age;            // 年齢

    // 引数付きコンストラクタ
    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // メソッド
    public void say()
    {
        Log.d("javatest", "「私の名前は " + this.name + " です。年は " + this.age + " 歳です。」");
    }

    @Override
    public void think(String hobby)
    {
        Log.d("javatest", "「私は " + hobby + " について考える。」");
    }
}
