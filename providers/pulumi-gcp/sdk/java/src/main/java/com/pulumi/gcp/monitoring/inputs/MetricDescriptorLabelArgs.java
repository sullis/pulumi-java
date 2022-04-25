// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricDescriptorLabelArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricDescriptorLabelArgs Empty = new MetricDescriptorLabelArgs();

    /**
     * A human-readable description for the label.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A human-readable description for the label.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The key for this label. The key must not exceed 100 characters. The first character of the key must be an upper- or lower-case letter, the remaining characters must be letters, digits or underscores, and the key must match the regular expression [a-zA-Z][a-zA-Z0-9_]*
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The key for this label. The key must not exceed 100 characters. The first character of the key must be an upper- or lower-case letter, the remaining characters must be letters, digits or underscores, and the key must match the regular expression [a-zA-Z][a-zA-Z0-9_]*
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `STRING`, `BOOL`, and `INT64`.
     * 
     */
    @Import(name="valueType")
    private @Nullable Output<String> valueType;

    /**
     * @return The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `STRING`, `BOOL`, and `INT64`.
     * 
     */
    public Optional<Output<String>> valueType() {
        return Optional.ofNullable(this.valueType);
    }

    private MetricDescriptorLabelArgs() {}

    private MetricDescriptorLabelArgs(MetricDescriptorLabelArgs $) {
        this.description = $.description;
        this.key = $.key;
        this.valueType = $.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricDescriptorLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricDescriptorLabelArgs $;

        public Builder() {
            $ = new MetricDescriptorLabelArgs();
        }

        public Builder(MetricDescriptorLabelArgs defaults) {
            $ = new MetricDescriptorLabelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A human-readable description for the label.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A human-readable description for the label.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param key The key for this label. The key must not exceed 100 characters. The first character of the key must be an upper- or lower-case letter, the remaining characters must be letters, digits or underscores, and the key must match the regular expression [a-zA-Z][a-zA-Z0-9_]*
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key for this label. The key must not exceed 100 characters. The first character of the key must be an upper- or lower-case letter, the remaining characters must be letters, digits or underscores, and the key must match the regular expression [a-zA-Z][a-zA-Z0-9_]*
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param valueType The type of data that can be assigned to the label.
         * Default value is `STRING`.
         * Possible values are `STRING`, `BOOL`, and `INT64`.
         * 
         * @return builder
         * 
         */
        public Builder valueType(@Nullable Output<String> valueType) {
            $.valueType = valueType;
            return this;
        }

        /**
         * @param valueType The type of data that can be assigned to the label.
         * Default value is `STRING`.
         * Possible values are `STRING`, `BOOL`, and `INT64`.
         * 
         * @return builder
         * 
         */
        public Builder valueType(String valueType) {
            return valueType(Output.of(valueType));
        }

        public MetricDescriptorLabelArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
