// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.EC2FleetArgs;
import io.pulumi.awsnative.ec2.enums.EC2FleetExcessCapacityTerminationPolicy;
import io.pulumi.awsnative.ec2.enums.EC2FleetType;
import io.pulumi.awsnative.ec2.outputs.EC2FleetFleetLaunchTemplateConfigRequest;
import io.pulumi.awsnative.ec2.outputs.EC2FleetOnDemandOptionsRequest;
import io.pulumi.awsnative.ec2.outputs.EC2FleetSpotOptionsRequest;
import io.pulumi.awsnative.ec2.outputs.EC2FleetTagSpecification;
import io.pulumi.awsnative.ec2.outputs.EC2FleetTargetCapacitySpecificationRequest;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::EC2::EC2Fleet
 * 
 */
@ResourceType(type="aws-native:ec2:EC2Fleet")
public class EC2Fleet extends io.pulumi.resources.CustomResource {
    @OutputExport(name="context", type=String.class, parameters={})
    private Output</* @Nullable */ String> context;

    public Output</* @Nullable */ String> getContext() {
        return this.context;
    }
    @OutputExport(name="excessCapacityTerminationPolicy", type=EC2FleetExcessCapacityTerminationPolicy.class, parameters={})
    private Output</* @Nullable */ EC2FleetExcessCapacityTerminationPolicy> excessCapacityTerminationPolicy;

    public Output</* @Nullable */ EC2FleetExcessCapacityTerminationPolicy> getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }
    @OutputExport(name="fleetId", type=String.class, parameters={})
    private Output<String> fleetId;

    public Output<String> getFleetId() {
        return this.fleetId;
    }
    @OutputExport(name="launchTemplateConfigs", type=List.class, parameters={EC2FleetFleetLaunchTemplateConfigRequest.class})
    private Output<List<EC2FleetFleetLaunchTemplateConfigRequest>> launchTemplateConfigs;

    public Output<List<EC2FleetFleetLaunchTemplateConfigRequest>> getLaunchTemplateConfigs() {
        return this.launchTemplateConfigs;
    }
    @OutputExport(name="onDemandOptions", type=EC2FleetOnDemandOptionsRequest.class, parameters={})
    private Output</* @Nullable */ EC2FleetOnDemandOptionsRequest> onDemandOptions;

    public Output</* @Nullable */ EC2FleetOnDemandOptionsRequest> getOnDemandOptions() {
        return this.onDemandOptions;
    }
    @OutputExport(name="replaceUnhealthyInstances", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> replaceUnhealthyInstances;

    public Output</* @Nullable */ Boolean> getReplaceUnhealthyInstances() {
        return this.replaceUnhealthyInstances;
    }
    @OutputExport(name="spotOptions", type=EC2FleetSpotOptionsRequest.class, parameters={})
    private Output</* @Nullable */ EC2FleetSpotOptionsRequest> spotOptions;

    public Output</* @Nullable */ EC2FleetSpotOptionsRequest> getSpotOptions() {
        return this.spotOptions;
    }
    @OutputExport(name="tagSpecifications", type=List.class, parameters={EC2FleetTagSpecification.class})
    private Output</* @Nullable */ List<EC2FleetTagSpecification>> tagSpecifications;

    public Output</* @Nullable */ List<EC2FleetTagSpecification>> getTagSpecifications() {
        return this.tagSpecifications;
    }
    @OutputExport(name="targetCapacitySpecification", type=EC2FleetTargetCapacitySpecificationRequest.class, parameters={})
    private Output<EC2FleetTargetCapacitySpecificationRequest> targetCapacitySpecification;

    public Output<EC2FleetTargetCapacitySpecificationRequest> getTargetCapacitySpecification() {
        return this.targetCapacitySpecification;
    }
    @OutputExport(name="terminateInstancesWithExpiration", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> terminateInstancesWithExpiration;

    public Output</* @Nullable */ Boolean> getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }
    @OutputExport(name="type", type=EC2FleetType.class, parameters={})
    private Output</* @Nullable */ EC2FleetType> type;

    public Output</* @Nullable */ EC2FleetType> getType() {
        return this.type;
    }
    @OutputExport(name="validFrom", type=String.class, parameters={})
    private Output</* @Nullable */ String> validFrom;

    public Output</* @Nullable */ String> getValidFrom() {
        return this.validFrom;
    }
    @OutputExport(name="validUntil", type=String.class, parameters={})
    private Output</* @Nullable */ String> validUntil;

    public Output</* @Nullable */ String> getValidUntil() {
        return this.validUntil;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EC2Fleet(String name, EC2FleetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:EC2Fleet", name, args == null ? EC2FleetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EC2Fleet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:EC2Fleet", name, null, makeResourceOptions(options, id));
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
    public static EC2Fleet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EC2Fleet(name, id, options);
    }
}
