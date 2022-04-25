// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.outputs;

import com.pulumi.aws.ecs.outputs.CapacityProviderAutoScalingGroupProviderManagedScaling;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CapacityProviderAutoScalingGroupProvider {
    /**
     * @return - ARN of the associated auto scaling group.
     * 
     */
    private final String autoScalingGroupArn;
    /**
     * @return - Configuration block defining the parameters of the auto scaling. Detailed below.
     * 
     */
    private final @Nullable CapacityProviderAutoScalingGroupProviderManagedScaling managedScaling;
    /**
     * @return - Enables or disables container-aware termination of instances in the auto scaling group when scale-in happens. Valid values are `ENABLED` and `DISABLED`.
     * 
     */
    private final @Nullable String managedTerminationProtection;

    @CustomType.Constructor
    private CapacityProviderAutoScalingGroupProvider(
        @CustomType.Parameter("autoScalingGroupArn") String autoScalingGroupArn,
        @CustomType.Parameter("managedScaling") @Nullable CapacityProviderAutoScalingGroupProviderManagedScaling managedScaling,
        @CustomType.Parameter("managedTerminationProtection") @Nullable String managedTerminationProtection) {
        this.autoScalingGroupArn = autoScalingGroupArn;
        this.managedScaling = managedScaling;
        this.managedTerminationProtection = managedTerminationProtection;
    }

    /**
     * @return - ARN of the associated auto scaling group.
     * 
     */
    public String autoScalingGroupArn() {
        return this.autoScalingGroupArn;
    }
    /**
     * @return - Configuration block defining the parameters of the auto scaling. Detailed below.
     * 
     */
    public Optional<CapacityProviderAutoScalingGroupProviderManagedScaling> managedScaling() {
        return Optional.ofNullable(this.managedScaling);
    }
    /**
     * @return - Enables or disables container-aware termination of instances in the auto scaling group when scale-in happens. Valid values are `ENABLED` and `DISABLED`.
     * 
     */
    public Optional<String> managedTerminationProtection() {
        return Optional.ofNullable(this.managedTerminationProtection);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityProviderAutoScalingGroupProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoScalingGroupArn;
        private @Nullable CapacityProviderAutoScalingGroupProviderManagedScaling managedScaling;
        private @Nullable String managedTerminationProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityProviderAutoScalingGroupProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingGroupArn = defaults.autoScalingGroupArn;
    	      this.managedScaling = defaults.managedScaling;
    	      this.managedTerminationProtection = defaults.managedTerminationProtection;
        }

        public Builder autoScalingGroupArn(String autoScalingGroupArn) {
            this.autoScalingGroupArn = Objects.requireNonNull(autoScalingGroupArn);
            return this;
        }
        public Builder managedScaling(@Nullable CapacityProviderAutoScalingGroupProviderManagedScaling managedScaling) {
            this.managedScaling = managedScaling;
            return this;
        }
        public Builder managedTerminationProtection(@Nullable String managedTerminationProtection) {
            this.managedTerminationProtection = managedTerminationProtection;
            return this;
        }        public CapacityProviderAutoScalingGroupProvider build() {
            return new CapacityProviderAutoScalingGroupProvider(autoScalingGroupArn, managedScaling, managedTerminationProtection);
        }
    }
}
