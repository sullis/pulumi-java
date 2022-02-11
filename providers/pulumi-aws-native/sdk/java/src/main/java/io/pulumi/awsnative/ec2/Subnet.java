// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.SubnetArgs;
import io.pulumi.awsnative.ec2.outputs.SubnetTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:ec2:Subnet")
public class Subnet extends io.pulumi.resources.CustomResource {
    @OutputExport(name="assignIpv6AddressOnCreation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> assignIpv6AddressOnCreation;

    public Output</* @Nullable */ Boolean> getAssignIpv6AddressOnCreation() {
        return this.assignIpv6AddressOnCreation;
    }
    @OutputExport(name="availabilityZone", type=String.class, parameters={})
    private Output</* @Nullable */ String> availabilityZone;

    public Output</* @Nullable */ String> getAvailabilityZone() {
        return this.availabilityZone;
    }
    @OutputExport(name="cidrBlock", type=String.class, parameters={})
    private Output<String> cidrBlock;

    public Output<String> getCidrBlock() {
        return this.cidrBlock;
    }
    @OutputExport(name="ipv6CidrBlock", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipv6CidrBlock;

    public Output</* @Nullable */ String> getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }
    @OutputExport(name="ipv6CidrBlocks", type=List.class, parameters={String.class})
    private Output<List<String>> ipv6CidrBlocks;

    public Output<List<String>> getIpv6CidrBlocks() {
        return this.ipv6CidrBlocks;
    }
    @OutputExport(name="mapPublicIpOnLaunch", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> mapPublicIpOnLaunch;

    public Output</* @Nullable */ Boolean> getMapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch;
    }
    @OutputExport(name="networkAclAssociationId", type=String.class, parameters={})
    private Output<String> networkAclAssociationId;

    public Output<String> getNetworkAclAssociationId() {
        return this.networkAclAssociationId;
    }
    @OutputExport(name="outpostArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> outpostArn;

    public Output</* @Nullable */ String> getOutpostArn() {
        return this.outpostArn;
    }
    @OutputExport(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId;
    }
    @OutputExport(name="tags", type=List.class, parameters={SubnetTag.class})
    private Output</* @Nullable */ List<SubnetTag>> tags;

    public Output</* @Nullable */ List<SubnetTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public Subnet(String name, SubnetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:Subnet", name, args == null ? SubnetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Subnet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:Subnet", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Subnet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Subnet(name, id, options);
    }
}
