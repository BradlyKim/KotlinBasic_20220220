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

            Toast.makeText(this, myName, Toast.LENGTH_SHORT).show()
            
        }

        btnConditionPractice.setOnClickListener {

//            if / else 조건문 연습
            val userAge = 17

            if (userAge >= 20) {
//                실제 userAge 값이 20 이상일때 실행됨
                Toast.makeText(this, "성인입니다.", Toast.LENGTH_SHORT).show()
                
            }
            else if (userAge >= 17 ) {
                Toast.makeText(this, "고등학생입니다.", Toast.LENGTH_SHORT).show()
            }
            else if (userAge >= 14 ) {
                Toast.makeText(this, "중학생입니다.", Toast.LENGTH_SHORT).show()
            }
            
            else {
//                위의 질문이 틀렸을때 대응할 코드 추가
                Toast.makeText(this, "초등학생 혹은 그 이하입니다.", Toast.LENGTH_SHORT).show()
            }

        }

        btnConditionPractice2.setOnClickListener { 
            
            val salary = 4000 
            val minutes = 50
            val overWork = false
//            기준1. 연봉이 5000이상이면 OK
            if (salary >= 5000) {
                Toast.makeText(this, "연봉이 5천 이상", Toast.LENGTH_SHORT).show()
            }

//            기준2. 야근만 안 하면 OK
            if (!overWork) {
//                 overWork 변수에 true가 있을때만 실행 => NOT 부정 : 야근을 하지 않으면
                Toast.makeText(this, "야근을 안 함", Toast.LENGTH_SHORT).show()
            }

//            기준3. 연봉 4000이상 + 거리 30분 이내
            if(salary >= 4000 && minutes < 30 ) {
                Toast.makeText(this, "연봉 and 출퇴근 시간 OK", Toast.LENGTH_SHORT).show()
            }

//            기준4. 연봉 5000이상 or 거리 1시간 이내
            if(salary >= 5000 || minutes < 60) {
                Toast.makeText(this, "연봉 or 출퇴근시간 OK", Toast.LENGTH_SHORT).show()
            }
            
        }
        
    }
}