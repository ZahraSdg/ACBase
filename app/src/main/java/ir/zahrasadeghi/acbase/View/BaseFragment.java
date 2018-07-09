package ir.zahrasadeghi.acbase.View;

import android.arch.lifecycle.Lifecycle;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;


public abstract class BaseFragment extends Fragment {

    protected Lifecycle lifecycle;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View v = inflater.inflate(getLayoutId(), container, false);
        ButterKnife.bind(this, v);
        lifecycle = getLifecycle();


        setView(v);

        return v;
    }

    @LayoutRes
    public abstract int getLayoutId();

    public abstract void setView(View v);
}
