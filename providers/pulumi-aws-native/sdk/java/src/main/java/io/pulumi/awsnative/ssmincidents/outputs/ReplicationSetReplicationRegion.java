// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents.outputs;

import io.pulumi.awsnative.ssmincidents.outputs.ReplicationSetRegionConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReplicationSetReplicationRegion {
    private final @Nullable ReplicationSetRegionConfiguration regionConfiguration;
    private final @Nullable String regionName;

    @CustomType.Constructor
    private ReplicationSetReplicationRegion(
        @CustomType.Parameter("regionConfiguration") @Nullable ReplicationSetRegionConfiguration regionConfiguration,
        @CustomType.Parameter("regionName") @Nullable String regionName) {
        this.regionConfiguration = regionConfiguration;
        this.regionName = regionName;
    }

    public Optional<ReplicationSetRegionConfiguration> regionConfiguration() {
        return Optional.ofNullable(this.regionConfiguration);
    }
    public Optional<String> regionName() {
        return Optional.ofNullable(this.regionName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationSetReplicationRegion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ReplicationSetRegionConfiguration regionConfiguration;
        private @Nullable String regionName;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationSetReplicationRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionConfiguration = defaults.regionConfiguration;
    	      this.regionName = defaults.regionName;
        }

        public Builder regionConfiguration(@Nullable ReplicationSetRegionConfiguration regionConfiguration) {
            this.regionConfiguration = regionConfiguration;
            return this;
        }
        public Builder regionName(@Nullable String regionName) {
            this.regionName = regionName;
            return this;
        }        public ReplicationSetReplicationRegion build() {
            return new ReplicationSetReplicationRegion(regionConfiguration, regionName);
        }
    }
}
