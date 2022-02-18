// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.IntegrationRuntimeArgs;
import io.pulumi.azurenative.synapse.outputs.ManagedIntegrationRuntimeResponse;
import io.pulumi.azurenative.synapse.outputs.SelfHostedIntegrationRuntimeResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Integration runtime resource type.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:synapse:IntegrationRuntime exampleIntegrationRuntime /subscriptions/12345678-1234-1234-1234-12345678abc/resourceGroups/exampleResourceGroup/providers/Microsoft.Synapse/workspaces/exampleWorkspaceName/integrationruntimes/exampleIntegrationRuntime 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:IntegrationRuntime")
public class IntegrationRuntime extends io.pulumi.resources.CustomResource {
    /**
     * Resource Etag.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Resource Etag.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
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
     * Integration runtime properties.
     * 
     */
    @OutputExport(name="properties", type=Either.class, parameters={ManagedIntegrationRuntimeResponse.class, SelfHostedIntegrationRuntimeResponse.class})
    private Output<Either<ManagedIntegrationRuntimeResponse,SelfHostedIntegrationRuntimeResponse>> properties;

    /**
     * @return Integration runtime properties.
     * 
     */
    public Output<Either<ManagedIntegrationRuntimeResponse,SelfHostedIntegrationRuntimeResponse>> getProperties() {
        return this.properties;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
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
    public IntegrationRuntime(String name, IntegrationRuntimeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:IntegrationRuntime", name, args == null ? IntegrationRuntimeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IntegrationRuntime(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:IntegrationRuntime", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:synapse/v20190601preview:IntegrationRuntime").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20201201:IntegrationRuntime").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210301:IntegrationRuntime").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210401preview:IntegrationRuntime").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210501:IntegrationRuntime").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601:IntegrationRuntime").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601preview:IntegrationRuntime").build())
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
    public static IntegrationRuntime get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationRuntime(name, id, options);
    }
}
