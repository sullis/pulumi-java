// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EventTypeTag {
    private final String key;
    private final String value;

    @OutputCustomType.Constructor({"key","value"})
    private EventTypeTag(
        String key,
        String value) {
        this.key = Objects.requireNonNull(key);
        this.value = Objects.requireNonNull(value);
    }

    public String getKey() {
        return this.key;
    }
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTypeTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTypeTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public EventTypeTag build() {
            return new EventTypeTag(key, value);
        }
    }
}
