// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datafactory.FactoryArgs;
import io.pulumi.azurenative.datafactory.outputs.EncryptionConfigurationResponse;
import io.pulumi.azurenative.datafactory.outputs.FactoryGitHubConfigurationResponse;
import io.pulumi.azurenative.datafactory.outputs.FactoryIdentityResponse;
import io.pulumi.azurenative.datafactory.outputs.FactoryVSTSConfigurationResponse;
import io.pulumi.azurenative.datafactory.outputs.GlobalParameterSpecificationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Factory resource type.
 * API Version: 2018-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datafactory:Factory exampleFactoryName /subscriptions/12345678-1234-1234-1234-12345678abc/resourceGroups/exampleResourceGroup/providers/Microsoft.DataFactory/factories/exampleFactoryName 
 * ```
 * 
 */
@ResourceType(type="azure-native:datafactory:Factory")
public class Factory extends io.pulumi.resources.CustomResource {
    /**
     * Time the factory was created in ISO8601 format.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time the factory was created in ISO8601 format.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Etag identifies change in the resource.
     * 
     */
    @OutputExport(name="eTag", type=String.class, parameters={})
    private Output<String> eTag;

    /**
     * @return Etag identifies change in the resource.
     * 
     */
    public Output<String> getETag() {
        return this.eTag;
    }
    /**
     * Properties to enable Customer Managed Key for the factory.
     * 
     */
    @OutputExport(name="encryption", type=EncryptionConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ EncryptionConfigurationResponse> encryption;

    /**
     * @return Properties to enable Customer Managed Key for the factory.
     * 
     */
    public Output</* @Nullable */ EncryptionConfigurationResponse> getEncryption() {
        return this.encryption;
    }
    /**
     * List of parameters for factory.
     * 
     */
    @OutputExport(name="globalParameters", type=Map.class, parameters={String.class, GlobalParameterSpecificationResponse.class})
    private Output</* @Nullable */ Map<String,GlobalParameterSpecificationResponse>> globalParameters;

    /**
     * @return List of parameters for factory.
     * 
     */
    public Output</* @Nullable */ Map<String,GlobalParameterSpecificationResponse>> getGlobalParameters() {
        return this.globalParameters;
    }
    /**
     * Managed service identity of the factory.
     * 
     */
    @OutputExport(name="identity", type=FactoryIdentityResponse.class, parameters={})
    private Output</* @Nullable */ FactoryIdentityResponse> identity;

    /**
     * @return Managed service identity of the factory.
     * 
     */
    public Output</* @Nullable */ FactoryIdentityResponse> getIdentity() {
        return this.identity;
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
     * The resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Factory provisioning state, example Succeeded.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Factory provisioning state, example Succeeded.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Whether or not public network access is allowed for the data factory.
     * 
     */
    @OutputExport(name="publicNetworkAccess", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicNetworkAccess;

    /**
     * @return Whether or not public network access is allowed for the data factory.
     * 
     */
    public Output</* @Nullable */ String> getPublicNetworkAccess() {
        return this.publicNetworkAccess;
    }
    /**
     * Git repo information of the factory.
     * 
     */
    @OutputExport(name="repoConfiguration", type=Either.class, parameters={FactoryGitHubConfigurationResponse.class, FactoryVSTSConfigurationResponse.class})
    private Output</* @Nullable */ Either<FactoryGitHubConfigurationResponse,FactoryVSTSConfigurationResponse>> repoConfiguration;

    /**
     * @return Git repo information of the factory.
     * 
     */
    public Output</* @Nullable */ Either<FactoryGitHubConfigurationResponse,FactoryVSTSConfigurationResponse>> getRepoConfiguration() {
        return this.repoConfiguration;
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
     * The resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Version of the factory.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Version of the factory.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(FactoryArgs.Builder a);
    }
    private static io.pulumi.azurenative.datafactory.FactoryArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.datafactory.FactoryArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Factory(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Factory(String name) {
        this(name, FactoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Factory(String name, FactoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Factory(String name, FactoryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datafactory:Factory", name, args == null ? FactoryArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Factory(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datafactory:Factory", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:datafactory/v20170901preview:Factory").build()),
                Input.of(Alias.builder().setType("azure-native:datafactory/v20180601:Factory").build())
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
    public static Factory get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Factory(name, id, options);
    }
}