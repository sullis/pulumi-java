// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A rule governing the accessibility of a vault from a specific ip address or ip range.
 * 
 */
public final class IPRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final IPRuleResponse Empty = new IPRuleResponse();

    /**
     * An IPv4 address range in CIDR notation, such as &#39;124.56.78.91&#39; (simple IP address) or &#39;124.56.78.0/24&#39; (all addresses that start with 124.56.78).
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return An IPv4 address range in CIDR notation, such as &#39;124.56.78.91&#39; (simple IP address) or &#39;124.56.78.0/24&#39; (all addresses that start with 124.56.78).
     * 
     */
    public String value() {
        return this.value;
    }

    private IPRuleResponse() {}

    private IPRuleResponse(IPRuleResponse $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IPRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IPRuleResponse $;

        public Builder() {
            $ = new IPRuleResponse();
        }

        public Builder(IPRuleResponse defaults) {
            $ = new IPRuleResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param value An IPv4 address range in CIDR notation, such as &#39;124.56.78.91&#39; (simple IP address) or &#39;124.56.78.0/24&#39; (all addresses that start with 124.56.78).
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public IPRuleResponse build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
