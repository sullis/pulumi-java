// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storsimple.ManagerArgs;
import io.pulumi.azurenative.storsimple.outputs.ManagerIntrinsicSettingsResponse;
import io.pulumi.azurenative.storsimple.outputs.ManagerSkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The StorSimple Manager.
 * API Version: 2017-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storsimple:Manager ManagerForSDKTest2 /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.StorSimple/Managers/ManagerForSDKTest2 
 * ```
 * 
 */
@ResourceType(type="azure-native:storsimple:Manager")
public class Manager extends io.pulumi.resources.CustomResource {
    /**
     * Represents the type of StorSimple Manager.
     * 
     */
    @OutputExport(name="cisIntrinsicSettings", type=ManagerIntrinsicSettingsResponse.class, parameters={})
    private Output</* @Nullable */ ManagerIntrinsicSettingsResponse> cisIntrinsicSettings;

    /**
     * @return Represents the type of StorSimple Manager.
     * 
     */
    public Output</* @Nullable */ ManagerIntrinsicSettingsResponse> getCisIntrinsicSettings() {
        return this.cisIntrinsicSettings;
    }
    /**
     * The etag of the manager.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return The etag of the manager.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * The geo location of the resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo location of the resource.
     * 
     */
    public Output<String> getLocation() {
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
     * Specifies the state of the resource as it is getting provisioned. Value of "Succeeded" means the Manager was successfully created.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return Specifies the state of the resource as it is getting provisioned. Value of "Succeeded" means the Manager was successfully created.
     * 
     */
    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Specifies the Sku.
     * 
     */
    @OutputExport(name="sku", type=ManagerSkuResponse.class, parameters={})
    private Output</* @Nullable */ ManagerSkuResponse> sku;

    /**
     * @return Specifies the Sku.
     * 
     */
    public Output</* @Nullable */ ManagerSkuResponse> getSku() {
        return this.sku;
    }
    /**
     * The tags attached to the resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags attached to the resource.
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

    public interface BuilderApplicator {
        public void apply(ManagerArgs.Builder a);
    }
    private static io.pulumi.azurenative.storsimple.ManagerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.storsimple.ManagerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Manager(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Manager(String name) {
        this(name, ManagerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Manager(String name, ManagerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Manager(String name, ManagerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:Manager", name, args == null ? ManagerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Manager(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:Manager", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:storsimple/v20161001:Manager").build()),
                Input.of(Alias.builder().setType("azure-native:storsimple/v20170601:Manager").build())
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
    public static Manager get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Manager(name, id, options);
    }
}