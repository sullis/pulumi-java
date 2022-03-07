// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OuContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final OuContainerArgs Empty = new OuContainerArgs();

    /**
     * The account name
     * 
     */
    @InputImport(name="accountName")
      private final @Nullable Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName == null ? Input.empty() : this.accountName;
    }

    /**
     * The name of the domain service.
     * 
     */
    @InputImport(name="domainServiceName", required=true)
      private final Input<String> domainServiceName;

    public Input<String> getDomainServiceName() {
        return this.domainServiceName;
    }

    /**
     * The name of the OuContainer.
     * 
     */
    @InputImport(name="ouContainerName")
      private final @Nullable Input<String> ouContainerName;

    public Input<String> getOuContainerName() {
        return this.ouContainerName == null ? Input.empty() : this.ouContainerName;
    }

    /**
     * The account password
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
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
     * The account spn
     * 
     */
    @InputImport(name="spn")
      private final @Nullable Input<String> spn;

    public Input<String> getSpn() {
        return this.spn == null ? Input.empty() : this.spn;
    }

    public OuContainerArgs(
        @Nullable Input<String> accountName,
        Input<String> domainServiceName,
        @Nullable Input<String> ouContainerName,
        @Nullable Input<String> password,
        Input<String> resourceGroupName,
        @Nullable Input<String> spn) {
        this.accountName = accountName;
        this.domainServiceName = Objects.requireNonNull(domainServiceName, "expected parameter 'domainServiceName' to be non-null");
        this.ouContainerName = ouContainerName;
        this.password = password;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.spn = spn;
    }

    private OuContainerArgs() {
        this.accountName = Input.empty();
        this.domainServiceName = Input.empty();
        this.ouContainerName = Input.empty();
        this.password = Input.empty();
        this.resourceGroupName = Input.empty();
        this.spn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OuContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountName;
        private Input<String> domainServiceName;
        private @Nullable Input<String> ouContainerName;
        private @Nullable Input<String> password;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> spn;

        public Builder() {
    	      // Empty
        }

        public Builder(OuContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.domainServiceName = defaults.domainServiceName;
    	      this.ouContainerName = defaults.ouContainerName;
    	      this.password = defaults.password;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.spn = defaults.spn;
        }

        public Builder setAccountName(@Nullable Input<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder setAccountName(@Nullable String accountName) {
            this.accountName = Input.ofNullable(accountName);
            return this;
        }

        public Builder setDomainServiceName(Input<String> domainServiceName) {
            this.domainServiceName = Objects.requireNonNull(domainServiceName);
            return this;
        }

        public Builder setDomainServiceName(String domainServiceName) {
            this.domainServiceName = Input.of(Objects.requireNonNull(domainServiceName));
            return this;
        }

        public Builder setOuContainerName(@Nullable Input<String> ouContainerName) {
            this.ouContainerName = ouContainerName;
            return this;
        }

        public Builder setOuContainerName(@Nullable String ouContainerName) {
            this.ouContainerName = Input.ofNullable(ouContainerName);
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
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

        public Builder setSpn(@Nullable Input<String> spn) {
            this.spn = spn;
            return this;
        }

        public Builder setSpn(@Nullable String spn) {
            this.spn = Input.ofNullable(spn);
            return this;
        }
        public OuContainerArgs build() {
            return new OuContainerArgs(accountName, domainServiceName, ouContainerName, password, resourceGroupName, spn);
        }
    }
}