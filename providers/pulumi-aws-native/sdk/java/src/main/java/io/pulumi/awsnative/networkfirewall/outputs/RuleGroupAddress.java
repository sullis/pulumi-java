// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupAddress {
    private final String addressDefinition;

    @OutputCustomType.Constructor({"addressDefinition"})
    private RuleGroupAddress(String addressDefinition) {
        this.addressDefinition = Objects.requireNonNull(addressDefinition);
    }

    public String getAddressDefinition() {
        return this.addressDefinition;
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
