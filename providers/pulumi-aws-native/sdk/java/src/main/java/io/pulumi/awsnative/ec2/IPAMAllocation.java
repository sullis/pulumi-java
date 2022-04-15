// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.IPAMAllocationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Schema of AWS::EC2::IPAMAllocation Type
 * 
 */
@ResourceType(type="aws-native:ec2:IPAMAllocation")
public class IPAMAllocation extends io.pulumi.resources.CustomResource {
    @Export(name="cidr", type=String.class, parameters={})
    private Output</* @Nullable */ String> cidr;

    public Output</* @Nullable */ String> cidr() {
        return this.cidr;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Id of the allocation.
     * 
     */
    @Export(name="ipamPoolAllocationId", type=String.class, parameters={})
    private Output<String> ipamPoolAllocationId;

    /**
     * @return Id of the allocation.
     * 
     */
    public Output<String> ipamPoolAllocationId() {
        return this.ipamPoolAllocationId;
    }
    /**
     * Id of the IPAM Pool.
     * 
     */
    @Export(name="ipamPoolId", type=String.class, parameters={})
    private Output<String> ipamPoolId;

    /**
     * @return Id of the IPAM Pool.
     * 
     */
    public Output<String> ipamPoolId() {
        return this.ipamPoolId;
    }
    /**
     * The desired netmask length of the allocation. If set, IPAM will choose a block of free space with this size and return the CIDR representing it.
     * 
     */
    @Export(name="netmaskLength", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> netmaskLength;

    /**
     * @return The desired netmask length of the allocation. If set, IPAM will choose a block of free space with this size and return the CIDR representing it.
     * 
     */
    public Output</* @Nullable */ Integer> netmaskLength() {
        return this.netmaskLength;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IPAMAllocation(String name) {
        this(name, IPAMAllocationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IPAMAllocation(String name, IPAMAllocationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IPAMAllocation(String name, IPAMAllocationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:IPAMAllocation", name, args == null ? IPAMAllocationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IPAMAllocation(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:IPAMAllocation", name, null, makeResourceOptions(options, id));
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
    public static IPAMAllocation get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IPAMAllocation(name, id, options);
    }
}
