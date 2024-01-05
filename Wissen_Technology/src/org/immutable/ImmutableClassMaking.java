package org.immutable;
//ImmutableClassMaking

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableClassMaking {
    private final String name;
    private final List<String> degrees;

    public ImmutableClassMaking(String name, List<String> degrees) {
        this.name = name;
        this.degrees = new ArrayList<>(degrees); // Creating a defensive copy of the list
    }

    public String getName() {
        return name;
    }

    public List<String> getDegrees() {
        return Collections.unmodifiableList(degrees); // Returning an unmodifiable view of the list
    }
}
