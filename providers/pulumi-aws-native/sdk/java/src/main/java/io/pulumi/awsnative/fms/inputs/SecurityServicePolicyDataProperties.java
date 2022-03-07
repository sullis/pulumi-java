// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.fms.inputs;

import io.pulumi.awsnative.fms.enums.PolicySecurityServicePolicyDataPropertiesType;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityServicePolicyDataProperties extends io.pulumi.resources.InvokeArgs {

    public static final SecurityServicePolicyDataProperties Empty = new SecurityServicePolicyDataProperties();

    @InputImport(name="managedServiceData")
      private final @Nullable String managedServiceData;

    public Optional<String> getManagedServiceData() {
        return this.managedServiceData == null ? Optional.empty() : Optional.ofNullable(this.managedServiceData);
    }

    @InputImport(name="type", required=true)
      private final PolicySecurityServicePolicyDataPropertiesType type;

    public PolicySecurityServicePolicyDataPropertiesType getType() {
        return this.type;
    }

    public SecurityServicePolicyDataProperties(
        @Nullable String managedServiceData,
        PolicySecurityServicePolicyDataPropertiesType type) {
        this.managedServiceData = managedServiceData;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SecurityServicePolicyDataProperties() {
        this.managedServiceData = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityServicePolicyDataProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String managedServiceData;
        private PolicySecurityServicePolicyDataPropertiesType type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityServicePolicyDataProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedServiceData = defaults.managedServiceData;
    	      this.type = defaults.type;
        }

        public Builder setManagedServiceData(@Nullable String managedServiceData) {
            this.managedServiceData = managedServiceData;
            return this;
        }

        public Builder setType(PolicySecurityServicePolicyDataPropertiesType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SecurityServicePolicyDataProperties build() {
            return new SecurityServicePolicyDataProperties(managedServiceData, type);
        }
    }
}