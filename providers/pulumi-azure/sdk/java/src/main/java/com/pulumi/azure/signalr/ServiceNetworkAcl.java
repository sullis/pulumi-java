// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.signalr;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.signalr.ServiceNetworkAclArgs;
import com.pulumi.azure.signalr.inputs.ServiceNetworkAclState;
import com.pulumi.azure.signalr.outputs.ServiceNetworkAclPrivateEndpoint;
import com.pulumi.azure.signalr.outputs.ServiceNetworkAclPublicNetwork;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages the Network ACL for a SignalR service.
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
 *         var exampleService = new Service(&#34;exampleService&#34;, ServiceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .sku(ServiceSku.builder()
 *                 .name(&#34;Standard_S1&#34;)
 *                 .capacity(1)
 *                 .build())
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .addressSpaces(&#34;10.5.0.0/16&#34;)
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .virtualNetworkName(exampleVirtualNetwork.getName())
 *             .addressPrefixes(&#34;10.5.2.0/24&#34;)
 *             .enforcePrivateLinkEndpointNetworkPolicies(true)
 *             .build());
 * 
 *         var exampleEndpoint = new Endpoint(&#34;exampleEndpoint&#34;, EndpointArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .subnetId(exampleSubnet.getId())
 *             .privateServiceConnection(EndpointPrivateServiceConnection.builder()
 *                 .name(&#34;psc-sig-test&#34;)
 *                 .isManualConnection(false)
 *                 .privateConnectionResourceId(exampleService.getId())
 *                 .subresourceNames(&#34;signalr&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleServiceNetworkAcl = new ServiceNetworkAcl(&#34;exampleServiceNetworkAcl&#34;, ServiceNetworkAclArgs.builder()        
 *             .signalrServiceId(exampleService.getId())
 *             .defaultAction(&#34;Deny&#34;)
 *             .publicNetwork(ServiceNetworkAclPublicNetwork.builder()
 *                 .allowedRequestTypes(&#34;ClientConnection&#34;)
 *                 .build())
 *             .privateEndpoints(ServiceNetworkAclPrivateEndpoint.builder()
 *                 .id(exampleEndpoint.getId())
 *                 .allowedRequestTypes(&#34;ServerConnection&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Network ACLs for a SignalR service can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:signalr/serviceNetworkAcl:ServiceNetworkAcl example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.SignalRService/signalR/signalr1
 * ```
 * 
 */
@ResourceType(type="azure:signalr/serviceNetworkAcl:ServiceNetworkAcl")
public class ServiceNetworkAcl extends com.pulumi.resources.CustomResource {
    /**
     * The default action to control the network access when no other rule matches. Possible values are `Allow` and `Deny`.
     * 
     */
    @Export(name="defaultAction", type=String.class, parameters={})
    private Output<String> defaultAction;

    /**
     * @return The default action to control the network access when no other rule matches. Possible values are `Allow` and `Deny`.
     * 
     */
    public Output<String> defaultAction() {
        return this.defaultAction;
    }
    /**
     * A `private_endpoint` block as defined below.
     * 
     */
    @Export(name="privateEndpoints", type=List.class, parameters={ServiceNetworkAclPrivateEndpoint.class})
    private Output</* @Nullable */ List<ServiceNetworkAclPrivateEndpoint>> privateEndpoints;

    /**
     * @return A `private_endpoint` block as defined below.
     * 
     */
    public Output<Optional<List<ServiceNetworkAclPrivateEndpoint>>> privateEndpoints() {
        return Codegen.optional(this.privateEndpoints);
    }
    /**
     * A `public_network` block as defined below.
     * 
     */
    @Export(name="publicNetwork", type=ServiceNetworkAclPublicNetwork.class, parameters={})
    private Output<ServiceNetworkAclPublicNetwork> publicNetwork;

    /**
     * @return A `public_network` block as defined below.
     * 
     */
    public Output<ServiceNetworkAclPublicNetwork> publicNetwork() {
        return this.publicNetwork;
    }
    /**
     * The ID of the SignalR service. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="signalrServiceId", type=String.class, parameters={})
    private Output<String> signalrServiceId;

    /**
     * @return The ID of the SignalR service. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> signalrServiceId() {
        return this.signalrServiceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceNetworkAcl(String name) {
        this(name, ServiceNetworkAclArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceNetworkAcl(String name, ServiceNetworkAclArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceNetworkAcl(String name, ServiceNetworkAclArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:signalr/serviceNetworkAcl:ServiceNetworkAcl", name, args == null ? ServiceNetworkAclArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceNetworkAcl(String name, Output<String> id, @Nullable ServiceNetworkAclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:signalr/serviceNetworkAcl:ServiceNetworkAcl", name, state, makeResourceOptions(options, id));
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
    public static ServiceNetworkAcl get(String name, Output<String> id, @Nullable ServiceNetworkAclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceNetworkAcl(name, id, state, options);
    }
}
