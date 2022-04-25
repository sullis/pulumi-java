// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A key-value pair to associate with a resource.
 * 
 */
public final class HealthCheckTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final HealthCheckTagArgs Empty = new HealthCheckTagArgs();

    /**
     * The key name of the tag.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The key name of the tag.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The value for the tag.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value for the tag.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private HealthCheckTagArgs() {}

    private HealthCheckTagArgs(HealthCheckTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HealthCheckTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HealthCheckTagArgs $;

        public Builder() {
            $ = new HealthCheckTagArgs();
        }

        public Builder(HealthCheckTagArgs defaults) {
            $ = new HealthCheckTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key name of the tag.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key name of the tag.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The value for the tag.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value for the tag.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public HealthCheckTagArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
