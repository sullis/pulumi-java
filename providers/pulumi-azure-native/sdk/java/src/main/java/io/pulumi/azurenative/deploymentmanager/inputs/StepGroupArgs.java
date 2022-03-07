// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.inputs.PrePostStepArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties that define a Step group in a rollout.
 * 
 */
public final class StepGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final StepGroupArgs Empty = new StepGroupArgs();

    /**
     * The list of step group names on which this step group depends on.
     * 
     */
    @InputImport(name="dependsOnStepGroups")
      private final @Nullable Input<List<String>> dependsOnStepGroups;

    public Input<List<String>> getDependsOnStepGroups() {
        return this.dependsOnStepGroups == null ? Input.empty() : this.dependsOnStepGroups;
    }

    /**
     * The resource Id of service unit to be deployed. The service unit should be from the service topology referenced in targetServiceTopologyId
     * 
     */
    @InputImport(name="deploymentTargetId", required=true)
      private final Input<String> deploymentTargetId;

    public Input<String> getDeploymentTargetId() {
        return this.deploymentTargetId;
    }

    /**
     * The name of the step group.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The list of steps to be run after deploying the target.
     * 
     */
    @InputImport(name="postDeploymentSteps")
      private final @Nullable Input<List<PrePostStepArgs>> postDeploymentSteps;

    public Input<List<PrePostStepArgs>> getPostDeploymentSteps() {
        return this.postDeploymentSteps == null ? Input.empty() : this.postDeploymentSteps;
    }

    /**
     * The list of steps to be run before deploying the target.
     * 
     */
    @InputImport(name="preDeploymentSteps")
      private final @Nullable Input<List<PrePostStepArgs>> preDeploymentSteps;

    public Input<List<PrePostStepArgs>> getPreDeploymentSteps() {
        return this.preDeploymentSteps == null ? Input.empty() : this.preDeploymentSteps;
    }

    public StepGroupArgs(
        @Nullable Input<List<String>> dependsOnStepGroups,
        Input<String> deploymentTargetId,
        Input<String> name,
        @Nullable Input<List<PrePostStepArgs>> postDeploymentSteps,
        @Nullable Input<List<PrePostStepArgs>> preDeploymentSteps) {
        this.dependsOnStepGroups = dependsOnStepGroups;
        this.deploymentTargetId = Objects.requireNonNull(deploymentTargetId, "expected parameter 'deploymentTargetId' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.postDeploymentSteps = postDeploymentSteps;
        this.preDeploymentSteps = preDeploymentSteps;
    }

    private StepGroupArgs() {
        this.dependsOnStepGroups = Input.empty();
        this.deploymentTargetId = Input.empty();
        this.name = Input.empty();
        this.postDeploymentSteps = Input.empty();
        this.preDeploymentSteps = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StepGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> dependsOnStepGroups;
        private Input<String> deploymentTargetId;
        private Input<String> name;
        private @Nullable Input<List<PrePostStepArgs>> postDeploymentSteps;
        private @Nullable Input<List<PrePostStepArgs>> preDeploymentSteps;

        public Builder() {
    	      // Empty
        }

        public Builder(StepGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOnStepGroups = defaults.dependsOnStepGroups;
    	      this.deploymentTargetId = defaults.deploymentTargetId;
    	      this.name = defaults.name;
    	      this.postDeploymentSteps = defaults.postDeploymentSteps;
    	      this.preDeploymentSteps = defaults.preDeploymentSteps;
        }

        public Builder setDependsOnStepGroups(@Nullable Input<List<String>> dependsOnStepGroups) {
            this.dependsOnStepGroups = dependsOnStepGroups;
            return this;
        }

        public Builder setDependsOnStepGroups(@Nullable List<String> dependsOnStepGroups) {
            this.dependsOnStepGroups = Input.ofNullable(dependsOnStepGroups);
            return this;
        }

        public Builder setDeploymentTargetId(Input<String> deploymentTargetId) {
            this.deploymentTargetId = Objects.requireNonNull(deploymentTargetId);
            return this;
        }

        public Builder setDeploymentTargetId(String deploymentTargetId) {
            this.deploymentTargetId = Input.of(Objects.requireNonNull(deploymentTargetId));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPostDeploymentSteps(@Nullable Input<List<PrePostStepArgs>> postDeploymentSteps) {
            this.postDeploymentSteps = postDeploymentSteps;
            return this;
        }

        public Builder setPostDeploymentSteps(@Nullable List<PrePostStepArgs> postDeploymentSteps) {
            this.postDeploymentSteps = Input.ofNullable(postDeploymentSteps);
            return this;
        }

        public Builder setPreDeploymentSteps(@Nullable Input<List<PrePostStepArgs>> preDeploymentSteps) {
            this.preDeploymentSteps = preDeploymentSteps;
            return this;
        }

        public Builder setPreDeploymentSteps(@Nullable List<PrePostStepArgs> preDeploymentSteps) {
            this.preDeploymentSteps = Input.ofNullable(preDeploymentSteps);
            return this;
        }
        public StepGroupArgs build() {
            return new StepGroupArgs(dependsOnStepGroups, deploymentTargetId, name, postDeploymentSteps, preDeploymentSteps);
        }
    }
}