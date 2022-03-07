// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.inputs;

import io.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationState Empty = new ReplicationConfigurationState();

    /**
     * The account ID of the destination registry to replicate to.
     * 
     */
    @InputImport(name="registryId")
      private final @Nullable Input<String> registryId;

    public Input<String> getRegistryId() {
        return this.registryId == null ? Input.empty() : this.registryId;
    }

    /**
     * Replication configuration for a registry. See Replication Configuration.
     * 
     */
    @InputImport(name="replicationConfiguration")
      private final @Nullable Input<ReplicationConfigurationReplicationConfigurationGetArgs> replicationConfiguration;

    public Input<ReplicationConfigurationReplicationConfigurationGetArgs> getReplicationConfiguration() {
        return this.replicationConfiguration == null ? Input.empty() : this.replicationConfiguration;
    }

    public ReplicationConfigurationState(
        @Nullable Input<String> registryId,
        @Nullable Input<ReplicationConfigurationReplicationConfigurationGetArgs> replicationConfiguration) {
        this.registryId = registryId;
        this.replicationConfiguration = replicationConfiguration;
    }

    private ReplicationConfigurationState() {
        this.registryId = Input.empty();
        this.replicationConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> registryId;
        private @Nullable Input<ReplicationConfigurationReplicationConfigurationGetArgs> replicationConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registryId = defaults.registryId;
    	      this.replicationConfiguration = defaults.replicationConfiguration;
        }

        public Builder setRegistryId(@Nullable Input<String> registryId) {
            this.registryId = registryId;
            return this;
        }

        public Builder setRegistryId(@Nullable String registryId) {
            this.registryId = Input.ofNullable(registryId);
            return this;
        }

        public Builder setReplicationConfiguration(@Nullable Input<ReplicationConfigurationReplicationConfigurationGetArgs> replicationConfiguration) {
            this.replicationConfiguration = replicationConfiguration;
            return this;
        }

        public Builder setReplicationConfiguration(@Nullable ReplicationConfigurationReplicationConfigurationGetArgs replicationConfiguration) {
            this.replicationConfiguration = Input.ofNullable(replicationConfiguration);
            return this;
        }
        public ReplicationConfigurationState build() {
            return new ReplicationConfigurationState(registryId, replicationConfiguration);
        }
    }
}