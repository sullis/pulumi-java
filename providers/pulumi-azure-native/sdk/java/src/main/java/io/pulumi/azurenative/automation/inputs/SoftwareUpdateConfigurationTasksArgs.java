// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.inputs.TaskPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Task properties of the software update configuration.
 * 
 */
public final class SoftwareUpdateConfigurationTasksArgs extends io.pulumi.resources.ResourceArgs {

    public static final SoftwareUpdateConfigurationTasksArgs Empty = new SoftwareUpdateConfigurationTasksArgs();

    /**
     * Post task properties.
     * 
     */
    @InputImport(name="postTask")
    private final @Nullable Input<TaskPropertiesArgs> postTask;

    public Input<TaskPropertiesArgs> getPostTask() {
        return this.postTask == null ? Input.empty() : this.postTask;
    }

    /**
     * Pre task properties.
     * 
     */
    @InputImport(name="preTask")
    private final @Nullable Input<TaskPropertiesArgs> preTask;

    public Input<TaskPropertiesArgs> getPreTask() {
        return this.preTask == null ? Input.empty() : this.preTask;
    }

    public SoftwareUpdateConfigurationTasksArgs(
        @Nullable Input<TaskPropertiesArgs> postTask,
        @Nullable Input<TaskPropertiesArgs> preTask) {
        this.postTask = postTask;
        this.preTask = preTask;
    }

    private SoftwareUpdateConfigurationTasksArgs() {
        this.postTask = Input.empty();
        this.preTask = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareUpdateConfigurationTasksArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TaskPropertiesArgs> postTask;
        private @Nullable Input<TaskPropertiesArgs> preTask;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareUpdateConfigurationTasksArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.postTask = defaults.postTask;
    	      this.preTask = defaults.preTask;
        }

        public Builder setPostTask(@Nullable Input<TaskPropertiesArgs> postTask) {
            this.postTask = postTask;
            return this;
        }

        public Builder setPostTask(@Nullable TaskPropertiesArgs postTask) {
            this.postTask = Input.ofNullable(postTask);
            return this;
        }

        public Builder setPreTask(@Nullable Input<TaskPropertiesArgs> preTask) {
            this.preTask = preTask;
            return this;
        }

        public Builder setPreTask(@Nullable TaskPropertiesArgs preTask) {
            this.preTask = Input.ofNullable(preTask);
            return this;
        }

        public SoftwareUpdateConfigurationTasksArgs build() {
            return new SoftwareUpdateConfigurationTasksArgs(postTask, preTask);
        }
    }
}
