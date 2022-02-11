// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ReplicationConfigurationReplicationDestination extends io.pulumi.resources.InvokeArgs {

    public static final ReplicationConfigurationReplicationDestination Empty = new ReplicationConfigurationReplicationDestination();

    @InputImport(name="region", required=true)
    private final String region;

    public String getRegion() {
        return this.region;
    }

    @InputImport(name="registryId", required=true)
    private final String registryId;

    public String getRegistryId() {
        return this.registryId;
    }

    public ReplicationConfigurationReplicationDestination(
        String region,
        String registryId) {
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.registryId = Objects.requireNonNull(registryId, "expected parameter 'registryId' to be non-null");
    }

    private ReplicationConfigurationReplicationDestination() {
        this.region = null;
        this.registryId = null;
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
