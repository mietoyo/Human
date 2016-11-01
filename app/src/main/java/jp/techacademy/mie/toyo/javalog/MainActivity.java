package jp.techacademy.mie.toyo.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import jp.techacademy.toyo.mie.human.R;


abstract public class MainActivity extends AppCompatActivity {

    private String hobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Human human = new Human("みえ",21,"think");

        human.think();

    human.say();
        Log.d("javatest", "私の名前は"+ human.name + "です" + "私の年齢は" +  human.age + "歳です");
        Log.d("javatest", "私は" + this.hobby + "について考える");


    }
}