// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.WorkflowArgs;
import io.pulumi.azurenative.logic.outputs.FlowAccessControlConfigurationResponse;
import io.pulumi.azurenative.logic.outputs.FlowEndpointsConfigurationResponse;
import io.pulumi.azurenative.logic.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.logic.outputs.ResourceReferenceResponse;
import io.pulumi.azurenative.logic.outputs.SkuResponse;
import io.pulumi.azurenative.logic.outputs.WorkflowParameterResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The workflow type.
 * API Version: 2019-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logic:Workflow myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows/{workflowName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:Workflow")
public class Workflow extends io.pulumi.resources.CustomResource {
    /**
     * The access control configuration.
     * 
     */
    @OutputExport(name="accessControl", type=FlowAccessControlConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ FlowAccessControlConfigurationResponse> accessControl;

    /**
     * @return The access control configuration.
     * 
     */
    public Output</* @Nullable */ FlowAccessControlConfigurationResponse> getAccessControl() {
        return this.accessControl;
    }
    /**
     * Gets the access endpoint.
     * 
     */
    @OutputExport(name="accessEndpoint", type=String.class, parameters={})
    private Output<String> accessEndpoint;

    /**
     * @return Gets the access endpoint.
     * 
     */
    public Output<String> getAccessEndpoint() {
        return this.accessEndpoint;
    }
    /**
     * Gets the changed time.
     * 
     */
    @OutputExport(name="changedTime", type=String.class, parameters={})
    private Output<String> changedTime;

    /**
     * @return Gets the changed time.
     * 
     */
    public Output<String> getChangedTime() {
        return this.changedTime;
    }
    /**
     * Gets the created time.
     * 
     */
    @OutputExport(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return Gets the created time.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * The definition.
     * 
     */
    @OutputExport(name="definition", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> definition;

    /**
     * @return The definition.
     * 
     */
    public Output</* @Nullable */ Object> getDefinition() {
        return this.definition;
    }
    /**
     * The endpoints configuration.
     * 
     */
    @OutputExport(name="endpointsConfiguration", type=FlowEndpointsConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ FlowEndpointsConfigurationResponse> endpointsConfiguration;

    /**
     * @return The endpoints configuration.
     * 
     */
    public Output</* @Nullable */ FlowEndpointsConfigurationResponse> getEndpointsConfiguration() {
        return this.endpointsConfiguration;
    }
    /**
     * Managed service identity properties.
     * 
     */
    @OutputExport(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    /**
     * @return Managed service identity properties.
     * 
     */
    public Output</* @Nullable */ ManagedServiceIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * The integration account.
     * 
     */
    @OutputExport(name="integrationAccount", type=ResourceReferenceResponse.class, parameters={})
    private Output</* @Nullable */ ResourceReferenceResponse> integrationAccount;

    /**
     * @return The integration account.
     * 
     */
    public Output</* @Nullable */ ResourceReferenceResponse> getIntegrationAccount() {
        return this.integrationAccount;
    }
    /**
     * The integration service environment.
     * 
     */
    @OutputExport(name="integrationServiceEnvironment", type=ResourceReferenceResponse.class, parameters={})
    private Output</* @Nullable */ ResourceReferenceResponse> integrationServiceEnvironment;

    /**
     * @return The integration service environment.
     * 
     */
    public Output</* @Nullable */ ResourceReferenceResponse> getIntegrationServiceEnvironment() {
        return this.integrationServiceEnvironment;
    }
    /**
     * The resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Gets the resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The parameters.
     * 
     */
    @OutputExport(name="parameters", type=Map.class, parameters={String.class, WorkflowParameterResponse.class})
    private Output</* @Nullable */ Map<String,WorkflowParameterResponse>> parameters;

    /**
     * @return The parameters.
     * 
     */
    public Output</* @Nullable */ Map<String,WorkflowParameterResponse>> getParameters() {
        return this.parameters;
    }
    /**
     * Gets the provisioning state.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets the provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The sku.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return The sku.
     * 
     */
    public Output<SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * The state.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output</* @Nullable */ String> state;

    /**
     * @return The state.
     * 
     */
    public Output</* @Nullable */ String> getState() {
        return this.state;
    }
    /**
     * The resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Gets the resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets the resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Gets the version.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Gets the version.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workflow(String name, WorkflowArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:Workflow", name, args == null ? WorkflowArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Workflow(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:Workflow", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:logic/v20150201preview:Workflow").build()),
                Input.of(Alias.builder().setType("azure-native:logic/v20160601:Workflow").build()),
                Input.of(Alias.builder().setType("azure-native:logic/v20180701preview:Workflow").build()),
                Input.of(Alias.builder().setType("azure-native:logic/v20190501:Workflow").build())
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
    public static Workflow get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Workflow(name, id, options);
    }
}
