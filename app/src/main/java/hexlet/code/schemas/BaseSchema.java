package hexlet.code.schemas;

public abstract class BaseSchema<T> {
    public boolean isRequired = false;

    public abstract boolean isValid(Object o);

    public BaseSchema<T> required() {
        isRequired = true;
        return this;
    }
}
