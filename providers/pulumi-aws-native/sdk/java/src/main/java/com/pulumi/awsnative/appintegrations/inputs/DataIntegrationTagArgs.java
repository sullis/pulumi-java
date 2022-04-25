// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appintegrations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A label for tagging DataIntegration resources
 * 
 */
public final class DataIntegrationTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataIntegrationTagArgs Empty = new DataIntegrationTagArgs();

    /**
     * A key to identify the tag.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return A key to identify the tag.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Corresponding tag value for the key.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Corresponding tag value for the key.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private DataIntegrationTagArgs() {}

    private DataIntegrationTagArgs(DataIntegrationTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataIntegrationTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataIntegrationTagArgs $;

        public Builder() {
            $ = new DataIntegrationTagArgs();
        }

        public Builder(DataIntegrationTagArgs defaults) {
            $ = new DataIntegrationTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key A key to identify the tag.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key A key to identify the tag.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Corresponding tag value for the key.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Corresponding tag value for the key.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DataIntegrationTagArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
