// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.appsync.ApiKeyArgs;
import io.pulumi.aws.appsync.inputs.ApiKeyState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an AppSync API Key.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_appsync_api_key` can be imported using the AppSync API ID and key separated by `:`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appsync/apiKey:ApiKey example xxxxx:yyyyy
 * ```
 * 
 */
@ResourceType(type="aws:appsync/apiKey:ApiKey")
public class ApiKey extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the associated AppSync API
     * 
     */
    @OutputExport(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    /**
     * @return The ID of the associated AppSync API
     * 
     */
    public Output<String> getApiId() {
        return this.apiId;
    }
    /**
     * The API key description. Defaults to "Managed by Pulumi".
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The API key description. Defaults to "Managed by Pulumi".
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
     * 
     */
    @OutputExport(name="expires", type=String.class, parameters={})
    private Output</* @Nullable */ String> expires;

    /**
     * @return RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
     * 
     */
    public Output</* @Nullable */ String> getExpires() {
        return this.expires;
    }
    /**
     * The API key
     * 
     */
    @OutputExport(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return The API key
     * 
     */
    public Output<String> getKey() {
        return this.key;
    }

    public interface BuilderApplicator {
        public void apply(ApiKeyArgs.Builder a);
    }
    private static io.pulumi.aws.appsync.ApiKeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.appsync.ApiKeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ApiKey(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiKey(String name) {
        this(name, ApiKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiKey(String name, ApiKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiKey(String name, ApiKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/apiKey:ApiKey", name, args == null ? ApiKeyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApiKey(String name, Input<String> id, @Nullable ApiKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/apiKey:ApiKey", name, state, makeResourceOptions(options, id));
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
    public static ApiKey get(String name, Input<String> id, @Nullable ApiKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApiKey(name, id, state, options);
    }
}