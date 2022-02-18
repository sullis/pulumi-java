// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * An array of objects representing the details of a replication destination.
 * 
 */
public final class ReplicationConfigurationReplicationDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationReplicationDestinationArgs Empty = new ReplicationConfigurationReplicationDestinationArgs();

    @InputImport(name="region", required=true)
    private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="registryId", required=true)
    private final Input<String> registryId;

    public Input<String> getRegistryId() {
        return this.registryId;
    }

    public ReplicationConfigurationReplicationDestinationArgs(
        Input<String> region,
        Input<String> registryId) {
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.registryId = Objects.requireNonNull(registryId, "expected parameter 'registryId' to be non-null");
    }

    private ReplicationConfigurationReplicationDestinationArgs() {
        this.region = Input.empty();
        this.registryId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> region;
        private Input<String> registryId;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationReplicationDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.registryId = defaults.registryId;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder setRegistryId(Input<String> registryId) {
            this.registryId = Objects.requireNonNull(registryId);
            return this;
        }

        public Builder setRegistryId(String registryId) {
            this.registryId = Input.of(Objects.requireNonNull(registryId));
            return this;
        }

        public ReplicationConfigurationReplicationDestinationArgs build() {
            return new ReplicationConfigurationReplicationDestinationArgs(region, registryId);
        }
    }
}
