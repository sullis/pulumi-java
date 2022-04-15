// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.xray;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.xray.EncryptionConfigArgs;
import io.pulumi.aws.xray.inputs.EncryptionConfigState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates and manages an AWS XRay Encryption Config.
 * 
 * > **NOTE:** Removing this resource from the provider has no effect to the encryption configuration within X-Ray.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * XRay Encryption Config can be imported using the region name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:xray/encryptionConfig:EncryptionConfig example us-west-2
 * ```
 * 
 */
@ResourceType(type="aws:xray/encryptionConfig:EncryptionConfig")
public class EncryptionConfig extends io.pulumi.resources.CustomResource {
    /**
     * An AWS KMS customer master key (CMK) ARN.
     * 
     */
    @Export(name="keyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyId;

    /**
     * @return An AWS KMS customer master key (CMK) ARN.
     * 
     */
    public Output</* @Nullable */ String> keyId() {
        return this.keyId;
    }
    /**
     * The type of encryption. Set to `KMS` to use your own key for encryption. Set to `NONE` for default encryption.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of encryption. Set to `KMS` to use your own key for encryption. Set to `NONE` for default encryption.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EncryptionConfig(String name) {
        this(name, EncryptionConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EncryptionConfig(String name, EncryptionConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EncryptionConfig(String name, EncryptionConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:xray/encryptionConfig:EncryptionConfig", name, args == null ? EncryptionConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EncryptionConfig(String name, Output<String> id, @Nullable EncryptionConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:xray/encryptionConfig:EncryptionConfig", name, state, makeResourceOptions(options, id));
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
    public static EncryptionConfig get(String name, Output<String> id, @Nullable EncryptionConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EncryptionConfig(name, id, state, options);
    }
}
