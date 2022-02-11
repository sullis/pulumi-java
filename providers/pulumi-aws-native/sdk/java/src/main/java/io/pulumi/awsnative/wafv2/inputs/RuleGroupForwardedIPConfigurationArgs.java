// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupForwardedIPConfigurationFallbackBehavior;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupForwardedIPConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupForwardedIPConfigurationArgs Empty = new RuleGroupForwardedIPConfigurationArgs();

    @InputImport(name="fallbackBehavior", required=true)
    private final Input<RuleGroupForwardedIPConfigurationFallbackBehavior> fallbackBehavior;

    public Input<RuleGroupForwardedIPConfigurationFallbackBehavior> getFallbackBehavior() {
        return this.fallbackBehavior;
    }

    @InputImport(name="headerName", required=true)
    private final Input<String> headerName;

    public Input<String> getHeaderName() {
        return this.headerName;
    }

    public RuleGroupForwardedIPConfigurationArgs(
        Input<RuleGroupForwardedIPConfigurationFallbackBehavior> fallbackBehavior,
        Input<String> headerName) {
        this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior, "expected parameter 'fallbackBehavior' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
    }

    private RuleGroupForwardedIPConfigurationArgs() {
        this.fallbackBehavior = Input.empty();
        this.headerName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupForwardedIPConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RuleGroupForwardedIPConfigurationFallbackBehavior> fallbackBehavior;
        private Input<String> headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupForwardedIPConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
        }

        public Builder setFallbackBehavior(Input<RuleGroupForwardedIPConfigurationFallbackBehavior> fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }

        public Builder setFallbackBehavior(RuleGroupForwardedIPConfigurationFallbackBehavior fallbackBehavior) {
            this.fallbackBehavior = Input.of(Objects.requireNonNull(fallbackBehavior));
            return this;
        }

        public Builder setHeaderName(Input<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Input.of(Objects.requireNonNull(headerName));
            return this;
        }

        public RuleGroupForwardedIPConfigurationArgs build() {
            return new RuleGroupForwardedIPConfigurationArgs(fallbackBehavior, headerName);
        }
    }
}
