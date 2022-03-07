// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1beta1.inputs.AllowedConfigListArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.AllowedSubjectAltNamesArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.IssuanceModesArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.ReusableConfigWrapperArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.SubjectArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The issuing policy for a CertificateAuthority. Certificates will not be successfully issued from this CertificateAuthority if they violate the policy.
 * 
 */
public final class CertificateAuthorityPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityPolicyArgs Empty = new CertificateAuthorityPolicyArgs();

    /**
     * Optional. If any value is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed value. If no value is specified, all values will be allowed for this fied. Glob patterns are also supported.
     * 
     */
    @InputImport(name="allowedCommonNames")
      private final @Nullable Input<List<String>> allowedCommonNames;

    public Input<List<String>> getAllowedCommonNames() {
        return this.allowedCommonNames == null ? Input.empty() : this.allowedCommonNames;
    }

    /**
     * Optional. All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper in the list.
     * 
     */
    @InputImport(name="allowedConfigList")
      private final @Nullable Input<AllowedConfigListArgs> allowedConfigList;

    public Input<AllowedConfigListArgs> getAllowedConfigList() {
        return this.allowedConfigList == null ? Input.empty() : this.allowedConfigList;
    }

    /**
     * Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue Certificates.
     * 
     */
    @InputImport(name="allowedIssuanceModes")
      private final @Nullable Input<IssuanceModesArgs> allowedIssuanceModes;

    public Input<IssuanceModesArgs> getAllowedIssuanceModes() {
        return this.allowedIssuanceModes == null ? Input.empty() : this.allowedIssuanceModes;
    }

    /**
     * Optional. If any Subject is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed Subject. If a Subject has an empty field, any value will be allowed for that field.
     * 
     */
    @InputImport(name="allowedLocationsAndOrganizations")
      private final @Nullable Input<List<SubjectArgs>> allowedLocationsAndOrganizations;

    public Input<List<SubjectArgs>> getAllowedLocationsAndOrganizations() {
        return this.allowedLocationsAndOrganizations == null ? Input.empty() : this.allowedLocationsAndOrganizations;
    }

    /**
     * Optional. If a AllowedSubjectAltNames is specified here, then all Certificates issued by the CertificateAuthority must match AllowedSubjectAltNames. If no value or an empty value is specified, any value will be allowed for the SubjectAltNames field.
     * 
     */
    @InputImport(name="allowedSans")
      private final @Nullable Input<AllowedSubjectAltNamesArgs> allowedSans;

    public Input<AllowedSubjectAltNamesArgs> getAllowedSans() {
        return this.allowedSans == null ? Input.empty() : this.allowedSans;
    }

    /**
     * Optional. The maximum lifetime allowed by the CertificateAuthority. Note that if the any part if the issuing chain expires before a Certificate's requested maximum_lifetime, the effective lifetime will be explicitly truncated.
     * 
     */
    @InputImport(name="maximumLifetime")
      private final @Nullable Input<String> maximumLifetime;

    public Input<String> getMaximumLifetime() {
        return this.maximumLifetime == null ? Input.empty() : this.maximumLifetime;
    }

    /**
     * Optional. All Certificates issued by the CertificateAuthority will use the provided configuration values, overwriting any requested configuration values.
     * 
     */
    @InputImport(name="overwriteConfigValues")
      private final @Nullable Input<ReusableConfigWrapperArgs> overwriteConfigValues;

    public Input<ReusableConfigWrapperArgs> getOverwriteConfigValues() {
        return this.overwriteConfigValues == null ? Input.empty() : this.overwriteConfigValues;
    }

    public CertificateAuthorityPolicyArgs(
        @Nullable Input<List<String>> allowedCommonNames,
        @Nullable Input<AllowedConfigListArgs> allowedConfigList,
        @Nullable Input<IssuanceModesArgs> allowedIssuanceModes,
        @Nullable Input<List<SubjectArgs>> allowedLocationsAndOrganizations,
        @Nullable Input<AllowedSubjectAltNamesArgs> allowedSans,
        @Nullable Input<String> maximumLifetime,
        @Nullable Input<ReusableConfigWrapperArgs> overwriteConfigValues) {
        this.allowedCommonNames = allowedCommonNames;
        this.allowedConfigList = allowedConfigList;
        this.allowedIssuanceModes = allowedIssuanceModes;
        this.allowedLocationsAndOrganizations = allowedLocationsAndOrganizations;
        this.allowedSans = allowedSans;
        this.maximumLifetime = maximumLifetime;
        this.overwriteConfigValues = overwriteConfigValues;
    }

    private CertificateAuthorityPolicyArgs() {
        this.allowedCommonNames = Input.empty();
        this.allowedConfigList = Input.empty();
        this.allowedIssuanceModes = Input.empty();
        this.allowedLocationsAndOrganizations = Input.empty();
        this.allowedSans = Input.empty();
        this.maximumLifetime = Input.empty();
        this.overwriteConfigValues = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> allowedCommonNames;
        private @Nullable Input<AllowedConfigListArgs> allowedConfigList;
        private @Nullable Input<IssuanceModesArgs> allowedIssuanceModes;
        private @Nullable Input<List<SubjectArgs>> allowedLocationsAndOrganizations;
        private @Nullable Input<AllowedSubjectAltNamesArgs> allowedSans;
        private @Nullable Input<String> maximumLifetime;
        private @Nullable Input<ReusableConfigWrapperArgs> overwriteConfigValues;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedCommonNames = defaults.allowedCommonNames;
    	      this.allowedConfigList = defaults.allowedConfigList;
    	      this.allowedIssuanceModes = defaults.allowedIssuanceModes;
    	      this.allowedLocationsAndOrganizations = defaults.allowedLocationsAndOrganizations;
    	      this.allowedSans = defaults.allowedSans;
    	      this.maximumLifetime = defaults.maximumLifetime;
    	      this.overwriteConfigValues = defaults.overwriteConfigValues;
        }

        public Builder setAllowedCommonNames(@Nullable Input<List<String>> allowedCommonNames) {
            this.allowedCommonNames = allowedCommonNames;
            return this;
        }

        public Builder setAllowedCommonNames(@Nullable List<String> allowedCommonNames) {
            this.allowedCommonNames = Input.ofNullable(allowedCommonNames);
            return this;
        }

        public Builder setAllowedConfigList(@Nullable Input<AllowedConfigListArgs> allowedConfigList) {
            this.allowedConfigList = allowedConfigList;
            return this;
        }

        public Builder setAllowedConfigList(@Nullable AllowedConfigListArgs allowedConfigList) {
            this.allowedConfigList = Input.ofNullable(allowedConfigList);
            return this;
        }

        public Builder setAllowedIssuanceModes(@Nullable Input<IssuanceModesArgs> allowedIssuanceModes) {
            this.allowedIssuanceModes = allowedIssuanceModes;
            return this;
        }

        public Builder setAllowedIssuanceModes(@Nullable IssuanceModesArgs allowedIssuanceModes) {
            this.allowedIssuanceModes = Input.ofNullable(allowedIssuanceModes);
            return this;
        }

        public Builder setAllowedLocationsAndOrganizations(@Nullable Input<List<SubjectArgs>> allowedLocationsAndOrganizations) {
            this.allowedLocationsAndOrganizations = allowedLocationsAndOrganizations;
            return this;
        }

        public Builder setAllowedLocationsAndOrganizations(@Nullable List<SubjectArgs> allowedLocationsAndOrganizations) {
            this.allowedLocationsAndOrganizations = Input.ofNullable(allowedLocationsAndOrganizations);
            return this;
        }

        public Builder setAllowedSans(@Nullable Input<AllowedSubjectAltNamesArgs> allowedSans) {
            this.allowedSans = allowedSans;
            return this;
        }

        public Builder setAllowedSans(@Nullable AllowedSubjectAltNamesArgs allowedSans) {
            this.allowedSans = Input.ofNullable(allowedSans);
            return this;
        }

        public Builder setMaximumLifetime(@Nullable Input<String> maximumLifetime) {
            this.maximumLifetime = maximumLifetime;
            return this;
        }

        public Builder setMaximumLifetime(@Nullable String maximumLifetime) {
            this.maximumLifetime = Input.ofNullable(maximumLifetime);
            return this;
        }

        public Builder setOverwriteConfigValues(@Nullable Input<ReusableConfigWrapperArgs> overwriteConfigValues) {
            this.overwriteConfigValues = overwriteConfigValues;
            return this;
        }

        public Builder setOverwriteConfigValues(@Nullable ReusableConfigWrapperArgs overwriteConfigValues) {
            this.overwriteConfigValues = Input.ofNullable(overwriteConfigValues);
            return this;
        }
        public CertificateAuthorityPolicyArgs build() {
            return new CertificateAuthorityPolicyArgs(allowedCommonNames, allowedConfigList, allowedIssuanceModes, allowedLocationsAndOrganizations, allowedSans, maximumLifetime, overwriteConfigValues);
        }
    }
}