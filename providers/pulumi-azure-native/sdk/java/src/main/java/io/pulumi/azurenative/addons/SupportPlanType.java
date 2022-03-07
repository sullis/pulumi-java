// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.addons;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.addons.SupportPlanTypeArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The status of the Canonical support plan.
 * API Version: 2018-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:addons:SupportPlanType Standard subscriptions/d18d258f-bdba-4de1-8b51-e79d6c181d5e/providers/Microsoft.Addons/supportProviders/canonical/supportPlanTypes/Standard 
 * ```
 * 
 */
@ResourceType(type="azure-native:addons:SupportPlanType")
public class SupportPlanType extends io.pulumi.resources.CustomResource {
    /**
     * The name of the Canonical support plan, i.e. "essential", "standard" or "advanced".
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Canonical support plan, i.e. "essential", "standard" or "advanced".
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return The provisioning state of the resource.
     * 
     */
    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Microsoft.Addons/supportProvider
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Microsoft.Addons/supportProvider
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(SupportPlanTypeArgs.Builder a);
    }
    private static io.pulumi.azurenative.addons.SupportPlanTypeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.addons.SupportPlanTypeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SupportPlanType(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SupportPlanType(String name) {
        this(name, SupportPlanTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SupportPlanType(String name, SupportPlanTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SupportPlanType(String name, SupportPlanTypeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:addons:SupportPlanType", name, args == null ? SupportPlanTypeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SupportPlanType(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:addons:SupportPlanType", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:addons/v20170515:SupportPlanType").build()),
                Input.of(Alias.builder().setType("azure-native:addons/v20180301:SupportPlanType").build())
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
    public static SupportPlanType get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SupportPlanType(name, id, options);
    }
}