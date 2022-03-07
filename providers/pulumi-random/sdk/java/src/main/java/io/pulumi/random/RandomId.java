// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.random;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.random.RandomIdArgs;
import io.pulumi.random.Utilities;
import io.pulumi.random.inputs.RandomIdState;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The resource `random.RandomId` generates random numbers that are intended to be
 * used as unique identifiers for other resources.
 * 
 * This resource *does* use a cryptographic random number generator in order
 * to minimize the chance of collisions, making the results of this resource
 * when a 16-byte identifier is requested of equivalent uniqueness to a
 * type-4 UUID.
 * 
 * This resource can be used in conjunction with resources that have
 * the `create_before_destroy` lifecycle flag set to avoid conflicts with
 * unique names during the brief period where both the old and new resources
 * exist concurrently.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * # Random IDs can be imported using the b64_url with an optional prefix. This # can be used to replace a config value with a value interpolated from the # random provider without experiencing diffs. # Example with no prefix
 * 
 * ```sh
 *  $ pulumi import random:index/randomId:RandomId server p-9hUg
 * ```
 * 
 * # Example with prefix (prefix is separated by a ,)
 * 
 * ```sh
 *  $ pulumi import random:index/randomId:RandomId server my-prefix-,p-9hUg
 * ```
 * 
 */
@ResourceType(type="random:index/randomId:RandomId")
public class RandomId extends io.pulumi.resources.CustomResource {
    /**
     * The generated id presented in base64 without additional transformations.
     * 
     */
    @OutputExport(name="b64Std", type=String.class, parameters={})
    private Output<String> b64Std;

    /**
     * @return The generated id presented in base64 without additional transformations.
     * 
     */
    public Output<String> getB64Std() {
        return this.b64Std;
    }
    /**
     * The generated id presented in base64, using the URL-friendly character set: case-sensitive letters, digits and the characters `_` and `-`.
     * 
     */
    @OutputExport(name="b64Url", type=String.class, parameters={})
    private Output<String> b64Url;

    /**
     * @return The generated id presented in base64, using the URL-friendly character set: case-sensitive letters, digits and the characters `_` and `-`.
     * 
     */
    public Output<String> getB64Url() {
        return this.b64Url;
    }
    /**
     * The number of random bytes to produce. The minimum value is 1, which produces eight bits of randomness.
     * 
     */
    @OutputExport(name="byteLength", type=Integer.class, parameters={})
    private Output<Integer> byteLength;

    /**
     * @return The number of random bytes to produce. The minimum value is 1, which produces eight bits of randomness.
     * 
     */
    public Output<Integer> getByteLength() {
        return this.byteLength;
    }
    /**
     * The generated id presented in non-padded decimal digits.
     * 
     */
    @OutputExport(name="dec", type=String.class, parameters={})
    private Output<String> dec;

    /**
     * @return The generated id presented in non-padded decimal digits.
     * 
     */
    public Output<String> getDec() {
        return this.dec;
    }
    /**
     * The generated id presented in padded hexadecimal digits. This result will always be twice as long as the requested byte length.
     * 
     */
    @OutputExport(name="hex", type=String.class, parameters={})
    private Output<String> hex;

    /**
     * @return The generated id presented in padded hexadecimal digits. This result will always be twice as long as the requested byte length.
     * 
     */
    public Output<String> getHex() {
        return this.hex;
    }
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
     * Arbitrary string to prefix the output value with. This string is supplied as-is, meaning it is not guaranteed to be URL-safe or base64 encoded.
     * 
     */
    @OutputExport(name="prefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> prefix;

    /**
     * @return Arbitrary string to prefix the output value with. This string is supplied as-is, meaning it is not guaranteed to be URL-safe or base64 encoded.
     * 
     */
    public Output</* @Nullable */ String> getPrefix() {
        return this.prefix;
    }

    public interface BuilderApplicator {
        public void apply(RandomIdArgs.Builder a);
    }
    private static io.pulumi.random.RandomIdArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.random.RandomIdArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RandomId(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RandomId(String name) {
        this(name, RandomIdArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RandomId(String name, RandomIdArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RandomId(String name, RandomIdArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("random:index/randomId:RandomId", name, args == null ? RandomIdArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RandomId(String name, Input<String> id, @Nullable RandomIdState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("random:index/randomId:RandomId", name, state, makeResourceOptions(options, id));
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
    public static RandomId get(String name, Input<String> id, @Nullable RandomIdState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RandomId(name, id, state, options);
    }
}