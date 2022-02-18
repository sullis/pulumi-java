// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.DscNodeConfigurationArgs;
import io.pulumi.azurenative.automation.outputs.DscConfigurationAssociationPropertyResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Definition of the dsc node configuration.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automation:DscNodeConfiguration configName.nodeConfigName /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/myAutomationAccount20/nodeConfigurations/configName.nodeConfigName 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:DscNodeConfiguration")
public class DscNodeConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * Gets or sets the configuration of the node.
     * 
     */
    @OutputExport(name="configuration", type=DscConfigurationAssociationPropertyResponse.class, parameters={})
    private Output</* @Nullable */ DscConfigurationAssociationPropertyResponse> configuration;

    /**
     * @return Gets or sets the configuration of the node.
     * 
     */
    public Output</* @Nullable */ DscConfigurationAssociationPropertyResponse> getConfiguration() {
        return this.configuration;
    }
    /**
     * Gets or sets creation time.
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> creationTime;

    /**
     * @return Gets or sets creation time.
     * 
     */
    public Output</* @Nullable */ String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * If a new build version of NodeConfiguration is required.
     * 
     */
    @OutputExport(name="incrementNodeConfigurationBuild", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> incrementNodeConfigurationBuild;

    /**
     * @return If a new build version of NodeConfiguration is required.
     * 
     */
    public Output</* @Nullable */ Boolean> getIncrementNodeConfigurationBuild() {
        return this.incrementNodeConfigurationBuild;
    }
    /**
     * Gets or sets the last modified time.
     * 
     */
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedTime;

    /**
     * @return Gets or sets the last modified time.
     * 
     */
    public Output</* @Nullable */ String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Number of nodes with this node configuration assigned
     * 
     */
    @OutputExport(name="nodeCount", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> nodeCount;

    /**
     * @return Number of nodes with this node configuration assigned
     * 
     */
    public Output</* @Nullable */ Double> getNodeCount() {
        return this.nodeCount;
    }
    /**
     * Source of node configuration.
     * 
     */
    @OutputExport(name="source", type=String.class, parameters={})
    private Output</* @Nullable */ String> source;

    /**
     * @return Source of node configuration.
     * 
     */
    public Output</* @Nullable */ String> getSource() {
        return this.source;
    }
    /**
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
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
    public DscNodeConfiguration(String name, DscNodeConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:DscNodeConfiguration", name, args == null ? DscNodeConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DscNodeConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:DscNodeConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:automation/v20151031:DscNodeConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20180115:DscNodeConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20190601:DscNodeConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20200113preview:DscNodeConfiguration").build())
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
    public static DscNodeConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DscNodeConfiguration(name, id, options);
    }
}
