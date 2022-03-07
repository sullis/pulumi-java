// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UptimeCheckConfigResourceGroupGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigResourceGroupGetArgs Empty = new UptimeCheckConfigResourceGroupGetArgs();

    /**
     * The group of resources being monitored. Should be the `name` of a group
     * 
     */
    @InputImport(name="groupId")
      private final @Nullable Input<String> groupId;

    public Input<String> getGroupId() {
        return this.groupId == null ? Input.empty() : this.groupId;
    }

    /**
     * The resource type of the group members.
     * Possible values are `RESOURCE_TYPE_UNSPECIFIED`, `INSTANCE`, and `AWS_ELB_LOAD_BALANCER`.
     * 
     */
    @InputImport(name="resourceType")
      private final @Nullable Input<String> resourceType;

    public Input<String> getPropResourceType() {
        return this.resourceType == null ? Input.empty() : this.resourceType;
    }

    public UptimeCheckConfigResourceGroupGetArgs(
        @Nullable Input<String> groupId,
        @Nullable Input<String> resourceType) {
        this.groupId = groupId;
        this.resourceType = resourceType;
    }

    private UptimeCheckConfigResourceGroupGetArgs() {
        this.groupId = Input.empty();
        this.resourceType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigResourceGroupGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> groupId;
        private @Nullable Input<String> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(UptimeCheckConfigResourceGroupGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setGroupId(@Nullable Input<String> groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder setGroupId(@Nullable String groupId) {
            this.groupId = Input.ofNullable(groupId);
            return this;
        }

        public Builder setResourceType(@Nullable Input<String> resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = Input.ofNullable(resourceType);
            return this;
        }
        public UptimeCheckConfigResourceGroupGetArgs build() {
            return new UptimeCheckConfigResourceGroupGetArgs(groupId, resourceType);
        }
    }
}