package hexlet.code.schemas;

import java.util.ArrayList;
import java.util.List;

public class NumberSchema extends BaseSchema {

    private boolean isRequired = false;
    private boolean isPositive = false;
    private List<Integer> range = null;

    public NumberSchema required() {
        this.isRequired = true;
        return this;
    }

    public NumberSchema positive() {
        this.isPositive = true;
        return this;
    }

    public NumberSchema range(int start, int end) {
        range = new ArrayList<>();
        range.add(start);
        range.add(end);
        return this;
    }

    @Override
    public boolean isValid(Object value) {
        if (value == null) {
            return !isRequired;
        }

        if (!(value instanceof Integer)) {
            return false;
        }

        Integer number = (Integer) value;

        if (isPositive && number <= 0) {
            return false;
        }

        if (range != null) {
            return number >= range.get(0) && number <= range.get(1);
        }
        return true;
    }
}
