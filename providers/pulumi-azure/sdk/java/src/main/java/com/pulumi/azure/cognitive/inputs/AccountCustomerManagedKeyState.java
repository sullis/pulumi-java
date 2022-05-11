// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cognitive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountCustomerManagedKeyState extends com.pulumi.resources.ResourceArgs {

    public static final AccountCustomerManagedKeyState Empty = new AccountCustomerManagedKeyState();

    /**
     * The ID of the Cognitive Account. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="cognitiveAccountId")
    private @Nullable Output<String> cognitiveAccountId;

    /**
     * @return The ID of the Cognitive Account. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> cognitiveAccountId() {
        return Optional.ofNullable(this.cognitiveAccountId);
    }

    /**
     * The Client ID of the User Assigned Identity that has access to the key. This property only needs to be specified when there&#39;re multiple identities attached to the Cognitive Account.
     * 
     */
    @Import(name="identityClientId")
    private @Nullable Output<String> identityClientId;

    /**
     * @return The Client ID of the User Assigned Identity that has access to the key. This property only needs to be specified when there&#39;re multiple identities attached to the Cognitive Account.
     * 
     */
    public Optional<Output<String>> identityClientId() {
        return Optional.ofNullable(this.identityClientId);
    }

    /**
     * The ID of the Key Vault Key which should be used to Encrypt the data in this Cognitive Account.
     * 
     */
    @Import(name="keyVaultKeyId")
    private @Nullable Output<String> keyVaultKeyId;

    /**
     * @return The ID of the Key Vault Key which should be used to Encrypt the data in this Cognitive Account.
     * 
     */
    public Optional<Output<String>> keyVaultKeyId() {
        return Optional.ofNullable(this.keyVaultKeyId);
    }

    private AccountCustomerManagedKeyState() {}

    private AccountCustomerManagedKeyState(AccountCustomerManagedKeyState $) {
        this.cognitiveAccountId = $.cognitiveAccountId;
        this.identityClientId = $.identityClientId;
        this.keyVaultKeyId = $.keyVaultKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountCustomerManagedKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountCustomerManagedKeyState $;

        public Builder() {
            $ = new AccountCustomerManagedKeyState();
        }

        public Builder(AccountCustomerManagedKeyState defaults) {
            $ = new AccountCustomerManagedKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cognitiveAccountId The ID of the Cognitive Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder cognitiveAccountId(@Nullable Output<String> cognitiveAccountId) {
            $.cognitiveAccountId = cognitiveAccountId;
            return this;
        }

        /**
         * @param cognitiveAccountId The ID of the Cognitive Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder cognitiveAccountId(String cognitiveAccountId) {
            return cognitiveAccountId(Output.of(cognitiveAccountId));
        }

        /**
         * @param identityClientId The Client ID of the User Assigned Identity that has access to the key. This property only needs to be specified when there&#39;re multiple identities attached to the Cognitive Account.
         * 
         * @return builder
         * 
         */
        public Builder identityClientId(@Nullable Output<String> identityClientId) {
            $.identityClientId = identityClientId;
            return this;
        }

        /**
         * @param identityClientId The Client ID of the User Assigned Identity that has access to the key. This property only needs to be specified when there&#39;re multiple identities attached to the Cognitive Account.
         * 
         * @return builder
         * 
         */
        public Builder identityClientId(String identityClientId) {
            return identityClientId(Output.of(identityClientId));
        }

        /**
         * @param keyVaultKeyId The ID of the Key Vault Key which should be used to Encrypt the data in this Cognitive Account.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(@Nullable Output<String> keyVaultKeyId) {
            $.keyVaultKeyId = keyVaultKeyId;
            return this;
        }

        /**
         * @param keyVaultKeyId The ID of the Key Vault Key which should be used to Encrypt the data in this Cognitive Account.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(String keyVaultKeyId) {
            return keyVaultKeyId(Output.of(keyVaultKeyId));
        }

        public AccountCustomerManagedKeyState build() {
            return $;
        }
    }

}
