package ir.zahrasadeghi.acbase.Model;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

//Use this for view models that need inputs in constructor

public class ViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private static volatile ViewModelFactory INSTANCE;

    public static ViewModelFactory getInstance() {

        if (INSTANCE == null) {
            synchronized (ViewModelFactory.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ViewModelFactory();
                }
            }
        }
        return INSTANCE;
    }

    private ViewModelFactory() {
        super();
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        return super.create(modelClass);
    }
}
