// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.SpotFleetSpotPlacementTenancy;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetSpotPlacementArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetSpotPlacementArgs Empty = new SpotFleetSpotPlacementArgs();

    @InputImport(name="availabilityZone")
    private final @Nullable Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Input.empty() : this.availabilityZone;
    }

    @InputImport(name="groupName")
    private final @Nullable Input<String> groupName;

    public Input<String> getGroupName() {
        return this.groupName == null ? Input.empty() : this.groupName;
    }

    @InputImport(name="tenancy")
    private final @Nullable Input<SpotFleetSpotPlacementTenancy> tenancy;

    public Input<SpotFleetSpotPlacementTenancy> getTenancy() {
        return this.tenancy == null ? Input.empty() : this.tenancy;
    }

    public SpotFleetSpotPlacementArgs(
        @Nullable Input<String> availabilityZone,
        @Nullable Input<String> groupName,
        @Nullable Input<SpotFleetSpotPlacementTenancy> tenancy) {
        this.availabilityZone = availabilityZone;
        this.groupName = groupName;
        this.tenancy = tenancy;
    }

    private SpotFleetSpotPlacementArgs() {
        this.availabilityZone = Input.empty();
        this.groupName = Input.empty();
        this.tenancy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetSpotPlacementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> availabilityZone;
        private @Nullable Input<String> groupName;
        private @Nullable Input<SpotFleetSpotPlacementTenancy> tenancy;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetSpotPlacementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.groupName = defaults.groupName;
    	      this.tenancy = defaults.tenancy;
        }

        public Builder setAvailabilityZone(@Nullable Input<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Input.ofNullable(availabilityZone);
            return this;
        }

        public Builder setGroupName(@Nullable Input<String> groupName) {
            this.groupName = groupName;
            return this;
        }

        public Builder setGroupName(@Nullable String groupName) {
            this.groupName = Input.ofNullable(groupName);
            return this;
        }

        public Builder setTenancy(@Nullable Input<SpotFleetSpotPlacementTenancy> tenancy) {
            this.tenancy = tenancy;
            return this;
        }

        public Builder setTenancy(@Nullable SpotFleetSpotPlacementTenancy tenancy) {
            this.tenancy = Input.ofNullable(tenancy);
            return this;
        }

        public SpotFleetSpotPlacementArgs build() {
            return new SpotFleetSpotPlacementArgs(availabilityZone, groupName, tenancy);
        }
    }
}
