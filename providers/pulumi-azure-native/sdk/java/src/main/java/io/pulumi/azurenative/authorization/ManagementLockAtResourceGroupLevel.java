// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.authorization.ManagementLockAtResourceGroupLevelArgs;
import io.pulumi.azurenative.authorization.outputs.ManagementLockOwnerResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The lock information.
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:authorization:ManagementLockAtResourceGroupLevel testlock /subscriptions/subscriptionId/resourceGroups/resourcegroupname/providers/Microsoft.Authorization/locks/testlock 
 * ```
 * 
 */
@ResourceType(type="azure-native:authorization:ManagementLockAtResourceGroupLevel")
public class ManagementLockAtResourceGroupLevel extends io.pulumi.resources.CustomResource {
    /**
     * The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means authorized users can only read from a resource, but they can't modify or delete it.
     * 
     */
    @OutputExport(name="level", type=String.class, parameters={})
    private Output<String> level;

    /**
     * @return The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means authorized users can only read from a resource, but they can't modify or delete it.
     * 
     */
    public Output<String> getLevel() {
        return this.level;
    }
    /**
     * The name of the lock.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the lock.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Notes about the lock. Maximum of 512 characters.
     * 
     */
    @OutputExport(name="notes", type=String.class, parameters={})
    private Output</* @Nullable */ String> notes;

    /**
     * @return Notes about the lock. Maximum of 512 characters.
     * 
     */
    public Output</* @Nullable */ String> getNotes() {
        return this.notes;
    }
    /**
     * The owners of the lock.
     * 
     */
    @OutputExport(name="owners", type=List.class, parameters={ManagementLockOwnerResponse.class})
    private Output</* @Nullable */ List<ManagementLockOwnerResponse>> owners;

    /**
     * @return The owners of the lock.
     * 
     */
    public Output</* @Nullable */ List<ManagementLockOwnerResponse>> getOwners() {
        return this.owners;
    }
    /**
     * The resource type of the lock - Microsoft.Authorization/locks.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type of the lock - Microsoft.Authorization/locks.
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
    public ManagementLockAtResourceGroupLevel(String name, ManagementLockAtResourceGroupLevelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:ManagementLockAtResourceGroupLevel", name, args == null ? ManagementLockAtResourceGroupLevelArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ManagementLockAtResourceGroupLevel(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:ManagementLockAtResourceGroupLevel", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:authorization/v20150101:ManagementLockAtResourceGroupLevel").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20160901:ManagementLockAtResourceGroupLevel").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20170401:ManagementLockAtResourceGroupLevel").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20200501:ManagementLockAtResourceGroupLevel").build())
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
    public static ManagementLockAtResourceGroupLevel get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ManagementLockAtResourceGroupLevel(name, id, options);
    }
}
