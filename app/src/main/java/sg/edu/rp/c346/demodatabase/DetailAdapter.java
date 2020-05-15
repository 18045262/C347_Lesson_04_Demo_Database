package sg.edu.rp.c346.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailAdapter extends ArrayAdapter<Task> {

    private ArrayList<Task> tasks;
    private Context context;
    private TextView tvID, tvDesc, tvDate;

    public DetailAdapter(Context context, int resource, ArrayList<Task> objects) {
        super(context, resource, objects);

        tasks = objects;
        this.context = context;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvID = rowView.findViewById(R.id.tvID);
        tvDesc = rowView.findViewById(R.id.tvDesc);
        tvDate = rowView.findViewById(R.id.tvDate);

        Task current = tasks.get(position);
        tvID.setText("ID: " +current.getId());
        tvDesc.setText("Description: " + current.getDescription());
        tvDate.setText("Date: " + current.getDate());
        return rowView;
    }

}
