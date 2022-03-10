// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EC2FleetPlacement {
    private final @Nullable String affinity;
    private final @Nullable String availabilityZone;
    private final @Nullable String groupName;
    private final @Nullable String hostId;
    private final @Nullable String hostResourceGroupArn;
    private final @Nullable Integer partitionNumber;
    private final @Nullable String spreadDomain;
    private final @Nullable String tenancy;

    @OutputCustomType.Constructor
    private EC2FleetPlacement(
        @OutputCustomType.Parameter("affinity") @Nullable String affinity,
        @OutputCustomType.Parameter("availabilityZone") @Nullable String availabilityZone,
        @OutputCustomType.Parameter("groupName") @Nullable String groupName,
        @OutputCustomType.Parameter("hostId") @Nullable String hostId,
        @OutputCustomType.Parameter("hostResourceGroupArn") @Nullable String hostResourceGroupArn,
        @OutputCustomType.Parameter("partitionNumber") @Nullable Integer partitionNumber,
        @OutputCustomType.Parameter("spreadDomain") @Nullable String spreadDomain,
        @OutputCustomType.Parameter("tenancy") @Nullable String tenancy) {
        this.affinity = affinity;
        this.availabilityZone = availabilityZone;
        this.groupName = groupName;
        this.hostId = hostId;
        this.hostResourceGroupArn = hostResourceGroupArn;
        this.partitionNumber = partitionNumber;
        this.spreadDomain = spreadDomain;
        this.tenancy = tenancy;
    }

    public Optional<String> getAffinity() {
        return Optional.ofNullable(this.affinity);
    }
    public Optional<String> getAvailabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    public Optional<String> getGroupName() {
        return Optional.ofNullable(this.groupName);
    }
    public Optional<String> getHostId() {
        return Optional.ofNullable(this.hostId);
    }
    public Optional<String> getHostResourceGroupArn() {
        return Optional.ofNullable(this.hostResourceGroupArn);
    }
    public Optional<Integer> getPartitionNumber() {
        return Optional.ofNullable(this.partitionNumber);
    }
    public Optional<String> getSpreadDomain() {
        return Optional.ofNullable(this.spreadDomain);
    }
    public Optional<String> getTenancy() {
        return Optional.ofNullable(this.tenancy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetPlacement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String affinity;
        private @Nullable String availabilityZone;
        private @Nullable String groupName;
        private @Nullable String hostId;
        private @Nullable String hostResourceGroupArn;
        private @Nullable Integer partitionNumber;
        private @Nullable String spreadDomain;
        private @Nullable String tenancy;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetPlacement defaults) {
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

        public Builder setAffinity(@Nullable String affinity) {
            this.affinity = affinity;
            return this;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setGroupName(@Nullable String groupName) {
            this.groupName = groupName;
            return this;
        }

        public Builder setHostId(@Nullable String hostId) {
            this.hostId = hostId;
            return this;
        }

        public Builder setHostResourceGroupArn(@Nullable String hostResourceGroupArn) {
            this.hostResourceGroupArn = hostResourceGroupArn;
            return this;
        }

        public Builder setPartitionNumber(@Nullable Integer partitionNumber) {
            this.partitionNumber = partitionNumber;
            return this;
        }

        public Builder setSpreadDomain(@Nullable String spreadDomain) {
            this.spreadDomain = spreadDomain;
            return this;
        }

        public Builder setTenancy(@Nullable String tenancy) {
            this.tenancy = tenancy;
            return this;
        }
        public EC2FleetPlacement build() {
            return new EC2FleetPlacement(affinity, availabilityZone, groupName, hostId, hostResourceGroupArn, partitionNumber, spreadDomain, tenancy);
        }
    }
}
