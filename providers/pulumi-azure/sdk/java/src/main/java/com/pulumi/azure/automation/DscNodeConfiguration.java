// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.automation.DscNodeConfigurationArgs;
import com.pulumi.azure.automation.inputs.DscNodeConfigurationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Automation DSC Node Configuration.
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
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .sku(Map.of(&#34;name&#34;, &#34;Basic&#34;))
 *             .build());
 * 
 *         var exampleDscConfiguration = new DscConfiguration(&#34;exampleDscConfiguration&#34;, DscConfigurationArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .automationAccountName(exampleAccount.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .contentEmbedded(&#34;configuration test {}&#34;)
 *             .build());
 * 
 *         var exampleDscNodeConfiguration = new DscNodeConfiguration(&#34;exampleDscNodeConfiguration&#34;, DscNodeConfigurationArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .automationAccountName(exampleAccount.getName())
 *             .contentEmbedded(&#34;&#34;&#34;
 * instance of MSFT_FileDirectoryConfiguration as $MSFT_FileDirectoryConfiguration1ref
 * {
 *   ResourceID = &#34;[File]bla&#34;;
 *   Ensure = &#34;Present&#34;;
 *   Contents = &#34;bogus Content&#34;;
 *   DestinationPath = &#34;c:\\bogus.txt&#34;;
 *   ModuleName = &#34;PSDesiredStateConfiguration&#34;;
 *   SourceInfo = &#34;::3::9::file&#34;;
 *   ModuleVersion = &#34;1.0&#34;;
 *   ConfigurationName = &#34;bla&#34;;
 * };
 * instance of OMI_ConfigurationDocument
 * {
 *   Version=&#34;2.0.0&#34;;
 *   MinimumCompatibleVersion = &#34;1.0.0&#34;;
 *   CompatibleVersionAdditionalProperties= {&#34;Omi_BaseResource:ConfigurationName&#34;};
 *   Author=&#34;bogusAuthor&#34;;
 *   GenerationDate=&#34;06/15/2018 14:06:24&#34;;
 *   GenerationHost=&#34;bogusComputer&#34;;
 *   Name=&#34;test&#34;;
 * };
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Automation DSC Node Configuration&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:automation/dscNodeConfiguration:DscNodeConfiguration configuration1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/nodeConfigurations/configuration1
 * ```
 * 
 */
@ResourceType(type="azure:automation/dscNodeConfiguration:DscNodeConfiguration")
public class DscNodeConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The name of the automation account in which the DSC Node Configuration is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="automationAccountName", type=String.class, parameters={})
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account in which the DSC Node Configuration is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }
    @Export(name="configurationName", type=String.class, parameters={})
    private Output<String> configurationName;

    public Output<String> configurationName() {
        return this.configurationName;
    }
    /**
     * The PowerShell DSC Node Configuration (mof content).
     * 
     */
    @Export(name="contentEmbedded", type=String.class, parameters={})
    private Output<String> contentEmbedded;

    /**
     * @return The PowerShell DSC Node Configuration (mof content).
     * 
     */
    public Output<String> contentEmbedded() {
        return this.contentEmbedded;
    }
    /**
     * Specifies the name of the DSC Node Configuration. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the DSC Node Configuration. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which the DSC Node Configuration is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the DSC Node Configuration is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DscNodeConfiguration(String name) {
        this(name, DscNodeConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DscNodeConfiguration(String name, DscNodeConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DscNodeConfiguration(String name, DscNodeConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/dscNodeConfiguration:DscNodeConfiguration", name, args == null ? DscNodeConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DscNodeConfiguration(String name, Output<String> id, @Nullable DscNodeConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/dscNodeConfiguration:DscNodeConfiguration", name, state, makeResourceOptions(options, id));
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
    public static DscNodeConfiguration get(String name, Output<String> id, @Nullable DscNodeConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DscNodeConfiguration(name, id, state, options);
    }
}
