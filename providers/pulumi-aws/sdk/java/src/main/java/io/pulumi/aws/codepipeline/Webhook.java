// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codepipeline;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.codepipeline.WebhookArgs;
import io.pulumi.aws.codepipeline.inputs.WebhookState;
import io.pulumi.aws.codepipeline.outputs.WebhookAuthenticationConfiguration;
import io.pulumi.aws.codepipeline.outputs.WebhookFilter;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a CodePipeline Webhook.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CodePipeline Webhooks can be imported by their ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:codepipeline/webhook:Webhook example arn:aws:codepipeline:us-west-2:123456789012:webhook:example
 * ```
 * 
 */
@ResourceType(type="aws:codepipeline/webhook:Webhook")
public class Webhook extends io.pulumi.resources.CustomResource {
    /**
     * The CodePipeline webhook's ARN.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The CodePipeline webhook's ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
     * 
     */
    @OutputExport(name="authentication", type=String.class, parameters={})
    private Output<String> authentication;

    /**
     * @return The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
     * 
     */
    public Output<String> getAuthentication() {
        return this.authentication;
    }
    /**
     * An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
     * 
     */
    @OutputExport(name="authenticationConfiguration", type=WebhookAuthenticationConfiguration.class, parameters={})
    private Output</* @Nullable */ WebhookAuthenticationConfiguration> authenticationConfiguration;

    /**
     * @return An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
     * 
     */
    public Output</* @Nullable */ WebhookAuthenticationConfiguration> getAuthenticationConfiguration() {
        return this.authenticationConfiguration;
    }
    /**
     * One or more `filter` blocks. Filter blocks are documented below.
     * 
     */
    @OutputExport(name="filters", type=List.class, parameters={WebhookFilter.class})
    private Output<List<WebhookFilter>> filters;

    /**
     * @return One or more `filter` blocks. Filter blocks are documented below.
     * 
     */
    public Output<List<WebhookFilter>> getFilters() {
        return this.filters;
    }
    /**
     * The name of the webhook.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the webhook.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
     * 
     */
    @OutputExport(name="targetAction", type=String.class, parameters={})
    private Output<String> targetAction;

    /**
     * @return The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
     * 
     */
    public Output<String> getTargetAction() {
        return this.targetAction;
    }
    /**
     * The name of the pipeline.
     * 
     */
    @OutputExport(name="targetPipeline", type=String.class, parameters={})
    private Output<String> targetPipeline;

    /**
     * @return The name of the pipeline.
     * 
     */
    public Output<String> getTargetPipeline() {
        return this.targetPipeline;
    }
    /**
     * The CodePipeline webhook's URL. POST events to this endpoint to trigger the target.
     * 
     */
    @OutputExport(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The CodePipeline webhook's URL. POST events to this endpoint to trigger the target.
     * 
     */
    public Output<String> getUrl() {
        return this.url;
    }

    public interface BuilderApplicator {
        public void apply(WebhookArgs.Builder a);
    }
    private static io.pulumi.aws.codepipeline.WebhookArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.codepipeline.WebhookArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Webhook(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Webhook(String name) {
        this(name, WebhookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Webhook(String name, WebhookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Webhook(String name, WebhookArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codepipeline/webhook:Webhook", name, args == null ? WebhookArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Webhook(String name, Input<String> id, @Nullable WebhookState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codepipeline/webhook:Webhook", name, state, makeResourceOptions(options, id));
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
    public static Webhook get(String name, Input<String> id, @Nullable WebhookState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Webhook(name, id, state, options);
    }
}