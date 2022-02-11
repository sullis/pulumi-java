// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ecs.TaskSetArgs;
import io.pulumi.awsnative.ecs.enums.TaskSetLaunchType;
import io.pulumi.awsnative.ecs.outputs.TaskSetLoadBalancer;
import io.pulumi.awsnative.ecs.outputs.TaskSetNetworkConfiguration;
import io.pulumi.awsnative.ecs.outputs.TaskSetScale;
import io.pulumi.awsnative.ecs.outputs.TaskSetServiceRegistry;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:ecs:TaskSet")
public class TaskSet extends io.pulumi.resources.CustomResource {
    @OutputExport(name="cluster", type=String.class, parameters={})
    private Output<String> cluster;

    public Output<String> getCluster() {
        return this.cluster;
    }
    @OutputExport(name="externalId", type=String.class, parameters={})
    private Output</* @Nullable */ String> externalId;

    public Output</* @Nullable */ String> getExternalId() {
        return this.externalId;
    }
    @OutputExport(name="launchType", type=TaskSetLaunchType.class, parameters={})
    private Output</* @Nullable */ TaskSetLaunchType> launchType;

    public Output</* @Nullable */ TaskSetLaunchType> getLaunchType() {
        return this.launchType;
    }
    @OutputExport(name="loadBalancers", type=List.class, parameters={TaskSetLoadBalancer.class})
    private Output</* @Nullable */ List<TaskSetLoadBalancer>> loadBalancers;

    public Output</* @Nullable */ List<TaskSetLoadBalancer>> getLoadBalancers() {
        return this.loadBalancers;
    }
    @OutputExport(name="networkConfiguration", type=TaskSetNetworkConfiguration.class, parameters={})
    private Output</* @Nullable */ TaskSetNetworkConfiguration> networkConfiguration;

    public Output</* @Nullable */ TaskSetNetworkConfiguration> getNetworkConfiguration() {
        return this.networkConfiguration;
    }
    @OutputExport(name="platformVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> platformVersion;

    public Output</* @Nullable */ String> getPlatformVersion() {
        return this.platformVersion;
    }
    @OutputExport(name="scale", type=TaskSetScale.class, parameters={})
    private Output</* @Nullable */ TaskSetScale> scale;

    public Output</* @Nullable */ TaskSetScale> getScale() {
        return this.scale;
    }
    @OutputExport(name="service", type=String.class, parameters={})
    private Output<String> service;

    public Output<String> getService() {
        return this.service;
    }
    @OutputExport(name="serviceRegistries", type=List.class, parameters={TaskSetServiceRegistry.class})
    private Output</* @Nullable */ List<TaskSetServiceRegistry>> serviceRegistries;

    public Output</* @Nullable */ List<TaskSetServiceRegistry>> getServiceRegistries() {
        return this.serviceRegistries;
    }
    @OutputExport(name="taskDefinition", type=String.class, parameters={})
    private Output<String> taskDefinition;

    public Output<String> getTaskDefinition() {
        return this.taskDefinition;
    }

    public TaskSet(String name, TaskSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecs:TaskSet", name, args == null ? TaskSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TaskSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecs:TaskSet", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static TaskSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TaskSet(name, id, options);
    }
}
