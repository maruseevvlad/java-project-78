package hexlet.code.schemas;

import java.util.Map;

public final class MapSchema extends BaseSchema<Map<?, ?>> {
    private Integer size = null;
    private Map<String, BaseSchema<String>> shape;
    private boolean isRequired = false;

    public MapSchema required() {
        isRequired = true;
        return this;
    }

    public MapSchema sizeof(Integer needSize) {
        this.size = needSize;
        return this;
    }

    public MapSchema shape(Map<String, BaseSchema<String>> schemas) {
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
            for (Map.Entry<String, BaseSchema<String>> entry : shape.entrySet()) {
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
