// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.random;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.random.inputs.RandomUuidState;

import javax.annotation.Nullable;
import java.util.Map;

/**
 * The resource `random.RandomUuid` generates random uuid string that is intended to be used as unique identifiers for other resources.
 * 
 * This resource uses [hashicorp/go-uuid](https://github.com/hashicorp/go-uuid) to generate a UUID-formatted string for use with services needed a unique string identifier.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * # Random UUID's can be imported. This can be used to replace a config # value with a value interpolated from the random provider without # experiencing diffs.
 * 
 * ```sh
 *  $ pulumi import random:index/randomUuid:RandomUuid main aabbccdd-eeff-0011-2233-445566778899
 * ```
 * 
 */
@ResourceType(type="random:index/randomUuid:RandomUuid")
public class RandomUuid extends io.pulumi.resources.CustomResource {
    /**
     * Arbitrary map of values that, when changed, will trigger recreation of resource. See the main provider documentation for more information.
     * 
     */
    @OutputExport(name="keepers", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> keepers;

    /**
     * @return Arbitrary map of values that, when changed, will trigger recreation of resource. See the main provider documentation for more information.
     * 
     */
    public Output</* @Nullable */ Map<String,Object>> getKeepers() {
        return this.keepers;
    }
    /**
     * The generated uuid presented in string format.
     * 
     */
    @OutputExport(name="result", type=String.class, parameters={})
    private Output<String> result;

    /**
     * @return The generated uuid presented in string format.
     * 
     */
    public Output<String> getResult() {
        return this.result;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RandomUuid(String name, @Nullable RandomUuidArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("random:index/randomUuid:RandomUuid", name, args == null ? RandomUuidArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RandomUuid(String name, Input<String> id, @Nullable RandomUuidState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("random:index/randomUuid:RandomUuid", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RandomUuid get(String name, Input<String> id, @Nullable RandomUuidState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RandomUuid(name, id, state, options);
    }
}
