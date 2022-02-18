// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A rule governing the accessibility of a managed hsm pool from a specific ip address or ip range.
 * 
 */
public final class MHSMIPRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final MHSMIPRuleResponse Empty = new MHSMIPRuleResponse();

    /**
     * An IPv4 address range in CIDR notation, such as '124.56.78.91' (simple IP address) or '124.56.78.0/24' (all addresses that start with 124.56.78).
     * 
     */
    @InputImport(name="value", required=true)
    private final String value;

    public String getValue() {
        return this.value;
    }

    public MHSMIPRuleResponse(String value) {
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private MHSMIPRuleResponse() {
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MHSMIPRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(MHSMIPRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public MHSMIPRuleResponse build() {
            return new MHSMIPRuleResponse(value);
        }
    }
}
