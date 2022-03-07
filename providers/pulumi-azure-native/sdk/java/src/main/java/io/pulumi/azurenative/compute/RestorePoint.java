// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.RestorePointArgs;
import io.pulumi.azurenative.compute.outputs.ApiEntityReferenceResponse;
import io.pulumi.azurenative.compute.outputs.RestorePointSourceMetadataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Restore Point details.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:RestorePoint rpName /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/restorePointCollections/rpcName/restorePoints/rpName 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:RestorePoint")
public class RestorePoint extends io.pulumi.resources.CustomResource {
    /**
     * Gets the consistency mode for the restore point. Please refer to https://aka.ms/RestorePoints for more details.
     * 
     */
    @OutputExport(name="consistencyMode", type=String.class, parameters={})
    private Output<String> consistencyMode;

    /**
     * @return Gets the consistency mode for the restore point. Please refer to https://aka.ms/RestorePoints for more details.
     * 
     */
    public Output<String> getConsistencyMode() {
        return this.consistencyMode;
    }
    /**
     * List of disk resource ids that the customer wishes to exclude from the restore point. If no disks are specified, all disks will be included.
     * 
     */
    @OutputExport(name="excludeDisks", type=List.class, parameters={ApiEntityReferenceResponse.class})
    private Output</* @Nullable */ List<ApiEntityReferenceResponse>> excludeDisks;

    /**
     * @return List of disk resource ids that the customer wishes to exclude from the restore point. If no disks are specified, all disks will be included.
     * 
     */
    public Output</* @Nullable */ List<ApiEntityReferenceResponse>> getExcludeDisks() {
        return this.excludeDisks;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Gets the provisioning state of the restore point.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets the provisioning state of the restore point.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets the details of the VM captured at the time of the restore point creation.
     * 
     */
    @OutputExport(name="sourceMetadata", type=RestorePointSourceMetadataResponse.class, parameters={})
    private Output<RestorePointSourceMetadataResponse> sourceMetadata;

    /**
     * @return Gets the details of the VM captured at the time of the restore point creation.
     * 
     */
    public Output<RestorePointSourceMetadataResponse> getSourceMetadata() {
        return this.sourceMetadata;
    }
    /**
     * Gets the creation time of the restore point.
     * 
     */
    @OutputExport(name="timeCreated", type=String.class, parameters={})
    private Output</* @Nullable */ String> timeCreated;

    /**
     * @return Gets the creation time of the restore point.
     * 
     */
    public Output</* @Nullable */ String> getTimeCreated() {
        return this.timeCreated;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(RestorePointArgs.Builder a);
    }
    private static io.pulumi.azurenative.compute.RestorePointArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.compute.RestorePointArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RestorePoint(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RestorePoint(String name) {
        this(name, RestorePointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RestorePoint(String name, RestorePointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RestorePoint(String name, RestorePointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:RestorePoint", name, args == null ? RestorePointArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RestorePoint(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:RestorePoint", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:compute/v20210301:RestorePoint").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210401:RestorePoint").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210701:RestorePoint").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20211101:RestorePoint").build())
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
    public static RestorePoint get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RestorePoint(name, id, options);
    }
}