// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.loganalytics;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.loganalytics.DataExportRuleArgs;
import com.pulumi.azure.loganalytics.inputs.DataExportRuleState;
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
 * Manages a Log Analytics Data Export Rule.
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
 *         var exampleAnalyticsWorkspace = new AnalyticsWorkspace(&#34;exampleAnalyticsWorkspace&#34;, AnalyticsWorkspaceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .sku(&#34;PerGB2018&#34;)
 *             .retentionInDays(30)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleDataExportRule = new DataExportRule(&#34;exampleDataExportRule&#34;, DataExportRuleArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .workspaceResourceId(exampleAnalyticsWorkspace.getId())
 *             .destinationResourceId(exampleAccount.getId())
 *             .tableNames(&#34;Heartbeat&#34;)
 *             .enabled(true)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Log Analytics Data Export Rule can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:loganalytics/dataExportRule:DataExportRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/dataExports/dataExport1
 * ```
 * 
 */
@ResourceType(type="azure:loganalytics/dataExportRule:DataExportRule")
public class DataExportRule extends com.pulumi.resources.CustomResource {
    /**
     * The destination resource ID. It should be a storage account, an event hub namespace or an event hub. If the destination is an event hub namespace, an event hub would be created for each table automatically.
     * 
     */
    @Export(name="destinationResourceId", type=String.class, parameters={})
    private Output<String> destinationResourceId;

    /**
     * @return The destination resource ID. It should be a storage account, an event hub namespace or an event hub. If the destination is an event hub namespace, an event hub would be created for each table automatically.
     * 
     */
    public Output<String> destinationResourceId() {
        return this.destinationResourceId;
    }
    /**
     * Is this Log Analytics Data Export Rule enabled? Possible values include `true` or `false`. Defaults to `false`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Is this Log Analytics Data Export Rule enabled? Possible values include `true` or `false`. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The ID of the created Data Export Rule.
     * 
     */
    @Export(name="exportRuleId", type=String.class, parameters={})
    private Output<String> exportRuleId;

    /**
     * @return The ID of the created Data Export Rule.
     * 
     */
    public Output<String> exportRuleId() {
        return this.exportRuleId;
    }
    /**
     * The name of the Log Analytics Data Export Rule. Changing this forces a new Log Analytics Data Export Rule to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Log Analytics Data Export Rule. Changing this forces a new Log Analytics Data Export Rule to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Log Analytics Data Export should exist. Changing this forces a new Log Analytics Data Export Rule to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Log Analytics Data Export should exist. Changing this forces a new Log Analytics Data Export Rule to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A list of table names to export to the destination resource, for example: `[&#34;Heartbeat&#34;, &#34;SecurityEvent&#34;]`.
     * 
     */
    @Export(name="tableNames", type=List.class, parameters={String.class})
    private Output<List<String>> tableNames;

    /**
     * @return A list of table names to export to the destination resource, for example: `[&#34;Heartbeat&#34;, &#34;SecurityEvent&#34;]`.
     * 
     */
    public Output<List<String>> tableNames() {
        return this.tableNames;
    }
    /**
     * The resource ID of the workspace. Changing this forces a new Log Analytics Data Export Rule to be created.
     * 
     */
    @Export(name="workspaceResourceId", type=String.class, parameters={})
    private Output<String> workspaceResourceId;

    /**
     * @return The resource ID of the workspace. Changing this forces a new Log Analytics Data Export Rule to be created.
     * 
     */
    public Output<String> workspaceResourceId() {
        return this.workspaceResourceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataExportRule(String name) {
        this(name, DataExportRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataExportRule(String name, DataExportRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataExportRule(String name, DataExportRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:loganalytics/dataExportRule:DataExportRule", name, args == null ? DataExportRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataExportRule(String name, Output<String> id, @Nullable DataExportRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:loganalytics/dataExportRule:DataExportRule", name, state, makeResourceOptions(options, id));
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
    public static DataExportRule get(String name, Output<String> id, @Nullable DataExportRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataExportRule(name, id, state, options);
    }
}
