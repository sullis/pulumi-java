// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EC2FleetPlacementArgs extends io.pulumi.resources.ResourceArgs {

    public static final EC2FleetPlacementArgs Empty = new EC2FleetPlacementArgs();

    @InputImport(name="affinity")
    private final @Nullable Input<String> affinity;

    public Input<String> getAffinity() {
        return this.affinity == null ? Input.empty() : this.affinity;
    }

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

    @InputImport(name="hostId")
    private final @Nullable Input<String> hostId;

    public Input<String> getHostId() {
        return this.hostId == null ? Input.empty() : this.hostId;
    }

    @InputImport(name="hostResourceGroupArn")
    private final @Nullable Input<String> hostResourceGroupArn;

    public Input<String> getHostResourceGroupArn() {
        return this.hostResourceGroupArn == null ? Input.empty() : this.hostResourceGroupArn;
    }

    @InputImport(name="partitionNumber")
    private final @Nullable Input<Integer> partitionNumber;

    public Input<Integer> getPartitionNumber() {
        return this.partitionNumber == null ? Input.empty() : this.partitionNumber;
    }

    @InputImport(name="spreadDomain")
    private final @Nullable Input<String> spreadDomain;

    public Input<String> getSpreadDomain() {
        return this.spreadDomain == null ? Input.empty() : this.spreadDomain;
    }

    @InputImport(name="tenancy")
    private final @Nullable Input<String> tenancy;

    public Input<String> getTenancy() {
        return this.tenancy == null ? Input.empty() : this.tenancy;
    }

    public EC2FleetPlacementArgs(
        @Nullable Input<String> affinity,
        @Nullable Input<String> availabilityZone,
        @Nullable Input<String> groupName,
        @Nullable Input<String> hostId,
        @Nullable Input<String> hostResourceGroupArn,
        @Nullable Input<Integer> partitionNumber,
        @Nullable Input<String> spreadDomain,
        @Nullable Input<String> tenancy) {
        this.affinity = affinity;
        this.availabilityZone = availabilityZone;
        this.groupName = groupName;
        this.hostId = hostId;
        this.hostResourceGroupArn = hostResourceGroupArn;
        this.partitionNumber = partitionNumber;
        this.spreadDomain = spreadDomain;
        this.tenancy = tenancy;
    }

    private EC2FleetPlacementArgs() {
        this.affinity = Input.empty();
        this.availabilityZone = Input.empty();
        this.groupName = Input.empty();
        this.hostId = Input.empty();
        this.hostResourceGroupArn = Input.empty();
        this.partitionNumber = Input.empty();
        this.spreadDomain = Input.empty();
        this.tenancy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetPlacementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> affinity;
        private @Nullable Input<String> availabilityZone;
        private @Nullable Input<String> groupName;
        private @Nullable Input<String> hostId;
        private @Nullable Input<String> hostResourceGroupArn;
        private @Nullable Input<Integer> partitionNumber;
        private @Nullable Input<String> spreadDomain;
        private @Nullable Input<String> tenancy;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetPlacementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinity = defaults.affinity;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.groupName = defaults.groupName;
    	      this.hostId = defaults.hostId;
    	      this.hostResourceGroupArn = defaults.hostResourceGroupArn;
    	      this.partitionNumber = defaults.partitionNumber;
    	      this.spreadDomain = defaults.spreadDomain;
    	      this.tenancy = defaults.tenancy;
        }

        public Builder setAffinity(@Nullable Input<String> affinity) {
            this.affinity = affinity;
            return this;
        }

        public Builder setAffinity(@Nullable String affinity) {
            this.affinity = Input.ofNullable(affinity);
            return this;
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

        public Builder setHostId(@Nullable Input<String> hostId) {
            this.hostId = hostId;
            return this;
        }

        public Builder setHostId(@Nullable String hostId) {
            this.hostId = Input.ofNullable(hostId);
            return this;
        }

        public Builder setHostResourceGroupArn(@Nullable Input<String> hostResourceGroupArn) {
            this.hostResourceGroupArn = hostResourceGroupArn;
            return this;
        }

        public Builder setHostResourceGroupArn(@Nullable String hostResourceGroupArn) {
            this.hostResourceGroupArn = Input.ofNullable(hostResourceGroupArn);
            return this;
        }

        public Builder setPartitionNumber(@Nullable Input<Integer> partitionNumber) {
            this.partitionNumber = partitionNumber;
            return this;
        }

        public Builder setPartitionNumber(@Nullable Integer partitionNumber) {
            this.partitionNumber = Input.ofNullable(partitionNumber);
            return this;
        }

        public Builder setSpreadDomain(@Nullable Input<String> spreadDomain) {
            this.spreadDomain = spreadDomain;
            return this;
        }

        public Builder setSpreadDomain(@Nullable String spreadDomain) {
            this.spreadDomain = Input.ofNullable(spreadDomain);
            return this;
        }

        public Builder setTenancy(@Nullable Input<String> tenancy) {
            this.tenancy = tenancy;
            return this;
        }

        public Builder setTenancy(@Nullable String tenancy) {
            this.tenancy = Input.ofNullable(tenancy);
            return this;
        }

        public EC2FleetPlacementArgs build() {
            return new EC2FleetPlacementArgs(affinity, availabilityZone, groupName, hostId, hostResourceGroupArn, partitionNumber, spreadDomain, tenancy);
        }
    }
}
