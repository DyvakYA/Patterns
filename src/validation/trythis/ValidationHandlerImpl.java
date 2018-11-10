package validation.trythis;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 5/31/2018.
 */
public class ValidationHandlerImpl<T> implements ValidationHandler<T>{

    public Map<String, String> notNull(T t) {
        Map<String, String> errorMap = new HashMap<>();
        if (t == null) {
            errorMap.put("error", "Object == null");
        }
        return errorMap;
    }

    @Override
    public void runWithOutCommit(T t) {

    }


}
