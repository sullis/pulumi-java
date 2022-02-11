// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupAddressArgs Empty = new RuleGroupAddressArgs();

    @InputImport(name="addressDefinition", required=true)
    private final Input<String> addressDefinition;

    public Input<String> getAddressDefinition() {
        return this.addressDefinition;
    }

    public RuleGroupAddressArgs(Input<String> addressDefinition) {
        this.addressDefinition = Objects.requireNonNull(addressDefinition, "expected parameter 'addressDefinition' to be non-null");
    }

    private RuleGroupAddressArgs() {
        this.addressDefinition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> addressDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressDefinition = defaults.addressDefinition;
        }

        public Builder setAddressDefinition(Input<String> addressDefinition) {
            this.addressDefinition = Objects.requireNonNull(addressDefinition);
            return this;
        }

        public Builder setAddressDefinition(String addressDefinition) {
            this.addressDefinition = Input.of(Objects.requireNonNull(addressDefinition));
            return this;
        }

        public RuleGroupAddressArgs build() {
            return new RuleGroupAddressArgs(addressDefinition);
        }
    }
}
