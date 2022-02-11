// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs;

import io.pulumi.awsnative.ecs.enums.TaskSetLaunchType;
import io.pulumi.awsnative.ecs.inputs.TaskSetLoadBalancerArgs;
import io.pulumi.awsnative.ecs.inputs.TaskSetNetworkConfigurationArgs;
import io.pulumi.awsnative.ecs.inputs.TaskSetScaleArgs;
import io.pulumi.awsnative.ecs.inputs.TaskSetServiceRegistryArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskSetArgs Empty = new TaskSetArgs();

    @InputImport(name="cluster", required=true)
    private final Input<String> cluster;

    public Input<String> getCluster() {
        return this.cluster;
    }

    @InputImport(name="externalId")
    private final @Nullable Input<String> externalId;

    public Input<String> getExternalId() {
        return this.externalId == null ? Input.empty() : this.externalId;
    }

    @InputImport(name="launchType")
    private final @Nullable Input<TaskSetLaunchType> launchType;

    public Input<TaskSetLaunchType> getLaunchType() {
        return this.launchType == null ? Input.empty() : this.launchType;
    }

    @InputImport(name="loadBalancers")
    private final @Nullable Input<List<TaskSetLoadBalancerArgs>> loadBalancers;

    public Input<List<TaskSetLoadBalancerArgs>> getLoadBalancers() {
        return this.loadBalancers == null ? Input.empty() : this.loadBalancers;
    }

    @InputImport(name="networkConfiguration")
    private final @Nullable Input<TaskSetNetworkConfigurationArgs> networkConfiguration;

    public Input<TaskSetNetworkConfigurationArgs> getNetworkConfiguration() {
        return this.networkConfiguration == null ? Input.empty() : this.networkConfiguration;
    }

    @InputImport(name="platformVersion")
    private final @Nullable Input<String> platformVersion;

    public Input<String> getPlatformVersion() {
        return this.platformVersion == null ? Input.empty() : this.platformVersion;
    }

    @InputImport(name="scale")
    private final @Nullable Input<TaskSetScaleArgs> scale;

    public Input<TaskSetScaleArgs> getScale() {
        return this.scale == null ? Input.empty() : this.scale;
    }

    @InputImport(name="service", required=true)
    private final Input<String> service;

    public Input<String> getService() {
        return this.service;
    }

    @InputImport(name="serviceRegistries")
    private final @Nullable Input<List<TaskSetServiceRegistryArgs>> serviceRegistries;

    public Input<List<TaskSetServiceRegistryArgs>> getServiceRegistries() {
        return this.serviceRegistries == null ? Input.empty() : this.serviceRegistries;
    }

    @InputImport(name="taskDefinition", required=true)
    private final Input<String> taskDefinition;

    public Input<String> getTaskDefinition() {
        return this.taskDefinition;
    }

    public TaskSetArgs(
        Input<String> cluster,
        @Nullable Input<String> externalId,
        @Nullable Input<TaskSetLaunchType> launchType,
        @Nullable Input<List<TaskSetLoadBalancerArgs>> loadBalancers,
        @Nullable Input<TaskSetNetworkConfigurationArgs> networkConfiguration,
        @Nullable Input<String> platformVersion,
        @Nullable Input<TaskSetScaleArgs> scale,
        Input<String> service,
        @Nullable Input<List<TaskSetServiceRegistryArgs>> serviceRegistries,
        Input<String> taskDefinition) {
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
        this.externalId = externalId;
        this.launchType = launchType;
        this.loadBalancers = loadBalancers;
        this.networkConfiguration = networkConfiguration;
        this.platformVersion = platformVersion;
        this.scale = scale;
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
        this.serviceRegistries = serviceRegistries;
        this.taskDefinition = Objects.requireNonNull(taskDefinition, "expected parameter 'taskDefinition' to be non-null");
    }

    private TaskSetArgs() {
        this.cluster = Input.empty();
        this.externalId = Input.empty();
        this.launchType = Input.empty();
        this.loadBalancers = Input.empty();
        this.networkConfiguration = Input.empty();
        this.platformVersion = Input.empty();
        this.scale = Input.empty();
        this.service = Input.empty();
        this.serviceRegistries = Input.empty();
        this.taskDefinition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cluster;
        private @Nullable Input<String> externalId;
        private @Nullable Input<TaskSetLaunchType> launchType;
        private @Nullable Input<List<TaskSetLoadBalancerArgs>> loadBalancers;
        private @Nullable Input<TaskSetNetworkConfigurationArgs> networkConfiguration;
        private @Nullable Input<String> platformVersion;
        private @Nullable Input<TaskSetScaleArgs> scale;
        private Input<String> service;
        private @Nullable Input<List<TaskSetServiceRegistryArgs>> serviceRegistries;
        private Input<String> taskDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.externalId = defaults.externalId;
    	      this.launchType = defaults.launchType;
    	      this.loadBalancers = defaults.loadBalancers;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.platformVersion = defaults.platformVersion;
    	      this.scale = defaults.scale;
    	      this.service = defaults.service;
    	      this.serviceRegistries = defaults.serviceRegistries;
    	      this.taskDefinition = defaults.taskDefinition;
        }

        public Builder setCluster(Input<String> cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }

        public Builder setCluster(String cluster) {
            this.cluster = Input.of(Objects.requireNonNull(cluster));
            return this;
        }

        public Builder setExternalId(@Nullable Input<String> externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder setExternalId(@Nullable String externalId) {
            this.externalId = Input.ofNullable(externalId);
            return this;
        }

        public Builder setLaunchType(@Nullable Input<TaskSetLaunchType> launchType) {
            this.launchType = launchType;
            return this;
        }

        public Builder setLaunchType(@Nullable TaskSetLaunchType launchType) {
            this.launchType = Input.ofNullable(launchType);
            return this;
        }

        public Builder setLoadBalancers(@Nullable Input<List<TaskSetLoadBalancerArgs>> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }

        public Builder setLoadBalancers(@Nullable List<TaskSetLoadBalancerArgs> loadBalancers) {
            this.loadBalancers = Input.ofNullable(loadBalancers);
            return this;
        }

        public Builder setNetworkConfiguration(@Nullable Input<TaskSetNetworkConfigurationArgs> networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        public Builder setNetworkConfiguration(@Nullable TaskSetNetworkConfigurationArgs networkConfiguration) {
            this.networkConfiguration = Input.ofNullable(networkConfiguration);
            return this;
        }

        public Builder setPlatformVersion(@Nullable Input<String> platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }

        public Builder setPlatformVersion(@Nullable String platformVersion) {
            this.platformVersion = Input.ofNullable(platformVersion);
            return this;
        }

        public Builder setScale(@Nullable Input<TaskSetScaleArgs> scale) {
            this.scale = scale;
            return this;
        }

        public Builder setScale(@Nullable TaskSetScaleArgs scale) {
            this.scale = Input.ofNullable(scale);
            return this;
        }

        public Builder setService(Input<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder setService(String service) {
            this.service = Input.of(Objects.requireNonNull(service));
            return this;
        }

        public Builder setServiceRegistries(@Nullable Input<List<TaskSetServiceRegistryArgs>> serviceRegistries) {
            this.serviceRegistries = serviceRegistries;
            return this;
        }

        public Builder setServiceRegistries(@Nullable List<TaskSetServiceRegistryArgs> serviceRegistries) {
            this.serviceRegistries = Input.ofNullable(serviceRegistries);
            return this;
        }

        public Builder setTaskDefinition(Input<String> taskDefinition) {
            this.taskDefinition = Objects.requireNonNull(taskDefinition);
            return this;
        }

        public Builder setTaskDefinition(String taskDefinition) {
            this.taskDefinition = Input.of(Objects.requireNonNull(taskDefinition));
            return this;
        }

        public TaskSetArgs build() {
            return new TaskSetArgs(cluster, externalId, launchType, loadBalancers, networkConfiguration, platformVersion, scale, service, serviceRegistries, taskDefinition);
        }
    }
}
