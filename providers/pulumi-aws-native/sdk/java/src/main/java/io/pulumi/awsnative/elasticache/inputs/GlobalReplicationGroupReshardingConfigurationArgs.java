// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticache.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalReplicationGroupReshardingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalReplicationGroupReshardingConfigurationArgs Empty = new GlobalReplicationGroupReshardingConfigurationArgs();

    /**
     * Unique identifier for the Node Group. This is either auto-generated by ElastiCache (4-digit id) or a user supplied id.
     * 
     */
    @Import(name="nodeGroupId")
      private final @Nullable Output<String> nodeGroupId;

    public Output<String> nodeGroupId() {
        return this.nodeGroupId == null ? Codegen.empty() : this.nodeGroupId;
    }

    /**
     * A list of preferred availability zones for the nodes of new node groups.
     * 
     */
    @Import(name="preferredAvailabilityZones")
      private final @Nullable Output<List<String>> preferredAvailabilityZones;

    public Output<List<String>> preferredAvailabilityZones() {
        return this.preferredAvailabilityZones == null ? Codegen.empty() : this.preferredAvailabilityZones;
    }

    public GlobalReplicationGroupReshardingConfigurationArgs(
        @Nullable Output<String> nodeGroupId,
        @Nullable Output<List<String>> preferredAvailabilityZones) {
        this.nodeGroupId = nodeGroupId;
        this.preferredAvailabilityZones = preferredAvailabilityZones;
    }

    private GlobalReplicationGroupReshardingConfigurationArgs() {
        this.nodeGroupId = Codegen.empty();
        this.preferredAvailabilityZones = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalReplicationGroupReshardingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> nodeGroupId;
        private @Nullable Output<List<String>> preferredAvailabilityZones;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalReplicationGroupReshardingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeGroupId = defaults.nodeGroupId;
    	      this.preferredAvailabilityZones = defaults.preferredAvailabilityZones;
        }

        public Builder nodeGroupId(@Nullable Output<String> nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public Builder nodeGroupId(@Nullable String nodeGroupId) {
            this.nodeGroupId = Codegen.ofNullable(nodeGroupId);
            return this;
        }
        public Builder preferredAvailabilityZones(@Nullable Output<List<String>> preferredAvailabilityZones) {
            this.preferredAvailabilityZones = preferredAvailabilityZones;
            return this;
        }
        public Builder preferredAvailabilityZones(@Nullable List<String> preferredAvailabilityZones) {
            this.preferredAvailabilityZones = Codegen.ofNullable(preferredAvailabilityZones);
            return this;
        }
        public Builder preferredAvailabilityZones(String... preferredAvailabilityZones) {
            return preferredAvailabilityZones(List.of(preferredAvailabilityZones));
        }        public GlobalReplicationGroupReshardingConfigurationArgs build() {
            return new GlobalReplicationGroupReshardingConfigurationArgs(nodeGroupId, preferredAvailabilityZones);
        }
    }
}
