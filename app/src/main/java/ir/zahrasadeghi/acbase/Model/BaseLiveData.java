package ir.zahrasadeghi.acbase.Model;

import android.arch.lifecycle.LiveData;

/**
 * Created by Zahra Sdg on 9/18/2017.
 */

public abstract class BaseLiveData<T> extends LiveData {

    @Override
    protected void onActive() {
        super.onActive();
    }

    @Override
    protected void onInactive() {
        super.onInactive();
    }
}
