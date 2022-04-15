// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupIPSetForwardedIPConfigurationFallbackBehavior;
import io.pulumi.awsnative.wafv2.enums.RuleGroupIPSetForwardedIPConfigurationPosition;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupIPSetForwardedIPConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupIPSetForwardedIPConfiguration Empty = new RuleGroupIPSetForwardedIPConfiguration();

    @Import(name="fallbackBehavior", required=true)
      private final RuleGroupIPSetForwardedIPConfigurationFallbackBehavior fallbackBehavior;

    public RuleGroupIPSetForwardedIPConfigurationFallbackBehavior fallbackBehavior() {
        return this.fallbackBehavior;
    }

    @Import(name="headerName", required=true)
      private final String headerName;

    public String headerName() {
        return this.headerName;
    }

    @Import(name="position", required=true)
      private final RuleGroupIPSetForwardedIPConfigurationPosition position;

    public RuleGroupIPSetForwardedIPConfigurationPosition position() {
        return this.position;
    }

    public RuleGroupIPSetForwardedIPConfiguration(
        RuleGroupIPSetForwardedIPConfigurationFallbackBehavior fallbackBehavior,
        String headerName,
        RuleGroupIPSetForwardedIPConfigurationPosition position) {
        this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior, "expected parameter 'fallbackBehavior' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.position = Objects.requireNonNull(position, "expected parameter 'position' to be non-null");
    }

    private RuleGroupIPSetForwardedIPConfiguration() {
        this.fallbackBehavior = null;
        this.headerName = null;
        this.position = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupIPSetForwardedIPConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupIPSetForwardedIPConfigurationFallbackBehavior fallbackBehavior;
        private String headerName;
        private RuleGroupIPSetForwardedIPConfigurationPosition position;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupIPSetForwardedIPConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
    	      this.position = defaults.position;
        }

        public Builder fallbackBehavior(RuleGroupIPSetForwardedIPConfigurationFallbackBehavior fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }
        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public Builder position(RuleGroupIPSetForwardedIPConfigurationPosition position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }        public RuleGroupIPSetForwardedIPConfiguration build() {
            return new RuleGroupIPSetForwardedIPConfiguration(fallbackBehavior, headerName, position);
        }
    }
}
