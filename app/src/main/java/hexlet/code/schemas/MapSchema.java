package hexlet.code.schemas;

import java.util.Map;

public class MapSchema extends BaseSchema {
    private Integer size = null;
    private Map<String, BaseSchema<?>> shape;
    private boolean isRequired = false;

    public MapSchema required() {
        isRequired = true;
        return this;
    }

    public MapSchema sizeof(Integer needSize) {
        this.size = needSize;
        return this;
    }

    public MapSchema shape(Map<String, BaseSchema<?>> schemas) {
        this.shape = schemas;
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

        if (shape != null) {
            for (Map.Entry<String, BaseSchema<?>> entry : shape.entrySet()) {
                if (!entry.getValue().isValid(map.get(entry.getKey()))) {
                    return false;
                }
            }
        }

        if (size != null) {
            if (((Map<?, ?>) value).size() != size) {
                return false;
            }
        }

        return true;
    }
}
