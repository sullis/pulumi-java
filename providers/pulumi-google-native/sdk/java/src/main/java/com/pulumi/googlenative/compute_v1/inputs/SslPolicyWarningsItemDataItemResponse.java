// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SslPolicyWarningsItemDataItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final SslPolicyWarningsItemDataItemResponse Empty = new SslPolicyWarningsItemDataItemResponse();

    /**
     * A key that provides more detail on the warning being returned. For example, for warnings where there are no results in a list request for a particular zone, this key might be scope and the key value might be the zone name. Other examples might be a key indicating a deprecated resource and a suggested replacement, or a warning about invalid network settings (for example, if an instance attempts to perform IP forwarding but is not enabled for IP forwarding).
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return A key that provides more detail on the warning being returned. For example, for warnings where there are no results in a list request for a particular zone, this key might be scope and the key value might be the zone name. Other examples might be a key indicating a deprecated resource and a suggested replacement, or a warning about invalid network settings (for example, if an instance attempts to perform IP forwarding but is not enabled for IP forwarding).
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * A warning data value corresponding to the key.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return A warning data value corresponding to the key.
     * 
     */
    public String value() {
        return this.value;
    }

    private SslPolicyWarningsItemDataItemResponse() {}

    private SslPolicyWarningsItemDataItemResponse(SslPolicyWarningsItemDataItemResponse $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SslPolicyWarningsItemDataItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SslPolicyWarningsItemDataItemResponse $;

        public Builder() {
            $ = new SslPolicyWarningsItemDataItemResponse();
        }

        public Builder(SslPolicyWarningsItemDataItemResponse defaults) {
            $ = new SslPolicyWarningsItemDataItemResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param key A key that provides more detail on the warning being returned. For example, for warnings where there are no results in a list request for a particular zone, this key might be scope and the key value might be the zone name. Other examples might be a key indicating a deprecated resource and a suggested replacement, or a warning about invalid network settings (for example, if an instance attempts to perform IP forwarding but is not enabled for IP forwarding).
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param value A warning data value corresponding to the key.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public SslPolicyWarningsItemDataItemResponse build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
