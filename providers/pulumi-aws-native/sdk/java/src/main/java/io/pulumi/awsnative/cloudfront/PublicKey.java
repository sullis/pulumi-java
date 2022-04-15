// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudfront.PublicKeyArgs;
import io.pulumi.awsnative.cloudfront.outputs.PublicKeyConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::CloudFront::PublicKey
 * 
 */
@ResourceType(type="aws-native:cloudfront:PublicKey")
public class PublicKey extends io.pulumi.resources.CustomResource {
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    public Output<String> createdTime() {
        return this.createdTime;
    }
    @Export(name="publicKeyConfig", type=PublicKeyConfig.class, parameters={})
    private Output<PublicKeyConfig> publicKeyConfig;

    public Output<PublicKeyConfig> publicKeyConfig() {
        return this.publicKeyConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PublicKey(String name) {
        this(name, PublicKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PublicKey(String name, PublicKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PublicKey(String name, PublicKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudfront:PublicKey", name, args == null ? PublicKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PublicKey(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudfront:PublicKey", name, null, makeResourceOptions(options, id));
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
    public static PublicKey get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PublicKey(name, id, options);
    }
}
