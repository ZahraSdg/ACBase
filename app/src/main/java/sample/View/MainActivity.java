package sample.View;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import ir.zahrasadeghi.acbase.BaseObserver;
import ir.zahrasadeghi.acbase.R;
import ir.zahrasadeghi.acbase.View.BaseActivity;
import sample.Model.model;
import sample.MyObserver;

public class MainActivity extends BaseActivity<model> {

    @BindView(R.id.text)
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public model initViewModel() {
        return viewModelProvider.get(model.class);
    }

    @Override
    public BaseObserver initObserver() {
        return new MyObserver();
    }
}
