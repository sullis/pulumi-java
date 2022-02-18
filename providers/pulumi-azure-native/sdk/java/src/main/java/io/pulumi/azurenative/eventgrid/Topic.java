// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventgrid.TopicArgs;
import io.pulumi.azurenative.eventgrid.outputs.InboundIpRuleResponse;
import io.pulumi.azurenative.eventgrid.outputs.JsonInputSchemaMappingResponse;
import io.pulumi.azurenative.eventgrid.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * EventGrid Topic
 * API Version: 2020-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:eventgrid:Topic exampletopic1 /subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourceGroups/examplerg/providers/Microsoft.EventGrid/topics/exampletopic1 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventgrid:Topic")
public class Topic extends io.pulumi.resources.CustomResource {
    /**
     * Endpoint for the topic.
     * 
     */
    @OutputExport(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return Endpoint for the topic.
     * 
     */
    public Output<String> getEndpoint() {
        return this.endpoint;
    }
    /**
     * This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     * 
     */
    @OutputExport(name="inboundIpRules", type=List.class, parameters={InboundIpRuleResponse.class})
    private Output</* @Nullable */ List<InboundIpRuleResponse>> inboundIpRules;

    /**
     * @return This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     * 
     */
    public Output</* @Nullable */ List<InboundIpRuleResponse>> getInboundIpRules() {
        return this.inboundIpRules;
    }
    /**
     * This determines the format that Event Grid should expect for incoming events published to the topic.
     * 
     */
    @OutputExport(name="inputSchema", type=String.class, parameters={})
    private Output</* @Nullable */ String> inputSchema;

    /**
     * @return This determines the format that Event Grid should expect for incoming events published to the topic.
     * 
     */
    public Output</* @Nullable */ String> getInputSchema() {
        return this.inputSchema;
    }
    /**
     * This enables publishing using custom event schemas. An InputSchemaMapping can be specified to map various properties of a source schema to various required properties of the EventGridEvent schema.
     * 
     */
    @OutputExport(name="inputSchemaMapping", type=JsonInputSchemaMappingResponse.class, parameters={})
    private Output</* @Nullable */ JsonInputSchemaMappingResponse> inputSchemaMapping;

    /**
     * @return This enables publishing using custom event schemas. An InputSchemaMapping can be specified to map various properties of a source schema to various required properties of the EventGridEvent schema.
     * 
     */
    public Output</* @Nullable */ JsonInputSchemaMappingResponse> getInputSchemaMapping() {
        return this.inputSchemaMapping;
    }
    /**
     * Location of the resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the resource.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Metric resource id for the topic.
     * 
     */
    @OutputExport(name="metricResourceId", type=String.class, parameters={})
    private Output<String> metricResourceId;

    /**
     * @return Metric resource id for the topic.
     * 
     */
    public Output<String> getMetricResourceId() {
        return this.metricResourceId;
    }
    /**
     * Name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="privateEndpointConnections", type=List.class, parameters={PrivateEndpointConnectionResponse.class})
    private Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections;

    public Output<List<PrivateEndpointConnectionResponse>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Provisioning state of the topic.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the topic.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * This determines if traffic is allowed over public network. By default it is enabled.
     * You can further restrict to specific IPs by configuring <seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicProperties.InboundIpRules" />
     * 
     */
    @OutputExport(name="publicNetworkAccess", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicNetworkAccess;

    /**
     * @return This determines if traffic is allowed over public network. By default it is enabled.
     * You can further restrict to specific IPs by configuring <seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicProperties.InboundIpRules" />
     * 
     */
    public Output</* @Nullable */ String> getPublicNetworkAccess() {
        return this.publicNetworkAccess;
    }
    /**
     * The system metadata relating to Topic resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to Topic resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Tags of the resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags of the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the resource.
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
    public Topic(String name, TopicArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:Topic", name, args == null ? TopicArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Topic(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:Topic", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20170615preview:Topic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20170915preview:Topic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20180101:Topic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20180501preview:Topic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20180915preview:Topic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20190101:Topic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20190201preview:Topic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20190601:Topic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20200101preview:Topic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20200401preview:Topic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20200601:Topic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20201015preview:Topic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20210601preview:Topic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20211201:Topic").build())
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
    public static Topic get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Topic(name, id, options);
    }
}
