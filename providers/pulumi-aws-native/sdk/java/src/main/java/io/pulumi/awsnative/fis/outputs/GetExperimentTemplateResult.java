// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.fis.outputs;

import io.pulumi.awsnative.fis.outputs.ExperimentTemplateActionMap;
import io.pulumi.awsnative.fis.outputs.ExperimentTemplateStopCondition;
import io.pulumi.awsnative.fis.outputs.ExperimentTemplateTargetMap;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetExperimentTemplateResult {
    private final @Nullable ExperimentTemplateActionMap actions;
    private final @Nullable String description;
    private final @Nullable String id;
    private final @Nullable String roleArn;
    private final @Nullable List<ExperimentTemplateStopCondition> stopConditions;
    private final @Nullable ExperimentTemplateTargetMap targets;

    @OutputCustomType.Constructor
    private GetExperimentTemplateResult(
        @OutputCustomType.Parameter("actions") @Nullable ExperimentTemplateActionMap actions,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("roleArn") @Nullable String roleArn,
        @OutputCustomType.Parameter("stopConditions") @Nullable List<ExperimentTemplateStopCondition> stopConditions,
        @OutputCustomType.Parameter("targets") @Nullable ExperimentTemplateTargetMap targets) {
        this.actions = actions;
        this.description = description;
        this.id = id;
        this.roleArn = roleArn;
        this.stopConditions = stopConditions;
        this.targets = targets;
    }

    public Optional<ExperimentTemplateActionMap> getActions() {
        return Optional.ofNullable(this.actions);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    public List<ExperimentTemplateStopCondition> getStopConditions() {
        return this.stopConditions == null ? List.of() : this.stopConditions;
    }
    public Optional<ExperimentTemplateTargetMap> getTargets() {
        return Optional.ofNullable(this.targets);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExperimentTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExperimentTemplateActionMap actions;
        private @Nullable String description;
        private @Nullable String id;
        private @Nullable String roleArn;
        private @Nullable List<ExperimentTemplateStopCondition> stopConditions;
        private @Nullable ExperimentTemplateTargetMap targets;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExperimentTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.roleArn = defaults.roleArn;
    	      this.stopConditions = defaults.stopConditions;
    	      this.targets = defaults.targets;
        }

        public Builder setActions(@Nullable ExperimentTemplateActionMap actions) {
            this.actions = actions;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setStopConditions(@Nullable List<ExperimentTemplateStopCondition> stopConditions) {
            this.stopConditions = stopConditions;
            return this;
        }

        public Builder setTargets(@Nullable ExperimentTemplateTargetMap targets) {
            this.targets = targets;
            return this;
        }
        public GetExperimentTemplateResult build() {
            return new GetExperimentTemplateResult(actions, description, id, roleArn, stopConditions, targets);
        }
    }
}
