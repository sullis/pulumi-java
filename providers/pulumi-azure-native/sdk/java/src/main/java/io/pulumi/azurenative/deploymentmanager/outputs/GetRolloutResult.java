// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.azurenative.deploymentmanager.outputs.IdentityResponse;
import io.pulumi.azurenative.deploymentmanager.outputs.RolloutOperationInfoResponse;
import io.pulumi.azurenative.deploymentmanager.outputs.ServiceResponse;
import io.pulumi.azurenative.deploymentmanager.outputs.StepGroupResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRolloutResult {
    /**
     * The reference to the artifact source resource Id where the payload is located.
     * 
     */
    private final @Nullable String artifactSourceId;
    /**
     * The version of the build being deployed.
     * 
     */
    private final String buildVersion;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Identity for the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Operational information of the rollout.
     * 
     */
    private final RolloutOperationInfoResponse operationInfo;
    /**
     * The detailed information on the services being deployed.
     * 
     */
    private final List<ServiceResponse> services;
    /**
     * The current status of the rollout.
     * 
     */
    private final String status;
    /**
     * The list of step groups that define the orchestration.
     * 
     */
    private final List<StepGroupResponse> stepGroups;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The resource Id of the service topology from which service units are being referenced in step groups to be deployed.
     * 
     */
    private final String targetServiceTopologyId;
    /**
     * The cardinal count of total number of retries performed on the rollout at a given time.
     * 
     */
    private final Integer totalRetryAttempts;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"artifactSourceId","buildVersion","id","identity","location","name","operationInfo","services","status","stepGroups","tags","targetServiceTopologyId","totalRetryAttempts","type"})
    private GetRolloutResult(
        @Nullable String artifactSourceId,
        String buildVersion,
        String id,
        @Nullable IdentityResponse identity,
        String location,
        String name,
        RolloutOperationInfoResponse operationInfo,
        List<ServiceResponse> services,
        String status,
        List<StepGroupResponse> stepGroups,
        @Nullable Map<String,String> tags,
        String targetServiceTopologyId,
        Integer totalRetryAttempts,
        String type) {
        this.artifactSourceId = artifactSourceId;
        this.buildVersion = Objects.requireNonNull(buildVersion);
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.operationInfo = Objects.requireNonNull(operationInfo);
        this.services = Objects.requireNonNull(services);
        this.status = Objects.requireNonNull(status);
        this.stepGroups = Objects.requireNonNull(stepGroups);
        this.tags = tags;
        this.targetServiceTopologyId = Objects.requireNonNull(targetServiceTopologyId);
        this.totalRetryAttempts = Objects.requireNonNull(totalRetryAttempts);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The reference to the artifact source resource Id where the payload is located.
     * 
    */
    public Optional<String> getArtifactSourceId() {
        return Optional.ofNullable(this.artifactSourceId);
    }
    /**
     * The version of the build being deployed.
     * 
    */
    public String getBuildVersion() {
        return this.buildVersion;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Identity for the resource.
     * 
    */
    public Optional<IdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Operational information of the rollout.
     * 
    */
    public RolloutOperationInfoResponse getOperationInfo() {
        return this.operationInfo;
    }
    /**
     * The detailed information on the services being deployed.
     * 
    */
    public List<ServiceResponse> getServices() {
        return this.services;
    }
    /**
     * The current status of the rollout.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * The list of step groups that define the orchestration.
     * 
    */
    public List<StepGroupResponse> getStepGroups() {
        return this.stepGroups;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The resource Id of the service topology from which service units are being referenced in step groups to be deployed.
     * 
    */
    public String getTargetServiceTopologyId() {
        return this.targetServiceTopologyId;
    }
    /**
     * The cardinal count of total number of retries performed on the rollout at a given time.
     * 
    */
    public Integer getTotalRetryAttempts() {
        return this.totalRetryAttempts;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRolloutResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String artifactSourceId;
        private String buildVersion;
        private String id;
        private @Nullable IdentityResponse identity;
        private String location;
        private String name;
        private RolloutOperationInfoResponse operationInfo;
        private List<ServiceResponse> services;
        private String status;
        private List<StepGroupResponse> stepGroups;
        private @Nullable Map<String,String> tags;
        private String targetServiceTopologyId;
        private Integer totalRetryAttempts;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRolloutResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactSourceId = defaults.artifactSourceId;
    	      this.buildVersion = defaults.buildVersion;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.operationInfo = defaults.operationInfo;
    	      this.services = defaults.services;
    	      this.status = defaults.status;
    	      this.stepGroups = defaults.stepGroups;
    	      this.tags = defaults.tags;
    	      this.targetServiceTopologyId = defaults.targetServiceTopologyId;
    	      this.totalRetryAttempts = defaults.totalRetryAttempts;
    	      this.type = defaults.type;
        }

        public Builder setArtifactSourceId(@Nullable String artifactSourceId) {
            this.artifactSourceId = artifactSourceId;
            return this;
        }

        public Builder setBuildVersion(String buildVersion) {
            this.buildVersion = Objects.requireNonNull(buildVersion);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperationInfo(RolloutOperationInfoResponse operationInfo) {
            this.operationInfo = Objects.requireNonNull(operationInfo);
            return this;
        }

        public Builder setServices(List<ServiceResponse> services) {
            this.services = Objects.requireNonNull(services);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStepGroups(List<StepGroupResponse> stepGroups) {
            this.stepGroups = Objects.requireNonNull(stepGroups);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTargetServiceTopologyId(String targetServiceTopologyId) {
            this.targetServiceTopologyId = Objects.requireNonNull(targetServiceTopologyId);
            return this;
        }

        public Builder setTotalRetryAttempts(Integer totalRetryAttempts) {
            this.totalRetryAttempts = Objects.requireNonNull(totalRetryAttempts);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetRolloutResult build() {
            return new GetRolloutResult(artifactSourceId, buildVersion, id, identity, location, name, operationInfo, services, status, stepGroups, tags, targetServiceTopologyId, totalRetryAttempts, type);
        }
    }
}