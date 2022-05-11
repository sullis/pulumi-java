// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datafactory.IntegrationRuntimeManagedArgs;
import com.pulumi.azure.datafactory.inputs.IntegrationRuntimeManagedState;
import com.pulumi.azure.datafactory.outputs.IntegrationRuntimeManagedCatalogInfo;
import com.pulumi.azure.datafactory.outputs.IntegrationRuntimeManagedCustomSetupScript;
import com.pulumi.azure.datafactory.outputs.IntegrationRuntimeManagedVnetIntegration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Data Factory Managed Integration Runtime.
 * 
 * &gt; **NOTE:** The `azure.datafactory.IntegrationRuntimeManaged` resource has been superseded by the `azure.datafactory.IntegrationRuntimeSsis` resource. We recommend using the `azure.datafactory.IntegrationRuntimeSsis` resource for new deployments.
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
 *         var exampleFactory = new Factory(&#34;exampleFactory&#34;, FactoryArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .build());
 * 
 *         var exampleIntegrationRuntimeManaged = new IntegrationRuntimeManaged(&#34;exampleIntegrationRuntimeManaged&#34;, IntegrationRuntimeManagedArgs.builder()        
 *             .dataFactoryId(exampleFactory.getId())
 *             .location(exampleResourceGroup.getLocation())
 *             .nodeSize(&#34;Standard_D8_v3&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Data Factory Integration Managed Runtimes can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:datafactory/integrationRuntimeManaged:IntegrationRuntimeManaged example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/integrationruntimes/example
 * ```
 * 
 */
@ResourceType(type="azure:datafactory/integrationRuntimeManaged:IntegrationRuntimeManaged")
public class IntegrationRuntimeManaged extends com.pulumi.resources.CustomResource {
    /**
     * A `catalog_info` block as defined below.
     * 
     */
    @Export(name="catalogInfo", type=IntegrationRuntimeManagedCatalogInfo.class, parameters={})
    private Output</* @Nullable */ IntegrationRuntimeManagedCatalogInfo> catalogInfo;

    /**
     * @return A `catalog_info` block as defined below.
     * 
     */
    public Output<Optional<IntegrationRuntimeManagedCatalogInfo>> catalogInfo() {
        return Codegen.optional(this.catalogInfo);
    }
    /**
     * A `custom_setup_script` block as defined below.
     * 
     */
    @Export(name="customSetupScript", type=IntegrationRuntimeManagedCustomSetupScript.class, parameters={})
    private Output</* @Nullable */ IntegrationRuntimeManagedCustomSetupScript> customSetupScript;

    /**
     * @return A `custom_setup_script` block as defined below.
     * 
     */
    public Output<Optional<IntegrationRuntimeManagedCustomSetupScript>> customSetupScript() {
        return Codegen.optional(this.customSetupScript);
    }
    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Export(name="dataFactoryId", type=String.class, parameters={})
    private Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }
    /**
     * Integration runtime description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Integration runtime description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The Managed Integration Runtime edition. Valid values are `Standard` and `Enterprise`. Defaults to `Standard`.
     * 
     */
    @Export(name="edition", type=String.class, parameters={})
    private Output</* @Nullable */ String> edition;

    /**
     * @return The Managed Integration Runtime edition. Valid values are `Standard` and `Enterprise`. Defaults to `Standard`.
     * 
     */
    public Output<Optional<String>> edition() {
        return Codegen.optional(this.edition);
    }
    /**
     * The type of the license that is used. Valid values are `LicenseIncluded` and `BasePrize`. Defaults to `LicenseIncluded`.
     * 
     */
    @Export(name="licenseType", type=String.class, parameters={})
    private Output</* @Nullable */ String> licenseType;

    /**
     * @return The type of the license that is used. Valid values are `LicenseIncluded` and `BasePrize`. Defaults to `LicenseIncluded`.
     * 
     */
    public Output<Optional<String>> licenseType() {
        return Codegen.optional(this.licenseType);
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Defines the maximum parallel executions per node. Defaults to `1`. Max is `16`.
     * 
     */
    @Export(name="maxParallelExecutionsPerNode", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxParallelExecutionsPerNode;

    /**
     * @return Defines the maximum parallel executions per node. Defaults to `1`. Max is `16`.
     * 
     */
    public Output<Optional<Integer>> maxParallelExecutionsPerNode() {
        return Codegen.optional(this.maxParallelExecutionsPerNode);
    }
    /**
     * Specifies the name of the Managed Integration Runtime. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Managed Integration Runtime. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The size of the nodes on which the Managed Integration Runtime runs. Valid values are: `Standard_D2_v3`, `Standard_D4_v3`, `Standard_D8_v3`, `Standard_D16_v3`, `Standard_D32_v3`, `Standard_D64_v3`, `Standard_E2_v3`, `Standard_E4_v3`, `Standard_E8_v3`, `Standard_E16_v3`, `Standard_E32_v3`, `Standard_E64_v3`, `Standard_D1_v2`, `Standard_D2_v2`, `Standard_D3_v2`, `Standard_D4_v2`, `Standard_A4_v2` and `Standard_A8_v2`
     * 
     */
    @Export(name="nodeSize", type=String.class, parameters={})
    private Output<String> nodeSize;

    /**
     * @return The size of the nodes on which the Managed Integration Runtime runs. Valid values are: `Standard_D2_v3`, `Standard_D4_v3`, `Standard_D8_v3`, `Standard_D16_v3`, `Standard_D32_v3`, `Standard_D64_v3`, `Standard_E2_v3`, `Standard_E4_v3`, `Standard_E8_v3`, `Standard_E16_v3`, `Standard_E32_v3`, `Standard_E64_v3`, `Standard_D1_v2`, `Standard_D2_v2`, `Standard_D3_v2`, `Standard_D4_v2`, `Standard_A4_v2` and `Standard_A8_v2`
     * 
     */
    public Output<String> nodeSize() {
        return this.nodeSize;
    }
    /**
     * Number of nodes for the Managed Integration Runtime. Max is `10`. Defaults to `1`.
     * 
     */
    @Export(name="numberOfNodes", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> numberOfNodes;

    /**
     * @return Number of nodes for the Managed Integration Runtime. Max is `10`. Defaults to `1`.
     * 
     */
    public Output<Optional<Integer>> numberOfNodes() {
        return Codegen.optional(this.numberOfNodes);
    }
    /**
     * A `vnet_integration` block as defined below.
     * 
     */
    @Export(name="vnetIntegration", type=IntegrationRuntimeManagedVnetIntegration.class, parameters={})
    private Output</* @Nullable */ IntegrationRuntimeManagedVnetIntegration> vnetIntegration;

    /**
     * @return A `vnet_integration` block as defined below.
     * 
     */
    public Output<Optional<IntegrationRuntimeManagedVnetIntegration>> vnetIntegration() {
        return Codegen.optional(this.vnetIntegration);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationRuntimeManaged(String name) {
        this(name, IntegrationRuntimeManagedArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationRuntimeManaged(String name, IntegrationRuntimeManagedArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationRuntimeManaged(String name, IntegrationRuntimeManagedArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/integrationRuntimeManaged:IntegrationRuntimeManaged", name, args == null ? IntegrationRuntimeManagedArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IntegrationRuntimeManaged(String name, Output<String> id, @Nullable IntegrationRuntimeManagedState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/integrationRuntimeManaged:IntegrationRuntimeManaged", name, state, makeResourceOptions(options, id));
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
    public static IntegrationRuntimeManaged get(String name, Output<String> id, @Nullable IntegrationRuntimeManagedState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationRuntimeManaged(name, id, state, options);
    }
}
