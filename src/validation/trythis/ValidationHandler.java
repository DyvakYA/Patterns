package validation.trythis;

import java.util.Map;

/**
 * Created by User on 5/31/2018.
 */
public interface ValidationHandler<T> {

    Map<String, String> notNull(T t);

    void runWithOutCommit(T t);
}
