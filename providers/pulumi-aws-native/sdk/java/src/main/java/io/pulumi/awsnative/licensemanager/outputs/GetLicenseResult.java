// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager.outputs;

import io.pulumi.awsnative.licensemanager.outputs.LicenseConsumptionConfiguration;
import io.pulumi.awsnative.licensemanager.outputs.LicenseEntitlement;
import io.pulumi.awsnative.licensemanager.outputs.LicenseIssuerData;
import io.pulumi.awsnative.licensemanager.outputs.LicenseMetadata;
import io.pulumi.awsnative.licensemanager.outputs.LicenseValidityDateFormat;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLicenseResult {
    /**
     * Beneficiary of the license.
     * 
     */
    private final @Nullable String beneficiary;
    private final @Nullable LicenseConsumptionConfiguration consumptionConfiguration;
    private final @Nullable List<LicenseEntitlement> entitlements;
    /**
     * Home region for the created license.
     * 
     */
    private final @Nullable String homeRegion;
    private final @Nullable LicenseIssuerData issuer;
    /**
     * Amazon Resource Name is a unique name for each resource.
     * 
     */
    private final @Nullable String licenseArn;
    private final @Nullable List<LicenseMetadata> licenseMetadata;
    /**
     * Name for the created license.
     * 
     */
    private final @Nullable String licenseName;
    /**
     * Product name for the created license.
     * 
     */
    private final @Nullable String productName;
    /**
     * ProductSKU of the license.
     * 
     */
    private final @Nullable String productSKU;
    private final @Nullable LicenseValidityDateFormat validity;
    /**
     * The version of the license.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor
    private GetLicenseResult(
        @OutputCustomType.Parameter("beneficiary") @Nullable String beneficiary,
        @OutputCustomType.Parameter("consumptionConfiguration") @Nullable LicenseConsumptionConfiguration consumptionConfiguration,
        @OutputCustomType.Parameter("entitlements") @Nullable List<LicenseEntitlement> entitlements,
        @OutputCustomType.Parameter("homeRegion") @Nullable String homeRegion,
        @OutputCustomType.Parameter("issuer") @Nullable LicenseIssuerData issuer,
        @OutputCustomType.Parameter("licenseArn") @Nullable String licenseArn,
        @OutputCustomType.Parameter("licenseMetadata") @Nullable List<LicenseMetadata> licenseMetadata,
        @OutputCustomType.Parameter("licenseName") @Nullable String licenseName,
        @OutputCustomType.Parameter("productName") @Nullable String productName,
        @OutputCustomType.Parameter("productSKU") @Nullable String productSKU,
        @OutputCustomType.Parameter("validity") @Nullable LicenseValidityDateFormat validity,
        @OutputCustomType.Parameter("version") @Nullable String version) {
        this.beneficiary = beneficiary;
        this.consumptionConfiguration = consumptionConfiguration;
        this.entitlements = entitlements;
        this.homeRegion = homeRegion;
        this.issuer = issuer;
        this.licenseArn = licenseArn;
        this.licenseMetadata = licenseMetadata;
        this.licenseName = licenseName;
        this.productName = productName;
        this.productSKU = productSKU;
        this.validity = validity;
        this.version = version;
    }

    /**
     * Beneficiary of the license.
     * 
    */
    public Optional<String> getBeneficiary() {
        return Optional.ofNullable(this.beneficiary);
    }
    public Optional<LicenseConsumptionConfiguration> getConsumptionConfiguration() {
        return Optional.ofNullable(this.consumptionConfiguration);
    }
    public List<LicenseEntitlement> getEntitlements() {
        return this.entitlements == null ? List.of() : this.entitlements;
    }
    /**
     * Home region for the created license.
     * 
    */
    public Optional<String> getHomeRegion() {
        return Optional.ofNullable(this.homeRegion);
    }
    public Optional<LicenseIssuerData> getIssuer() {
        return Optional.ofNullable(this.issuer);
    }
    /**
     * Amazon Resource Name is a unique name for each resource.
     * 
    */
    public Optional<String> getLicenseArn() {
        return Optional.ofNullable(this.licenseArn);
    }
    public List<LicenseMetadata> getLicenseMetadata() {
        return this.licenseMetadata == null ? List.of() : this.licenseMetadata;
    }
    /**
     * Name for the created license.
     * 
    */
    public Optional<String> getLicenseName() {
        return Optional.ofNullable(this.licenseName);
    }
    /**
     * Product name for the created license.
     * 
    */
    public Optional<String> getProductName() {
        return Optional.ofNullable(this.productName);
    }
    /**
     * ProductSKU of the license.
     * 
    */
    public Optional<String> getProductSKU() {
        return Optional.ofNullable(this.productSKU);
    }
    public Optional<LicenseValidityDateFormat> getValidity() {
        return Optional.ofNullable(this.validity);
    }
    /**
     * The version of the license.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicenseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String beneficiary;
        private @Nullable LicenseConsumptionConfiguration consumptionConfiguration;
        private @Nullable List<LicenseEntitlement> entitlements;
        private @Nullable String homeRegion;
        private @Nullable LicenseIssuerData issuer;
        private @Nullable String licenseArn;
        private @Nullable List<LicenseMetadata> licenseMetadata;
        private @Nullable String licenseName;
        private @Nullable String productName;
        private @Nullable String productSKU;
        private @Nullable LicenseValidityDateFormat validity;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLicenseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.beneficiary = defaults.beneficiary;
    	      this.consumptionConfiguration = defaults.consumptionConfiguration;
    	      this.entitlements = defaults.entitlements;
    	      this.homeRegion = defaults.homeRegion;
    	      this.issuer = defaults.issuer;
    	      this.licenseArn = defaults.licenseArn;
    	      this.licenseMetadata = defaults.licenseMetadata;
    	      this.licenseName = defaults.licenseName;
    	      this.productName = defaults.productName;
    	      this.productSKU = defaults.productSKU;
    	      this.validity = defaults.validity;
    	      this.version = defaults.version;
        }

        public Builder setBeneficiary(@Nullable String beneficiary) {
            this.beneficiary = beneficiary;
            return this;
        }

        public Builder setConsumptionConfiguration(@Nullable LicenseConsumptionConfiguration consumptionConfiguration) {
            this.consumptionConfiguration = consumptionConfiguration;
            return this;
        }

        public Builder setEntitlements(@Nullable List<LicenseEntitlement> entitlements) {
            this.entitlements = entitlements;
            return this;
        }

        public Builder setHomeRegion(@Nullable String homeRegion) {
            this.homeRegion = homeRegion;
            return this;
        }

        public Builder setIssuer(@Nullable LicenseIssuerData issuer) {
            this.issuer = issuer;
            return this;
        }

        public Builder setLicenseArn(@Nullable String licenseArn) {
            this.licenseArn = licenseArn;
            return this;
        }

        public Builder setLicenseMetadata(@Nullable List<LicenseMetadata> licenseMetadata) {
            this.licenseMetadata = licenseMetadata;
            return this;
        }

        public Builder setLicenseName(@Nullable String licenseName) {
            this.licenseName = licenseName;
            return this;
        }

        public Builder setProductName(@Nullable String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setProductSKU(@Nullable String productSKU) {
            this.productSKU = productSKU;
            return this;
        }

        public Builder setValidity(@Nullable LicenseValidityDateFormat validity) {
            this.validity = validity;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public GetLicenseResult build() {
            return new GetLicenseResult(beneficiary, consumptionConfiguration, entitlements, homeRegion, issuer, licenseArn, licenseMetadata, licenseName, productName, productSKU, validity, version);
        }
    }
}
