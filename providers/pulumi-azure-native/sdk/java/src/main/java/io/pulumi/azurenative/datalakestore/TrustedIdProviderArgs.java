// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrustedIdProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrustedIdProviderArgs Empty = new TrustedIdProviderArgs();

    /**
     * The name of the Data Lake Store account.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The URL of this trusted identity provider.
     * 
     */
    @Import(name="idProvider", required=true)
      private final Output<String> idProvider;

    public Output<String> getIdProvider() {
        return this.idProvider;
    }

    /**
     * The name of the Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * 
     */
    @Import(name="trustedIdProviderName")
      private final @Nullable Output<String> trustedIdProviderName;

    public Output<String> getTrustedIdProviderName() {
        return this.trustedIdProviderName == null ? Output.empty() : this.trustedIdProviderName;
    }

    public TrustedIdProviderArgs(
        Output<String> accountName,
        Output<String> idProvider,
        Output<String> resourceGroupName,
        @Nullable Output<String> trustedIdProviderName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.idProvider = Objects.requireNonNull(idProvider, "expected parameter 'idProvider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.trustedIdProviderName = trustedIdProviderName;
    }

    private TrustedIdProviderArgs() {
        this.accountName = Output.empty();
        this.idProvider = Output.empty();
        this.resourceGroupName = Output.empty();
        this.trustedIdProviderName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrustedIdProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private Output<String> idProvider;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> trustedIdProviderName;

        public Builder() {
    	      // Empty
        }

        public Builder(TrustedIdProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.idProvider = defaults.idProvider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.trustedIdProviderName = defaults.trustedIdProviderName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder idProvider(Output<String> idProvider) {
            this.idProvider = Objects.requireNonNull(idProvider);
            return this;
        }
        public Builder idProvider(String idProvider) {
            this.idProvider = Output.of(Objects.requireNonNull(idProvider));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder trustedIdProviderName(@Nullable Output<String> trustedIdProviderName) {
            this.trustedIdProviderName = trustedIdProviderName;
            return this;
        }
        public Builder trustedIdProviderName(@Nullable String trustedIdProviderName) {
            this.trustedIdProviderName = Output.ofNullable(trustedIdProviderName);
            return this;
        }        public TrustedIdProviderArgs build() {
            return new TrustedIdProviderArgs(accountName, idProvider, resourceGroupName, trustedIdProviderName);
        }
    }
}
