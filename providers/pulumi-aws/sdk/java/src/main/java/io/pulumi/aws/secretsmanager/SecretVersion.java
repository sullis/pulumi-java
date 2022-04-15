// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.secretsmanager;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.secretsmanager.SecretVersionArgs;
import io.pulumi.aws.secretsmanager.inputs.SecretVersionState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage AWS Secrets Manager secret version including its secret value. To manage secret metadata, see the `aws.secretsmanager.Secret` resource.
 * 
 * > **NOTE:** If the `AWSCURRENT` staging label is present on this version during resource deletion, that label cannot be removed and will be skipped to prevent errors when fully deleting the secret. That label will leave this secret version active even after the resource is deleted from this provider unless the secret itself is deleted. Move the `AWSCURRENT` staging label before or after deleting this resource from this provider to fully trigger version deprecation if necessary.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_secretsmanager_secret_version` can be imported by using the secret ID and version ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:secretsmanager/secretVersion:SecretVersion example 'arn:aws:secretsmanager:us-east-1:123456789012:secret:example-123456|xxxxx-xxxxxxx-xxxxxxx-xxxxx'
 * ```
 * 
 */
@ResourceType(type="aws:secretsmanager/secretVersion:SecretVersion")
public class SecretVersion extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the secret.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the secret.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
     * 
     */
    @Export(name="secretBinary", type=String.class, parameters={})
    private Output</* @Nullable */ String> secretBinary;

    /**
     * @return Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
     * 
     */
    public Output</* @Nullable */ String> secretBinary() {
        return this.secretBinary;
    }
    /**
     * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     * 
     */
    @Export(name="secretId", type=String.class, parameters={})
    private Output<String> secretId;

    /**
     * @return Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     * 
     */
    public Output<String> secretId() {
        return this.secretId;
    }
    /**
     * Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
     * 
     */
    @Export(name="secretString", type=String.class, parameters={})
    private Output</* @Nullable */ String> secretString;

    /**
     * @return Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
     * 
     */
    public Output</* @Nullable */ String> secretString() {
        return this.secretString;
    }
    /**
     * The unique identifier of the version of the secret.
     * 
     */
    @Export(name="versionId", type=String.class, parameters={})
    private Output<String> versionId;

    /**
     * @return The unique identifier of the version of the secret.
     * 
     */
    public Output<String> versionId() {
        return this.versionId;
    }
    /**
     * Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
     * 
     */
    @Export(name="versionStages", type=List.class, parameters={String.class})
    private Output<List<String>> versionStages;

    /**
     * @return Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
     * 
     */
    public Output<List<String>> versionStages() {
        return this.versionStages;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecretVersion(String name) {
        this(name, SecretVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecretVersion(String name, SecretVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecretVersion(String name, SecretVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:secretsmanager/secretVersion:SecretVersion", name, args == null ? SecretVersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecretVersion(String name, Output<String> id, @Nullable SecretVersionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:secretsmanager/secretVersion:SecretVersion", name, state, makeResourceOptions(options, id));
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
    public static SecretVersion get(String name, Output<String> id, @Nullable SecretVersionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecretVersion(name, id, state, options);
    }
}
