// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.autonomousdevelopmentplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encryption properties of a Data Pool
 * 
 */
public final class DataPoolEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataPoolEncryptionArgs Empty = new DataPoolEncryptionArgs();

    /**
     * The name of Key Vault key
     * 
     */
    @Import(name="keyName", required=true)
    private Output<String> keyName;

    /**
     * @return The name of Key Vault key
     * 
     */
    public Output<String> keyName() {
        return this.keyName;
    }

    /**
     * The URI of a soft delete-enabled Key Vault that is in the same location as the Data Pool location
     * 
     */
    @Import(name="keyVaultUri", required=true)
    private Output<String> keyVaultUri;

    /**
     * @return The URI of a soft delete-enabled Key Vault that is in the same location as the Data Pool location
     * 
     */
    public Output<String> keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * The version of Key Vault key
     * 
     */
    @Import(name="keyVersion")
    private @Nullable Output<String> keyVersion;

    /**
     * @return The version of Key Vault key
     * 
     */
    public Optional<Output<String>> keyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }

    /**
     * The resource ID of a user-assigned Managed Identity used to access the encryption key in the Key Vault. Requires access to the key operations get, wrap, unwrap, and recover
     * 
     */
    @Import(name="userAssignedIdentity", required=true)
    private Output<String> userAssignedIdentity;

    /**
     * @return The resource ID of a user-assigned Managed Identity used to access the encryption key in the Key Vault. Requires access to the key operations get, wrap, unwrap, and recover
     * 
     */
    public Output<String> userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    private DataPoolEncryptionArgs() {}

    private DataPoolEncryptionArgs(DataPoolEncryptionArgs $) {
        this.keyName = $.keyName;
        this.keyVaultUri = $.keyVaultUri;
        this.keyVersion = $.keyVersion;
        this.userAssignedIdentity = $.userAssignedIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataPoolEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataPoolEncryptionArgs $;

        public Builder() {
            $ = new DataPoolEncryptionArgs();
        }

        public Builder(DataPoolEncryptionArgs defaults) {
            $ = new DataPoolEncryptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyName The name of Key Vault key
         * 
         * @return builder
         * 
         */
        public Builder keyName(Output<String> keyName) {
            $.keyName = keyName;
            return this;
        }

        /**
         * @param keyName The name of Key Vault key
         * 
         * @return builder
         * 
         */
        public Builder keyName(String keyName) {
            return keyName(Output.of(keyName));
        }

        /**
         * @param keyVaultUri The URI of a soft delete-enabled Key Vault that is in the same location as the Data Pool location
         * 
         * @return builder
         * 
         */
        public Builder keyVaultUri(Output<String> keyVaultUri) {
            $.keyVaultUri = keyVaultUri;
            return this;
        }

        /**
         * @param keyVaultUri The URI of a soft delete-enabled Key Vault that is in the same location as the Data Pool location
         * 
         * @return builder
         * 
         */
        public Builder keyVaultUri(String keyVaultUri) {
            return keyVaultUri(Output.of(keyVaultUri));
        }

        /**
         * @param keyVersion The version of Key Vault key
         * 
         * @return builder
         * 
         */
        public Builder keyVersion(@Nullable Output<String> keyVersion) {
            $.keyVersion = keyVersion;
            return this;
        }

        /**
         * @param keyVersion The version of Key Vault key
         * 
         * @return builder
         * 
         */
        public Builder keyVersion(String keyVersion) {
            return keyVersion(Output.of(keyVersion));
        }

        /**
         * @param userAssignedIdentity The resource ID of a user-assigned Managed Identity used to access the encryption key in the Key Vault. Requires access to the key operations get, wrap, unwrap, and recover
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentity(Output<String> userAssignedIdentity) {
            $.userAssignedIdentity = userAssignedIdentity;
            return this;
        }

        /**
         * @param userAssignedIdentity The resource ID of a user-assigned Managed Identity used to access the encryption key in the Key Vault. Requires access to the key operations get, wrap, unwrap, and recover
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentity(String userAssignedIdentity) {
            return userAssignedIdentity(Output.of(userAssignedIdentity));
        }

        public DataPoolEncryptionArgs build() {
            $.keyName = Objects.requireNonNull($.keyName, "expected parameter 'keyName' to be non-null");
            $.keyVaultUri = Objects.requireNonNull($.keyVaultUri, "expected parameter 'keyVaultUri' to be non-null");
            $.userAssignedIdentity = Objects.requireNonNull($.userAssignedIdentity, "expected parameter 'userAssignedIdentity' to be non-null");
            return $;
        }
    }

}
