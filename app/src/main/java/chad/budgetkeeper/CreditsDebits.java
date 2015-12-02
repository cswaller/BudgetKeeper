package chad.budgetkeeper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by chadparnin on 12/2/15.
 */
public class CreditsDebits extends Activity implements AdapterView.OnItemSelectedListener
{

    RadioButton creditsRadio1, debitRadio1;
    Spinner spinner1;
    TextView amount1;
    EditText amount1Edit;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credits_debits);

        spinner1 = (Spinner) findViewById(R.id.type1Spinner);
        spinner1.setOnItemSelectedListener(this);

        // set up spinner
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.type1Array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner1.setAdapter(adapter1);
    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id)
    {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    public void onNothingSelected(AdapterView<?> parent)
    {
        // Another interface callback
    }

}
