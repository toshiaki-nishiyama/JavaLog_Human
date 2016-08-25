package jp.techacademy.toshiakinishiyama.javalog;

import android.util.Log;

/**
 * Created by Toshiaki.Nishiyama on 2016/08/25.
 */
class Dog extends Animal implements Movable
{
    // クラス変数
    static String to_jp = "犬";

    // 変数
    String name;        // 名前
    int age;            // 年齢

    // コンストラクタ
    public Dog()
    {
        name = "";
        age = 0;
    }

    // メソッド
    public void say()
    {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    // 引数付きコンストラクタ
    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは犬クラスです。");
    }

    @Override
    public void move()
    {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }
}
