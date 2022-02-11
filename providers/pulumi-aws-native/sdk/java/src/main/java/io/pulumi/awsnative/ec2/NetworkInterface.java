// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.NetworkInterfaceArgs;
import io.pulumi.awsnative.ec2.outputs.NetworkInterfaceInstanceIpv6Address;
import io.pulumi.awsnative.ec2.outputs.NetworkInterfacePrivateIpAddressSpecification;
import io.pulumi.awsnative.ec2.outputs.NetworkInterfaceTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:ec2:NetworkInterface")
public class NetworkInterface extends io.pulumi.resources.CustomResource {
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="groupSet", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> groupSet;

    public Output</* @Nullable */ List<String>> getGroupSet() {
        return this.groupSet;
    }
    @OutputExport(name="interfaceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> interfaceType;

    public Output</* @Nullable */ String> getInterfaceType() {
        return this.interfaceType;
    }
    @OutputExport(name="ipv6AddressCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> ipv6AddressCount;

    public Output</* @Nullable */ Integer> getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }
    @OutputExport(name="ipv6Addresses", type=List.class, parameters={NetworkInterfaceInstanceIpv6Address.class})
    private Output</* @Nullable */ List<NetworkInterfaceInstanceIpv6Address>> ipv6Addresses;

    public Output</* @Nullable */ List<NetworkInterfaceInstanceIpv6Address>> getIpv6Addresses() {
        return this.ipv6Addresses;
    }
    @OutputExport(name="primaryPrivateIpAddress", type=String.class, parameters={})
    private Output<String> primaryPrivateIpAddress;

    public Output<String> getPrimaryPrivateIpAddress() {
        return this.primaryPrivateIpAddress;
    }
    @OutputExport(name="privateIpAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateIpAddress;

    public Output</* @Nullable */ String> getPrivateIpAddress() {
        return this.privateIpAddress;
    }
    @OutputExport(name="privateIpAddresses", type=List.class, parameters={NetworkInterfacePrivateIpAddressSpecification.class})
    private Output</* @Nullable */ List<NetworkInterfacePrivateIpAddressSpecification>> privateIpAddresses;

    public Output</* @Nullable */ List<NetworkInterfacePrivateIpAddressSpecification>> getPrivateIpAddresses() {
        return this.privateIpAddresses;
    }
    @OutputExport(name="secondaryPrivateIpAddressCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> secondaryPrivateIpAddressCount;

    public Output</* @Nullable */ Integer> getSecondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount;
    }
    @OutputExport(name="secondaryPrivateIpAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> secondaryPrivateIpAddresses;

    public Output<List<String>> getSecondaryPrivateIpAddresses() {
        return this.secondaryPrivateIpAddresses;
    }
    @OutputExport(name="sourceDestCheck", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sourceDestCheck;

    public Output</* @Nullable */ Boolean> getSourceDestCheck() {
        return this.sourceDestCheck;
    }
    @OutputExport(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId;
    }
    @OutputExport(name="tags", type=List.class, parameters={NetworkInterfaceTag.class})
    private Output</* @Nullable */ List<NetworkInterfaceTag>> tags;

    public Output</* @Nullable */ List<NetworkInterfaceTag>> getTags() {
        return this.tags;
    }

    public NetworkInterface(String name, NetworkInterfaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:NetworkInterface", name, args == null ? NetworkInterfaceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NetworkInterface(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:NetworkInterface", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static NetworkInterface get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkInterface(name, id, options);
    }
}
