package jp.techacademy.mie.toyo.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable {

    static String to_jp = "人";
    private final String hobby;

    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public static void introduce() {

        Log.d("javatest", "これは人クラスです。");
    }

    public void say() {
        Log.d("javatest", "私の名前は"+ this.name + "です" + "私の年齢は" +  this.age + "歳です");
    }

    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }

}