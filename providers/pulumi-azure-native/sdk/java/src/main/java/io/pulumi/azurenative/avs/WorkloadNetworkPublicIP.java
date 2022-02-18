// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.WorkloadNetworkPublicIPArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * NSX Public IP Block
 * API Version: 2021-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:avs:WorkloadNetworkPublicIP publicIP1 /subscriptions/{subscription-id}/resourceGroups/group1/providers/Microsoft.AVS/privateClouds/cloud1/workloadNetworks/default/publicIPs/publicIP1 
 * ```
 * 
 */
@ResourceType(type="azure-native:avs:WorkloadNetworkPublicIP")
public class WorkloadNetworkPublicIP extends io.pulumi.resources.CustomResource {
    /**
     * Display name of the Public IP Block.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Display name of the Public IP Block.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Number of Public IPs requested.
     * 
     */
    @OutputExport(name="numberOfPublicIPs", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> numberOfPublicIPs;

    /**
     * @return Number of Public IPs requested.
     * 
     */
    public Output</* @Nullable */ Double> getNumberOfPublicIPs() {
        return this.numberOfPublicIPs;
    }
    /**
     * The provisioning state
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * CIDR Block of the Public IP Block.
     * 
     */
    @OutputExport(name="publicIPBlock", type=String.class, parameters={})
    private Output<String> publicIPBlock;

    /**
     * @return CIDR Block of the Public IP Block.
     * 
     */
    public Output<String> getPublicIPBlock() {
        return this.publicIPBlock;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkloadNetworkPublicIP(String name, WorkloadNetworkPublicIPArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:WorkloadNetworkPublicIP", name, args == null ? WorkloadNetworkPublicIPArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WorkloadNetworkPublicIP(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:WorkloadNetworkPublicIP", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:avs/v20210601:WorkloadNetworkPublicIP").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20211201:WorkloadNetworkPublicIP").build())
            ))
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
    public static WorkloadNetworkPublicIP get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkloadNetworkPublicIP(name, id, options);
    }
}
