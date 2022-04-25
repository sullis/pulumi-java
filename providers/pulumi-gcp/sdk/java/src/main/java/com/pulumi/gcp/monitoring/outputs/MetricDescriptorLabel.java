// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricDescriptorLabel {
    /**
     * @return A human-readable description for the label.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The key for this label. The key must not exceed 100 characters. The first character of the key must be an upper- or lower-case letter, the remaining characters must be letters, digits or underscores, and the key must match the regular expression [a-zA-Z][a-zA-Z0-9_]*
     * 
     */
    private final String key;
    /**
     * @return The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `STRING`, `BOOL`, and `INT64`.
     * 
     */
    private final @Nullable String valueType;

    @CustomType.Constructor
    private MetricDescriptorLabel(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("valueType") @Nullable String valueType) {
        this.description = description;
        this.key = key;
        this.valueType = valueType;
    }

    /**
     * @return A human-readable description for the label.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The key for this label. The key must not exceed 100 characters. The first character of the key must be an upper- or lower-case letter, the remaining characters must be letters, digits or underscores, and the key must match the regular expression [a-zA-Z][a-zA-Z0-9_]*
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `STRING`, `BOOL`, and `INT64`.
     * 
     */
    public Optional<String> valueType() {
        return Optional.ofNullable(this.valueType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricDescriptorLabel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String key;
        private @Nullable String valueType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricDescriptorLabel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.key = defaults.key;
    	      this.valueType = defaults.valueType;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder valueType(@Nullable String valueType) {
            this.valueType = valueType;
            return this;
        }        public MetricDescriptorLabel build() {
            return new MetricDescriptorLabel(description, key, valueType);
        }
    }
}
