// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.relay;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.relay.NamespaceArgs;
import com.pulumi.azure.relay.inputs.NamespaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Relay Namespace.
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
 *         var exampleNamespace = new Namespace(&#34;exampleNamespace&#34;, NamespaceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .skuName(&#34;Standard&#34;)
 *             .tags(Map.of(&#34;source&#34;, &#34;example&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Azure Relay Namespace&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:relay/namespace:Namespace relay1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Relay/namespaces/relay1
 * ```
 * 
 */
@ResourceType(type="azure:relay/namespace:Namespace")
public class Namespace extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the supported Azure location where the Azure Relay Namespace exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the Azure Relay Namespace exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The Identifier for Azure Insights metrics.
     * 
     */
    @Export(name="metricId", type=String.class, parameters={})
    private Output<String> metricId;

    /**
     * @return The Identifier for Azure Insights metrics.
     * 
     */
    public Output<String> metricId() {
        return this.metricId;
    }
    /**
     * Specifies the name of the Azure Relay Namespace. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Azure Relay Namespace. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The primary connection string for the authorization rule `RootManageSharedAccessKey`.
     * 
     */
    @Export(name="primaryConnectionString", type=String.class, parameters={})
    private Output<String> primaryConnectionString;

    /**
     * @return The primary connection string for the authorization rule `RootManageSharedAccessKey`.
     * 
     */
    public Output<String> primaryConnectionString() {
        return this.primaryConnectionString;
    }
    /**
     * The primary access key for the authorization rule `RootManageSharedAccessKey`.
     * 
     */
    @Export(name="primaryKey", type=String.class, parameters={})
    private Output<String> primaryKey;

    /**
     * @return The primary access key for the authorization rule `RootManageSharedAccessKey`.
     * 
     */
    public Output<String> primaryKey() {
        return this.primaryKey;
    }
    /**
     * The name of the resource group in which to create the Azure Relay Namespace.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Azure Relay Namespace.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The secondary connection string for the authorization rule `RootManageSharedAccessKey`.
     * 
     */
    @Export(name="secondaryConnectionString", type=String.class, parameters={})
    private Output<String> secondaryConnectionString;

    /**
     * @return The secondary connection string for the authorization rule `RootManageSharedAccessKey`.
     * 
     */
    public Output<String> secondaryConnectionString() {
        return this.secondaryConnectionString;
    }
    /**
     * The secondary access key for the authorization rule `RootManageSharedAccessKey`.
     * 
     */
    @Export(name="secondaryKey", type=String.class, parameters={})
    private Output<String> secondaryKey;

    /**
     * @return The secondary access key for the authorization rule `RootManageSharedAccessKey`.
     * 
     */
    public Output<String> secondaryKey() {
        return this.secondaryKey;
    }
    /**
     * The name of the SKU to use. At this time the only supported value is `Standard`.
     * 
     */
    @Export(name="skuName", type=String.class, parameters={})
    private Output<String> skuName;

    /**
     * @return The name of the SKU to use. At this time the only supported value is `Standard`.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Namespace(String name) {
        this(name, NamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Namespace(String name, NamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Namespace(String name, NamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:relay/namespace:Namespace", name, args == null ? NamespaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Namespace(String name, Output<String> id, @Nullable NamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:relay/namespace:Namespace", name, state, makeResourceOptions(options, id));
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
    public static Namespace get(String name, Output<String> id, @Nullable NamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Namespace(name, id, state, options);
    }
}
