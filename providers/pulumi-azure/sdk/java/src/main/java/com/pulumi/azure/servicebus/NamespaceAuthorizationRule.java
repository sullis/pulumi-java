// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.servicebus.NamespaceAuthorizationRuleArgs;
import com.pulumi.azure.servicebus.inputs.NamespaceAuthorizationRuleState;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a ServiceBus Namespace authorization Rule within a ServiceBus.
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
 *             .location(&#34;West US&#34;)
 *             .build());
 * 
 *         var exampleNamespace = new Namespace(&#34;exampleNamespace&#34;, NamespaceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .sku(&#34;Standard&#34;)
 *             .tags(Map.of(&#34;source&#34;, &#34;example&#34;))
 *             .build());
 * 
 *         var exampleNamespaceAuthorizationRule = new NamespaceAuthorizationRule(&#34;exampleNamespaceAuthorizationRule&#34;, NamespaceAuthorizationRuleArgs.builder()        
 *             .namespaceId(exampleNamespace.getId())
 *             .listen(true)
 *             .send(true)
 *             .manage(false)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * ServiceBus Namespace authorization rules can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:servicebus/namespaceAuthorizationRule:NamespaceAuthorizationRule rule1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ServiceBus/namespaces/namespace1/AuthorizationRules/rule1
 * ```
 * 
 */
@ResourceType(type="azure:servicebus/namespaceAuthorizationRule:NamespaceAuthorizationRule")
public class NamespaceAuthorizationRule extends com.pulumi.resources.CustomResource {
    /**
     * Grants listen access to this this Authorization Rule. Defaults to `false`.
     * 
     */
    @Export(name="listen", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> listen;

    /**
     * @return Grants listen access to this this Authorization Rule. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> listen() {
        return Codegen.optional(this.listen);
    }
    /**
     * Grants manage access to this this Authorization Rule. When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
     * 
     */
    @Export(name="manage", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> manage;

    /**
     * @return Grants manage access to this this Authorization Rule. When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> manage() {
        return Codegen.optional(this.manage);
    }
    /**
     * Specifies the name of the ServiceBus Namespace Authorization Rule resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the ServiceBus Namespace Authorization Rule resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the ID of the ServiceBus Namespace. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="namespaceId", type=String.class, parameters={})
    private Output<String> namespaceId;

    /**
     * @return Specifies the ID of the ServiceBus Namespace. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }
    /**
     * The Primary Connection String for the ServiceBus Namespace authorization Rule.
     * 
     */
    @Export(name="primaryConnectionString", type=String.class, parameters={})
    private Output<String> primaryConnectionString;

    /**
     * @return The Primary Connection String for the ServiceBus Namespace authorization Rule.
     * 
     */
    public Output<String> primaryConnectionString() {
        return this.primaryConnectionString;
    }
    /**
     * The alias Primary Connection String for the ServiceBus Namespace, if the namespace is Geo DR paired.
     * 
     */
    @Export(name="primaryConnectionStringAlias", type=String.class, parameters={})
    private Output<String> primaryConnectionStringAlias;

    /**
     * @return The alias Primary Connection String for the ServiceBus Namespace, if the namespace is Geo DR paired.
     * 
     */
    public Output<String> primaryConnectionStringAlias() {
        return this.primaryConnectionStringAlias;
    }
    /**
     * The Primary Key for the ServiceBus Namespace authorization Rule.
     * 
     */
    @Export(name="primaryKey", type=String.class, parameters={})
    private Output<String> primaryKey;

    /**
     * @return The Primary Key for the ServiceBus Namespace authorization Rule.
     * 
     */
    public Output<String> primaryKey() {
        return this.primaryKey;
    }
    /**
     * The Secondary Connection String for the ServiceBus Namespace authorization Rule.
     * 
     */
    @Export(name="secondaryConnectionString", type=String.class, parameters={})
    private Output<String> secondaryConnectionString;

    /**
     * @return The Secondary Connection String for the ServiceBus Namespace authorization Rule.
     * 
     */
    public Output<String> secondaryConnectionString() {
        return this.secondaryConnectionString;
    }
    /**
     * The alias Secondary Connection String for the ServiceBus Namespace
     * 
     */
    @Export(name="secondaryConnectionStringAlias", type=String.class, parameters={})
    private Output<String> secondaryConnectionStringAlias;

    /**
     * @return The alias Secondary Connection String for the ServiceBus Namespace
     * 
     */
    public Output<String> secondaryConnectionStringAlias() {
        return this.secondaryConnectionStringAlias;
    }
    /**
     * The Secondary Key for the ServiceBus Namespace authorization Rule.
     * 
     */
    @Export(name="secondaryKey", type=String.class, parameters={})
    private Output<String> secondaryKey;

    /**
     * @return The Secondary Key for the ServiceBus Namespace authorization Rule.
     * 
     */
    public Output<String> secondaryKey() {
        return this.secondaryKey;
    }
    /**
     * Grants send access to this this Authorization Rule. Defaults to `false`.
     * 
     */
    @Export(name="send", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> send;

    /**
     * @return Grants send access to this this Authorization Rule. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> send() {
        return Codegen.optional(this.send);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NamespaceAuthorizationRule(String name) {
        this(name, NamespaceAuthorizationRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamespaceAuthorizationRule(String name, NamespaceAuthorizationRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamespaceAuthorizationRule(String name, NamespaceAuthorizationRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:servicebus/namespaceAuthorizationRule:NamespaceAuthorizationRule", name, args == null ? NamespaceAuthorizationRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NamespaceAuthorizationRule(String name, Output<String> id, @Nullable NamespaceAuthorizationRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:servicebus/namespaceAuthorizationRule:NamespaceAuthorizationRule", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure:eventhub/namespaceAuthorizationRule:NamespaceAuthorizationRule").build())
            ))
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
    public static NamespaceAuthorizationRule get(String name, Output<String> id, @Nullable NamespaceAuthorizationRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NamespaceAuthorizationRule(name, id, state, options);
    }
}
