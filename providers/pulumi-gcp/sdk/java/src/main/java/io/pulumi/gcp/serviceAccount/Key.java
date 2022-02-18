// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.serviceAccount;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.serviceAccount.KeyArgs;
import io.pulumi.gcp.serviceAccount.inputs.KeyState;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates and manages service account keys, which allow the use of a service account outside of Google Cloud.
 * 
 * * [API documentation](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/iam/docs/creating-managing-service-account-keys)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:serviceAccount/key:Key")
public class Key extends io.pulumi.resources.CustomResource {
    /**
     * Arbitrary map of values that, when changed, will trigger a new key to be generated.
     * 
     */
    @OutputExport(name="keepers", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> keepers;

    /**
     * @return Arbitrary map of values that, when changed, will trigger a new key to be generated.
     * 
     */
    public Output</* @Nullable */ Map<String,Object>> getKeepers() {
        return this.keepers;
    }
    /**
     * The algorithm used to generate the key. KEY_ALG_RSA_2048 is the default algorithm.
     * Valid values are listed at
     * [ServiceAccountPrivateKeyType](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys#ServiceAccountKeyAlgorithm)
     * (only used on create)
     * 
     */
    @OutputExport(name="keyAlgorithm", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyAlgorithm;

    /**
     * @return The algorithm used to generate the key. KEY_ALG_RSA_2048 is the default algorithm.
     * Valid values are listed at
     * [ServiceAccountPrivateKeyType](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys#ServiceAccountKeyAlgorithm)
     * (only used on create)
     * 
     */
    public Output</* @Nullable */ String> getKeyAlgorithm() {
        return this.keyAlgorithm;
    }
    /**
     * The name used for this key pair
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name used for this key pair
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The private key in JSON format, base64 encoded. This is what you normally get as a file when creating
     * service account keys through the CLI or web console. This is only populated when creating a new key.
     * 
     */
    @OutputExport(name="privateKey", type=String.class, parameters={})
    private Output<String> privateKey;

    /**
     * @return The private key in JSON format, base64 encoded. This is what you normally get as a file when creating
     * service account keys through the CLI or web console. This is only populated when creating a new key.
     * 
     */
    public Output<String> getPrivateKey() {
        return this.privateKey;
    }
    /**
     * The output format of the private key. TYPE_GOOGLE_CREDENTIALS_FILE is the default output format.
     * 
     */
    @OutputExport(name="privateKeyType", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateKeyType;

    /**
     * @return The output format of the private key. TYPE_GOOGLE_CREDENTIALS_FILE is the default output format.
     * 
     */
    public Output</* @Nullable */ String> getPrivateKeyType() {
        return this.privateKeyType;
    }
    /**
     * The public key, base64 encoded
     * 
     */
    @OutputExport(name="publicKey", type=String.class, parameters={})
    private Output<String> publicKey;

    /**
     * @return The public key, base64 encoded
     * 
     */
    public Output<String> getPublicKey() {
        return this.publicKey;
    }
    /**
     * Public key data to create a service account key for given service account. The expected format for this field is a base64 encoded X509_PEM and it conflicts with `public_key_type` and `private_key_type`.
     * 
     */
    @OutputExport(name="publicKeyData", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicKeyData;

    /**
     * @return Public key data to create a service account key for given service account. The expected format for this field is a base64 encoded X509_PEM and it conflicts with `public_key_type` and `private_key_type`.
     * 
     */
    public Output</* @Nullable */ String> getPublicKeyData() {
        return this.publicKeyData;
    }
    /**
     * The output format of the public key requested. TYPE_X509_PEM_FILE is the default output format.
     * 
     */
    @OutputExport(name="publicKeyType", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicKeyType;

    /**
     * @return The output format of the public key requested. TYPE_X509_PEM_FILE is the default output format.
     * 
     */
    public Output</* @Nullable */ String> getPublicKeyType() {
        return this.publicKeyType;
    }
    /**
     * The Service account id of the Key. This can be a string in the format
     * `{ACCOUNT}` or `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`, where `{ACCOUNT}` is the email address or
     * unique id of the service account. If the `{ACCOUNT}` syntax is used, the project will be inferred from the account.
     * 
     */
    @OutputExport(name="serviceAccountId", type=String.class, parameters={})
    private Output<String> serviceAccountId;

    /**
     * @return The Service account id of the Key. This can be a string in the format
     * `{ACCOUNT}` or `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`, where `{ACCOUNT}` is the email address or
     * unique id of the service account. If the `{ACCOUNT}` syntax is used, the project will be inferred from the account.
     * 
     */
    public Output<String> getServiceAccountId() {
        return this.serviceAccountId;
    }
    /**
     * The key can be used after this timestamp. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @OutputExport(name="validAfter", type=String.class, parameters={})
    private Output<String> validAfter;

    /**
     * @return The key can be used after this timestamp. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> getValidAfter() {
        return this.validAfter;
    }
    /**
     * The key can be used before this timestamp.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @OutputExport(name="validBefore", type=String.class, parameters={})
    private Output<String> validBefore;

    /**
     * @return The key can be used before this timestamp.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> getValidBefore() {
        return this.validBefore;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Key(String name, KeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:serviceAccount/key:Key", name, args == null ? KeyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Key(String name, Input<String> id, @Nullable KeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:serviceAccount/key:Key", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Key get(String name, Input<String> id, @Nullable KeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Key(name, id, state, options);
    }
}
