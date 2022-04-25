// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.outputs;

import com.pulumi.azurenative.deploymentmanager.outputs.PrePostStepResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class StepGroupResponse {
    /**
     * @return The list of step group names on which this step group depends on.
     * 
     */
    private final @Nullable List<String> dependsOnStepGroups;
    /**
     * @return The resource Id of service unit to be deployed. The service unit should be from the service topology referenced in targetServiceTopologyId
     * 
     */
    private final String deploymentTargetId;
    /**
     * @return The name of the step group.
     * 
     */
    private final String name;
    /**
     * @return The list of steps to be run after deploying the target.
     * 
     */
    private final @Nullable List<PrePostStepResponse> postDeploymentSteps;
    /**
     * @return The list of steps to be run before deploying the target.
     * 
     */
    private final @Nullable List<PrePostStepResponse> preDeploymentSteps;

    @CustomType.Constructor
    private StepGroupResponse(
        @CustomType.Parameter("dependsOnStepGroups") @Nullable List<String> dependsOnStepGroups,
        @CustomType.Parameter("deploymentTargetId") String deploymentTargetId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("postDeploymentSteps") @Nullable List<PrePostStepResponse> postDeploymentSteps,
        @CustomType.Parameter("preDeploymentSteps") @Nullable List<PrePostStepResponse> preDeploymentSteps) {
        this.dependsOnStepGroups = dependsOnStepGroups;
        this.deploymentTargetId = deploymentTargetId;
        this.name = name;
        this.postDeploymentSteps = postDeploymentSteps;
        this.preDeploymentSteps = preDeploymentSteps;
    }

    /**
     * @return The list of step group names on which this step group depends on.
     * 
     */
    public List<String> dependsOnStepGroups() {
        return this.dependsOnStepGroups == null ? List.of() : this.dependsOnStepGroups;
    }
    /**
     * @return The resource Id of service unit to be deployed. The service unit should be from the service topology referenced in targetServiceTopologyId
     * 
     */
    public String deploymentTargetId() {
        return this.deploymentTargetId;
    }
    /**
     * @return The name of the step group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The list of steps to be run after deploying the target.
     * 
     */
    public List<PrePostStepResponse> postDeploymentSteps() {
        return this.postDeploymentSteps == null ? List.of() : this.postDeploymentSteps;
    }
    /**
     * @return The list of steps to be run before deploying the target.
     * 
     */
    public List<PrePostStepResponse> preDeploymentSteps() {
        return this.preDeploymentSteps == null ? List.of() : this.preDeploymentSteps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StepGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dependsOnStepGroups;
        private String deploymentTargetId;
        private String name;
        private @Nullable List<PrePostStepResponse> postDeploymentSteps;
        private @Nullable List<PrePostStepResponse> preDeploymentSteps;

        public Builder() {
    	      // Empty
        }

        public Builder(StepGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOnStepGroups = defaults.dependsOnStepGroups;
    	      this.deploymentTargetId = defaults.deploymentTargetId;
    	      this.name = defaults.name;
    	      this.postDeploymentSteps = defaults.postDeploymentSteps;
    	      this.preDeploymentSteps = defaults.preDeploymentSteps;
        }

        public Builder dependsOnStepGroups(@Nullable List<String> dependsOnStepGroups) {
            this.dependsOnStepGroups = dependsOnStepGroups;
            return this;
        }
        public Builder dependsOnStepGroups(String... dependsOnStepGroups) {
            return dependsOnStepGroups(List.of(dependsOnStepGroups));
        }
        public Builder deploymentTargetId(String deploymentTargetId) {
            this.deploymentTargetId = Objects.requireNonNull(deploymentTargetId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder postDeploymentSteps(@Nullable List<PrePostStepResponse> postDeploymentSteps) {
            this.postDeploymentSteps = postDeploymentSteps;
            return this;
        }
        public Builder postDeploymentSteps(PrePostStepResponse... postDeploymentSteps) {
            return postDeploymentSteps(List.of(postDeploymentSteps));
        }
        public Builder preDeploymentSteps(@Nullable List<PrePostStepResponse> preDeploymentSteps) {
            this.preDeploymentSteps = preDeploymentSteps;
            return this;
        }
        public Builder preDeploymentSteps(PrePostStepResponse... preDeploymentSteps) {
            return preDeploymentSteps(List.of(preDeploymentSteps));
        }        public StepGroupResponse build() {
            return new StepGroupResponse(dependsOnStepGroups, deploymentTargetId, name, postDeploymentSteps, preDeploymentSteps);
        }
    }
}
