// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.runtimeconfig_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.runtimeconfig_v1beta1.inputs.EndConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WaiterArgs extends io.pulumi.resources.ResourceArgs {

    public static final WaiterArgs Empty = new WaiterArgs();

    @InputImport(name="configId", required=true)
      private final Input<String> configId;

    public Input<String> getConfigId() {
        return this.configId;
    }

    /**
     * [Optional] The failure condition of this waiter. If this condition is met, `done` will be set to `true` and the `error` code will be set to `ABORTED`. The failure condition takes precedence over the success condition. If both conditions are met, a failure will be indicated. This value is optional; if no failure condition is set, the only failure scenario will be a timeout.
     * 
     */
    @InputImport(name="failure")
      private final @Nullable Input<EndConditionArgs> failure;

    public Input<EndConditionArgs> getFailure() {
        return this.failure == null ? Input.empty() : this.failure;
    }

    /**
     * The name of the Waiter resource, in the format: projects/[PROJECT_ID]/configs/[CONFIG_NAME]/waiters/[WAITER_NAME] The `[PROJECT_ID]` must be a valid Google Cloud project ID, the `[CONFIG_NAME]` must be a valid RuntimeConfig resource, the `[WAITER_NAME]` must match RFC 1035 segment specification, and the length of `[WAITER_NAME]` must be less than 64 bytes. After you create a Waiter resource, you cannot change the resource name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * [Required] The success condition. If this condition is met, `done` will be set to `true` and the `error` value will remain unset. The failure condition takes precedence over the success condition. If both conditions are met, a failure will be indicated.
     * 
     */
    @InputImport(name="success")
      private final @Nullable Input<EndConditionArgs> success;

    public Input<EndConditionArgs> getSuccess() {
        return this.success == null ? Input.empty() : this.success;
    }

    /**
     * [Required] Specifies the timeout of the waiter in seconds, beginning from the instant that `waiters().create` method is called. If this time elapses before the success or failure conditions are met, the waiter fails and sets the `error` code to `DEADLINE_EXCEEDED`.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Input<String> timeout;

    public Input<String> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    public WaiterArgs(
        Input<String> configId,
        @Nullable Input<EndConditionArgs> failure,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<EndConditionArgs> success,
        @Nullable Input<String> timeout) {
        this.configId = Objects.requireNonNull(configId, "expected parameter 'configId' to be non-null");
        this.failure = failure;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.success = success;
        this.timeout = timeout;
    }

    private WaiterArgs() {
        this.configId = Input.empty();
        this.failure = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.success = Input.empty();
        this.timeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WaiterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> configId;
        private @Nullable Input<EndConditionArgs> failure;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<EndConditionArgs> success;
        private @Nullable Input<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(WaiterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.failure = defaults.failure;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.success = defaults.success;
    	      this.timeout = defaults.timeout;
        }

        public Builder setConfigId(Input<String> configId) {
            this.configId = Objects.requireNonNull(configId);
            return this;
        }

        public Builder setConfigId(String configId) {
            this.configId = Input.of(Objects.requireNonNull(configId));
            return this;
        }

        public Builder setFailure(@Nullable Input<EndConditionArgs> failure) {
            this.failure = failure;
            return this;
        }

        public Builder setFailure(@Nullable EndConditionArgs failure) {
            this.failure = Input.ofNullable(failure);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setSuccess(@Nullable Input<EndConditionArgs> success) {
            this.success = success;
            return this;
        }

        public Builder setSuccess(@Nullable EndConditionArgs success) {
            this.success = Input.ofNullable(success);
            return this;
        }

        public Builder setTimeout(@Nullable Input<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }
        public WaiterArgs build() {
            return new WaiterArgs(configId, failure, name, project, requestId, success, timeout);
        }
    }
}