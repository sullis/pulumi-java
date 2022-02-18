// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appplatform.StorageArgs;
import io.pulumi.azurenative.appplatform.outputs.StorageAccountResponse;
import io.pulumi.azurenative.appplatform.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Storage resource payload.
 * API Version: 2021-09-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:appplatform:Storage mystorage /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/storages/mystorage 
 * ```
 * 
 */
@ResourceType(type="azure-native:appplatform:Storage")
public class Storage extends io.pulumi.resources.CustomResource {
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Properties of the storage resource payload.
     * 
     */
    @OutputExport(name="properties", type=StorageAccountResponse.class, parameters={})
    private Output<StorageAccountResponse> properties;

    /**
     * @return Properties of the storage resource payload.
     * 
     */
    public Output<StorageAccountResponse> getProperties() {
        return this.properties;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
    public Storage(String name, StorageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:Storage", name, args == null ? StorageArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Storage(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:Storage", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:appplatform/v20210901preview:Storage").build()),
                Input.of(Alias.builder().setType("azure-native:appplatform/v20220101preview:Storage").build())
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
    public static Storage get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Storage(name, id, options);
    }
}
