package info.ernestas.simple.springexample.core.builder;

import info.ernestas.simple.springexample.core.model.Name;

public class NameBuilder {

    private Name name = new Name();

    public NameBuilder() {
        name.setId(1);
        name.setName("John Doe");
    }

    public static NameBuilder init() {
        return new NameBuilder();
    }

    public Name build() {
        return name;
    }

    public NameBuilder withId(Integer id) {
        name.setId(id);
        return this;
    }

    public NameBuilder withName(String name) {
        this.name.setName(name);
        return this;
    }
}
