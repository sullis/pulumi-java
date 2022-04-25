// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticache.outputs;

import com.pulumi.awsnative.elasticache.outputs.GlobalReplicationGroupReshardingConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GlobalReplicationGroupRegionalConfiguration {
    /**
     * @return The replication group id of the Global Datastore member.
     * 
     */
    private final @Nullable String replicationGroupId;
    /**
     * @return The AWS region of the Global Datastore member.
     * 
     */
    private final @Nullable String replicationGroupRegion;
    /**
     * @return A list of PreferredAvailabilityZones objects that specifies the configuration of a node group in the resharded cluster.
     * 
     */
    private final @Nullable List<GlobalReplicationGroupReshardingConfiguration> reshardingConfigurations;

    @CustomType.Constructor
    private GlobalReplicationGroupRegionalConfiguration(
        @CustomType.Parameter("replicationGroupId") @Nullable String replicationGroupId,
        @CustomType.Parameter("replicationGroupRegion") @Nullable String replicationGroupRegion,
        @CustomType.Parameter("reshardingConfigurations") @Nullable List<GlobalReplicationGroupReshardingConfiguration> reshardingConfigurations) {
        this.replicationGroupId = replicationGroupId;
        this.replicationGroupRegion = replicationGroupRegion;
        this.reshardingConfigurations = reshardingConfigurations;
    }

    /**
     * @return The replication group id of the Global Datastore member.
     * 
     */
    public Optional<String> replicationGroupId() {
        return Optional.ofNullable(this.replicationGroupId);
    }
    /**
     * @return The AWS region of the Global Datastore member.
     * 
     */
    public Optional<String> replicationGroupRegion() {
        return Optional.ofNullable(this.replicationGroupRegion);
    }
    /**
     * @return A list of PreferredAvailabilityZones objects that specifies the configuration of a node group in the resharded cluster.
     * 
     */
    public List<GlobalReplicationGroupReshardingConfiguration> reshardingConfigurations() {
        return this.reshardingConfigurations == null ? List.of() : this.reshardingConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalReplicationGroupRegionalConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String replicationGroupId;
        private @Nullable String replicationGroupRegion;
        private @Nullable List<GlobalReplicationGroupReshardingConfiguration> reshardingConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalReplicationGroupRegionalConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicationGroupId = defaults.replicationGroupId;
    	      this.replicationGroupRegion = defaults.replicationGroupRegion;
    	      this.reshardingConfigurations = defaults.reshardingConfigurations;
        }

        public Builder replicationGroupId(@Nullable String replicationGroupId) {
            this.replicationGroupId = replicationGroupId;
            return this;
        }
        public Builder replicationGroupRegion(@Nullable String replicationGroupRegion) {
            this.replicationGroupRegion = replicationGroupRegion;
            return this;
        }
        public Builder reshardingConfigurations(@Nullable List<GlobalReplicationGroupReshardingConfiguration> reshardingConfigurations) {
            this.reshardingConfigurations = reshardingConfigurations;
            return this;
        }
        public Builder reshardingConfigurations(GlobalReplicationGroupReshardingConfiguration... reshardingConfigurations) {
            return reshardingConfigurations(List.of(reshardingConfigurations));
        }        public GlobalReplicationGroupRegionalConfiguration build() {
            return new GlobalReplicationGroupRegionalConfiguration(replicationGroupId, replicationGroupRegion, reshardingConfigurations);
        }
    }
}
