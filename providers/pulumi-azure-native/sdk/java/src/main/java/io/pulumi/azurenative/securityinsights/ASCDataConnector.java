// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.ASCDataConnectorArgs;
import io.pulumi.azurenative.securityinsights.outputs.AlertsDataTypeOfDataConnectorResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents ASC (Azure Security Center) data connector.
 * API Version: 2020-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:ASCDataConnector 73e01a99-5cd7-4139-a149-9f2736ff2ab5 /subscriptions/d0cfe6b2-9ac0-4464-9919-dccaee2e48c0/resourceGroups/myRg/providers/Microsoft.OperationalInsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/dataConnectors/73e01a99-5cd7-4139-a149-9f2736ff2ab5 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:ASCDataConnector")
public class ASCDataConnector extends io.pulumi.resources.CustomResource {
    /**
     * The available data types for the connector.
     * 
     */
    @OutputExport(name="dataTypes", type=AlertsDataTypeOfDataConnectorResponse.class, parameters={})
    private Output</* @Nullable */ AlertsDataTypeOfDataConnectorResponse> dataTypes;

    /**
     * @return The available data types for the connector.
     * 
     */
    public Output</* @Nullable */ AlertsDataTypeOfDataConnectorResponse> getDataTypes() {
        return this.dataTypes;
    }
    /**
     * Etag of the azure resource
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Etag of the azure resource
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * The kind of the data connector
     * Expected value is 'AzureSecurityCenter'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the data connector
     * Expected value is 'AzureSecurityCenter'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Azure resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The subscription id to connect to, and get the data from.
     * 
     */
    @OutputExport(name="subscriptionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> subscriptionId;

    /**
     * @return The subscription id to connect to, and get the data from.
     * 
     */
    public Output</* @Nullable */ String> getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Azure resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ASCDataConnectorArgs.Builder a);
    }
    private static io.pulumi.azurenative.securityinsights.ASCDataConnectorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.securityinsights.ASCDataConnectorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ASCDataConnector(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ASCDataConnector(String name) {
        this(name, ASCDataConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ASCDataConnector(String name, ASCDataConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ASCDataConnector(String name, ASCDataConnectorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:ASCDataConnector", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private ASCDataConnector(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:ASCDataConnector", name, null, makeResourceOptions(options, id));
    }

    private static ASCDataConnectorArgs makeArgs(ASCDataConnectorArgs args) {
        var builder = args == null ? ASCDataConnectorArgs.builder() : ASCDataConnectorArgs.builder(args);
        return builder
            .setKind("AzureSecurityCenter")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20190101preview:ASCDataConnector").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20200101:ASCDataConnector").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210301preview:ASCDataConnector").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210901preview:ASCDataConnector").build())
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
    public static ASCDataConnector get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ASCDataConnector(name, id, options);
    }
}