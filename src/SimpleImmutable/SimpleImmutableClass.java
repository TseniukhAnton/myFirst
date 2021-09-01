package SimpleImmutable;

public final class SimpleImmutableClass {
    private final String firstName;
    private final int id;

    public SimpleImmutableClass(String firstName, int id) {
        this.firstName = firstName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }
}
