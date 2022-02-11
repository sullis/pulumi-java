// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupAddress extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupAddress Empty = new RuleGroupAddress();

    @InputImport(name="addressDefinition", required=true)
    private final String addressDefinition;

    public String getAddressDefinition() {
        return this.addressDefinition;
    }

    public RuleGroupAddress(String addressDefinition) {
        this.addressDefinition = Objects.requireNonNull(addressDefinition, "expected parameter 'addressDefinition' to be non-null");
    }

    private RuleGroupAddress() {
        this.addressDefinition = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addressDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressDefinition = defaults.addressDefinition;
        }

        public Builder setAddressDefinition(String addressDefinition) {
            this.addressDefinition = Objects.requireNonNull(addressDefinition);
            return this;
        }

        public RuleGroupAddress build() {
            return new RuleGroupAddress(addressDefinition);
        }
    }
}
