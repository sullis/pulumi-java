// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration options for Cloud Armor Adaptive Protection (CAAP).
 * 
 */
public final class SecurityPolicyAdaptiveProtectionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyAdaptiveProtectionConfigArgs Empty = new SecurityPolicyAdaptiveProtectionConfigArgs();

    /**
     * If set to true, enables Cloud Armor Machine Learning.
     * 
     */
    @Import(name="layer7DdosDefenseConfig")
      private final @Nullable Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs> layer7DdosDefenseConfig;

    public Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs> getLayer7DdosDefenseConfig() {
        return this.layer7DdosDefenseConfig == null ? Output.empty() : this.layer7DdosDefenseConfig;
    }

    public SecurityPolicyAdaptiveProtectionConfigArgs(@Nullable Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs> layer7DdosDefenseConfig) {
        this.layer7DdosDefenseConfig = layer7DdosDefenseConfig;
    }

    private SecurityPolicyAdaptiveProtectionConfigArgs() {
        this.layer7DdosDefenseConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyAdaptiveProtectionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs> layer7DdosDefenseConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyAdaptiveProtectionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.layer7DdosDefenseConfig = defaults.layer7DdosDefenseConfig;
        }

        public Builder layer7DdosDefenseConfig(@Nullable Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs> layer7DdosDefenseConfig) {
            this.layer7DdosDefenseConfig = layer7DdosDefenseConfig;
            return this;
        }
        public Builder layer7DdosDefenseConfig(@Nullable SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs layer7DdosDefenseConfig) {
            this.layer7DdosDefenseConfig = Output.ofNullable(layer7DdosDefenseConfig);
            return this;
        }        public SecurityPolicyAdaptiveProtectionConfigArgs build() {
            return new SecurityPolicyAdaptiveProtectionConfigArgs(layer7DdosDefenseConfig);
        }
    }
}
