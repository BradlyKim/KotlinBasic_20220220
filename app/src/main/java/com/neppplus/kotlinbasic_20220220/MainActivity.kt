package com.neppplus.kotlinbasic_20220220

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btnLog 버튼이 눌리면 해야할 일을 지정

        btnLog.setOnClickListener {

//            로그 버튼이 눌릴때마다 실행될 코드 {  }
//            로그를 찍어보자.

            Log.d( "메인화면", "로그 버튼 눌림" )
            Log.e( "메인화면", "e로 로그 버튼 눌림" )

        }

        btnToast.setOnClickListener {

//            토스트를 띄워보자

            Toast.makeText(this, "토스트 버튼 눌림", Toast.LENGTH_SHORT).show()

        }

        btnVariablePractice.setOnClickListener {

//            var / val 에 대한 연습 체험
            var myName : String   // 내용 변경 가능
            val friendName : String  // 한번 대입한 값으로 고정
            
//            myName - 내 이름, friendName - 친구 이름
            
            myName = "김정환"
            friendName = "전혜진"

//            내이름 / 친구이름 다시 대입 (데이터 변경)
            
            myName = "김도훈"  // var은 데이터 변경 가능
//          friendName = "김시연"  // val은 데이터 변경 불가
            
        }

    }
}