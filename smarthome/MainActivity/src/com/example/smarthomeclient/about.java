package com.example.smarthomeclient;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class about extends Activity{
	private Button email;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		email=(Button)findViewById(R.id.email);
		email.setOnClickListener(new bugreport());
	}
	public class bugreport implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//ϵͳ�ʼ�ϵͳ�Ķ���Ϊandroid.content.Intent.ACTION_SEND
			Intent email = new Intent(android.content.Intent.ACTION_SEND);
			email.setType("plain/text");
			String[] emailReciver = new String[]{"ZWN476867589@gmail.com"};
			String emailSubject = "bug����";

			//�����ʼ�Ĭ�ϵ�ַ
			email.putExtra(android.content.Intent.EXTRA_EMAIL, emailReciver);
			//�����ʼ�Ĭ�ϱ���
			email.putExtra(android.content.Intent.EXTRA_SUBJECT, emailSubject);
			//����ϵͳ���ʼ�ϵͳ
			startActivity(Intent.createChooser(email, "��ѡ��򿪵�Ӧ�ó���"));
		}
	}    
}
	
	