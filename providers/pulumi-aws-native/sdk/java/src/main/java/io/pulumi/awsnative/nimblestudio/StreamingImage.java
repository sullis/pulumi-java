// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.nimblestudio.StreamingImageArgs;
import io.pulumi.awsnative.nimblestudio.outputs.StreamingImageEncryptionConfiguration;
import io.pulumi.awsnative.nimblestudio.outputs.StreamingImageTags;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a streaming session machine image that can be used to launch a streaming session
 * 
 */
@ResourceType(type="aws-native:nimblestudio:StreamingImage")
public class StreamingImage extends io.pulumi.resources.CustomResource {
    /**
     * <p>A human-readable description of the streaming image.</p>
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return <p>A human-readable description of the streaming image.</p>
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * <p>The ID of an EC2 machine image with which to create this streaming image.</p>
     * 
     */
    @OutputExport(name="ec2ImageId", type=String.class, parameters={})
    private Output<String> ec2ImageId;

    /**
     * @return <p>The ID of an EC2 machine image with which to create this streaming image.</p>
     * 
     */
    public Output<String> getEc2ImageId() {
        return this.ec2ImageId;
    }
    @OutputExport(name="encryptionConfiguration", type=StreamingImageEncryptionConfiguration.class, parameters={})
    private Output<StreamingImageEncryptionConfiguration> encryptionConfiguration;

    public Output<StreamingImageEncryptionConfiguration> getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }
    /**
     * <p>The list of EULAs that must be accepted before a Streaming Session can be started using this streaming image.</p>
     * 
     */
    @OutputExport(name="eulaIds", type=List.class, parameters={String.class})
    private Output<List<String>> eulaIds;

    /**
     * @return <p>The list of EULAs that must be accepted before a Streaming Session can be started using this streaming image.</p>
     * 
     */
    public Output<List<String>> getEulaIds() {
        return this.eulaIds;
    }
    /**
     * <p>A friendly name for a streaming image resource.</p>
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return <p>A friendly name for a streaming image resource.</p>
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * <p>The owner of the streaming image, either the studioId that contains the streaming image, or 'amazon' for images that are provided by Amazon Nimble Studio.</p>
     * 
     */
    @OutputExport(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return <p>The owner of the streaming image, either the studioId that contains the streaming image, or 'amazon' for images that are provided by Amazon Nimble Studio.</p>
     * 
     */
    public Output<String> getOwner() {
        return this.owner;
    }
    /**
     * <p>The platform of the streaming image, either WINDOWS or LINUX.</p>
     * 
     */
    @OutputExport(name="platform", type=String.class, parameters={})
    private Output<String> platform;

    /**
     * @return <p>The platform of the streaming image, either WINDOWS or LINUX.</p>
     * 
     */
    public Output<String> getPlatform() {
        return this.platform;
    }
    @OutputExport(name="streamingImageId", type=String.class, parameters={})
    private Output<String> streamingImageId;

    public Output<String> getStreamingImageId() {
        return this.streamingImageId;
    }
    /**
     * <p>The studioId. </p>
     * 
     */
    @OutputExport(name="studioId", type=String.class, parameters={})
    private Output<String> studioId;

    /**
     * @return <p>The studioId. </p>
     * 
     */
    public Output<String> getStudioId() {
        return this.studioId;
    }
    @OutputExport(name="tags", type=StreamingImageTags.class, parameters={})
    private Output</* @Nullable */ StreamingImageTags> tags;

    public Output</* @Nullable */ StreamingImageTags> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(StreamingImageArgs.Builder a);
    }
    private static io.pulumi.awsnative.nimblestudio.StreamingImageArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.nimblestudio.StreamingImageArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public StreamingImage(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StreamingImage(String name) {
        this(name, StreamingImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StreamingImage(String name, StreamingImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StreamingImage(String name, StreamingImageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:nimblestudio:StreamingImage", name, args == null ? StreamingImageArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private StreamingImage(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:nimblestudio:StreamingImage", name, null, makeResourceOptions(options, id));
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
    public static StreamingImage get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StreamingImage(name, id, options);
    }
}