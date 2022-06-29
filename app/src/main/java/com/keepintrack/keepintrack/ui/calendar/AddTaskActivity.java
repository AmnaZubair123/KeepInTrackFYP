package com.keepintrack.keepintrack.ui.calendar;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.keepintrack.keepintrack.R;
import com.keepintrack.keepintrack.ui.calendar.utils.TaskDatabase;

public class AddTaskActivity extends AppCompatActivity {

    ImageView backButton;
    EditText taskNameEt;
    TextView doneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        backButton = findViewById(R.id.backBn_addTask);
        backButton.setOnClickListener(view -> {
            onBackPressed();
        });

        taskNameEt = findViewById(R.id.addNewTaskEditText);
        doneButton = findViewById(R.id.doneBn_addTask);

        doneButton.setOnClickListener(view -> {
            TaskDatabase taskDb = new TaskDatabase(AddTaskActivity.this);
            taskDb.addTask(taskNameEt.getText().toString().trim());
            taskNameEt.setText("");
            finish();
        });
    }

}