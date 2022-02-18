// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.container.inputs.AzureNodePoolAutoscalingGetArgs;
import io.pulumi.gcp.container.inputs.AzureNodePoolConfigGetArgs;
import io.pulumi.gcp.container.inputs.AzureNodePoolMaxPodsConstraintGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureNodePoolState extends io.pulumi.resources.ResourceArgs {

    public static final AzureNodePoolState Empty = new AzureNodePoolState();

    /**
     * Optional. Annotations on the node pool. This field has the same restrictions as Kubernetes annotations. The total size of all keys and values combined is limited to 256k. Keys can have 2 segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @InputImport(name="annotations")
    private final @Nullable Input<Map<String,String>> annotations;

    public Input<Map<String,String>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * Required. Autoscaler configuration for this node pool.
     * 
     */
    @InputImport(name="autoscaling")
    private final @Nullable Input<AzureNodePoolAutoscalingGetArgs> autoscaling;

    public Input<AzureNodePoolAutoscalingGetArgs> getAutoscaling() {
        return this.autoscaling == null ? Input.empty() : this.autoscaling;
    }

    /**
     * Optional. The Azure availability zone of the nodes in this nodepool. When unspecified, it defaults to `1`.
     * 
     */
    @InputImport(name="azureAvailabilityZone")
    private final @Nullable Input<String> azureAvailabilityZone;

    public Input<String> getAzureAvailabilityZone() {
        return this.azureAvailabilityZone == null ? Input.empty() : this.azureAvailabilityZone;
    }

    /**
     * The azureCluster for the resource
     * 
     */
    @InputImport(name="cluster")
    private final @Nullable Input<String> cluster;

    public Input<String> getCluster() {
        return this.cluster == null ? Input.empty() : this.cluster;
    }

    /**
     * Required. The node configuration of the node pool.
     * 
     */
    @InputImport(name="config")
    private final @Nullable Input<AzureNodePoolConfigGetArgs> config;

    public Input<AzureNodePoolConfigGetArgs> getConfig() {
        return this.config == null ? Input.empty() : this.config;
    }

    /**
     * Output only. The time at which this node pool was created.
     * 
     */
    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * Allows clients to perform consistent read-modify-writes through optimistic concurrency control. May be sent on update
     * and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The location for the resource
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Required. The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
     */
    @InputImport(name="maxPodsConstraint")
    private final @Nullable Input<AzureNodePoolMaxPodsConstraintGetArgs> maxPodsConstraint;

    public Input<AzureNodePoolMaxPodsConstraintGetArgs> getMaxPodsConstraint() {
        return this.maxPodsConstraint == null ? Input.empty() : this.maxPodsConstraint;
    }

    /**
     * The name of this resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The project for the resource
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Output only. If set, there are currently pending changes to the node pool.
     * 
     */
    @InputImport(name="reconciling")
    private final @Nullable Input<Boolean> reconciling;

    public Input<Boolean> getReconciling() {
        return this.reconciling == null ? Input.empty() : this.reconciling;
    }

    /**
     * Output only. The current state of the node pool. Possible values: STATE_UNSPECIFIED, PROVISIONING, RUNNING, RECONCILING,
     * STOPPING, ERROR, DEGRADED
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * Required. The ARM ID of the subnet where the node pool VMs run. Make sure it's a subnet under the virtual network in the cluster configuration.
     * 
     */
    @InputImport(name="subnetId")
    private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    /**
     * Output only. A globally unique identifier for the node pool.
     * 
     */
    @InputImport(name="uid")
    private final @Nullable Input<String> uid;

    public Input<String> getUid() {
        return this.uid == null ? Input.empty() : this.uid;
    }

    /**
     * Output only. The time at which this node pool was last updated.
     * 
     */
    @InputImport(name="updateTime")
    private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    /**
     * Required. The Kubernetes version (e.g. `1.19.10-gke.1000`) running on this node pool.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public AzureNodePoolState(
        @Nullable Input<Map<String,String>> annotations,
        @Nullable Input<AzureNodePoolAutoscalingGetArgs> autoscaling,
        @Nullable Input<String> azureAvailabilityZone,
        @Nullable Input<String> cluster,
        @Nullable Input<AzureNodePoolConfigGetArgs> config,
        @Nullable Input<String> createTime,
        @Nullable Input<String> etag,
        @Nullable Input<String> location,
        @Nullable Input<AzureNodePoolMaxPodsConstraintGetArgs> maxPodsConstraint,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<Boolean> reconciling,
        @Nullable Input<String> state,
        @Nullable Input<String> subnetId,
        @Nullable Input<String> uid,
        @Nullable Input<String> updateTime,
        @Nullable Input<String> version) {
        this.annotations = annotations;
        this.autoscaling = autoscaling;
        this.azureAvailabilityZone = azureAvailabilityZone;
        this.cluster = cluster;
        this.config = config;
        this.createTime = createTime;
        this.etag = etag;
        this.location = location;
        this.maxPodsConstraint = maxPodsConstraint;
        this.name = name;
        this.project = project;
        this.reconciling = reconciling;
        this.state = state;
        this.subnetId = subnetId;
        this.uid = uid;
        this.updateTime = updateTime;
        this.version = version;
    }

    private AzureNodePoolState() {
        this.annotations = Input.empty();
        this.autoscaling = Input.empty();
        this.azureAvailabilityZone = Input.empty();
        this.cluster = Input.empty();
        this.config = Input.empty();
        this.createTime = Input.empty();
        this.etag = Input.empty();
        this.location = Input.empty();
        this.maxPodsConstraint = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.reconciling = Input.empty();
        this.state = Input.empty();
        this.subnetId = Input.empty();
        this.uid = Input.empty();
        this.updateTime = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureNodePoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> annotations;
        private @Nullable Input<AzureNodePoolAutoscalingGetArgs> autoscaling;
        private @Nullable Input<String> azureAvailabilityZone;
        private @Nullable Input<String> cluster;
        private @Nullable Input<AzureNodePoolConfigGetArgs> config;
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> location;
        private @Nullable Input<AzureNodePoolMaxPodsConstraintGetArgs> maxPodsConstraint;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<Boolean> reconciling;
        private @Nullable Input<String> state;
        private @Nullable Input<String> subnetId;
        private @Nullable Input<String> uid;
        private @Nullable Input<String> updateTime;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureNodePoolState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.autoscaling = defaults.autoscaling;
    	      this.azureAvailabilityZone = defaults.azureAvailabilityZone;
    	      this.cluster = defaults.cluster;
    	      this.config = defaults.config;
    	      this.createTime = defaults.createTime;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.maxPodsConstraint = defaults.maxPodsConstraint;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.reconciling = defaults.reconciling;
    	      this.state = defaults.state;
    	      this.subnetId = defaults.subnetId;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
    	      this.version = defaults.version;
        }

        public Builder setAnnotations(@Nullable Input<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable Map<String,String> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setAutoscaling(@Nullable Input<AzureNodePoolAutoscalingGetArgs> autoscaling) {
            this.autoscaling = autoscaling;
            return this;
        }

        public Builder setAutoscaling(@Nullable AzureNodePoolAutoscalingGetArgs autoscaling) {
            this.autoscaling = Input.ofNullable(autoscaling);
            return this;
        }

        public Builder setAzureAvailabilityZone(@Nullable Input<String> azureAvailabilityZone) {
            this.azureAvailabilityZone = azureAvailabilityZone;
            return this;
        }

        public Builder setAzureAvailabilityZone(@Nullable String azureAvailabilityZone) {
            this.azureAvailabilityZone = Input.ofNullable(azureAvailabilityZone);
            return this;
        }

        public Builder setCluster(@Nullable Input<String> cluster) {
            this.cluster = cluster;
            return this;
        }

        public Builder setCluster(@Nullable String cluster) {
            this.cluster = Input.ofNullable(cluster);
            return this;
        }

        public Builder setConfig(@Nullable Input<AzureNodePoolConfigGetArgs> config) {
            this.config = config;
            return this;
        }

        public Builder setConfig(@Nullable AzureNodePoolConfigGetArgs config) {
            this.config = Input.ofNullable(config);
            return this;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMaxPodsConstraint(@Nullable Input<AzureNodePoolMaxPodsConstraintGetArgs> maxPodsConstraint) {
            this.maxPodsConstraint = maxPodsConstraint;
            return this;
        }

        public Builder setMaxPodsConstraint(@Nullable AzureNodePoolMaxPodsConstraintGetArgs maxPodsConstraint) {
            this.maxPodsConstraint = Input.ofNullable(maxPodsConstraint);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setReconciling(@Nullable Input<Boolean> reconciling) {
            this.reconciling = reconciling;
            return this;
        }

        public Builder setReconciling(@Nullable Boolean reconciling) {
            this.reconciling = Input.ofNullable(reconciling);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setSubnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
            return this;
        }

        public Builder setUid(@Nullable Input<String> uid) {
            this.uid = uid;
            return this;
        }

        public Builder setUid(@Nullable String uid) {
            this.uid = Input.ofNullable(uid);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public AzureNodePoolState build() {
            return new AzureNodePoolState(annotations, autoscaling, azureAvailabilityZone, cluster, config, createTime, etag, location, maxPodsConstraint, name, project, reconciling, state, subnetId, uid, updateTime, version);
        }
    }
}
