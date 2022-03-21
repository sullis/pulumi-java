// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UptimeCheckConfigResourceGroupGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigResourceGroupGetArgs Empty = new UptimeCheckConfigResourceGroupGetArgs();

    /**
     * The group of resources being monitored. Should be the `name` of a group
     * 
     */
    @Import(name="groupId")
      private final @Nullable Output<String> groupId;

    public Output<String> getGroupId() {
        return this.groupId == null ? Output.empty() : this.groupId;
    }

    /**
     * The resource type of the group members.
     * Possible values are `RESOURCE_TYPE_UNSPECIFIED`, `INSTANCE`, and `AWS_ELB_LOAD_BALANCER`.
     * 
     */
    @Import(name="resourceType")
      private final @Nullable Output<String> resourceType;

    public Output<String> getPropResourceType() {
        return this.resourceType == null ? Output.empty() : this.resourceType;
    }

    public UptimeCheckConfigResourceGroupGetArgs(
        @Nullable Output<String> groupId,
        @Nullable Output<String> resourceType) {
        this.groupId = groupId;
        this.resourceType = resourceType;
    }

    private UptimeCheckConfigResourceGroupGetArgs() {
        this.groupId = Output.empty();
        this.resourceType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigResourceGroupGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> groupId;
        private @Nullable Output<String> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(UptimeCheckConfigResourceGroupGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder groupId(@Nullable Output<String> groupId) {
            this.groupId = groupId;
            return this;
        }
        public Builder groupId(@Nullable String groupId) {
            this.groupId = Output.ofNullable(groupId);
            return this;
        }
        public Builder resourceType(@Nullable Output<String> resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = Output.ofNullable(resourceType);
            return this;
        }        public UptimeCheckConfigResourceGroupGetArgs build() {
            return new UptimeCheckConfigResourceGroupGetArgs(groupId, resourceType);
        }
    }
}
