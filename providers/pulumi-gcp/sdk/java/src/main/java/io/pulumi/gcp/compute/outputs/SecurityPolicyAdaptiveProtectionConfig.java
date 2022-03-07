// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecurityPolicyAdaptiveProtectionConfig {
    /**
     * Configuration for [Google Cloud Armor Adaptive Protection Layer 7 DDoS Defense](https://cloud.google.com/armor/docs/adaptive-protection-overview?hl=en). Structure is documented below.
     * 
     */
    private final @Nullable SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7DdosDefenseConfig;

    @OutputCustomType.Constructor({"layer7DdosDefenseConfig"})
    private SecurityPolicyAdaptiveProtectionConfig(@Nullable SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7DdosDefenseConfig) {
        this.layer7DdosDefenseConfig = layer7DdosDefenseConfig;
    }

    /**
     * Configuration for [Google Cloud Armor Adaptive Protection Layer 7 DDoS Defense](https://cloud.google.com/armor/docs/adaptive-protection-overview?hl=en). Structure is documented below.
     * 
    */
    public Optional<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig> getLayer7DdosDefenseConfig() {
        return Optional.ofNullable(this.layer7DdosDefenseConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyAdaptiveProtectionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7DdosDefenseConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyAdaptiveProtectionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.layer7DdosDefenseConfig = defaults.layer7DdosDefenseConfig;
        }

        public Builder setLayer7DdosDefenseConfig(@Nullable SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7DdosDefenseConfig) {
            this.layer7DdosDefenseConfig = layer7DdosDefenseConfig;
            return this;
        }
        public SecurityPolicyAdaptiveProtectionConfig build() {
            return new SecurityPolicyAdaptiveProtectionConfig(layer7DdosDefenseConfig);
        }
    }
}