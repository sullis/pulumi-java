// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReplicationConfigurationReplicationDestination {
    private final String region;
    private final String registryId;

    @OutputCustomType.Constructor({"region","registryId"})
    private ReplicationConfigurationReplicationDestination(
        String region,
        String registryId) {
        this.region = Objects.requireNonNull(region);
        this.registryId = Objects.requireNonNull(registryId);
    }

    public String getRegion() {
        return this.region;
    }
    public String getRegistryId() {
        return this.registryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String region;
        private String registryId;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationReplicationDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.registryId = defaults.registryId;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegistryId(String registryId) {
            this.registryId = Objects.requireNonNull(registryId);
            return this;
        }

        public ReplicationConfigurationReplicationDestination build() {
            return new ReplicationConfigurationReplicationDestination(region, registryId);
        }
    }
}
