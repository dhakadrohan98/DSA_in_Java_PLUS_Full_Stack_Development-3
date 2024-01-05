package org.hashmap.internal.working;

public final class ImmutableKey {
    private final String data;

    public ImmutableKey(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ImmutableKey otherKey = (ImmutableKey) obj;

        return data.equals(otherKey.data);
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }
}

