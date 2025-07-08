package hexlet.code.schemas;

public abstract class BaseSchema<T> {
    private boolean isRequired = false;

    public abstract boolean isValid(Object o);

    public boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(boolean value) {
        isRequired = value;
    }
}
