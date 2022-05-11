// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.DiskPoolArgs;
import com.pulumi.azure.compute.inputs.DiskPoolState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Disk Pool.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleVirtualNetwork.getResourceGroupName())
 *             .virtualNetworkName(exampleVirtualNetwork.getName())
 *             .addressPrefixes(&#34;10.0.0.0/24&#34;)
 *             .delegations(SubnetDelegation.builder()
 *                 .name(&#34;diskspool&#34;)
 *                 .serviceDelegation(SubnetDelegationServiceDelegation.builder()
 *                     .actions(&#34;Microsoft.Network/virtualNetworks/read&#34;)
 *                     .name(&#34;Microsoft.StoragePool/diskPools&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleDiskPool = new DiskPool(&#34;exampleDiskPool&#34;, DiskPoolArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .skuName(&#34;Basic_B1&#34;)
 *             .subnetId(exampleSubnet.getId())
 *             .zones(&#34;1&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Disk Pools can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/diskPool:DiskPool example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.StoragePool/diskPools/diskPool1
 * ```
 * 
 */
@ResourceType(type="azure:compute/diskPool:DiskPool")
public class DiskPool extends com.pulumi.resources.CustomResource {
    /**
     * The Azure Region where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the Disk Pool. Changing this forces a new Disk Pool to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Disk Pool. Changing this forces a new Disk Pool to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The SKU of the Disk Pool. Possible values are `Basic_B1`, `Standard_S1` and `Premium_P1`. Changing this forces a new Disk Pool to be created.
     * 
     */
    @Export(name="skuName", type=String.class, parameters={})
    private Output<String> skuName;

    /**
     * @return The SKU of the Disk Pool. Possible values are `Basic_B1`, `Standard_S1` and `Premium_P1`. Changing this forces a new Disk Pool to be created.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }
    /**
     * The ID of the Subnet where the Disk Pool should be created. Changing this forces a new Disk Pool to be created.
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return The ID of the Subnet where the Disk Pool should be created. Changing this forces a new Disk Pool to be created.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }
    /**
     * A mapping of tags which should be assigned to the Disk Pool.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Disk Pool.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies a list of Availability Zones in which this Disk Pool should be located. Changing this forces a new Disk Pool to be created.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output<List<String>> zones;

    /**
     * @return Specifies a list of Availability Zones in which this Disk Pool should be located. Changing this forces a new Disk Pool to be created.
     * 
     */
    public Output<List<String>> zones() {
        return this.zones;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DiskPool(String name) {
        this(name, DiskPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DiskPool(String name, DiskPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiskPool(String name, DiskPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/diskPool:DiskPool", name, args == null ? DiskPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DiskPool(String name, Output<String> id, @Nullable DiskPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/diskPool:DiskPool", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static DiskPool get(String name, Output<String> id, @Nullable DiskPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DiskPool(name, id, state, options);
    }
}
