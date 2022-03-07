// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionContainerDependencyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionContainerDependencyArgs Empty = new TaskDefinitionContainerDependencyArgs();

    @InputImport(name="condition")
      private final @Nullable Input<String> condition;

    public Input<String> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="containerName")
      private final @Nullable Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName == null ? Input.empty() : this.containerName;
    }

    public TaskDefinitionContainerDependencyArgs(
        @Nullable Input<String> condition,
        @Nullable Input<String> containerName) {
        this.condition = condition;
        this.containerName = containerName;
    }

    private TaskDefinitionContainerDependencyArgs() {
        this.condition = Input.empty();
        this.containerName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionContainerDependencyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> condition;
        private @Nullable Input<String> containerName;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionContainerDependencyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.containerName = defaults.containerName;
        }

        public Builder setCondition(@Nullable Input<String> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable String condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setContainerName(@Nullable Input<String> containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = Input.ofNullable(containerName);
            return this;
        }
        public TaskDefinitionContainerDependencyArgs build() {
            return new TaskDefinitionContainerDependencyArgs(condition, containerName);
        }
    }
}