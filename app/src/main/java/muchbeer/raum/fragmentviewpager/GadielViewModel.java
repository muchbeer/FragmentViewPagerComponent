package muchbeer.raum.fragmentviewpager;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GadielViewModel extends ViewModel {

    /**
     * Live Data Instance
     */
    private MutableLiveData<String> mName = new MutableLiveData<>();

    public void setName(String name) {
        mName.setValue(name);
    }

    public LiveData<String> getName() {
        return mName;
    }
}
