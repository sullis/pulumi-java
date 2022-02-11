// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.EC2FleetFleetLaunchTemplateOverridesRequest;
import io.pulumi.awsnative.ec2.outputs.EC2FleetFleetLaunchTemplateSpecificationRequest;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EC2FleetFleetLaunchTemplateConfigRequest {
    private final @Nullable EC2FleetFleetLaunchTemplateSpecificationRequest launchTemplateSpecification;
    private final @Nullable List<EC2FleetFleetLaunchTemplateOverridesRequest> overrides;

    @OutputCustomType.Constructor({"launchTemplateSpecification","overrides"})
    private EC2FleetFleetLaunchTemplateConfigRequest(
        @Nullable EC2FleetFleetLaunchTemplateSpecificationRequest launchTemplateSpecification,
        @Nullable List<EC2FleetFleetLaunchTemplateOverridesRequest> overrides) {
        this.launchTemplateSpecification = launchTemplateSpecification;
        this.overrides = overrides;
    }

    public Optional<EC2FleetFleetLaunchTemplateSpecificationRequest> getLaunchTemplateSpecification() {
        return Optional.ofNullable(this.launchTemplateSpecification);
    }
    public List<EC2FleetFleetLaunchTemplateOverridesRequest> getOverrides() {
        return this.overrides == null ? List.of() : this.overrides;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetFleetLaunchTemplateConfigRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EC2FleetFleetLaunchTemplateSpecificationRequest launchTemplateSpecification;
        private @Nullable List<EC2FleetFleetLaunchTemplateOverridesRequest> overrides;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetFleetLaunchTemplateConfigRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateSpecification = defaults.launchTemplateSpecification;
    	      this.overrides = defaults.overrides;
        }

        public Builder setLaunchTemplateSpecification(@Nullable EC2FleetFleetLaunchTemplateSpecificationRequest launchTemplateSpecification) {
            this.launchTemplateSpecification = launchTemplateSpecification;
            return this;
        }

        public Builder setOverrides(@Nullable List<EC2FleetFleetLaunchTemplateOverridesRequest> overrides) {
            this.overrides = overrides;
            return this;
        }

        public EC2FleetFleetLaunchTemplateConfigRequest build() {
            return new EC2FleetFleetLaunchTemplateConfigRequest(launchTemplateSpecification, overrides);
        }
    }
}
