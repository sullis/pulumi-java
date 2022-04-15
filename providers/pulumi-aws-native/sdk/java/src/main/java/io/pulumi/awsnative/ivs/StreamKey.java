// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ivs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ivs.StreamKeyArgs;
import io.pulumi.awsnative.ivs.outputs.StreamKeyTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::IVS::StreamKey
 * 
 */
@ResourceType(type="aws-native:ivs:StreamKey")
public class StreamKey extends io.pulumi.resources.CustomResource {
    /**
     * Stream Key ARN is automatically generated on creation and assigned as the unique identifier.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Stream Key ARN is automatically generated on creation and assigned as the unique identifier.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Channel ARN for the stream.
     * 
     */
    @Export(name="channelArn", type=String.class, parameters={})
    private Output<String> channelArn;

    /**
     * @return Channel ARN for the stream.
     * 
     */
    public Output<String> channelArn() {
        return this.channelArn;
    }
    /**
     * A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    @Export(name="tags", type=List.class, parameters={StreamKeyTag.class})
    private Output</* @Nullable */ List<StreamKeyTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    public Output</* @Nullable */ List<StreamKeyTag>> tags() {
        return this.tags;
    }
    /**
     * Stream-key value.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return Stream-key value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StreamKey(String name) {
        this(name, StreamKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StreamKey(String name, StreamKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StreamKey(String name, StreamKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ivs:StreamKey", name, args == null ? StreamKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StreamKey(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ivs:StreamKey", name, null, makeResourceOptions(options, id));
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
    public static StreamKey get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StreamKey(name, id, options);
    }
}
