// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.inputs.TaskPropertiesResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Task properties of the software update configuration.
 * 
 */
public final class SoftwareUpdateConfigurationTasksResponse extends io.pulumi.resources.InvokeArgs {

    public static final SoftwareUpdateConfigurationTasksResponse Empty = new SoftwareUpdateConfigurationTasksResponse();

    /**
     * Post task properties.
     * 
     */
    @InputImport(name="postTask")
    private final @Nullable TaskPropertiesResponse postTask;

    public Optional<TaskPropertiesResponse> getPostTask() {
        return this.postTask == null ? Optional.empty() : Optional.ofNullable(this.postTask);
    }

    /**
     * Pre task properties.
     * 
     */
    @InputImport(name="preTask")
    private final @Nullable TaskPropertiesResponse preTask;

    public Optional<TaskPropertiesResponse> getPreTask() {
        return this.preTask == null ? Optional.empty() : Optional.ofNullable(this.preTask);
    }

    public SoftwareUpdateConfigurationTasksResponse(
        @Nullable TaskPropertiesResponse postTask,
        @Nullable TaskPropertiesResponse preTask) {
        this.postTask = postTask;
        this.preTask = preTask;
    }

    private SoftwareUpdateConfigurationTasksResponse() {
        this.postTask = null;
        this.preTask = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareUpdateConfigurationTasksResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TaskPropertiesResponse postTask;
        private @Nullable TaskPropertiesResponse preTask;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareUpdateConfigurationTasksResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.postTask = defaults.postTask;
    	      this.preTask = defaults.preTask;
        }

        public Builder setPostTask(@Nullable TaskPropertiesResponse postTask) {
            this.postTask = postTask;
            return this;
        }

        public Builder setPreTask(@Nullable TaskPropertiesResponse preTask) {
            this.preTask = preTask;
            return this;
        }

        public SoftwareUpdateConfigurationTasksResponse build() {
            return new SoftwareUpdateConfigurationTasksResponse(postTask, preTask);
        }
    }
}
