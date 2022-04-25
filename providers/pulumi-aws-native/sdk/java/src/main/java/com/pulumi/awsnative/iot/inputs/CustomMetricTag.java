// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A key-value pair to associate with a resource.
 * 
 */
public final class CustomMetricTag extends com.pulumi.resources.InvokeArgs {

    public static final CustomMetricTag Empty = new CustomMetricTag();

    /**
     * The tag&#39;s key.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return The tag&#39;s key.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * The tag&#39;s value.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return The tag&#39;s value.
     * 
     */
    public String value() {
        return this.value;
    }

    private CustomMetricTag() {}

    private CustomMetricTag(CustomMetricTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomMetricTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomMetricTag $;

        public Builder() {
            $ = new CustomMetricTag();
        }

        public Builder(CustomMetricTag defaults) {
            $ = new CustomMetricTag(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The tag&#39;s key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param value The tag&#39;s value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public CustomMetricTag build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
