// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.serviceAccount;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyArgs Empty = new KeyArgs();

    /**
     * Arbitrary map of values that, when changed, will trigger a new key to be generated.
     * 
     */
    @Import(name="keepers")
    private @Nullable Output<Map<String,Object>> keepers;

    /**
     * @return Arbitrary map of values that, when changed, will trigger a new key to be generated.
     * 
     */
    public Optional<Output<Map<String,Object>>> keepers() {
        return Optional.ofNullable(this.keepers);
    }

    /**
     * The algorithm used to generate the key. KEY_ALG_RSA_2048 is the default algorithm.
     * Valid values are listed at
     * [ServiceAccountPrivateKeyType](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys#ServiceAccountKeyAlgorithm)
     * (only used on create)
     * 
     */
    @Import(name="keyAlgorithm")
    private @Nullable Output<String> keyAlgorithm;

    /**
     * @return The algorithm used to generate the key. KEY_ALG_RSA_2048 is the default algorithm.
     * Valid values are listed at
     * [ServiceAccountPrivateKeyType](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys#ServiceAccountKeyAlgorithm)
     * (only used on create)
     * 
     */
    public Optional<Output<String>> keyAlgorithm() {
        return Optional.ofNullable(this.keyAlgorithm);
    }

    /**
     * The output format of the private key. TYPE_GOOGLE_CREDENTIALS_FILE is the default output format.
     * 
     */
    @Import(name="privateKeyType")
    private @Nullable Output<String> privateKeyType;

    /**
     * @return The output format of the private key. TYPE_GOOGLE_CREDENTIALS_FILE is the default output format.
     * 
     */
    public Optional<Output<String>> privateKeyType() {
        return Optional.ofNullable(this.privateKeyType);
    }

    /**
     * Public key data to create a service account key for given service account. The expected format for this field is a base64 encoded X509_PEM and it conflicts with `public_key_type` and `private_key_type`.
     * 
     */
    @Import(name="publicKeyData")
    private @Nullable Output<String> publicKeyData;

    /**
     * @return Public key data to create a service account key for given service account. The expected format for this field is a base64 encoded X509_PEM and it conflicts with `public_key_type` and `private_key_type`.
     * 
     */
    public Optional<Output<String>> publicKeyData() {
        return Optional.ofNullable(this.publicKeyData);
    }

    /**
     * The output format of the public key requested. TYPE_X509_PEM_FILE is the default output format.
     * 
     */
    @Import(name="publicKeyType")
    private @Nullable Output<String> publicKeyType;

    /**
     * @return The output format of the public key requested. TYPE_X509_PEM_FILE is the default output format.
     * 
     */
    public Optional<Output<String>> publicKeyType() {
        return Optional.ofNullable(this.publicKeyType);
    }

    /**
     * The Service account id of the Key. This can be a string in the format
     * `{ACCOUNT}` or `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`, where `{ACCOUNT}` is the email address or
     * unique id of the service account. If the `{ACCOUNT}` syntax is used, the project will be inferred from the account.
     * 
     */
    @Import(name="serviceAccountId", required=true)
    private Output<String> serviceAccountId;

    /**
     * @return The Service account id of the Key. This can be a string in the format
     * `{ACCOUNT}` or `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`, where `{ACCOUNT}` is the email address or
     * unique id of the service account. If the `{ACCOUNT}` syntax is used, the project will be inferred from the account.
     * 
     */
    public Output<String> serviceAccountId() {
        return this.serviceAccountId;
    }

    private KeyArgs() {}

    private KeyArgs(KeyArgs $) {
        this.keepers = $.keepers;
        this.keyAlgorithm = $.keyAlgorithm;
        this.privateKeyType = $.privateKeyType;
        this.publicKeyData = $.publicKeyData;
        this.publicKeyType = $.publicKeyType;
        this.serviceAccountId = $.serviceAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyArgs $;

        public Builder() {
            $ = new KeyArgs();
        }

        public Builder(KeyArgs defaults) {
            $ = new KeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keepers Arbitrary map of values that, when changed, will trigger a new key to be generated.
         * 
         * @return builder
         * 
         */
        public Builder keepers(@Nullable Output<Map<String,Object>> keepers) {
            $.keepers = keepers;
            return this;
        }

        /**
         * @param keepers Arbitrary map of values that, when changed, will trigger a new key to be generated.
         * 
         * @return builder
         * 
         */
        public Builder keepers(Map<String,Object> keepers) {
            return keepers(Output.of(keepers));
        }

        /**
         * @param keyAlgorithm The algorithm used to generate the key. KEY_ALG_RSA_2048 is the default algorithm.
         * Valid values are listed at
         * [ServiceAccountPrivateKeyType](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys#ServiceAccountKeyAlgorithm)
         * (only used on create)
         * 
         * @return builder
         * 
         */
        public Builder keyAlgorithm(@Nullable Output<String> keyAlgorithm) {
            $.keyAlgorithm = keyAlgorithm;
            return this;
        }

        /**
         * @param keyAlgorithm The algorithm used to generate the key. KEY_ALG_RSA_2048 is the default algorithm.
         * Valid values are listed at
         * [ServiceAccountPrivateKeyType](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys#ServiceAccountKeyAlgorithm)
         * (only used on create)
         * 
         * @return builder
         * 
         */
        public Builder keyAlgorithm(String keyAlgorithm) {
            return keyAlgorithm(Output.of(keyAlgorithm));
        }

        /**
         * @param privateKeyType The output format of the private key. TYPE_GOOGLE_CREDENTIALS_FILE is the default output format.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyType(@Nullable Output<String> privateKeyType) {
            $.privateKeyType = privateKeyType;
            return this;
        }

        /**
         * @param privateKeyType The output format of the private key. TYPE_GOOGLE_CREDENTIALS_FILE is the default output format.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyType(String privateKeyType) {
            return privateKeyType(Output.of(privateKeyType));
        }

        /**
         * @param publicKeyData Public key data to create a service account key for given service account. The expected format for this field is a base64 encoded X509_PEM and it conflicts with `public_key_type` and `private_key_type`.
         * 
         * @return builder
         * 
         */
        public Builder publicKeyData(@Nullable Output<String> publicKeyData) {
            $.publicKeyData = publicKeyData;
            return this;
        }

        /**
         * @param publicKeyData Public key data to create a service account key for given service account. The expected format for this field is a base64 encoded X509_PEM and it conflicts with `public_key_type` and `private_key_type`.
         * 
         * @return builder
         * 
         */
        public Builder publicKeyData(String publicKeyData) {
            return publicKeyData(Output.of(publicKeyData));
        }

        /**
         * @param publicKeyType The output format of the public key requested. TYPE_X509_PEM_FILE is the default output format.
         * 
         * @return builder
         * 
         */
        public Builder publicKeyType(@Nullable Output<String> publicKeyType) {
            $.publicKeyType = publicKeyType;
            return this;
        }

        /**
         * @param publicKeyType The output format of the public key requested. TYPE_X509_PEM_FILE is the default output format.
         * 
         * @return builder
         * 
         */
        public Builder publicKeyType(String publicKeyType) {
            return publicKeyType(Output.of(publicKeyType));
        }

        /**
         * @param serviceAccountId The Service account id of the Key. This can be a string in the format
         * `{ACCOUNT}` or `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`, where `{ACCOUNT}` is the email address or
         * unique id of the service account. If the `{ACCOUNT}` syntax is used, the project will be inferred from the account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountId(Output<String> serviceAccountId) {
            $.serviceAccountId = serviceAccountId;
            return this;
        }

        /**
         * @param serviceAccountId The Service account id of the Key. This can be a string in the format
         * `{ACCOUNT}` or `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`, where `{ACCOUNT}` is the email address or
         * unique id of the service account. If the `{ACCOUNT}` syntax is used, the project will be inferred from the account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountId(String serviceAccountId) {
            return serviceAccountId(Output.of(serviceAccountId));
        }

        public KeyArgs build() {
            $.serviceAccountId = Objects.requireNonNull($.serviceAccountId, "expected parameter 'serviceAccountId' to be non-null");
            return $;
        }
    }

}
