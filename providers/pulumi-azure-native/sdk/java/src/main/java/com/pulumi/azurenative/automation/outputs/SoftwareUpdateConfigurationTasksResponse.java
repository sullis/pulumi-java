// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.outputs;

import com.pulumi.azurenative.automation.outputs.TaskPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SoftwareUpdateConfigurationTasksResponse {
    /**
     * @return Post task properties.
     * 
     */
    private final @Nullable TaskPropertiesResponse postTask;
    /**
     * @return Pre task properties.
     * 
     */
    private final @Nullable TaskPropertiesResponse preTask;

    @CustomType.Constructor
    private SoftwareUpdateConfigurationTasksResponse(
        @CustomType.Parameter("postTask") @Nullable TaskPropertiesResponse postTask,
        @CustomType.Parameter("preTask") @Nullable TaskPropertiesResponse preTask) {
        this.postTask = postTask;
        this.preTask = preTask;
    }

    /**
     * @return Post task properties.
     * 
     */
    public Optional<TaskPropertiesResponse> postTask() {
        return Optional.ofNullable(this.postTask);
    }
    /**
     * @return Pre task properties.
     * 
     */
    public Optional<TaskPropertiesResponse> preTask() {
        return Optional.ofNullable(this.preTask);
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

        public Builder postTask(@Nullable TaskPropertiesResponse postTask) {
            this.postTask = postTask;
            return this;
        }
        public Builder preTask(@Nullable TaskPropertiesResponse preTask) {
            this.preTask = preTask;
            return this;
        }        public SoftwareUpdateConfigurationTasksResponse build() {
            return new SoftwareUpdateConfigurationTasksResponse(postTask, preTask);
        }
    }
}
