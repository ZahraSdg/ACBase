package ir.zahrasadeghi.acbase;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;

/**
 * Created by Zahra Sdg on 9/18/2017.
 */

public abstract class BaseObserver implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public abstract void onResume();

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public abstract void onPause();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public abstract void onCreate();

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public abstract void onDestroy();

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public abstract void onStart();

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public abstract void onStop();
}
