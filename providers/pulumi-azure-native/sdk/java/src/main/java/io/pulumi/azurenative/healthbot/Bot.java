// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthbot;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.healthbot.BotArgs;
import io.pulumi.azurenative.healthbot.outputs.HealthBotPropertiesResponse;
import io.pulumi.azurenative.healthbot.outputs.SkuResponse;
import io.pulumi.azurenative.healthbot.outputs.SystemDataResponse;
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
 * HealthBot resource definition
 * API Version: 2020-12-08.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:healthbot:Bot samplebotname /subscriptions/subscription-id/resourceGroups/OneResourceGroupName/providers/Microsoft.HealthBot/healthBots/samplebotname 
 * ```
 * 
 */
@ResourceType(type="azure-native:healthbot:Bot")
public class Bot extends io.pulumi.resources.CustomResource {
    /**
     * The geo-location where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
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
     * The set of properties specific to Healthbot resource.
     * 
     */
    @OutputExport(name="properties", type=HealthBotPropertiesResponse.class, parameters={})
    private Output<HealthBotPropertiesResponse> properties;

    /**
     * @return The set of properties specific to Healthbot resource.
     * 
     */
    public Output<HealthBotPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * SKU of the HealthBot.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return SKU of the HealthBot.
     * 
     */
    public Output<SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
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
        public void apply(BotArgs.Builder a);
    }
    private static io.pulumi.azurenative.healthbot.BotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.healthbot.BotArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Bot(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Bot(String name) {
        this(name, BotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Bot(String name, BotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Bot(String name, BotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:healthbot:Bot", name, args == null ? BotArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Bot(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:healthbot:Bot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:healthbot/v20201020:Bot").build()),
                Input.of(Alias.builder().setType("azure-native:healthbot/v20201020preview:Bot").build()),
                Input.of(Alias.builder().setType("azure-native:healthbot/v20201208:Bot").build()),
                Input.of(Alias.builder().setType("azure-native:healthbot/v20201208preview:Bot").build()),
                Input.of(Alias.builder().setType("azure-native:healthbot/v20210610:Bot").build()),
                Input.of(Alias.builder().setType("azure-native:healthbot/v20210824:Bot").build())
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
    public static Bot get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Bot(name, id, options);
    }
}