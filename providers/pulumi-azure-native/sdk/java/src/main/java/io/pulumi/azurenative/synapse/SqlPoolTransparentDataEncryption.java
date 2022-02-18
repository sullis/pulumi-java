// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.SqlPoolTransparentDataEncryptionArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a Sql pool transparent data encryption configuration.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:synapse:SqlPoolTransparentDataEncryption current /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-6852/providers/Microsoft.Synapse/workspaces/sqlcrudtest-2080/sqlPools/sqlcrudtest-9187/transparentDataEncryption/current 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:SqlPoolTransparentDataEncryption")
public class SqlPoolTransparentDataEncryption extends io.pulumi.resources.CustomResource {
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
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
     * The status of the database transparent data encryption.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return The status of the database transparent data encryption.
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
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
    public SqlPoolTransparentDataEncryption(String name, SqlPoolTransparentDataEncryptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:SqlPoolTransparentDataEncryption", name, args == null ? SqlPoolTransparentDataEncryptionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SqlPoolTransparentDataEncryption(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:SqlPoolTransparentDataEncryption", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:synapse/v20190601preview:SqlPoolTransparentDataEncryption").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20201201:SqlPoolTransparentDataEncryption").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210301:SqlPoolTransparentDataEncryption").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210401preview:SqlPoolTransparentDataEncryption").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210501:SqlPoolTransparentDataEncryption").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601:SqlPoolTransparentDataEncryption").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601preview:SqlPoolTransparentDataEncryption").build())
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
    public static SqlPoolTransparentDataEncryption get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SqlPoolTransparentDataEncryption(name, id, options);
    }
}
