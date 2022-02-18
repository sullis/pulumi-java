// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionVolumeFromArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionVolumeFromArgs Empty = new TaskDefinitionVolumeFromArgs();

    @InputImport(name="readOnly")
    private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    @InputImport(name="sourceContainer")
    private final @Nullable Input<String> sourceContainer;

    public Input<String> getSourceContainer() {
        return this.sourceContainer == null ? Input.empty() : this.sourceContainer;
    }

    public TaskDefinitionVolumeFromArgs(
        @Nullable Input<Boolean> readOnly,
        @Nullable Input<String> sourceContainer) {
        this.readOnly = readOnly;
        this.sourceContainer = sourceContainer;
    }

    private TaskDefinitionVolumeFromArgs() {
        this.readOnly = Input.empty();
        this.sourceContainer = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolumeFromArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> readOnly;
        private @Nullable Input<String> sourceContainer;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolumeFromArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readOnly = defaults.readOnly;
    	      this.sourceContainer = defaults.sourceContainer;
        }

        public Builder setReadOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }

        public Builder setSourceContainer(@Nullable Input<String> sourceContainer) {
            this.sourceContainer = sourceContainer;
            return this;
        }

        public Builder setSourceContainer(@Nullable String sourceContainer) {
            this.sourceContainer = Input.ofNullable(sourceContainer);
            return this;
        }

        public TaskDefinitionVolumeFromArgs build() {
            return new TaskDefinitionVolumeFromArgs(readOnly, sourceContainer);
        }
    }
}
