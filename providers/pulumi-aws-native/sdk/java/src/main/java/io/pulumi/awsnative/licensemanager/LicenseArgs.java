// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager;

import io.pulumi.awsnative.licensemanager.inputs.LicenseConsumptionConfigurationArgs;
import io.pulumi.awsnative.licensemanager.inputs.LicenseEntitlementArgs;
import io.pulumi.awsnative.licensemanager.inputs.LicenseIssuerDataArgs;
import io.pulumi.awsnative.licensemanager.inputs.LicenseMetadataArgs;
import io.pulumi.awsnative.licensemanager.inputs.LicenseValidityDateFormatArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LicenseArgs extends io.pulumi.resources.ResourceArgs {

    public static final LicenseArgs Empty = new LicenseArgs();

    /**
     * Beneficiary of the license.
     * 
     */
    @Import(name="beneficiary")
      private final @Nullable Output<String> beneficiary;

    public Output<String> beneficiary() {
        return this.beneficiary == null ? Codegen.empty() : this.beneficiary;
    }

    @Import(name="consumptionConfiguration", required=true)
      private final Output<LicenseConsumptionConfigurationArgs> consumptionConfiguration;

    public Output<LicenseConsumptionConfigurationArgs> consumptionConfiguration() {
        return this.consumptionConfiguration;
    }

    @Import(name="entitlements", required=true)
      private final Output<List<LicenseEntitlementArgs>> entitlements;

    public Output<List<LicenseEntitlementArgs>> entitlements() {
        return this.entitlements;
    }

    /**
     * Home region for the created license.
     * 
     */
    @Import(name="homeRegion", required=true)
      private final Output<String> homeRegion;

    public Output<String> homeRegion() {
        return this.homeRegion;
    }

    @Import(name="issuer", required=true)
      private final Output<LicenseIssuerDataArgs> issuer;

    public Output<LicenseIssuerDataArgs> issuer() {
        return this.issuer;
    }

    @Import(name="licenseMetadata")
      private final @Nullable Output<List<LicenseMetadataArgs>> licenseMetadata;

    public Output<List<LicenseMetadataArgs>> licenseMetadata() {
        return this.licenseMetadata == null ? Codegen.empty() : this.licenseMetadata;
    }

    /**
     * Name for the created license.
     * 
     */
    @Import(name="licenseName")
      private final @Nullable Output<String> licenseName;

    public Output<String> licenseName() {
        return this.licenseName == null ? Codegen.empty() : this.licenseName;
    }

    /**
     * Product name for the created license.
     * 
     */
    @Import(name="productName", required=true)
      private final Output<String> productName;

    public Output<String> productName() {
        return this.productName;
    }

    /**
     * ProductSKU of the license.
     * 
     */
    @Import(name="productSKU")
      private final @Nullable Output<String> productSKU;

    public Output<String> productSKU() {
        return this.productSKU == null ? Codegen.empty() : this.productSKU;
    }

    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    @Import(name="validity", required=true)
      private final Output<LicenseValidityDateFormatArgs> validity;

    public Output<LicenseValidityDateFormatArgs> validity() {
        return this.validity;
    }

    public LicenseArgs(
        @Nullable Output<String> beneficiary,
        Output<LicenseConsumptionConfigurationArgs> consumptionConfiguration,
        Output<List<LicenseEntitlementArgs>> entitlements,
        Output<String> homeRegion,
        Output<LicenseIssuerDataArgs> issuer,
        @Nullable Output<List<LicenseMetadataArgs>> licenseMetadata,
        @Nullable Output<String> licenseName,
        Output<String> productName,
        @Nullable Output<String> productSKU,
        @Nullable Output<String> status,
        Output<LicenseValidityDateFormatArgs> validity) {
        this.beneficiary = beneficiary;
        this.consumptionConfiguration = Objects.requireNonNull(consumptionConfiguration, "expected parameter 'consumptionConfiguration' to be non-null");
        this.entitlements = Objects.requireNonNull(entitlements, "expected parameter 'entitlements' to be non-null");
        this.homeRegion = Objects.requireNonNull(homeRegion, "expected parameter 'homeRegion' to be non-null");
        this.issuer = Objects.requireNonNull(issuer, "expected parameter 'issuer' to be non-null");
        this.licenseMetadata = licenseMetadata;
        this.licenseName = licenseName;
        this.productName = Objects.requireNonNull(productName, "expected parameter 'productName' to be non-null");
        this.productSKU = productSKU;
        this.status = status;
        this.validity = Objects.requireNonNull(validity, "expected parameter 'validity' to be non-null");
    }

    private LicenseArgs() {
        this.beneficiary = Codegen.empty();
        this.consumptionConfiguration = Codegen.empty();
        this.entitlements = Codegen.empty();
        this.homeRegion = Codegen.empty();
        this.issuer = Codegen.empty();
        this.licenseMetadata = Codegen.empty();
        this.licenseName = Codegen.empty();
        this.productName = Codegen.empty();
        this.productSKU = Codegen.empty();
        this.status = Codegen.empty();
        this.validity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> beneficiary;
        private Output<LicenseConsumptionConfigurationArgs> consumptionConfiguration;
        private Output<List<LicenseEntitlementArgs>> entitlements;
        private Output<String> homeRegion;
        private Output<LicenseIssuerDataArgs> issuer;
        private @Nullable Output<List<LicenseMetadataArgs>> licenseMetadata;
        private @Nullable Output<String> licenseName;
        private Output<String> productName;
        private @Nullable Output<String> productSKU;
        private @Nullable Output<String> status;
        private Output<LicenseValidityDateFormatArgs> validity;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.beneficiary = defaults.beneficiary;
    	      this.consumptionConfiguration = defaults.consumptionConfiguration;
    	      this.entitlements = defaults.entitlements;
    	      this.homeRegion = defaults.homeRegion;
    	      this.issuer = defaults.issuer;
    	      this.licenseMetadata = defaults.licenseMetadata;
    	      this.licenseName = defaults.licenseName;
    	      this.productName = defaults.productName;
    	      this.productSKU = defaults.productSKU;
    	      this.status = defaults.status;
    	      this.validity = defaults.validity;
        }

        public Builder beneficiary(@Nullable Output<String> beneficiary) {
            this.beneficiary = beneficiary;
            return this;
        }
        public Builder beneficiary(@Nullable String beneficiary) {
            this.beneficiary = Codegen.ofNullable(beneficiary);
            return this;
        }
        public Builder consumptionConfiguration(Output<LicenseConsumptionConfigurationArgs> consumptionConfiguration) {
            this.consumptionConfiguration = Objects.requireNonNull(consumptionConfiguration);
            return this;
        }
        public Builder consumptionConfiguration(LicenseConsumptionConfigurationArgs consumptionConfiguration) {
            this.consumptionConfiguration = Output.of(Objects.requireNonNull(consumptionConfiguration));
            return this;
        }
        public Builder entitlements(Output<List<LicenseEntitlementArgs>> entitlements) {
            this.entitlements = Objects.requireNonNull(entitlements);
            return this;
        }
        public Builder entitlements(List<LicenseEntitlementArgs> entitlements) {
            this.entitlements = Output.of(Objects.requireNonNull(entitlements));
            return this;
        }
        public Builder entitlements(LicenseEntitlementArgs... entitlements) {
            return entitlements(List.of(entitlements));
        }
        public Builder homeRegion(Output<String> homeRegion) {
            this.homeRegion = Objects.requireNonNull(homeRegion);
            return this;
        }
        public Builder homeRegion(String homeRegion) {
            this.homeRegion = Output.of(Objects.requireNonNull(homeRegion));
            return this;
        }
        public Builder issuer(Output<LicenseIssuerDataArgs> issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public Builder issuer(LicenseIssuerDataArgs issuer) {
            this.issuer = Output.of(Objects.requireNonNull(issuer));
            return this;
        }
        public Builder licenseMetadata(@Nullable Output<List<LicenseMetadataArgs>> licenseMetadata) {
            this.licenseMetadata = licenseMetadata;
            return this;
        }
        public Builder licenseMetadata(@Nullable List<LicenseMetadataArgs> licenseMetadata) {
            this.licenseMetadata = Codegen.ofNullable(licenseMetadata);
            return this;
        }
        public Builder licenseMetadata(LicenseMetadataArgs... licenseMetadata) {
            return licenseMetadata(List.of(licenseMetadata));
        }
        public Builder licenseName(@Nullable Output<String> licenseName) {
            this.licenseName = licenseName;
            return this;
        }
        public Builder licenseName(@Nullable String licenseName) {
            this.licenseName = Codegen.ofNullable(licenseName);
            return this;
        }
        public Builder productName(Output<String> productName) {
            this.productName = Objects.requireNonNull(productName);
            return this;
        }
        public Builder productName(String productName) {
            this.productName = Output.of(Objects.requireNonNull(productName));
            return this;
        }
        public Builder productSKU(@Nullable Output<String> productSKU) {
            this.productSKU = productSKU;
            return this;
        }
        public Builder productSKU(@Nullable String productSKU) {
            this.productSKU = Codegen.ofNullable(productSKU);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder validity(Output<LicenseValidityDateFormatArgs> validity) {
            this.validity = Objects.requireNonNull(validity);
            return this;
        }
        public Builder validity(LicenseValidityDateFormatArgs validity) {
            this.validity = Output.of(Objects.requireNonNull(validity));
            return this;
        }        public LicenseArgs build() {
            return new LicenseArgs(beneficiary, consumptionConfiguration, entitlements, homeRegion, issuer, licenseMetadata, licenseName, productName, productSKU, status, validity);
        }
    }
}
