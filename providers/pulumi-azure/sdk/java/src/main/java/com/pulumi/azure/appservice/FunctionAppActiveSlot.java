// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appservice.FunctionAppActiveSlotArgs;
import com.pulumi.azure.appservice.inputs.FunctionAppActiveSlotState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Function App Active Slot.
 * 
 * ## Example Usage
 * ### Windows Function App
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
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleServicePlan = new ServicePlan(&#34;exampleServicePlan&#34;, ServicePlanArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .osType(&#34;Windows&#34;)
 *             .skuName(&#34;Y1&#34;)
 *             .build());
 * 
 *         var exampleWindowsFunctionApp = new WindowsFunctionApp(&#34;exampleWindowsFunctionApp&#34;, WindowsFunctionAppArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .storageAccountName(exampleAccount.getName())
 *             .servicePlanId(exampleServicePlan.getId())
 *             .siteConfig()
 *             .build());
 * 
 *         var exampleWindowsFunctionAppSlot = new WindowsFunctionAppSlot(&#34;exampleWindowsFunctionAppSlot&#34;, WindowsFunctionAppSlotArgs.builder()        
 *             .functionAppId(exampleWindowsFunctionApp.getId())
 *             .storageAccountName(exampleAccount.getName())
 *             .siteConfig()
 *             .build());
 * 
 *         var exampleFunctionAppActiveSlot = new FunctionAppActiveSlot(&#34;exampleFunctionAppActiveSlot&#34;, FunctionAppActiveSlotArgs.builder()        
 *             .slotId(exampleWindowsFunctionAppSlot.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Linux Function App
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
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleServicePlan = new ServicePlan(&#34;exampleServicePlan&#34;, ServicePlanArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .osType(&#34;Linux&#34;)
 *             .skuName(&#34;Y1&#34;)
 *             .build());
 * 
 *         var exampleLinuxFunctionApp = new LinuxFunctionApp(&#34;exampleLinuxFunctionApp&#34;, LinuxFunctionAppArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .servicePlanId(exampleServicePlan.getId())
 *             .storageAccountName(exampleAccount.getName())
 *             .siteConfig()
 *             .build());
 * 
 *         var exampleLinuxFunctionAppSlot = new LinuxFunctionAppSlot(&#34;exampleLinuxFunctionAppSlot&#34;, LinuxFunctionAppSlotArgs.builder()        
 *             .functionAppId(exampleLinuxFunctionApp.getName())
 *             .storageAccountName(exampleAccount.getName())
 *             .siteConfig()
 *             .build());
 * 
 *         var exampleFunctionAppActiveSlot = new FunctionAppActiveSlot(&#34;exampleFunctionAppActiveSlot&#34;, FunctionAppActiveSlotArgs.builder()        
 *             .slotId(exampleLinuxFunctionAppSlot.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * a Function App Active Slot can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appservice/functionAppActiveSlot:FunctionAppActiveSlot example &#34;/subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Web/sites/site1&#34;
 * ```
 * 
 */
@ResourceType(type="azure:appservice/functionAppActiveSlot:FunctionAppActiveSlot")
public class FunctionAppActiveSlot extends com.pulumi.resources.CustomResource {
    /**
     * The timestamp of the last successful swap with `Production`
     * 
     */
    @Export(name="lastSuccessfulSwap", type=String.class, parameters={})
    private Output<String> lastSuccessfulSwap;

    /**
     * @return The timestamp of the last successful swap with `Production`
     * 
     */
    public Output<String> lastSuccessfulSwap() {
        return this.lastSuccessfulSwap;
    }
    /**
     * The swap action should overwrite the Production slot&#39;s network configuration with the configuration from this slot. Defaults to `true`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="overwriteNetworkConfig", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> overwriteNetworkConfig;

    /**
     * @return The swap action should overwrite the Production slot&#39;s network configuration with the configuration from this slot. Defaults to `true`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> overwriteNetworkConfig() {
        return Codegen.optional(this.overwriteNetworkConfig);
    }
    /**
     * The ID of the Slot to swap with `Production`.
     * 
     */
    @Export(name="slotId", type=String.class, parameters={})
    private Output<String> slotId;

    /**
     * @return The ID of the Slot to swap with `Production`.
     * 
     */
    public Output<String> slotId() {
        return this.slotId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FunctionAppActiveSlot(String name) {
        this(name, FunctionAppActiveSlotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FunctionAppActiveSlot(String name, FunctionAppActiveSlotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FunctionAppActiveSlot(String name, FunctionAppActiveSlotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/functionAppActiveSlot:FunctionAppActiveSlot", name, args == null ? FunctionAppActiveSlotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FunctionAppActiveSlot(String name, Output<String> id, @Nullable FunctionAppActiveSlotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/functionAppActiveSlot:FunctionAppActiveSlot", name, state, makeResourceOptions(options, id));
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
    public static FunctionAppActiveSlot get(String name, Output<String> id, @Nullable FunctionAppActiveSlotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FunctionAppActiveSlot(name, id, state, options);
    }
}
