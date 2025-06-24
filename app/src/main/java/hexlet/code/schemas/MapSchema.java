package hexlet.code.schemas;

import java.util.HashMap;
import java.util.Map;

public class MapSchema extends BaseSchema {

    private boolean isRequired = false;
    private Integer size = null;

    public MapSchema required() {
        this.isRequired = true;
        return this;
    }

    public MapSchema sizeof(Integer size) {
        this.size = size;
        return this;
    }

    @Override
    public boolean isValid(Object value) {
        if (value == null) {
            return !isRequired;
        }

        if (!(value instanceof Map)) {
            return false;
        }

        Map map = (Map) value;

        if (size != null) {
            if (((Map<?, ?>) value).size() != size) {
                return false;
            }
        }

        return true;
    }
}
