// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_beta.outputs.ResourcePolicyGroupPlacementPolicyResponse;
import io.pulumi.googlenative.compute_beta.outputs.ResourcePolicyInstanceSchedulePolicyResponse;
import io.pulumi.googlenative.compute_beta.outputs.ResourcePolicyResourceStatusResponse;
import io.pulumi.googlenative.compute_beta.outputs.ResourcePolicySnapshotSchedulePolicyResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResourcePolicyResult {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    private final String description;
    /**
     * Resource policy for instances for placement configuration.
     * 
     */
    private final ResourcePolicyGroupPlacementPolicyResponse groupPlacementPolicy;
    /**
     * Resource policy for scheduling instance operations.
     * 
     */
    private final ResourcePolicyInstanceSchedulePolicyResponse instanceSchedulePolicy;
    /**
     * Type of the resource. Always compute#resource_policies for resource policies.
     * 
     */
    private final String kind;
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    private final String region;
    /**
     * The system status of the resource policy.
     * 
     */
    private final ResourcePolicyResourceStatusResponse resourceStatus;
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
     */
    private final String selfLink;
    /**
     * Resource policy for persistent disks for creating snapshots.
     * 
     */
    private final ResourcePolicySnapshotSchedulePolicyResponse snapshotSchedulePolicy;
    /**
     * The status of resource policy creation.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetResourcePolicyResult(
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("groupPlacementPolicy") ResourcePolicyGroupPlacementPolicyResponse groupPlacementPolicy,
        @CustomType.Parameter("instanceSchedulePolicy") ResourcePolicyInstanceSchedulePolicyResponse instanceSchedulePolicy,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("resourceStatus") ResourcePolicyResourceStatusResponse resourceStatus,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("snapshotSchedulePolicy") ResourcePolicySnapshotSchedulePolicyResponse snapshotSchedulePolicy,
        @CustomType.Parameter("status") String status) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.groupPlacementPolicy = groupPlacementPolicy;
        this.instanceSchedulePolicy = instanceSchedulePolicy;
        this.kind = kind;
        this.name = name;
        this.region = region;
        this.resourceStatus = resourceStatus;
        this.selfLink = selfLink;
        this.snapshotSchedulePolicy = snapshotSchedulePolicy;
        this.status = status;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public String getDescription() {
        return this.description;
    }
    /**
     * Resource policy for instances for placement configuration.
     * 
    */
    public ResourcePolicyGroupPlacementPolicyResponse getGroupPlacementPolicy() {
        return this.groupPlacementPolicy;
    }
    /**
     * Resource policy for scheduling instance operations.
     * 
    */
    public ResourcePolicyInstanceSchedulePolicyResponse getInstanceSchedulePolicy() {
        return this.instanceSchedulePolicy;
    }
    /**
     * Type of the resource. Always compute#resource_policies for resource policies.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    public String getRegion() {
        return this.region;
    }
    /**
     * The system status of the resource policy.
     * 
    */
    public ResourcePolicyResourceStatusResponse getResourceStatus() {
        return this.resourceStatus;
    }
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Resource policy for persistent disks for creating snapshots.
     * 
    */
    public ResourcePolicySnapshotSchedulePolicyResponse getSnapshotSchedulePolicy() {
        return this.snapshotSchedulePolicy;
    }
    /**
     * The status of resource policy creation.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private ResourcePolicyGroupPlacementPolicyResponse groupPlacementPolicy;
        private ResourcePolicyInstanceSchedulePolicyResponse instanceSchedulePolicy;
        private String kind;
        private String name;
        private String region;
        private ResourcePolicyResourceStatusResponse resourceStatus;
        private String selfLink;
        private ResourcePolicySnapshotSchedulePolicyResponse snapshotSchedulePolicy;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.groupPlacementPolicy = defaults.groupPlacementPolicy;
    	      this.instanceSchedulePolicy = defaults.instanceSchedulePolicy;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.resourceStatus = defaults.resourceStatus;
    	      this.selfLink = defaults.selfLink;
    	      this.snapshotSchedulePolicy = defaults.snapshotSchedulePolicy;
    	      this.status = defaults.status;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder groupPlacementPolicy(ResourcePolicyGroupPlacementPolicyResponse groupPlacementPolicy) {
            this.groupPlacementPolicy = Objects.requireNonNull(groupPlacementPolicy);
            return this;
        }
        public Builder instanceSchedulePolicy(ResourcePolicyInstanceSchedulePolicyResponse instanceSchedulePolicy) {
            this.instanceSchedulePolicy = Objects.requireNonNull(instanceSchedulePolicy);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder resourceStatus(ResourcePolicyResourceStatusResponse resourceStatus) {
            this.resourceStatus = Objects.requireNonNull(resourceStatus);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder snapshotSchedulePolicy(ResourcePolicySnapshotSchedulePolicyResponse snapshotSchedulePolicy) {
            this.snapshotSchedulePolicy = Objects.requireNonNull(snapshotSchedulePolicy);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetResourcePolicyResult build() {
            return new GetResourcePolicyResult(creationTimestamp, description, groupPlacementPolicy, instanceSchedulePolicy, kind, name, region, resourceStatus, selfLink, snapshotSchedulePolicy, status);
        }
    }
}
