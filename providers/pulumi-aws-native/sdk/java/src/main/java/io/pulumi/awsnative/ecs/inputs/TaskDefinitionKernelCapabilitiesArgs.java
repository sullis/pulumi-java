// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionKernelCapabilitiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionKernelCapabilitiesArgs Empty = new TaskDefinitionKernelCapabilitiesArgs();

    @InputImport(name="add")
    private final @Nullable Input<List<String>> add;

    public Input<List<String>> getAdd() {
        return this.add == null ? Input.empty() : this.add;
    }

    @InputImport(name="drop")
    private final @Nullable Input<List<String>> drop;

    public Input<List<String>> getDrop() {
        return this.drop == null ? Input.empty() : this.drop;
    }

    public TaskDefinitionKernelCapabilitiesArgs(
        @Nullable Input<List<String>> add,
        @Nullable Input<List<String>> drop) {
        this.add = add;
        this.drop = drop;
    }

    private TaskDefinitionKernelCapabilitiesArgs() {
        this.add = Input.empty();
        this.drop = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionKernelCapabilitiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> add;
        private @Nullable Input<List<String>> drop;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionKernelCapabilitiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.add = defaults.add;
    	      this.drop = defaults.drop;
        }

        public Builder setAdd(@Nullable Input<List<String>> add) {
            this.add = add;
            return this;
        }

        public Builder setAdd(@Nullable List<String> add) {
            this.add = Input.ofNullable(add);
            return this;
        }

        public Builder setDrop(@Nullable Input<List<String>> drop) {
            this.drop = drop;
            return this;
        }

        public Builder setDrop(@Nullable List<String> drop) {
            this.drop = Input.ofNullable(drop);
            return this;
        }

        public TaskDefinitionKernelCapabilitiesArgs build() {
            return new TaskDefinitionKernelCapabilitiesArgs(add, drop);
        }
    }
}
