// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomerSubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomerSubscriptionArgs Empty = new CustomerSubscriptionArgs();

    /**
     * Name of the product.
     * 
     */
    @InputImport(name="customerSubscriptionName")
    private final @Nullable Input<String> customerSubscriptionName;

    public Input<String> getCustomerSubscriptionName() {
        return this.customerSubscriptionName == null ? Input.empty() : this.customerSubscriptionName;
    }

    /**
     * Name of the Azure Stack registration.
     * 
     */
    @InputImport(name="registrationName", required=true)
    private final Input<String> registrationName;

    public Input<String> getRegistrationName() {
        return this.registrationName;
    }

    /**
     * Name of the resource group.
     * 
     */
    @InputImport(name="resourceGroup", required=true)
    private final Input<String> resourceGroup;

    public Input<String> getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Tenant Id.
     * 
     */
    @InputImport(name="tenantId")
    private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    public CustomerSubscriptionArgs(
        @Nullable Input<String> customerSubscriptionName,
        Input<String> registrationName,
        Input<String> resourceGroup,
        @Nullable Input<String> tenantId) {
        this.customerSubscriptionName = customerSubscriptionName;
        this.registrationName = Objects.requireNonNull(registrationName, "expected parameter 'registrationName' to be non-null");
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
        this.tenantId = tenantId;
    }

    private CustomerSubscriptionArgs() {
        this.customerSubscriptionName = Input.empty();
        this.registrationName = Input.empty();
        this.resourceGroup = Input.empty();
        this.tenantId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> customerSubscriptionName;
        private Input<String> registrationName;
        private Input<String> resourceGroup;
        private @Nullable Input<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerSubscriptionName = defaults.customerSubscriptionName;
    	      this.registrationName = defaults.registrationName;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setCustomerSubscriptionName(@Nullable Input<String> customerSubscriptionName) {
            this.customerSubscriptionName = customerSubscriptionName;
            return this;
        }

        public Builder setCustomerSubscriptionName(@Nullable String customerSubscriptionName) {
            this.customerSubscriptionName = Input.ofNullable(customerSubscriptionName);
            return this;
        }

        public Builder setRegistrationName(Input<String> registrationName) {
            this.registrationName = Objects.requireNonNull(registrationName);
            return this;
        }

        public Builder setRegistrationName(String registrationName) {
            this.registrationName = Input.of(Objects.requireNonNull(registrationName));
            return this;
        }

        public Builder setResourceGroup(Input<String> resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder setResourceGroup(String resourceGroup) {
            this.resourceGroup = Input.of(Objects.requireNonNull(resourceGroup));
            return this;
        }

        public Builder setTenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }

        public CustomerSubscriptionArgs build() {
            return new CustomerSubscriptionArgs(customerSubscriptionName, registrationName, resourceGroup, tenantId);
        }
    }
}
