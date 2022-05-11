// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.bot.HealthbotArgs;
import com.pulumi.azure.bot.inputs.HealthbotState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Healthbot Service.
 * 
 * ## Example Usage
 * 
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
 *         var exampleHealthbot = new Healthbot(&#34;exampleHealthbot&#34;, HealthbotArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .sku(Map.of(&#34;name&#34;, &#34;F0&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Healthbot Service can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:bot/healthbot:Healthbot example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.HealthBot/healthBots/bot1
 * ```
 * 
 */
@ResourceType(type="azure:bot/healthbot:Healthbot")
public class Healthbot extends com.pulumi.resources.CustomResource {
    /**
     * The management portal url.
     * 
     */
    @Export(name="botManagementPortalUrl", type=String.class, parameters={})
    private Output<String> botManagementPortalUrl;

    /**
     * @return The management portal url.
     * 
     */
    public Output<String> botManagementPortalUrl() {
        return this.botManagementPortalUrl;
    }
    /**
     * Specifies The Azure Region where the resource exists. CHanging this force a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies The Azure Region where the resource exists. CHanging this force a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies The name of the Healthbot Service resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies The name of the Healthbot Service resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies The name of the Resource Group in which to create the Healthbot Service. changing this
     * forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Specifies The name of the Resource Group in which to create the Healthbot Service. changing this
     * forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The name which should be used for the SKU of the service. Possible values are &#34;F0&#34; and &#34;S1&#34;.
     * 
     */
    @Export(name="skuName", type=String.class, parameters={})
    private Output<String> skuName;

    /**
     * @return The name which should be used for the SKU of the service. Possible values are &#34;F0&#34; and &#34;S1&#34;.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }
    /**
     * A mapping of tags which should be assigned to the service.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the service.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Healthbot(String name) {
        this(name, HealthbotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Healthbot(String name, HealthbotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Healthbot(String name, HealthbotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:bot/healthbot:Healthbot", name, args == null ? HealthbotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Healthbot(String name, Output<String> id, @Nullable HealthbotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:bot/healthbot:Healthbot", name, state, makeResourceOptions(options, id));
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
    public static Healthbot get(String name, Output<String> id, @Nullable HealthbotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Healthbot(name, id, state, options);
    }
}
