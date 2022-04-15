// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs;
import io.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsSpotSpecificationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFleetLaunchSpecificationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFleetLaunchSpecificationsArgs Empty = new InstanceFleetLaunchSpecificationsArgs();

    /**
     * Configuration block for on demand instances launch specifications
     * 
     */
    @Import(name="onDemandSpecifications")
      private final @Nullable Output<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications;

    public Output<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications() {
        return this.onDemandSpecifications == null ? Codegen.empty() : this.onDemandSpecifications;
    }

    /**
     * Configuration block for spot instances launch specifications
     * 
     */
    @Import(name="spotSpecifications")
      private final @Nullable Output<List<InstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications;

    public Output<List<InstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications() {
        return this.spotSpecifications == null ? Codegen.empty() : this.spotSpecifications;
    }

    public InstanceFleetLaunchSpecificationsArgs(
        @Nullable Output<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications,
        @Nullable Output<List<InstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications) {
        this.onDemandSpecifications = onDemandSpecifications;
        this.spotSpecifications = spotSpecifications;
    }

    private InstanceFleetLaunchSpecificationsArgs() {
        this.onDemandSpecifications = Codegen.empty();
        this.spotSpecifications = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFleetLaunchSpecificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications;
        private @Nullable Output<List<InstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFleetLaunchSpecificationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onDemandSpecifications = defaults.onDemandSpecifications;
    	      this.spotSpecifications = defaults.spotSpecifications;
        }

        public Builder onDemandSpecifications(@Nullable Output<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications) {
            this.onDemandSpecifications = onDemandSpecifications;
            return this;
        }
        public Builder onDemandSpecifications(@Nullable List<InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs> onDemandSpecifications) {
            this.onDemandSpecifications = Codegen.ofNullable(onDemandSpecifications);
            return this;
        }
        public Builder onDemandSpecifications(InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs... onDemandSpecifications) {
            return onDemandSpecifications(List.of(onDemandSpecifications));
        }
        public Builder spotSpecifications(@Nullable Output<List<InstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications) {
            this.spotSpecifications = spotSpecifications;
            return this;
        }
        public Builder spotSpecifications(@Nullable List<InstanceFleetLaunchSpecificationsSpotSpecificationArgs> spotSpecifications) {
            this.spotSpecifications = Codegen.ofNullable(spotSpecifications);
            return this;
        }
        public Builder spotSpecifications(InstanceFleetLaunchSpecificationsSpotSpecificationArgs... spotSpecifications) {
            return spotSpecifications(List.of(spotSpecifications));
        }        public InstanceFleetLaunchSpecificationsArgs build() {
            return new InstanceFleetLaunchSpecificationsArgs(onDemandSpecifications, spotSpecifications);
        }
    }
}
