// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskDefinitionVolumeDockerVolumeConfigurationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionVolumeDockerVolumeConfigurationGetArgs Empty = new TaskDefinitionVolumeDockerVolumeConfigurationGetArgs();

    /**
     * If this value is `true`, the Docker volume is created if it does not already exist. *Note*: This field is only used if the scope is `shared`.
     * 
     */
    @Import(name="autoprovision")
    private @Nullable Output<Boolean> autoprovision;

    /**
     * @return If this value is `true`, the Docker volume is created if it does not already exist. *Note*: This field is only used if the scope is `shared`.
     * 
     */
    public Optional<Output<Boolean>> autoprovision() {
        return Optional.ofNullable(this.autoprovision);
    }

    /**
     * Docker volume driver to use. The driver value must match the driver name provided by Docker because it is used for task placement.
     * 
     */
    @Import(name="driver")
    private @Nullable Output<String> driver;

    /**
     * @return Docker volume driver to use. The driver value must match the driver name provided by Docker because it is used for task placement.
     * 
     */
    public Optional<Output<String>> driver() {
        return Optional.ofNullable(this.driver);
    }

    /**
     * Map of Docker driver specific options.
     * 
     */
    @Import(name="driverOpts")
    private @Nullable Output<Map<String,String>> driverOpts;

    /**
     * @return Map of Docker driver specific options.
     * 
     */
    public Optional<Output<Map<String,String>>> driverOpts() {
        return Optional.ofNullable(this.driverOpts);
    }

    /**
     * Map of custom metadata to add to your Docker volume.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Map of custom metadata to add to your Docker volume.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Scope for the Docker volume, which determines its lifecycle, either `task` or `shared`.  Docker volumes that are scoped to a `task` are automatically provisioned when the task starts and destroyed when the task stops. Docker volumes that are scoped as `shared` persist after the task stops.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return Scope for the Docker volume, which determines its lifecycle, either `task` or `shared`.  Docker volumes that are scoped to a `task` are automatically provisioned when the task starts and destroyed when the task stops. Docker volumes that are scoped as `shared` persist after the task stops.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private TaskDefinitionVolumeDockerVolumeConfigurationGetArgs() {}

    private TaskDefinitionVolumeDockerVolumeConfigurationGetArgs(TaskDefinitionVolumeDockerVolumeConfigurationGetArgs $) {
        this.autoprovision = $.autoprovision;
        this.driver = $.driver;
        this.driverOpts = $.driverOpts;
        this.labels = $.labels;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskDefinitionVolumeDockerVolumeConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskDefinitionVolumeDockerVolumeConfigurationGetArgs $;

        public Builder() {
            $ = new TaskDefinitionVolumeDockerVolumeConfigurationGetArgs();
        }

        public Builder(TaskDefinitionVolumeDockerVolumeConfigurationGetArgs defaults) {
            $ = new TaskDefinitionVolumeDockerVolumeConfigurationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoprovision If this value is `true`, the Docker volume is created if it does not already exist. *Note*: This field is only used if the scope is `shared`.
         * 
         * @return builder
         * 
         */
        public Builder autoprovision(@Nullable Output<Boolean> autoprovision) {
            $.autoprovision = autoprovision;
            return this;
        }

        /**
         * @param autoprovision If this value is `true`, the Docker volume is created if it does not already exist. *Note*: This field is only used if the scope is `shared`.
         * 
         * @return builder
         * 
         */
        public Builder autoprovision(Boolean autoprovision) {
            return autoprovision(Output.of(autoprovision));
        }

        /**
         * @param driver Docker volume driver to use. The driver value must match the driver name provided by Docker because it is used for task placement.
         * 
         * @return builder
         * 
         */
        public Builder driver(@Nullable Output<String> driver) {
            $.driver = driver;
            return this;
        }

        /**
         * @param driver Docker volume driver to use. The driver value must match the driver name provided by Docker because it is used for task placement.
         * 
         * @return builder
         * 
         */
        public Builder driver(String driver) {
            return driver(Output.of(driver));
        }

        /**
         * @param driverOpts Map of Docker driver specific options.
         * 
         * @return builder
         * 
         */
        public Builder driverOpts(@Nullable Output<Map<String,String>> driverOpts) {
            $.driverOpts = driverOpts;
            return this;
        }

        /**
         * @param driverOpts Map of Docker driver specific options.
         * 
         * @return builder
         * 
         */
        public Builder driverOpts(Map<String,String> driverOpts) {
            return driverOpts(Output.of(driverOpts));
        }

        /**
         * @param labels Map of custom metadata to add to your Docker volume.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Map of custom metadata to add to your Docker volume.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param scope Scope for the Docker volume, which determines its lifecycle, either `task` or `shared`.  Docker volumes that are scoped to a `task` are automatically provisioned when the task starts and destroyed when the task stops. Docker volumes that are scoped as `shared` persist after the task stops.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Scope for the Docker volume, which determines its lifecycle, either `task` or `shared`.  Docker volumes that are scoped to a `task` are automatically provisioned when the task starts and destroyed when the task stops. Docker volumes that are scoped as `shared` persist after the task stops.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public TaskDefinitionVolumeDockerVolumeConfigurationGetArgs build() {
            return $;
        }
    }

}
