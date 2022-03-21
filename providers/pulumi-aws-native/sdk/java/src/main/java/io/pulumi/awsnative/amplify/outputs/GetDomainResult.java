// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplify.outputs;

import io.pulumi.awsnative.amplify.outputs.DomainSubDomainSetting;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDomainResult {
    private final @Nullable String arn;
    private final @Nullable List<String> autoSubDomainCreationPatterns;
    private final @Nullable String autoSubDomainIAMRole;
    private final @Nullable String certificateRecord;
    private final @Nullable String domainStatus;
    private final @Nullable Boolean enableAutoSubDomain;
    private final @Nullable String statusReason;
    private final @Nullable List<DomainSubDomainSetting> subDomainSettings;

    @CustomType.Constructor
    private GetDomainResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("autoSubDomainCreationPatterns") @Nullable List<String> autoSubDomainCreationPatterns,
        @CustomType.Parameter("autoSubDomainIAMRole") @Nullable String autoSubDomainIAMRole,
        @CustomType.Parameter("certificateRecord") @Nullable String certificateRecord,
        @CustomType.Parameter("domainStatus") @Nullable String domainStatus,
        @CustomType.Parameter("enableAutoSubDomain") @Nullable Boolean enableAutoSubDomain,
        @CustomType.Parameter("statusReason") @Nullable String statusReason,
        @CustomType.Parameter("subDomainSettings") @Nullable List<DomainSubDomainSetting> subDomainSettings) {
        this.arn = arn;
        this.autoSubDomainCreationPatterns = autoSubDomainCreationPatterns;
        this.autoSubDomainIAMRole = autoSubDomainIAMRole;
        this.certificateRecord = certificateRecord;
        this.domainStatus = domainStatus;
        this.enableAutoSubDomain = enableAutoSubDomain;
        this.statusReason = statusReason;
        this.subDomainSettings = subDomainSettings;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public List<String> getAutoSubDomainCreationPatterns() {
        return this.autoSubDomainCreationPatterns == null ? List.of() : this.autoSubDomainCreationPatterns;
    }
    public Optional<String> getAutoSubDomainIAMRole() {
        return Optional.ofNullable(this.autoSubDomainIAMRole);
    }
    public Optional<String> getCertificateRecord() {
        return Optional.ofNullable(this.certificateRecord);
    }
    public Optional<String> getDomainStatus() {
        return Optional.ofNullable(this.domainStatus);
    }
    public Optional<Boolean> getEnableAutoSubDomain() {
        return Optional.ofNullable(this.enableAutoSubDomain);
    }
    public Optional<String> getStatusReason() {
        return Optional.ofNullable(this.statusReason);
    }
    public List<DomainSubDomainSetting> getSubDomainSettings() {
        return this.subDomainSettings == null ? List.of() : this.subDomainSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<String> autoSubDomainCreationPatterns;
        private @Nullable String autoSubDomainIAMRole;
        private @Nullable String certificateRecord;
        private @Nullable String domainStatus;
        private @Nullable Boolean enableAutoSubDomain;
        private @Nullable String statusReason;
        private @Nullable List<DomainSubDomainSetting> subDomainSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.autoSubDomainCreationPatterns = defaults.autoSubDomainCreationPatterns;
    	      this.autoSubDomainIAMRole = defaults.autoSubDomainIAMRole;
    	      this.certificateRecord = defaults.certificateRecord;
    	      this.domainStatus = defaults.domainStatus;
    	      this.enableAutoSubDomain = defaults.enableAutoSubDomain;
    	      this.statusReason = defaults.statusReason;
    	      this.subDomainSettings = defaults.subDomainSettings;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder autoSubDomainCreationPatterns(@Nullable List<String> autoSubDomainCreationPatterns) {
            this.autoSubDomainCreationPatterns = autoSubDomainCreationPatterns;
            return this;
        }
        public Builder autoSubDomainCreationPatterns(String... autoSubDomainCreationPatterns) {
            return autoSubDomainCreationPatterns(List.of(autoSubDomainCreationPatterns));
        }
        public Builder autoSubDomainIAMRole(@Nullable String autoSubDomainIAMRole) {
            this.autoSubDomainIAMRole = autoSubDomainIAMRole;
            return this;
        }
        public Builder certificateRecord(@Nullable String certificateRecord) {
            this.certificateRecord = certificateRecord;
            return this;
        }
        public Builder domainStatus(@Nullable String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public Builder enableAutoSubDomain(@Nullable Boolean enableAutoSubDomain) {
            this.enableAutoSubDomain = enableAutoSubDomain;
            return this;
        }
        public Builder statusReason(@Nullable String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public Builder subDomainSettings(@Nullable List<DomainSubDomainSetting> subDomainSettings) {
            this.subDomainSettings = subDomainSettings;
            return this;
        }
        public Builder subDomainSettings(DomainSubDomainSetting... subDomainSettings) {
            return subDomainSettings(List.of(subDomainSettings));
        }        public GetDomainResult build() {
            return new GetDomainResult(arn, autoSubDomainCreationPatterns, autoSubDomainIAMRole, certificateRecord, domainStatus, enableAutoSubDomain, statusReason, subDomainSettings);
        }
    }
}
