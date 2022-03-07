// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devspaces;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devspaces.ControllerArgs;
import io.pulumi.azurenative.devspaces.outputs.SkuResponse;
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
 * API Version: 2019-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:devspaces:Controller myControllerResource /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.DevSpaces/controllers/myControllerResource 
 * ```
 * 
 */
@ResourceType(type="azure-native:devspaces:Controller")
public class Controller extends io.pulumi.resources.CustomResource {
    /**
     * DNS name for accessing DataPlane services
     * 
     */
    @OutputExport(name="dataPlaneFqdn", type=String.class, parameters={})
    private Output<String> dataPlaneFqdn;

    /**
     * @return DNS name for accessing DataPlane services
     * 
     */
    public Output<String> getDataPlaneFqdn() {
        return this.dataPlaneFqdn;
    }
    /**
     * DNS suffix for public endpoints running in the Azure Dev Spaces Controller.
     * 
     */
    @OutputExport(name="hostSuffix", type=String.class, parameters={})
    private Output<String> hostSuffix;

    /**
     * @return DNS suffix for public endpoints running in the Azure Dev Spaces Controller.
     * 
     */
    public Output<String> getHostSuffix() {
        return this.hostSuffix;
    }
    /**
     * Region where the Azure resource is located.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Region where the Azure resource is located.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
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
     * Provisioning state of the Azure Dev Spaces Controller.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the Azure Dev Spaces Controller.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Model representing SKU for Azure Dev Spaces Controller.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return Model representing SKU for Azure Dev Spaces Controller.
     * 
     */
    public Output<SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Tags for the Azure resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags for the Azure resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * DNS of the target container host's API server
     * 
     */
    @OutputExport(name="targetContainerHostApiServerFqdn", type=String.class, parameters={})
    private Output<String> targetContainerHostApiServerFqdn;

    /**
     * @return DNS of the target container host's API server
     * 
     */
    public Output<String> getTargetContainerHostApiServerFqdn() {
        return this.targetContainerHostApiServerFqdn;
    }
    /**
     * Resource ID of the target container host
     * 
     */
    @OutputExport(name="targetContainerHostResourceId", type=String.class, parameters={})
    private Output<String> targetContainerHostResourceId;

    /**
     * @return Resource ID of the target container host
     * 
     */
    public Output<String> getTargetContainerHostResourceId() {
        return this.targetContainerHostResourceId;
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

    public interface BuilderApplicator {
        public void apply(ControllerArgs.Builder a);
    }
    private static io.pulumi.azurenative.devspaces.ControllerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.devspaces.ControllerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Controller(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Controller(String name) {
        this(name, ControllerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Controller(String name, ControllerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Controller(String name, ControllerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devspaces:Controller", name, args == null ? ControllerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Controller(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devspaces:Controller", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:devspaces/v20190401:Controller").build())
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
    public static Controller get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Controller(name, id, options);
    }
}