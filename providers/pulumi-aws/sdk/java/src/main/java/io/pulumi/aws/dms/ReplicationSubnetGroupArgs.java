// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dms;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationSubnetGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationSubnetGroupArgs Empty = new ReplicationSubnetGroupArgs();

    /**
     * The description for the subnet group.
     * 
     */
    @Import(name="replicationSubnetGroupDescription", required=true)
      private final Output<String> replicationSubnetGroupDescription;

    public Output<String> getReplicationSubnetGroupDescription() {
        return this.replicationSubnetGroupDescription;
    }

    /**
     * The name for the replication subnet group. This value is stored as a lowercase string.
     * 
     */
    @Import(name="replicationSubnetGroupId", required=true)
      private final Output<String> replicationSubnetGroupId;

    public Output<String> getReplicationSubnetGroupId() {
        return this.replicationSubnetGroupId;
    }

    /**
     * A list of the EC2 subnet IDs for the subnet group.
     * 
     */
    @Import(name="subnetIds", required=true)
      private final Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ReplicationSubnetGroupArgs(
        Output<String> replicationSubnetGroupDescription,
        Output<String> replicationSubnetGroupId,
        Output<List<String>> subnetIds,
        @Nullable Output<Map<String,String>> tags) {
        this.replicationSubnetGroupDescription = Objects.requireNonNull(replicationSubnetGroupDescription, "expected parameter 'replicationSubnetGroupDescription' to be non-null");
        this.replicationSubnetGroupId = Objects.requireNonNull(replicationSubnetGroupId, "expected parameter 'replicationSubnetGroupId' to be non-null");
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.tags = tags;
    }

    private ReplicationSubnetGroupArgs() {
        this.replicationSubnetGroupDescription = Output.empty();
        this.replicationSubnetGroupId = Output.empty();
        this.subnetIds = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationSubnetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> replicationSubnetGroupDescription;
        private Output<String> replicationSubnetGroupId;
        private Output<List<String>> subnetIds;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationSubnetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicationSubnetGroupDescription = defaults.replicationSubnetGroupDescription;
    	      this.replicationSubnetGroupId = defaults.replicationSubnetGroupId;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
        }

        public Builder replicationSubnetGroupDescription(Output<String> replicationSubnetGroupDescription) {
            this.replicationSubnetGroupDescription = Objects.requireNonNull(replicationSubnetGroupDescription);
            return this;
        }
        public Builder replicationSubnetGroupDescription(String replicationSubnetGroupDescription) {
            this.replicationSubnetGroupDescription = Output.of(Objects.requireNonNull(replicationSubnetGroupDescription));
            return this;
        }
        public Builder replicationSubnetGroupId(Output<String> replicationSubnetGroupId) {
            this.replicationSubnetGroupId = Objects.requireNonNull(replicationSubnetGroupId);
            return this;
        }
        public Builder replicationSubnetGroupId(String replicationSubnetGroupId) {
            this.replicationSubnetGroupId = Output.of(Objects.requireNonNull(replicationSubnetGroupId));
            return this;
        }
        public Builder subnetIds(Output<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Output.of(Objects.requireNonNull(subnetIds));
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public ReplicationSubnetGroupArgs build() {
            return new ReplicationSubnetGroupArgs(replicationSubnetGroupDescription, replicationSubnetGroupId, subnetIds, tags);
        }
    }
}
