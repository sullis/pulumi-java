// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SelectionSelectionTag {
    /**
     * The key in a key-value pair.
     * 
     */
    private final String key;
    /**
     * An operation, such as `StringEquals`, that is applied to a key-value pair used to filter resources in a selection.
     * 
     */
    private final String type;
    /**
     * The value in a key-value pair.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"key","type","value"})
    private SelectionSelectionTag(
        String key,
        String type,
        String value) {
        this.key = Objects.requireNonNull(key);
        this.type = Objects.requireNonNull(type);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The key in a key-value pair.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * An operation, such as `StringEquals`, that is applied to a key-value pair used to filter resources in a selection.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The value in a key-value pair.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectionSelectionTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectionSelectionTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public SelectionSelectionTag build() {
            return new SelectionSelectionTag(key, type, value);
        }
    }
}