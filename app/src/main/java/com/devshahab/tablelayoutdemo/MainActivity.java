package com.devshahab.tablelayoutdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.devshahab.tablelayoutdemo.BLL.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Employee> listEmployee;
    private LayoutInflater layoutinflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutinflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        listEmployee = new ArrayList<>();
        listEmployee.add(new Employee(1, "shahab", "shahab@email.com", 923048637748L, "Gujranwala", new Date()));
        listEmployee.add(new Employee(2, "Ali Imran", "aliimran@email.com", 923043456677L, "Gujranwala, Punjab", new Date()));
        listEmployee.add(new Employee(3, "Usama Farooq", "usamafarooq@email.com", 923125672343L, "Gujranwala, Pubjab, Pakistan", new Date()));
        listEmployee.add(new Employee(4, "Hamza Mughal", "hamzamughal@email.com", 923345673343L, "Gujranwala, Pakistan", new Date()));
        listEmployee.add(new Employee(5, "Tahir Ur Qadri", "tahir@email.com", 923567653412L, "Lahore", new Date()));
        listEmployee.add(new Employee(6, "Kamran", "kamran@email.com", 9233456785L, "Gujranwala", new Date()));
        listEmployee.add(new Employee(7, "shahab", "shahab@email.com", 923048637748L, "Gujranwala", new Date()));
        listEmployee.add(new Employee(8, "Ali Imran", "aliimran@email.com", 923043456677L, "Gujranwala, Punjab", new Date()));
        listEmployee.add(new Employee(9, "Usama Farooq", "usamafarooq@email.com", 923125672343L, "Gujranwala, Pubjab, Pakistan", new Date()));
        listEmployee.add(new Employee(10, "Hamza Mughal", "hamzamughal@email.com", 923345673343L, "Gujranwala, Pakistan", new Date()));
        listEmployee.add(new Employee(11, "Tahir Ur Qadri", "tahir@email.com", 923567653412L, "Lahore", new Date()));
        listEmployee.add(new Employee(12, "Kamran", "kamran@email.com", 9233456785L, "Gujranwala", new Date()));
        listEmployee.add(new Employee(1, "shahab", "shahab@email.com", 923048637748L, "Gujranwala", new Date()));
        listEmployee.add(new Employee(2, "Ali Imran", "aliimran@email.com", 923043456677L, "Gujranwala, Punjab", new Date()));
        listEmployee.add(new Employee(3, "Usama Farooq", "usamafarooq@email.com", 923125672343L, "Gujranwala, Pubjab, Pakistan", new Date()));
        listEmployee.add(new Employee(4, "Hamza Mughal", "hamzamughal@email.com", 923345673343L, "Gujranwala, Pakistan", new Date()));
        listEmployee.add(new Employee(5, "Tahir Ur Qadri", "tahir@email.com", 923567653412L, "Lahore", new Date()));
        listEmployee.add(new Employee(6, "Kamran", "kamran@email.com", 9233456785L, "Gujranwala", new Date()));
        listEmployee.add(new Employee(7, "shahab", "shahab@email.com", 923048637748L, "Gujranwala", new Date()));
        listEmployee.add(new Employee(8, "Ali Imran", "aliimran@email.com", 923043456677L, "Gujranwala, Punjab", new Date()));
        listEmployee.add(new Employee(9, "Usama Farooq", "usamafarooq@email.com", 923125672343L, "Gujranwala, Pubjab, Pakistan", new Date()));
        listEmployee.add(new Employee(10, "Hamza Mughal", "hamzamughal@email.com", 923345673343L, "Gujranwala, Pakistan", new Date()));
        listEmployee.add(new Employee(11, "Tahir Ur Qadri", "tahir@email.com", 923567653412L, "Lahore", new Date()));
        listEmployee.add(new Employee(12, "Kamran", "kamran@email.com", 9233456785L, "Gujranwala", new Date()));
        listEmployee.add(new Employee(1, "shahab", "shahab@email.com", 923048637748L, "Gujranwala", new Date()));
        listEmployee.add(new Employee(2, "Ali Imran", "aliimran@email.com", 923043456677L, "Gujranwala, Punjab", new Date()));
        listEmployee.add(new Employee(3, "Usama Farooq", "usamafarooq@email.com", 923125672343L, "Gujranwala, Pubjab, Pakistan", new Date()));
        listEmployee.add(new Employee(4, "Hamza Mughal", "hamzamughal@email.com", 923345673343L, "Gujranwala, Pakistan", new Date()));
        listEmployee.add(new Employee(5, "Tahir Ur Qadri", "tahir@email.com", 923567653412L, "Lahore", new Date()));
        listEmployee.add(new Employee(6, "Kamran", "kamran@email.com", 9233456785L, "Gujranwala", new Date()));
        listEmployee.add(new Employee(7, "shahab", "shahab@email.com", 923048637748L, "Gujranwala", new Date()));
        listEmployee.add(new Employee(8, "Ali Imran", "aliimran@email.com", 923043456677L, "Gujranwala, Punjab", new Date()));
        listEmployee.add(new Employee(9, "Usama Farooq", "usamafarooq@email.com", 923125672343L, "Gujranwala, Pubjab, Pakistan", new Date()));
        listEmployee.add(new Employee(10, "Hamza Mughal", "hamzamughal@email.com", 923345673343L, "Gujranwala, Pakistan", new Date()));
        listEmployee.add(new Employee(11, "Tahir Ur Qadri", "tahir@email.com", 923567653412L, "Lahore", new Date()));
        listEmployee.add(new Employee(12, "Kamran", "kamran@email.com", 9233456785L, "Gujranwala", new Date()));

        TableLayout body = (TableLayout) findViewById(R.id.tableEmployee);


        for (Employee employee : listEmployee) {

            final TableRow row = (TableRow) layoutinflater.inflate(R.layout.adapter_list_table, body, false);
            final ViewHolder holder = new ViewHolder(row);

            holder.id.setText(employee.getId() + "");
            holder.name.setText(employee.getName());
            holder.email.setText(employee.getEmail());
            holder.address.setText(employee.getAddress());
            holder.phone.setText(employee.getPhone() + "");
            holder.DOB.setText(employee.getDOB().toString());

            row.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, holder.name.getText().toString(), Toast.LENGTH_SHORT).show();
                }


            });
            body.addView(row);
        }

        //ListView lisViewtEmployee = (ListView) findViewById(R.id.list_employee);

        float x = body.getScaleX();
        float y = body.getScaleY();

        // tableEmployee.setPivotX(0);
        // tableEmployee.setPivotY(0);
        // tableEmployee.setScaleX((float) (x + 1));
        // tableEmployee.setScaleY((float) (y + 1));


    }

    class ViewHolder {
        TextView id;
        TextView name;
        TextView email;
        TextView address;
        TextView phone;
        TextView DOB;

        public ViewHolder(View view) {
            id = (TextView) view.findViewById(R.id.txt_emp_id);
            name = (TextView) view.findViewById(R.id.txt_emp_name);
            email = (TextView) view.findViewById(R.id.txt_emp_email);
            address = (TextView) view.findViewById(R.id.txt_emp_address);
            phone = (TextView) view.findViewById(R.id.txt_emp_phone);
            DOB = (TextView) view.findViewById(R.id.txt_emp_dob);
        }
    }
}
