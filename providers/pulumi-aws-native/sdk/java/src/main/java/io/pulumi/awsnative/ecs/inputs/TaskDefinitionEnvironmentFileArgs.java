// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionEnvironmentFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionEnvironmentFileArgs Empty = new TaskDefinitionEnvironmentFileArgs();

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public TaskDefinitionEnvironmentFileArgs(
        @Nullable Input<String> type,
        @Nullable Input<String> value) {
        this.type = type;
        this.value = value;
    }

    private TaskDefinitionEnvironmentFileArgs() {
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionEnvironmentFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> type;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionEnvironmentFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public TaskDefinitionEnvironmentFileArgs build() {
            return new TaskDefinitionEnvironmentFileArgs(type, value);
        }
    }
}
