// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.container.inputs.AzureClusterAuthorizationGetArgs;
import io.pulumi.gcp.container.inputs.AzureClusterControlPlaneGetArgs;
import io.pulumi.gcp.container.inputs.AzureClusterFleetGetArgs;
import io.pulumi.gcp.container.inputs.AzureClusterNetworkingGetArgs;
import io.pulumi.gcp.container.inputs.AzureClusterWorkloadIdentityConfigGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureClusterState extends io.pulumi.resources.ResourceArgs {

    public static final AzureClusterState Empty = new AzureClusterState();

    /**
     * Optional. Annotations on the cluster. This field has the same restrictions as Kubernetes annotations. The total size of all keys and values combined is limited to 256k. Keys can have 2 segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @InputImport(name="annotations")
    private final @Nullable Input<Map<String,String>> annotations;

    public Input<Map<String,String>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * Required. Configuration related to the cluster RBAC settings.
     * 
     */
    @InputImport(name="authorization")
    private final @Nullable Input<AzureClusterAuthorizationGetArgs> authorization;

    public Input<AzureClusterAuthorizationGetArgs> getAuthorization() {
        return this.authorization == null ? Input.empty() : this.authorization;
    }

    /**
     * Required. The Azure region where the cluster runs. Each Google Cloud region supports a subset of nearby Azure regions. You can call to list all supported Azure regions within a given Google Cloud region.
     * 
     */
    @InputImport(name="azureRegion")
    private final @Nullable Input<String> azureRegion;

    public Input<String> getAzureRegion() {
        return this.azureRegion == null ? Input.empty() : this.azureRegion;
    }

    /**
     * Required. Name of the AzureClient. The `AzureClient` resource must reside on the same GCP project and region as the `AzureCluster`. `AzureClient` names are formatted as `projects/<project-number>/locations/<region>/azureClients/<client-id>`. See Resource Names (https:cloud.google.com/apis/design/resource_names) for more details on Google Cloud resource names.
     * 
     */
    @InputImport(name="client")
    private final @Nullable Input<String> client;

    public Input<String> getClient() {
        return this.client == null ? Input.empty() : this.client;
    }

    /**
     * Required. Configuration related to the cluster control plane.
     * 
     */
    @InputImport(name="controlPlane")
    private final @Nullable Input<AzureClusterControlPlaneGetArgs> controlPlane;

    public Input<AzureClusterControlPlaneGetArgs> getControlPlane() {
        return this.controlPlane == null ? Input.empty() : this.controlPlane;
    }

    /**
     * Output only. The time at which this cluster was created.
     * 
     */
    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * Optional. A human readable description of this cluster. Cannot be longer than 255 UTF-8 encoded bytes.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Output only. The endpoint of the cluster's API server.
     * 
     */
    @InputImport(name="endpoint")
    private final @Nullable Input<String> endpoint;

    public Input<String> getEndpoint() {
        return this.endpoint == null ? Input.empty() : this.endpoint;
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
     * Fleet configuration.
     * 
     */
    @InputImport(name="fleet")
    private final @Nullable Input<AzureClusterFleetGetArgs> fleet;

    public Input<AzureClusterFleetGetArgs> getFleet() {
        return this.fleet == null ? Input.empty() : this.fleet;
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
     * The name of this resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Required. Cluster-wide networking configuration.
     * 
     */
    @InputImport(name="networking")
    private final @Nullable Input<AzureClusterNetworkingGetArgs> networking;

    public Input<AzureClusterNetworkingGetArgs> getNetworking() {
        return this.networking == null ? Input.empty() : this.networking;
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
     * Output only. If set, there are currently changes in flight to the cluster.
     * 
     */
    @InputImport(name="reconciling")
    private final @Nullable Input<Boolean> reconciling;

    public Input<Boolean> getReconciling() {
        return this.reconciling == null ? Input.empty() : this.reconciling;
    }

    /**
     * The ARM ID the of the resource group containing proxy keyvault. Resource group ids are formatted as `/subscriptions/<subscription-id>/resourceGroups/<resource-group-name>`
     * 
     */
    @InputImport(name="resourceGroupId")
    private final @Nullable Input<String> resourceGroupId;

    public Input<String> getResourceGroupId() {
        return this.resourceGroupId == null ? Input.empty() : this.resourceGroupId;
    }

    /**
     * Output only. The current state of the cluster. Possible values: STATE_UNSPECIFIED, PROVISIONING, RUNNING, RECONCILING,
     * STOPPING, ERROR, DEGRADED
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * Output only. A globally unique identifier for the cluster.
     * 
     */
    @InputImport(name="uid")
    private final @Nullable Input<String> uid;

    public Input<String> getUid() {
        return this.uid == null ? Input.empty() : this.uid;
    }

    /**
     * Output only. The time at which this cluster was last updated.
     * 
     */
    @InputImport(name="updateTime")
    private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    /**
     * Output only. Workload Identity settings.
     * 
     */
    @InputImport(name="workloadIdentityConfigs")
    private final @Nullable Input<List<AzureClusterWorkloadIdentityConfigGetArgs>> workloadIdentityConfigs;

    public Input<List<AzureClusterWorkloadIdentityConfigGetArgs>> getWorkloadIdentityConfigs() {
        return this.workloadIdentityConfigs == null ? Input.empty() : this.workloadIdentityConfigs;
    }

    public AzureClusterState(
        @Nullable Input<Map<String,String>> annotations,
        @Nullable Input<AzureClusterAuthorizationGetArgs> authorization,
        @Nullable Input<String> azureRegion,
        @Nullable Input<String> client,
        @Nullable Input<AzureClusterControlPlaneGetArgs> controlPlane,
        @Nullable Input<String> createTime,
        @Nullable Input<String> description,
        @Nullable Input<String> endpoint,
        @Nullable Input<String> etag,
        @Nullable Input<AzureClusterFleetGetArgs> fleet,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<AzureClusterNetworkingGetArgs> networking,
        @Nullable Input<String> project,
        @Nullable Input<Boolean> reconciling,
        @Nullable Input<String> resourceGroupId,
        @Nullable Input<String> state,
        @Nullable Input<String> uid,
        @Nullable Input<String> updateTime,
        @Nullable Input<List<AzureClusterWorkloadIdentityConfigGetArgs>> workloadIdentityConfigs) {
        this.annotations = annotations;
        this.authorization = authorization;
        this.azureRegion = azureRegion;
        this.client = client;
        this.controlPlane = controlPlane;
        this.createTime = createTime;
        this.description = description;
        this.endpoint = endpoint;
        this.etag = etag;
        this.fleet = fleet;
        this.location = location;
        this.name = name;
        this.networking = networking;
        this.project = project;
        this.reconciling = reconciling;
        this.resourceGroupId = resourceGroupId;
        this.state = state;
        this.uid = uid;
        this.updateTime = updateTime;
        this.workloadIdentityConfigs = workloadIdentityConfigs;
    }

    private AzureClusterState() {
        this.annotations = Input.empty();
        this.authorization = Input.empty();
        this.azureRegion = Input.empty();
        this.client = Input.empty();
        this.controlPlane = Input.empty();
        this.createTime = Input.empty();
        this.description = Input.empty();
        this.endpoint = Input.empty();
        this.etag = Input.empty();
        this.fleet = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.networking = Input.empty();
        this.project = Input.empty();
        this.reconciling = Input.empty();
        this.resourceGroupId = Input.empty();
        this.state = Input.empty();
        this.uid = Input.empty();
        this.updateTime = Input.empty();
        this.workloadIdentityConfigs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> annotations;
        private @Nullable Input<AzureClusterAuthorizationGetArgs> authorization;
        private @Nullable Input<String> azureRegion;
        private @Nullable Input<String> client;
        private @Nullable Input<AzureClusterControlPlaneGetArgs> controlPlane;
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> description;
        private @Nullable Input<String> endpoint;
        private @Nullable Input<String> etag;
        private @Nullable Input<AzureClusterFleetGetArgs> fleet;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<AzureClusterNetworkingGetArgs> networking;
        private @Nullable Input<String> project;
        private @Nullable Input<Boolean> reconciling;
        private @Nullable Input<String> resourceGroupId;
        private @Nullable Input<String> state;
        private @Nullable Input<String> uid;
        private @Nullable Input<String> updateTime;
        private @Nullable Input<List<AzureClusterWorkloadIdentityConfigGetArgs>> workloadIdentityConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authorization = defaults.authorization;
    	      this.azureRegion = defaults.azureRegion;
    	      this.client = defaults.client;
    	      this.controlPlane = defaults.controlPlane;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.endpoint = defaults.endpoint;
    	      this.etag = defaults.etag;
    	      this.fleet = defaults.fleet;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networking = defaults.networking;
    	      this.project = defaults.project;
    	      this.reconciling = defaults.reconciling;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.state = defaults.state;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
    	      this.workloadIdentityConfigs = defaults.workloadIdentityConfigs;
        }

        public Builder setAnnotations(@Nullable Input<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable Map<String,String> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setAuthorization(@Nullable Input<AzureClusterAuthorizationGetArgs> authorization) {
            this.authorization = authorization;
            return this;
        }

        public Builder setAuthorization(@Nullable AzureClusterAuthorizationGetArgs authorization) {
            this.authorization = Input.ofNullable(authorization);
            return this;
        }

        public Builder setAzureRegion(@Nullable Input<String> azureRegion) {
            this.azureRegion = azureRegion;
            return this;
        }

        public Builder setAzureRegion(@Nullable String azureRegion) {
            this.azureRegion = Input.ofNullable(azureRegion);
            return this;
        }

        public Builder setClient(@Nullable Input<String> client) {
            this.client = client;
            return this;
        }

        public Builder setClient(@Nullable String client) {
            this.client = Input.ofNullable(client);
            return this;
        }

        public Builder setControlPlane(@Nullable Input<AzureClusterControlPlaneGetArgs> controlPlane) {
            this.controlPlane = controlPlane;
            return this;
        }

        public Builder setControlPlane(@Nullable AzureClusterControlPlaneGetArgs controlPlane) {
            this.controlPlane = Input.ofNullable(controlPlane);
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

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEndpoint(@Nullable Input<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = Input.ofNullable(endpoint);
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

        public Builder setFleet(@Nullable Input<AzureClusterFleetGetArgs> fleet) {
            this.fleet = fleet;
            return this;
        }

        public Builder setFleet(@Nullable AzureClusterFleetGetArgs fleet) {
            this.fleet = Input.ofNullable(fleet);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetworking(@Nullable Input<AzureClusterNetworkingGetArgs> networking) {
            this.networking = networking;
            return this;
        }

        public Builder setNetworking(@Nullable AzureClusterNetworkingGetArgs networking) {
            this.networking = Input.ofNullable(networking);
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

        public Builder setResourceGroupId(@Nullable Input<String> resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public Builder setResourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = Input.ofNullable(resourceGroupId);
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

        public Builder setWorkloadIdentityConfigs(@Nullable Input<List<AzureClusterWorkloadIdentityConfigGetArgs>> workloadIdentityConfigs) {
            this.workloadIdentityConfigs = workloadIdentityConfigs;
            return this;
        }

        public Builder setWorkloadIdentityConfigs(@Nullable List<AzureClusterWorkloadIdentityConfigGetArgs> workloadIdentityConfigs) {
            this.workloadIdentityConfigs = Input.ofNullable(workloadIdentityConfigs);
            return this;
        }

        public AzureClusterState build() {
            return new AzureClusterState(annotations, authorization, azureRegion, client, controlPlane, createTime, description, endpoint, etag, fleet, location, name, networking, project, reconciling, resourceGroupId, state, uid, updateTime, workloadIdentityConfigs);
        }
    }
}
