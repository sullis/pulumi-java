// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupForwardedIPConfigurationFallbackBehavior;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupForwardedIPConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupForwardedIPConfiguration Empty = new RuleGroupForwardedIPConfiguration();

    @InputImport(name="fallbackBehavior", required=true)
    private final RuleGroupForwardedIPConfigurationFallbackBehavior fallbackBehavior;

    public RuleGroupForwardedIPConfigurationFallbackBehavior getFallbackBehavior() {
        return this.fallbackBehavior;
    }

    @InputImport(name="headerName", required=true)
    private final String headerName;

    public String getHeaderName() {
        return this.headerName;
    }

    public RuleGroupForwardedIPConfiguration(
        RuleGroupForwardedIPConfigurationFallbackBehavior fallbackBehavior,
        String headerName) {
        this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior, "expected parameter 'fallbackBehavior' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
    }

    private RuleGroupForwardedIPConfiguration() {
        this.fallbackBehavior = null;
        this.headerName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupForwardedIPConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupForwardedIPConfigurationFallbackBehavior fallbackBehavior;
        private String headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupForwardedIPConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
        }

        public Builder setFallbackBehavior(RuleGroupForwardedIPConfigurationFallbackBehavior fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public RuleGroupForwardedIPConfiguration build() {
            return new RuleGroupForwardedIPConfiguration(fallbackBehavior, headerName);
        }
    }
}
