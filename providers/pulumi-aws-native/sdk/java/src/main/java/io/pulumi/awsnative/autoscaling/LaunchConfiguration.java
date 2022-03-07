// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.autoscaling;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.autoscaling.LaunchConfigurationArgs;
import io.pulumi.awsnative.autoscaling.outputs.LaunchConfigurationBlockDeviceMapping;
import io.pulumi.awsnative.autoscaling.outputs.LaunchConfigurationMetadataOptions;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::AutoScaling::LaunchConfiguration resource specifies the launch configuration that can be used by an Auto Scaling group to configure Amazon EC2 instances.
 * 
 */
@ResourceType(type="aws-native:autoscaling:LaunchConfiguration")
public class LaunchConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * For Auto Scaling groups that are running in a virtual private cloud (VPC), specifies whether to assign a public IP address to the group's instances.
     * 
     */
    @OutputExport(name="associatePublicIpAddress", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> associatePublicIpAddress;

    /**
     * @return For Auto Scaling groups that are running in a virtual private cloud (VPC), specifies whether to assign a public IP address to the group's instances.
     * 
     */
    public Output</* @Nullable */ Boolean> getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }
    /**
     * Specifies how block devices are exposed to the instance. You can specify virtual devices and EBS volumes.
     * 
     */
    @OutputExport(name="blockDeviceMappings", type=List.class, parameters={LaunchConfigurationBlockDeviceMapping.class})
    private Output</* @Nullable */ List<LaunchConfigurationBlockDeviceMapping>> blockDeviceMappings;

    /**
     * @return Specifies how block devices are exposed to the instance. You can specify virtual devices and EBS volumes.
     * 
     */
    public Output</* @Nullable */ List<LaunchConfigurationBlockDeviceMapping>> getBlockDeviceMappings() {
        return this.blockDeviceMappings;
    }
    /**
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to.
     * 
     */
    @OutputExport(name="classicLinkVPCId", type=String.class, parameters={})
    private Output</* @Nullable */ String> classicLinkVPCId;

    /**
     * @return The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to.
     * 
     */
    public Output</* @Nullable */ String> getClassicLinkVPCId() {
        return this.classicLinkVPCId;
    }
    /**
     * The IDs of one or more security groups for the VPC that you specified in the ClassicLinkVPCId property.
     * 
     */
    @OutputExport(name="classicLinkVPCSecurityGroups", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> classicLinkVPCSecurityGroups;

    /**
     * @return The IDs of one or more security groups for the VPC that you specified in the ClassicLinkVPCId property.
     * 
     */
    public Output</* @Nullable */ List<String>> getClassicLinkVPCSecurityGroups() {
        return this.classicLinkVPCSecurityGroups;
    }
    /**
     * Specifies whether the launch configuration is optimized for EBS I/O (true) or not (false).
     * 
     */
    @OutputExport(name="ebsOptimized", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ebsOptimized;

    /**
     * @return Specifies whether the launch configuration is optimized for EBS I/O (true) or not (false).
     * 
     */
    public Output</* @Nullable */ Boolean> getEbsOptimized() {
        return this.ebsOptimized;
    }
    /**
     * Provides the name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance. The instance profile contains the IAM role.
     * 
     */
    @OutputExport(name="iamInstanceProfile", type=String.class, parameters={})
    private Output</* @Nullable */ String> iamInstanceProfile;

    /**
     * @return Provides the name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance. The instance profile contains the IAM role.
     * 
     */
    public Output</* @Nullable */ String> getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }
    /**
     * Provides the unique ID of the Amazon Machine Image (AMI) that was assigned during registration.
     * 
     */
    @OutputExport(name="imageId", type=String.class, parameters={})
    private Output<String> imageId;

    /**
     * @return Provides the unique ID of the Amazon Machine Image (AMI) that was assigned during registration.
     * 
     */
    public Output<String> getImageId() {
        return this.imageId;
    }
    /**
     * The ID of the Amazon EC2 instance you want to use to create the launch configuration.
     * 
     */
    @OutputExport(name="instanceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceId;

    /**
     * @return The ID of the Amazon EC2 instance you want to use to create the launch configuration.
     * 
     */
    public Output</* @Nullable */ String> getInstanceId() {
        return this.instanceId;
    }
    /**
     * Controls whether instances in this group are launched with detailed (true) or basic (false) monitoring.
     * 
     */
    @OutputExport(name="instanceMonitoring", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> instanceMonitoring;

    /**
     * @return Controls whether instances in this group are launched with detailed (true) or basic (false) monitoring.
     * 
     */
    public Output</* @Nullable */ Boolean> getInstanceMonitoring() {
        return this.instanceMonitoring;
    }
    /**
     * Specifies the instance type of the EC2 instance.
     * 
     */
    @OutputExport(name="instanceType", type=String.class, parameters={})
    private Output<String> instanceType;

    /**
     * @return Specifies the instance type of the EC2 instance.
     * 
     */
    public Output<String> getInstanceType() {
        return this.instanceType;
    }
    /**
     * Provides the ID of the kernel associated with the EC2 AMI.
     * 
     */
    @OutputExport(name="kernelId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kernelId;

    /**
     * @return Provides the ID of the kernel associated with the EC2 AMI.
     * 
     */
    public Output</* @Nullable */ String> getKernelId() {
        return this.kernelId;
    }
    /**
     * Provides the name of the EC2 key pair.
     * 
     */
    @OutputExport(name="keyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyName;

    /**
     * @return Provides the name of the EC2 key pair.
     * 
     */
    public Output</* @Nullable */ String> getKeyName() {
        return this.keyName;
    }
    /**
     * The name of the launch configuration. This name must be unique per Region per account.
     * 
     */
    @OutputExport(name="launchConfigurationName", type=String.class, parameters={})
    private Output</* @Nullable */ String> launchConfigurationName;

    /**
     * @return The name of the launch configuration. This name must be unique per Region per account.
     * 
     */
    public Output</* @Nullable */ String> getLaunchConfigurationName() {
        return this.launchConfigurationName;
    }
    /**
     * The metadata options for the instances.
     * 
     */
    @OutputExport(name="metadataOptions", type=LaunchConfigurationMetadataOptions.class, parameters={})
    private Output</* @Nullable */ LaunchConfigurationMetadataOptions> metadataOptions;

    /**
     * @return The metadata options for the instances.
     * 
     */
    public Output</* @Nullable */ LaunchConfigurationMetadataOptions> getMetadataOptions() {
        return this.metadataOptions;
    }
    /**
     * The tenancy of the instance, either default or dedicated.
     * 
     */
    @OutputExport(name="placementTenancy", type=String.class, parameters={})
    private Output</* @Nullable */ String> placementTenancy;

    /**
     * @return The tenancy of the instance, either default or dedicated.
     * 
     */
    public Output</* @Nullable */ String> getPlacementTenancy() {
        return this.placementTenancy;
    }
    /**
     * The ID of the RAM disk to select.
     * 
     */
    @OutputExport(name="ramDiskId", type=String.class, parameters={})
    private Output</* @Nullable */ String> ramDiskId;

    /**
     * @return The ID of the RAM disk to select.
     * 
     */
    public Output</* @Nullable */ String> getRamDiskId() {
        return this.ramDiskId;
    }
    /**
     * A list that contains the security groups to assign to the instances in the Auto Scaling group.
     * 
     */
    @OutputExport(name="securityGroups", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityGroups;

    /**
     * @return A list that contains the security groups to assign to the instances in the Auto Scaling group.
     * 
     */
    public Output</* @Nullable */ List<String>> getSecurityGroups() {
        return this.securityGroups;
    }
    /**
     * The maximum hourly price you are willing to pay for any Spot Instances launched to fulfill the request.
     * 
     */
    @OutputExport(name="spotPrice", type=String.class, parameters={})
    private Output</* @Nullable */ String> spotPrice;

    /**
     * @return The maximum hourly price you are willing to pay for any Spot Instances launched to fulfill the request.
     * 
     */
    public Output</* @Nullable */ String> getSpotPrice() {
        return this.spotPrice;
    }
    /**
     * The Base64-encoded user data to make available to the launched EC2 instances.
     * 
     */
    @OutputExport(name="userData", type=String.class, parameters={})
    private Output</* @Nullable */ String> userData;

    /**
     * @return The Base64-encoded user data to make available to the launched EC2 instances.
     * 
     */
    public Output</* @Nullable */ String> getUserData() {
        return this.userData;
    }

    public interface BuilderApplicator {
        public void apply(LaunchConfigurationArgs.Builder a);
    }
    private static io.pulumi.awsnative.autoscaling.LaunchConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.autoscaling.LaunchConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LaunchConfiguration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LaunchConfiguration(String name) {
        this(name, LaunchConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LaunchConfiguration(String name, LaunchConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LaunchConfiguration(String name, LaunchConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:autoscaling:LaunchConfiguration", name, args == null ? LaunchConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LaunchConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:autoscaling:LaunchConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static LaunchConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LaunchConfiguration(name, id, options);
    }
}