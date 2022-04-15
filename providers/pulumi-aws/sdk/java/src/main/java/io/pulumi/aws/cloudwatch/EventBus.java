// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudwatch.EventBusArgs;
import io.pulumi.aws.cloudwatch.inputs.EventBusState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an EventBridge event bus resource.
 * 
 * > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EventBridge event buses can be imported using the `name` (which can also be a partner event source name), e.g., console
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/eventBus:EventBus messenger chat-messages
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/eventBus:EventBus")
public class EventBus extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the event bus.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the event bus.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The partner event source that the new event bus will be matched with. Must match `name`.
     * 
     */
    @Export(name="eventSourceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventSourceName;

    /**
     * @return The partner event source that the new event bus will be matched with. Must match `name`.
     * 
     */
    public Output</* @Nullable */ String> eventSourceName() {
        return this.eventSourceName;
    }
    /**
     * The name of the new event bus. The names of custom event buses can't contain the / character. To create a partner event bus, ensure the `name` matches the `event_source_name`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the new event bus. The names of custom event buses can't contain the / character. To create a partner event bus, ensure the `name` matches the `event_source_name`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventBus(String name) {
        this(name, EventBusArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventBus(String name, @Nullable EventBusArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventBus(String name, @Nullable EventBusArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventBus:EventBus", name, args == null ? EventBusArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventBus(String name, Output<String> id, @Nullable EventBusState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventBus:EventBus", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static EventBus get(String name, Output<String> id, @Nullable EventBusState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventBus(name, id, state, options);
    }
}
