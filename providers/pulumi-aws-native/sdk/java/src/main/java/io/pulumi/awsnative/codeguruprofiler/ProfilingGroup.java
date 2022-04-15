// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codeguruprofiler;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.codeguruprofiler.ProfilingGroupArgs;
import io.pulumi.awsnative.codeguruprofiler.enums.ProfilingGroupComputePlatform;
import io.pulumi.awsnative.codeguruprofiler.outputs.AgentPermissionsProperties;
import io.pulumi.awsnative.codeguruprofiler.outputs.ProfilingGroupChannel;
import io.pulumi.awsnative.codeguruprofiler.outputs.ProfilingGroupTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource schema represents the Profiling Group resource in the Amazon CodeGuru Profiler service.
 * 
 */
@ResourceType(type="aws-native:codeguruprofiler:ProfilingGroup")
public class ProfilingGroup extends io.pulumi.resources.CustomResource {
    /**
     * The agent permissions attached to this profiling group.
     * 
     */
    @Export(name="agentPermissions", type=AgentPermissionsProperties.class, parameters={})
    private Output</* @Nullable */ AgentPermissionsProperties> agentPermissions;

    /**
     * @return The agent permissions attached to this profiling group.
     * 
     */
    public Output</* @Nullable */ AgentPermissionsProperties> agentPermissions() {
        return this.agentPermissions;
    }
    /**
     * Configuration for Notification Channels for Anomaly Detection feature in CodeGuru Profiler which enables customers to detect anomalies in the application profile for those methods that represent the highest proportion of CPU time or latency
     * 
     */
    @Export(name="anomalyDetectionNotificationConfiguration", type=List.class, parameters={ProfilingGroupChannel.class})
    private Output</* @Nullable */ List<ProfilingGroupChannel>> anomalyDetectionNotificationConfiguration;

    /**
     * @return Configuration for Notification Channels for Anomaly Detection feature in CodeGuru Profiler which enables customers to detect anomalies in the application profile for those methods that represent the highest proportion of CPU time or latency
     * 
     */
    public Output</* @Nullable */ List<ProfilingGroupChannel>> anomalyDetectionNotificationConfiguration() {
        return this.anomalyDetectionNotificationConfiguration;
    }
    /**
     * The Amazon Resource Name (ARN) of the specified profiling group.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the specified profiling group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The compute platform of the profiling group.
     * 
     */
    @Export(name="computePlatform", type=ProfilingGroupComputePlatform.class, parameters={})
    private Output</* @Nullable */ ProfilingGroupComputePlatform> computePlatform;

    /**
     * @return The compute platform of the profiling group.
     * 
     */
    public Output</* @Nullable */ ProfilingGroupComputePlatform> computePlatform() {
        return this.computePlatform;
    }
    /**
     * The name of the profiling group.
     * 
     */
    @Export(name="profilingGroupName", type=String.class, parameters={})
    private Output<String> profilingGroupName;

    /**
     * @return The name of the profiling group.
     * 
     */
    public Output<String> profilingGroupName() {
        return this.profilingGroupName;
    }
    /**
     * The tags associated with a profiling group.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ProfilingGroupTag.class})
    private Output</* @Nullable */ List<ProfilingGroupTag>> tags;

    /**
     * @return The tags associated with a profiling group.
     * 
     */
    public Output</* @Nullable */ List<ProfilingGroupTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProfilingGroup(String name) {
        this(name, ProfilingGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProfilingGroup(String name, @Nullable ProfilingGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProfilingGroup(String name, @Nullable ProfilingGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:codeguruprofiler:ProfilingGroup", name, args == null ? ProfilingGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProfilingGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:codeguruprofiler:ProfilingGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ProfilingGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ProfilingGroup(name, id, options);
    }
}
