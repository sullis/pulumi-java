// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.inputs.RolloutStepResponse;
import io.pulumi.azurenative.deploymentmanager.inputs.ServiceUnitArtifactsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a service unit.
 * 
 */
public final class ServiceUnitResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceUnitResponse Empty = new ServiceUnitResponse();

    /**
     * The artifacts for the service unit.
     * 
     */
    @InputImport(name="artifacts")
      private final @Nullable ServiceUnitArtifactsResponse artifacts;

    public Optional<ServiceUnitArtifactsResponse> getArtifacts() {
        return this.artifacts == null ? Optional.empty() : Optional.ofNullable(this.artifacts);
    }

    /**
     * Describes the type of ARM deployment to be performed on the resource.
     * 
     */
    @InputImport(name="deploymentMode", required=true)
      private final String deploymentMode;

    public String getDeploymentMode() {
        return this.deploymentMode;
    }

    /**
     * Name of the service unit.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Detailed step information, if present.
     * 
     */
    @InputImport(name="steps")
      private final @Nullable List<RolloutStepResponse> steps;

    public List<RolloutStepResponse> getSteps() {
        return this.steps == null ? List.of() : this.steps;
    }

    /**
     * The Azure Resource Group to which the resources in the service unit belong to or should be deployed to.
     * 
     */
    @InputImport(name="targetResourceGroup", required=true)
      private final String targetResourceGroup;

    public String getTargetResourceGroup() {
        return this.targetResourceGroup;
    }

    public ServiceUnitResponse(
        @Nullable ServiceUnitArtifactsResponse artifacts,
        String deploymentMode,
        @Nullable String name,
        @Nullable List<RolloutStepResponse> steps,
        String targetResourceGroup) {
        this.artifacts = artifacts;
        this.deploymentMode = Objects.requireNonNull(deploymentMode, "expected parameter 'deploymentMode' to be non-null");
        this.name = name;
        this.steps = steps;
        this.targetResourceGroup = Objects.requireNonNull(targetResourceGroup, "expected parameter 'targetResourceGroup' to be non-null");
    }

    private ServiceUnitResponse() {
        this.artifacts = null;
        this.deploymentMode = null;
        this.name = null;
        this.steps = List.of();
        this.targetResourceGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceUnitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceUnitArtifactsResponse artifacts;
        private String deploymentMode;
        private @Nullable String name;
        private @Nullable List<RolloutStepResponse> steps;
        private String targetResourceGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceUnitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifacts = defaults.artifacts;
    	      this.deploymentMode = defaults.deploymentMode;
    	      this.name = defaults.name;
    	      this.steps = defaults.steps;
    	      this.targetResourceGroup = defaults.targetResourceGroup;
        }

        public Builder setArtifacts(@Nullable ServiceUnitArtifactsResponse artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        public Builder setDeploymentMode(String deploymentMode) {
            this.deploymentMode = Objects.requireNonNull(deploymentMode);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSteps(@Nullable List<RolloutStepResponse> steps) {
            this.steps = steps;
            return this;
        }

        public Builder setTargetResourceGroup(String targetResourceGroup) {
            this.targetResourceGroup = Objects.requireNonNull(targetResourceGroup);
            return this;
        }
        public ServiceUnitResponse build() {
            return new ServiceUnitResponse(artifacts, deploymentMode, name, steps, targetResourceGroup);
        }
    }
}