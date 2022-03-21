// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A rule governing the accessibility from a specific ip address or ip range.
 * 
 */
public final class IpRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final IpRuleResponse Empty = new IpRuleResponse();

    /**
     * An IPv4 address range in CIDR notation, such as '124.56.78.91' (simple IP address) or '124.56.78.0/24' (all addresses that start with 124.56.78).
     * 
     */
    @Import(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public IpRuleResponse(String value) {
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private IpRuleResponse() {
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(IpRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public IpRuleResponse build() {
            return new IpRuleResponse(value);
        }
    }
}
