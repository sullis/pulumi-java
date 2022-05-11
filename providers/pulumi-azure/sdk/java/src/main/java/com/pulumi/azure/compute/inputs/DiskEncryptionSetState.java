// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.azure.compute.inputs.DiskEncryptionSetIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskEncryptionSetState extends com.pulumi.resources.ResourceArgs {

    public static final DiskEncryptionSetState Empty = new DiskEncryptionSetState();

    /**
     * Boolean flag to specify whether Azure Disk Encryption Set automatically rotates encryption Key to latest version. Defaults to `false`.
     * 
     */
    @Import(name="autoKeyRotationEnabled")
    private @Nullable Output<Boolean> autoKeyRotationEnabled;

    /**
     * @return Boolean flag to specify whether Azure Disk Encryption Set automatically rotates encryption Key to latest version. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> autoKeyRotationEnabled() {
        return Optional.ofNullable(this.autoKeyRotationEnabled);
    }

    /**
     * The type of key used to encrypt the data of the disk. Possible values are `EncryptionAtRestWithCustomerKey` and `EncryptionAtRestWithPlatformAndCustomerKeys`. Defaults to `EncryptionAtRestWithCustomerKey`.
     * 
     */
    @Import(name="encryptionType")
    private @Nullable Output<String> encryptionType;

    /**
     * @return The type of key used to encrypt the data of the disk. Possible values are `EncryptionAtRestWithCustomerKey` and `EncryptionAtRestWithPlatformAndCustomerKeys`. Defaults to `EncryptionAtRestWithCustomerKey`.
     * 
     */
    public Optional<Output<String>> encryptionType() {
        return Optional.ofNullable(this.encryptionType);
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<DiskEncryptionSetIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<DiskEncryptionSetIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Specifies the URL to a Key Vault Key (either from a Key Vault Key, or the Key URL for the Key Vault Secret).
     * 
     */
    @Import(name="keyVaultKeyId")
    private @Nullable Output<String> keyVaultKeyId;

    /**
     * @return Specifies the URL to a Key Vault Key (either from a Key Vault Key, or the Key URL for the Key Vault Secret).
     * 
     */
    public Optional<Output<String>> keyVaultKeyId() {
        return Optional.ofNullable(this.keyVaultKeyId);
    }

    /**
     * Specifies the Azure Region where the Disk Encryption Set exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the Azure Region where the Disk Encryption Set exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Disk Encryption Set. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Disk Encryption Set. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the name of the Resource Group where the Disk Encryption Set should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where the Disk Encryption Set should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A mapping of tags to assign to the Disk Encryption Set.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the Disk Encryption Set.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DiskEncryptionSetState() {}

    private DiskEncryptionSetState(DiskEncryptionSetState $) {
        this.autoKeyRotationEnabled = $.autoKeyRotationEnabled;
        this.encryptionType = $.encryptionType;
        this.identity = $.identity;
        this.keyVaultKeyId = $.keyVaultKeyId;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskEncryptionSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskEncryptionSetState $;

        public Builder() {
            $ = new DiskEncryptionSetState();
        }

        public Builder(DiskEncryptionSetState defaults) {
            $ = new DiskEncryptionSetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoKeyRotationEnabled Boolean flag to specify whether Azure Disk Encryption Set automatically rotates encryption Key to latest version. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoKeyRotationEnabled(@Nullable Output<Boolean> autoKeyRotationEnabled) {
            $.autoKeyRotationEnabled = autoKeyRotationEnabled;
            return this;
        }

        /**
         * @param autoKeyRotationEnabled Boolean flag to specify whether Azure Disk Encryption Set automatically rotates encryption Key to latest version. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoKeyRotationEnabled(Boolean autoKeyRotationEnabled) {
            return autoKeyRotationEnabled(Output.of(autoKeyRotationEnabled));
        }

        /**
         * @param encryptionType The type of key used to encrypt the data of the disk. Possible values are `EncryptionAtRestWithCustomerKey` and `EncryptionAtRestWithPlatformAndCustomerKeys`. Defaults to `EncryptionAtRestWithCustomerKey`.
         * 
         * @return builder
         * 
         */
        public Builder encryptionType(@Nullable Output<String> encryptionType) {
            $.encryptionType = encryptionType;
            return this;
        }

        /**
         * @param encryptionType The type of key used to encrypt the data of the disk. Possible values are `EncryptionAtRestWithCustomerKey` and `EncryptionAtRestWithPlatformAndCustomerKeys`. Defaults to `EncryptionAtRestWithCustomerKey`.
         * 
         * @return builder
         * 
         */
        public Builder encryptionType(String encryptionType) {
            return encryptionType(Output.of(encryptionType));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<DiskEncryptionSetIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(DiskEncryptionSetIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param keyVaultKeyId Specifies the URL to a Key Vault Key (either from a Key Vault Key, or the Key URL for the Key Vault Secret).
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(@Nullable Output<String> keyVaultKeyId) {
            $.keyVaultKeyId = keyVaultKeyId;
            return this;
        }

        /**
         * @param keyVaultKeyId Specifies the URL to a Key Vault Key (either from a Key Vault Key, or the Key URL for the Key Vault Secret).
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(String keyVaultKeyId) {
            return keyVaultKeyId(Output.of(keyVaultKeyId));
        }

        /**
         * @param location Specifies the Azure Region where the Disk Encryption Set exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the Azure Region where the Disk Encryption Set exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the Disk Encryption Set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Disk Encryption Set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the Disk Encryption Set should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the Disk Encryption Set should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags to assign to the Disk Encryption Set.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the Disk Encryption Set.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DiskEncryptionSetState build() {
            return $;
        }
    }

}
