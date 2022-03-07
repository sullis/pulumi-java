// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A rule governing the accessibility from a specific ip address or ip range.
 * 
 */
public final class IpRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpRuleArgs Empty = new IpRuleArgs();

    /**
     * An IPv4 address range in CIDR notation, such as '124.56.78.91' (simple IP address) or '124.56.78.0/24' (all addresses that start with 124.56.78).
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public IpRuleArgs(Input<String> value) {
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private IpRuleArgs() {
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(IpRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public IpRuleArgs build() {
            return new IpRuleArgs(value);
        }
    }
}