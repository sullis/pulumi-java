// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.ImageVersionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::ImageVersion
 * 
 */
@ResourceType(type="aws-native:sagemaker:ImageVersion")
public class ImageVersion extends io.pulumi.resources.CustomResource {
    @Export(name="baseImage", type=String.class, parameters={})
    private Output<String> baseImage;

    public Output<String> baseImage() {
        return this.baseImage;
    }
    @Export(name="containerImage", type=String.class, parameters={})
    private Output<String> containerImage;

    public Output<String> containerImage() {
        return this.containerImage;
    }
    @Export(name="imageArn", type=String.class, parameters={})
    private Output<String> imageArn;

    public Output<String> imageArn() {
        return this.imageArn;
    }
    @Export(name="imageName", type=String.class, parameters={})
    private Output<String> imageName;

    public Output<String> imageName() {
        return this.imageName;
    }
    @Export(name="imageVersionArn", type=String.class, parameters={})
    private Output<String> imageVersionArn;

    public Output<String> imageVersionArn() {
        return this.imageVersionArn;
    }
    @Export(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ImageVersion(String name) {
        this(name, ImageVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ImageVersion(String name, ImageVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ImageVersion(String name, ImageVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:ImageVersion", name, args == null ? ImageVersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ImageVersion(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:ImageVersion", name, null, makeResourceOptions(options, id));
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
    public static ImageVersion get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ImageVersion(name, id, options);
    }
}
