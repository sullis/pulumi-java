// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.datashare.enums.ShareKind;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ShareArgs extends io.pulumi.resources.ResourceArgs {

    public static final ShareArgs Empty = new ShareArgs();

    /**
     * The name of the share account.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Share description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Share kind.
     * 
     */
    @InputImport(name="shareKind")
    private final @Nullable Input<Either<String,ShareKind>> shareKind;

    public Input<Either<String,ShareKind>> getShareKind() {
        return this.shareKind == null ? Input.empty() : this.shareKind;
    }

    /**
     * The name of the share.
     * 
     */
    @InputImport(name="shareName")
    private final @Nullable Input<String> shareName;

    public Input<String> getShareName() {
        return this.shareName == null ? Input.empty() : this.shareName;
    }

    /**
     * Share terms.
     * 
     */
    @InputImport(name="terms")
    private final @Nullable Input<String> terms;

    public Input<String> getTerms() {
        return this.terms == null ? Input.empty() : this.terms;
    }

    public ShareArgs(
        Input<String> accountName,
        @Nullable Input<String> description,
        Input<String> resourceGroupName,
        @Nullable Input<Either<String,ShareKind>> shareKind,
        @Nullable Input<String> shareName,
        @Nullable Input<String> terms) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.description = description;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareKind = shareKind;
        this.shareName = shareName;
        this.terms = terms;
    }

    private ShareArgs() {
        this.accountName = Input.empty();
        this.description = Input.empty();
        this.resourceGroupName = Input.empty();
        this.shareKind = Input.empty();
        this.shareName = Input.empty();
        this.terms = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> description;
        private Input<String> resourceGroupName;
        private @Nullable Input<Either<String,ShareKind>> shareKind;
        private @Nullable Input<String> shareName;
        private @Nullable Input<String> terms;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.description = defaults.description;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareKind = defaults.shareKind;
    	      this.shareName = defaults.shareName;
    	      this.terms = defaults.terms;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setShareKind(@Nullable Input<Either<String,ShareKind>> shareKind) {
            this.shareKind = shareKind;
            return this;
        }

        public Builder setShareKind(@Nullable Either<String,ShareKind> shareKind) {
            this.shareKind = Input.ofNullable(shareKind);
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

        public Builder setTerms(@Nullable Input<String> terms) {
            this.terms = terms;
            return this;
        }

        public Builder setTerms(@Nullable String terms) {
            this.terms = Input.ofNullable(terms);
            return this;
        }

        public ShareArgs build() {
            return new ShareArgs(accountName, description, resourceGroupName, shareKind, shareName, terms);
        }
    }
}
