// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.emr.InstanceGroupArgs;
import io.pulumi.aws.emr.inputs.InstanceGroupState;
import io.pulumi.aws.emr.outputs.InstanceGroupEbsConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an Elastic MapReduce Cluster Instance Group configuration.
 * See [Amazon Elastic MapReduce Documentation](https://aws.amazon.com/documentation/emr/) for more information.
 * 
 * > **NOTE:** At this time, Instance Groups cannot be destroyed through the API nor
 * web interface. Instance Groups are destroyed when the EMR Cluster is destroyed.
 * this provider will resize any Instance Group to zero when destroying the resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EMR task instance group can be imported using their EMR Cluster id and Instance Group id separated by a forward-slash `/`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:emr/instanceGroup:InstanceGroup task_greoup j-123456ABCDEF/ig-15EK4O09RZLNR
 * ```
 * 
 */
@ResourceType(type="aws:emr/instanceGroup:InstanceGroup")
public class InstanceGroup extends io.pulumi.resources.CustomResource {
    /**
     * The autoscaling policy document. This is a JSON formatted string. See [EMR Auto Scaling](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html)
     * 
     */
    @Export(name="autoscalingPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoscalingPolicy;

    /**
     * @return The autoscaling policy document. This is a JSON formatted string. See [EMR Auto Scaling](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html)
     * 
     */
    public Output</* @Nullable */ String> autoscalingPolicy() {
        return this.autoscalingPolicy;
    }
    /**
     * If set, the bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
     */
    @Export(name="bidPrice", type=String.class, parameters={})
    private Output</* @Nullable */ String> bidPrice;

    /**
     * @return If set, the bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
     */
    public Output</* @Nullable */ String> bidPrice() {
        return this.bidPrice;
    }
    /**
     * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * A JSON string for supplying list of configurations specific to the EMR instance group. Note that this can only be changed when using EMR release 5.21 or later.
     * 
     */
    @Export(name="configurationsJson", type=String.class, parameters={})
    private Output</* @Nullable */ String> configurationsJson;

    /**
     * @return A JSON string for supplying list of configurations specific to the EMR instance group. Note that this can only be changed when using EMR release 5.21 or later.
     * 
     */
    public Output</* @Nullable */ String> configurationsJson() {
        return this.configurationsJson;
    }
    /**
     * One or more `ebs_config` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="ebsConfigs", type=List.class, parameters={InstanceGroupEbsConfig.class})
    private Output<List<InstanceGroupEbsConfig>> ebsConfigs;

    /**
     * @return One or more `ebs_config` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<List<InstanceGroupEbsConfig>> ebsConfigs() {
        return this.ebsConfigs;
    }
    /**
     * Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="ebsOptimized", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ebsOptimized;

    /**
     * @return Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
     * 
     */
    public Output</* @Nullable */ Boolean> ebsOptimized() {
        return this.ebsOptimized;
    }
    /**
     * target number of instances for the instance group. defaults to 0.
     * 
     */
    @Export(name="instanceCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> instanceCount;

    /**
     * @return target number of instances for the instance group. defaults to 0.
     * 
     */
    public Output</* @Nullable */ Integer> instanceCount() {
        return this.instanceCount;
    }
    /**
     * The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="instanceType", type=String.class, parameters={})
    private Output<String> instanceType;

    /**
     * @return The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }
    /**
     * Human friendly name given to the instance group. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Human friendly name given to the instance group. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="runningInstanceCount", type=Integer.class, parameters={})
    private Output<Integer> runningInstanceCount;

    public Output<Integer> runningInstanceCount() {
        return this.runningInstanceCount;
    }
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceGroup(String name) {
        this(name, InstanceGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceGroup(String name, InstanceGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceGroup(String name, InstanceGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:emr/instanceGroup:InstanceGroup", name, args == null ? InstanceGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceGroup(String name, Output<String> id, @Nullable InstanceGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:emr/instanceGroup:InstanceGroup", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InstanceGroup get(String name, Output<String> id, @Nullable InstanceGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InstanceGroup(name, id, state, options);
    }
}
