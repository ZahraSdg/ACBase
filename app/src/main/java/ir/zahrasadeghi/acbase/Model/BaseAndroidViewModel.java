package ir.zahrasadeghi.acbase.Model;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;

/**
 * Created by Zahra Sdg on 9/18/2017.
 *
 * if you need to add any property to every view model add it here
 */

public abstract class BaseAndroidViewModel extends AndroidViewModel{


    public BaseAndroidViewModel(Application application) {
        super(application);
    }
}
