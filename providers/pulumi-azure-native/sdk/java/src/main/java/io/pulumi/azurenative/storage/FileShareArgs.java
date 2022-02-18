// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.storage.enums.EnabledProtocols;
import io.pulumi.azurenative.storage.enums.RootSquashType;
import io.pulumi.azurenative.storage.enums.ShareAccessTier;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FileShareArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileShareArgs Empty = new FileShareArgs();

    /**
     * Access tier for specific share. GpV2 account can choose between TransactionOptimized (default), Hot, and Cool. FileStorage account can choose Premium.
     * 
     */
    @InputImport(name="accessTier")
    private final @Nullable Input<Either<String,ShareAccessTier>> accessTier;

    public Input<Either<String,ShareAccessTier>> getAccessTier() {
        return this.accessTier == null ? Input.empty() : this.accessTier;
    }

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The authentication protocol that is used for the file share. Can only be specified when creating a share.
     * 
     */
    @InputImport(name="enabledProtocols")
    private final @Nullable Input<Either<String,EnabledProtocols>> enabledProtocols;

    public Input<Either<String,EnabledProtocols>> getEnabledProtocols() {
        return this.enabledProtocols == null ? Input.empty() : this.enabledProtocols;
    }

    /**
     * Optional, used to create a snapshot.
     * 
     */
    @InputImport(name="expand")
    private final @Nullable Input<String> expand;

    public Input<String> getExpand() {
        return this.expand == null ? Input.empty() : this.expand;
    }

    /**
     * A name-value pair to associate with the share as metadata.
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The property is for NFS share only. The default is NoRootSquash.
     * 
     */
    @InputImport(name="rootSquash")
    private final @Nullable Input<Either<String,RootSquashType>> rootSquash;

    public Input<Either<String,RootSquashType>> getRootSquash() {
        return this.rootSquash == null ? Input.empty() : this.rootSquash;
    }

    /**
     * The name of the file share within the specified storage account. File share names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * 
     */
    @InputImport(name="shareName")
    private final @Nullable Input<String> shareName;

    public Input<String> getShareName() {
        return this.shareName == null ? Input.empty() : this.shareName;
    }

    /**
     * The maximum size of the share, in gigabytes. Must be greater than 0, and less than or equal to 5TB (5120). For Large File Shares, the maximum size is 102400.
     * 
     */
    @InputImport(name="shareQuota")
    private final @Nullable Input<Integer> shareQuota;

    public Input<Integer> getShareQuota() {
        return this.shareQuota == null ? Input.empty() : this.shareQuota;
    }

    public FileShareArgs(
        @Nullable Input<Either<String,ShareAccessTier>> accessTier,
        Input<String> accountName,
        @Nullable Input<Either<String,EnabledProtocols>> enabledProtocols,
        @Nullable Input<String> expand,
        @Nullable Input<Map<String,String>> metadata,
        Input<String> resourceGroupName,
        @Nullable Input<Either<String,RootSquashType>> rootSquash,
        @Nullable Input<String> shareName,
        @Nullable Input<Integer> shareQuota) {
        this.accessTier = accessTier;
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.enabledProtocols = enabledProtocols;
        this.expand = expand;
        this.metadata = metadata;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.rootSquash = rootSquash;
        this.shareName = shareName;
        this.shareQuota = shareQuota;
    }

    private FileShareArgs() {
        this.accessTier = Input.empty();
        this.accountName = Input.empty();
        this.enabledProtocols = Input.empty();
        this.expand = Input.empty();
        this.metadata = Input.empty();
        this.resourceGroupName = Input.empty();
        this.rootSquash = Input.empty();
        this.shareName = Input.empty();
        this.shareQuota = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileShareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ShareAccessTier>> accessTier;
        private Input<String> accountName;
        private @Nullable Input<Either<String,EnabledProtocols>> enabledProtocols;
        private @Nullable Input<String> expand;
        private @Nullable Input<Map<String,String>> metadata;
        private Input<String> resourceGroupName;
        private @Nullable Input<Either<String,RootSquashType>> rootSquash;
        private @Nullable Input<String> shareName;
        private @Nullable Input<Integer> shareQuota;

        public Builder() {
    	      // Empty
        }

        public Builder(FileShareArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTier = defaults.accessTier;
    	      this.accountName = defaults.accountName;
    	      this.enabledProtocols = defaults.enabledProtocols;
    	      this.expand = defaults.expand;
    	      this.metadata = defaults.metadata;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.rootSquash = defaults.rootSquash;
    	      this.shareName = defaults.shareName;
    	      this.shareQuota = defaults.shareQuota;
        }

        public Builder setAccessTier(@Nullable Input<Either<String,ShareAccessTier>> accessTier) {
            this.accessTier = accessTier;
            return this;
        }

        public Builder setAccessTier(@Nullable Either<String,ShareAccessTier> accessTier) {
            this.accessTier = Input.ofNullable(accessTier);
            return this;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setEnabledProtocols(@Nullable Input<Either<String,EnabledProtocols>> enabledProtocols) {
            this.enabledProtocols = enabledProtocols;
            return this;
        }

        public Builder setEnabledProtocols(@Nullable Either<String,EnabledProtocols> enabledProtocols) {
            this.enabledProtocols = Input.ofNullable(enabledProtocols);
            return this;
        }

        public Builder setExpand(@Nullable Input<String> expand) {
            this.expand = expand;
            return this;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = Input.ofNullable(expand);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRootSquash(@Nullable Input<Either<String,RootSquashType>> rootSquash) {
            this.rootSquash = rootSquash;
            return this;
        }

        public Builder setRootSquash(@Nullable Either<String,RootSquashType> rootSquash) {
            this.rootSquash = Input.ofNullable(rootSquash);
            return this;
        }

        public Builder setShareName(@Nullable Input<String> shareName) {
            this.shareName = shareName;
            return this;
        }

        public Builder setShareName(@Nullable String shareName) {
            this.shareName = Input.ofNullable(shareName);
            return this;
        }

        public Builder setShareQuota(@Nullable Input<Integer> shareQuota) {
            this.shareQuota = shareQuota;
            return this;
        }

        public Builder setShareQuota(@Nullable Integer shareQuota) {
            this.shareQuota = Input.ofNullable(shareQuota);
            return this;
        }

        public FileShareArgs build() {
            return new FileShareArgs(accessTier, accountName, enabledProtocols, expand, metadata, resourceGroupName, rootSquash, shareName, shareQuota);
        }
    }
}
