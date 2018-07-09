package ir.zahrasadeghi.acbase.View;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import ir.zahrasadeghi.acbase.BaseObserver;

import butterknife.ButterKnife;

public abstract class BaseActivity<T extends ViewModel> extends AppCompatActivity {

    protected Lifecycle lifecycle;
    protected T viewModel;
    protected ViewModelProvider viewModelProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        ButterKnife.bind(this);
        lifecycle = getLifecycle();

        if (initObserver() != null) {
            lifecycle.addObserver(initObserver());
        }

        viewModelProvider = ViewModelProviders.of(this);
        viewModel = initViewModel();

    }

    @LayoutRes
    public abstract int getLayoutId();

    public abstract T initViewModel();

    public abstract BaseObserver initObserver();

}
