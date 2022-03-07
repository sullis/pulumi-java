// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsublite_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.pubsublite_v1.SubscriptionArgs;
import io.pulumi.googlenative.pubsublite_v1.outputs.DeliveryConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new subscription.
 * 
 */
@ResourceType(type="google-native:pubsublite/v1:Subscription")
public class Subscription extends io.pulumi.resources.CustomResource {
    /**
     * The settings for this subscription's message delivery.
     * 
     */
    @OutputExport(name="deliveryConfig", type=DeliveryConfigResponse.class, parameters={})
    private Output<DeliveryConfigResponse> deliveryConfig;

    /**
     * @return The settings for this subscription's message delivery.
     * 
     */
    public Output<DeliveryConfigResponse> getDeliveryConfig() {
        return this.deliveryConfig;
    }
    /**
     * The name of the subscription. Structured like: projects/{project_number}/locations/{location}/subscriptions/{subscription_id}
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the subscription. Structured like: projects/{project_number}/locations/{location}/subscriptions/{subscription_id}
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The name of the topic this subscription is attached to. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
     * 
     */
    @OutputExport(name="topic", type=String.class, parameters={})
    private Output<String> topic;

    /**
     * @return The name of the topic this subscription is attached to. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
     * 
     */
    public Output<String> getTopic() {
        return this.topic;
    }

    public interface BuilderApplicator {
        public void apply(SubscriptionArgs.Builder a);
    }
    private static io.pulumi.googlenative.pubsublite_v1.SubscriptionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.pubsublite_v1.SubscriptionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Subscription(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Subscription(String name) {
        this(name, SubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Subscription(String name, SubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Subscription(String name, SubscriptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:pubsublite/v1:Subscription", name, args == null ? SubscriptionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Subscription(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:pubsublite/v1:Subscription", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Subscription get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Subscription(name, id, options);
    }
}