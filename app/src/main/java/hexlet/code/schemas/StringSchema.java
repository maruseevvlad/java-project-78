package hexlet.code.schemas;

public class StringSchema {

    private boolean isRequired = false;
    private Integer minLength = null;
    private String containsSubstring  = null;

    public StringSchema required() {
        this.isRequired = true;
        return this;
    }

    public StringSchema minLength(int length) {
        this.minLength = length;
        return this;
    }

    public StringSchema contains(String subString) {
        this.containsSubstring  = subString;
        return this;
    }

    public boolean isValid(Object value) {
        if (value == null) {
            return !isRequired;
        }

        if (!(value instanceof String)) {
            return false;
        }

        String str = (String) value;

        if (isRequired && str.trim().isEmpty()) {
            return false;
        }

        if (minLength != null && str.length() < minLength) {
            return false;
        }

        if (containsSubstring != null && !str.contains(containsSubstring)) {
            return false;
        }

        return true;
    }
}
