// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.FirewallNetworkRuleCollectionArgs;
import com.pulumi.azure.network.inputs.FirewallNetworkRuleCollectionState;
import com.pulumi.azure.network.outputs.FirewallNetworkRuleCollectionRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a Network Rule Collection within an Azure Firewall.
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
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .virtualNetworkName(exampleVirtualNetwork.getName())
 *             .addressPrefixes(&#34;10.0.1.0/24&#34;)
 *             .build());
 * 
 *         var examplePublicIp = new PublicIp(&#34;examplePublicIp&#34;, PublicIpArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .allocationMethod(&#34;Static&#34;)
 *             .sku(&#34;Standard&#34;)
 *             .build());
 * 
 *         var exampleFirewall = new Firewall(&#34;exampleFirewall&#34;, FirewallArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .ipConfigurations(FirewallIpConfiguration.builder()
 *                 .name(&#34;configuration&#34;)
 *                 .subnetId(exampleSubnet.getId())
 *                 .publicIpAddressId(examplePublicIp.getId())
 *                 .build())
 *             .build());
 * 
 *         var exampleFirewallNetworkRuleCollection = new FirewallNetworkRuleCollection(&#34;exampleFirewallNetworkRuleCollection&#34;, FirewallNetworkRuleCollectionArgs.builder()        
 *             .azureFirewallName(exampleFirewall.getName())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .priority(100)
 *             .action(&#34;Allow&#34;)
 *             .rules(FirewallNetworkRuleCollectionRule.builder()
 *                 .name(&#34;testrule&#34;)
 *                 .sourceAddresses(&#34;10.0.0.0/16&#34;)
 *                 .destinationPorts(&#34;53&#34;)
 *                 .destinationAddresses(                
 *                     &#34;8.8.8.8&#34;,
 *                     &#34;8.8.4.4&#34;)
 *                 .protocols(                
 *                     &#34;TCP&#34;,
 *                     &#34;UDP&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Azure Firewall Network Rule Collections can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/firewallNetworkRuleCollection:FirewallNetworkRuleCollection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/azureFirewalls/myfirewall/networkRuleCollections/mycollection
 * ```
 * 
 */
@ResourceType(type="azure:network/firewallNetworkRuleCollection:FirewallNetworkRuleCollection")
public class FirewallNetworkRuleCollection extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the action the rule will apply to matching traffic. Possible values are `Allow` and `Deny`.
     * 
     */
    @Export(name="action", type=String.class, parameters={})
    private Output<String> action;

    /**
     * @return Specifies the action the rule will apply to matching traffic. Possible values are `Allow` and `Deny`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * Specifies the name of the Firewall in which the Network Rule Collection should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="azureFirewallName", type=String.class, parameters={})
    private Output<String> azureFirewallName;

    /**
     * @return Specifies the name of the Firewall in which the Network Rule Collection should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> azureFirewallName() {
        return this.azureFirewallName;
    }
    /**
     * Specifies the name of the Network Rule Collection which must be unique within the Firewall. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Network Rule Collection which must be unique within the Firewall. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the priority of the rule collection. Possible values are between `100` - `65000`.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return Specifies the priority of the rule collection. Possible values are between `100` - `65000`.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }
    /**
     * Specifies the name of the Resource Group in which the Firewall exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group in which the Firewall exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * One or more `rule` blocks as defined below.
     * 
     */
    @Export(name="rules", type=List.class, parameters={FirewallNetworkRuleCollectionRule.class})
    private Output<List<FirewallNetworkRuleCollectionRule>> rules;

    /**
     * @return One or more `rule` blocks as defined below.
     * 
     */
    public Output<List<FirewallNetworkRuleCollectionRule>> rules() {
        return this.rules;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallNetworkRuleCollection(String name) {
        this(name, FirewallNetworkRuleCollectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallNetworkRuleCollection(String name, FirewallNetworkRuleCollectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallNetworkRuleCollection(String name, FirewallNetworkRuleCollectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/firewallNetworkRuleCollection:FirewallNetworkRuleCollection", name, args == null ? FirewallNetworkRuleCollectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FirewallNetworkRuleCollection(String name, Output<String> id, @Nullable FirewallNetworkRuleCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/firewallNetworkRuleCollection:FirewallNetworkRuleCollection", name, state, makeResourceOptions(options, id));
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
    public static FirewallNetworkRuleCollection get(String name, Output<String> id, @Nullable FirewallNetworkRuleCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirewallNetworkRuleCollection(name, id, state, options);
    }
}
