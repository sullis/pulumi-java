// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisvideo;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.kinesisvideo.SignalingChannelArgs;
import io.pulumi.awsnative.kinesisvideo.enums.SignalingChannelType;
import io.pulumi.awsnative.kinesisvideo.outputs.SignalingChannelTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type Definition for AWS::KinesisVideo::SignalingChannel
 * 
 */
@ResourceType(type="aws-native:kinesisvideo:SignalingChannel")
public class SignalingChannel extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Kinesis Video Signaling Channel.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Kinesis Video Signaling Channel.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The period of time a signaling channel retains undelivered messages before they are discarded.
     * 
     */
    @Export(name="messageTtlSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> messageTtlSeconds;

    /**
     * @return The period of time a signaling channel retains undelivered messages before they are discarded.
     * 
     */
    public Output</* @Nullable */ Integer> messageTtlSeconds() {
        return this.messageTtlSeconds;
    }
    /**
     * The name of the Kinesis Video Signaling Channel.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the Kinesis Video Signaling Channel.
     * 
     */
    public Output</* @Nullable */ String> name() {
        return this.name;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={SignalingChannelTag.class})
    private Output</* @Nullable */ List<SignalingChannelTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<SignalingChannelTag>> tags() {
        return this.tags;
    }
    /**
     * The type of the Kinesis Video Signaling Channel to create. Currently, SINGLE_MASTER is the only supported channel type.
     * 
     */
    @Export(name="type", type=SignalingChannelType.class, parameters={})
    private Output</* @Nullable */ SignalingChannelType> type;

    /**
     * @return The type of the Kinesis Video Signaling Channel to create. Currently, SINGLE_MASTER is the only supported channel type.
     * 
     */
    public Output</* @Nullable */ SignalingChannelType> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SignalingChannel(String name) {
        this(name, SignalingChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SignalingChannel(String name, @Nullable SignalingChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SignalingChannel(String name, @Nullable SignalingChannelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kinesisvideo:SignalingChannel", name, args == null ? SignalingChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SignalingChannel(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kinesisvideo:SignalingChannel", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SignalingChannel get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SignalingChannel(name, id, options);
    }
}
