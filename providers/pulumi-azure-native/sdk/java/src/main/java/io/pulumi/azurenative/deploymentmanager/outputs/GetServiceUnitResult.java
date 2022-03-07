// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.azurenative.deploymentmanager.outputs.ServiceUnitArtifactsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetServiceUnitResult {
    /**
     * The artifacts for the service unit.
     * 
     */
    private final @Nullable ServiceUnitArtifactsResponse artifacts;
    /**
     * Describes the type of ARM deployment to be performed on the resource.
     * 
     */
    private final String deploymentMode;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
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
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The Azure Resource Group to which the resources in the service unit belong to or should be deployed to.
     * 
     */
    private final String targetResourceGroup;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"artifacts","deploymentMode","id","location","name","tags","targetResourceGroup","type"})
    private GetServiceUnitResult(
        @Nullable ServiceUnitArtifactsResponse artifacts,
        String deploymentMode,
        String id,
        String location,
        String name,
        @Nullable Map<String,String> tags,
        String targetResourceGroup,
        String type) {
        this.artifacts = artifacts;
        this.deploymentMode = Objects.requireNonNull(deploymentMode);
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.tags = tags;
        this.targetResourceGroup = Objects.requireNonNull(targetResourceGroup);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The artifacts for the service unit.
     * 
    */
    public Optional<ServiceUnitArtifactsResponse> getArtifacts() {
        return Optional.ofNullable(this.artifacts);
    }
    /**
     * Describes the type of ARM deployment to be performed on the resource.
     * 
    */
    public String getDeploymentMode() {
        return this.deploymentMode;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
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
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The Azure Resource Group to which the resources in the service unit belong to or should be deployed to.
     * 
    */
    public String getTargetResourceGroup() {
        return this.targetResourceGroup;
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

    public static Builder builder(GetServiceUnitResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceUnitArtifactsResponse artifacts;
        private String deploymentMode;
        private String id;
        private String location;
        private String name;
        private @Nullable Map<String,String> tags;
        private String targetResourceGroup;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceUnitResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifacts = defaults.artifacts;
    	      this.deploymentMode = defaults.deploymentMode;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.targetResourceGroup = defaults.targetResourceGroup;
    	      this.type = defaults.type;
        }

        public Builder setArtifacts(@Nullable ServiceUnitArtifactsResponse artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        public Builder setDeploymentMode(String deploymentMode) {
            this.deploymentMode = Objects.requireNonNull(deploymentMode);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
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

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTargetResourceGroup(String targetResourceGroup) {
            this.targetResourceGroup = Objects.requireNonNull(targetResourceGroup);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetServiceUnitResult build() {
            return new GetServiceUnitResult(artifacts, deploymentMode, id, location, name, tags, targetResourceGroup, type);
        }
    }
}