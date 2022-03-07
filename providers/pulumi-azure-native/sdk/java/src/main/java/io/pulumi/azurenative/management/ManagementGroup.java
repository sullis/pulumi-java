// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.management.ManagementGroupArgs;
import io.pulumi.azurenative.management.outputs.ManagementGroupChildInfoResponse;
import io.pulumi.azurenative.management.outputs.ManagementGroupDetailsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The management group details.
 * API Version: 2020-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:management:ManagementGroup ChildGroup /providers/Microsoft.Management/managementGroups/ChildGroup 
 * ```
 * 
 */
@ResourceType(type="azure-native:management:ManagementGroup")
public class ManagementGroup extends io.pulumi.resources.CustomResource {
    /**
     * The list of children.
     * 
     */
    @OutputExport(name="children", type=List.class, parameters={ManagementGroupChildInfoResponse.class})
    private Output</* @Nullable */ List<ManagementGroupChildInfoResponse>> children;

    /**
     * @return The list of children.
     * 
     */
    public Output</* @Nullable */ List<ManagementGroupChildInfoResponse>> getChildren() {
        return this.children;
    }
    /**
     * The details of a management group.
     * 
     */
    @OutputExport(name="details", type=ManagementGroupDetailsResponse.class, parameters={})
    private Output</* @Nullable */ ManagementGroupDetailsResponse> details;

    /**
     * @return The details of a management group.
     * 
     */
    public Output</* @Nullable */ ManagementGroupDetailsResponse> getDetails() {
        return this.details;
    }
    /**
     * The friendly name of the management group.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The friendly name of the management group.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The name of the management group. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the management group. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The AAD Tenant ID associated with the management group. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return The AAD Tenant ID associated with the management group. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    public Output</* @Nullable */ String> getTenantId() {
        return this.tenantId;
    }
    /**
     * The type of the resource.  For example, Microsoft.Management/managementGroups
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.  For example, Microsoft.Management/managementGroups
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ManagementGroupArgs.Builder a);
    }
    private static io.pulumi.azurenative.management.ManagementGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.management.ManagementGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ManagementGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagementGroup(String name) {
        this(name, ManagementGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagementGroup(String name, @Nullable ManagementGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagementGroup(String name, @Nullable ManagementGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:management:ManagementGroup", name, args == null ? ManagementGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ManagementGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:management:ManagementGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:management/v20171101preview:ManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:management/v20180101preview:ManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:management/v20180301preview:ManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:management/v20191101:ManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:management/v20200201:ManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:management/v20200501:ManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:management/v20201001:ManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:management/v20210401:ManagementGroup").build())
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
    public static ManagementGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ManagementGroup(name, id, options);
    }
}