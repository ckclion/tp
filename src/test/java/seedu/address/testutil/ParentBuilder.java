package seedu.address.testutil;

import static seedu.address.testutil.TypicalStudents.ALICE;

import seedu.address.model.person.Parent;
import seedu.address.model.person.Student;

/**
 * A utility class to help with building Parent objects.
 */
public class ParentBuilder extends PersonBuilder {

    public static final Student DEFAULT_CHILD = ALICE;

    private Student child;

    /**
     * Creates a {@code ParentBuilder} with the default details.
     */
    public ParentBuilder() {
        super();
        child = DEFAULT_CHILD;
    }

    /**
     * Initializes the ParentBuilder with the data of {@code parentToCopy}.
     */
    public ParentBuilder(Parent parentToCopy) {
        super(parentToCopy);
        child = parentToCopy.getChild();
    }

    /**
     * Sets the {@code child} of the {@code Parent} that we are building.
     */
    public ParentBuilder withChild(Student child) {
        this.child = child;
        return this;
    }

    @Override
    public ParentBuilder withName(String name) {
        super.withName(name);
        return this;
    }

    @Override
    public ParentBuilder withPhone(String phone) {
        super.withPhone(phone);
        return this;
    }

    @Override
    public ParentBuilder withEmail(String email) {
        super.withEmail(email);
        return this;
    }

    @Override
    public ParentBuilder withAddress(String address) {
        super.withAddress(address);
        return this;
    }

    @Override
    public ParentBuilder withTags(String... tags) {
        super.withTags(tags);
        return this;
    }

    public Parent build() {
        return new Parent(super.build(), child);
    }

}
