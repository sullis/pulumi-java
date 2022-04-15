// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iam.UserLoginProfileArgs;
import io.pulumi.aws.iam.inputs.UserLoginProfileState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an IAM User Login Profile with limited support for password creation during this provider resource creation. Uses PGP to encrypt the password for safe transport to the user. PGP keys can be obtained from Keybase.
 * 
 * > To reset an IAM User login password via this provider, you can use delete and recreate this resource or change any of the arguments.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IAM User Login Profiles can be imported without password information support via the IAM User name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:iam/userLoginProfile:UserLoginProfile example myusername
 * ```
 * 
 *  Since this provider has no method to read the PGP or password information during import, use [`ignore_changes` argument](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) to ignore them unless password recreation is desired. e.g. terraform resource "aws_iam_user_login_profile" "example" {
 * 
 * # ... other configuration ...
 * 
 *  lifecycle {
 * 
 *  ignore_changes = [
 * 
 *  password_length,
 * 
 *  password_reset_required,
 * 
 *  pgp_key,
 * 
 *  ]
 * 
 *  } }
 * 
 */
@ResourceType(type="aws:iam/userLoginProfile:UserLoginProfile")
public class UserLoginProfile extends io.pulumi.resources.CustomResource {
    /**
     * The encrypted password, base64 encoded. Only available if password was handled on this provider resource creation, not import.
     * 
     */
    @Export(name="encryptedPassword", type=String.class, parameters={})
    private Output<String> encryptedPassword;

    /**
     * @return The encrypted password, base64 encoded. Only available if password was handled on this provider resource creation, not import.
     * 
     */
    public Output<String> encryptedPassword() {
        return this.encryptedPassword;
    }
    /**
     * The fingerprint of the PGP key used to encrypt the password. Only available if password was handled on this provider resource creation, not import.
     * 
     */
    @Export(name="keyFingerprint", type=String.class, parameters={})
    private Output<String> keyFingerprint;

    /**
     * @return The fingerprint of the PGP key used to encrypt the password. Only available if password was handled on this provider resource creation, not import.
     * 
     */
    public Output<String> keyFingerprint() {
        return this.keyFingerprint;
    }
    /**
     * The length of the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
     * 
     */
    @Export(name="passwordLength", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> passwordLength;

    /**
     * @return The length of the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
     * 
     */
    public Output</* @Nullable */ Integer> passwordLength() {
        return this.passwordLength;
    }
    /**
     * Whether the user should be forced to reset the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
     * 
     */
    @Export(name="passwordResetRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> passwordResetRequired;

    /**
     * @return Whether the user should be forced to reset the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
     * 
     */
    public Output</* @Nullable */ Boolean> passwordResetRequired() {
        return this.passwordResetRequired;
    }
    /**
     * Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:username`. Only applies on resource creation. Drift detection is not possible with this argument.
     * 
     */
    @Export(name="pgpKey", type=String.class, parameters={})
    private Output<String> pgpKey;

    /**
     * @return Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:username`. Only applies on resource creation. Drift detection is not possible with this argument.
     * 
     */
    public Output<String> pgpKey() {
        return this.pgpKey;
    }
    /**
     * The IAM user's name.
     * 
     */
    @Export(name="user", type=String.class, parameters={})
    private Output<String> user;

    /**
     * @return The IAM user's name.
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserLoginProfile(String name) {
        this(name, UserLoginProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserLoginProfile(String name, UserLoginProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserLoginProfile(String name, UserLoginProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/userLoginProfile:UserLoginProfile", name, args == null ? UserLoginProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserLoginProfile(String name, Output<String> id, @Nullable UserLoginProfileState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/userLoginProfile:UserLoginProfile", name, state, makeResourceOptions(options, id));
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
    public static UserLoginProfile get(String name, Output<String> id, @Nullable UserLoginProfileState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UserLoginProfile(name, id, state, options);
    }
}
