// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.machinelearningservices.enums.ComputeEnvironmentType;
import io.pulumi.azurenative.machinelearningservices.inputs.CreateServiceRequestEnvironmentImageRequestArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.CreateServiceRequestKeysArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MachineLearningServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final MachineLearningServiceArgs Empty = new MachineLearningServiceArgs();

    /**
     * The compute environment type for the service.
     * 
     */
    @InputImport(name="computeType", required=true)
      private final Input<Either<String,ComputeEnvironmentType>> computeType;

    public Input<Either<String,ComputeEnvironmentType>> getComputeType() {
        return this.computeType;
    }

    /**
     * The description of the service.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The Environment, models and assets needed for inferencing.
     * 
     */
    @InputImport(name="environmentImageRequest")
      private final @Nullable Input<CreateServiceRequestEnvironmentImageRequestArgs> environmentImageRequest;

    public Input<CreateServiceRequestEnvironmentImageRequestArgs> getEnvironmentImageRequest() {
        return this.environmentImageRequest == null ? Input.empty() : this.environmentImageRequest;
    }

    /**
     * The authentication keys.
     * 
     */
    @InputImport(name="keys")
      private final @Nullable Input<CreateServiceRequestKeysArgs> keys;

    public Input<CreateServiceRequestKeysArgs> getKeys() {
        return this.keys == null ? Input.empty() : this.keys;
    }

    /**
     * The service tag dictionary. Tags are mutable.
     * 
     */
    @InputImport(name="kvTags")
      private final @Nullable Input<Map<String,String>> kvTags;

    public Input<Map<String,String>> getKvTags() {
        return this.kvTags == null ? Input.empty() : this.kvTags;
    }

    /**
     * The name of the Azure location/region.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The service properties dictionary. Properties are immutable.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the Azure Machine Learning service.
     * 
     */
    @InputImport(name="serviceName")
      private final @Nullable Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName == null ? Input.empty() : this.serviceName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public MachineLearningServiceArgs(
        Input<Either<String,ComputeEnvironmentType>> computeType,
        @Nullable Input<String> description,
        @Nullable Input<CreateServiceRequestEnvironmentImageRequestArgs> environmentImageRequest,
        @Nullable Input<CreateServiceRequestKeysArgs> keys,
        @Nullable Input<Map<String,String>> kvTags,
        @Nullable Input<String> location,
        @Nullable Input<Map<String,String>> properties,
        Input<String> resourceGroupName,
        @Nullable Input<String> serviceName,
        Input<String> workspaceName) {
        this.computeType = Objects.requireNonNull(computeType, "expected parameter 'computeType' to be non-null");
        this.description = description;
        this.environmentImageRequest = environmentImageRequest;
        this.keys = keys;
        this.kvTags = kvTags;
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = serviceName;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private MachineLearningServiceArgs() {
        this.computeType = Input.empty();
        this.description = Input.empty();
        this.environmentImageRequest = Input.empty();
        this.keys = Input.empty();
        this.kvTags = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineLearningServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,ComputeEnvironmentType>> computeType;
        private @Nullable Input<String> description;
        private @Nullable Input<CreateServiceRequestEnvironmentImageRequestArgs> environmentImageRequest;
        private @Nullable Input<CreateServiceRequestKeysArgs> keys;
        private @Nullable Input<Map<String,String>> kvTags;
        private @Nullable Input<String> location;
        private @Nullable Input<Map<String,String>> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> serviceName;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineLearningServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeType = defaults.computeType;
    	      this.description = defaults.description;
    	      this.environmentImageRequest = defaults.environmentImageRequest;
    	      this.keys = defaults.keys;
    	      this.kvTags = defaults.kvTags;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setComputeType(Input<Either<String,ComputeEnvironmentType>> computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }

        public Builder setComputeType(Either<String,ComputeEnvironmentType> computeType) {
            this.computeType = Input.of(Objects.requireNonNull(computeType));
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

        public Builder setEnvironmentImageRequest(@Nullable Input<CreateServiceRequestEnvironmentImageRequestArgs> environmentImageRequest) {
            this.environmentImageRequest = environmentImageRequest;
            return this;
        }

        public Builder setEnvironmentImageRequest(@Nullable CreateServiceRequestEnvironmentImageRequestArgs environmentImageRequest) {
            this.environmentImageRequest = Input.ofNullable(environmentImageRequest);
            return this;
        }

        public Builder setKeys(@Nullable Input<CreateServiceRequestKeysArgs> keys) {
            this.keys = keys;
            return this;
        }

        public Builder setKeys(@Nullable CreateServiceRequestKeysArgs keys) {
            this.keys = Input.ofNullable(keys);
            return this;
        }

        public Builder setKvTags(@Nullable Input<Map<String,String>> kvTags) {
            this.kvTags = kvTags;
            return this;
        }

        public Builder setKvTags(@Nullable Map<String,String> kvTags) {
            this.kvTags = Input.ofNullable(kvTags);
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

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServiceName(@Nullable Input<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder setServiceName(@Nullable String serviceName) {
            this.serviceName = Input.ofNullable(serviceName);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public MachineLearningServiceArgs build() {
            return new MachineLearningServiceArgs(computeType, description, environmentImageRequest, keys, kvTags, location, properties, resourceGroupName, serviceName, workspaceName);
        }
    }
}