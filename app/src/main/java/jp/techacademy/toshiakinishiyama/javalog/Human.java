package jp.techacademy.toshiakinishiyama.javalog;

import android.util.Log;

/**
 * Created by Toshiaki.Nishiyama on 2016/08/25.
 */
class Human extends Animal implements Thinkable
{
    // メンバ変数
    String hobby;       // 趣味

    // 引数付きコンストラクタ
    public Human(String name, int age, String hobby)
    {
        // メンバ変数の初期化
        this.name = name;       // 名前（継承元で宣言）
        this.age = age;         // 年齢（継承元で宣言）
        this.hobby = hobby;
    }

    // メソッド
    public void say()
    {
        Log.d("javatest", "「私の名前は " + this.name + " です。年は " + this.age + " 歳です。」");
    }

    @Override
    public void think()
    {
        Log.d("javatest", "「私は " + this.hobby + " について考える。」");
    }
}
