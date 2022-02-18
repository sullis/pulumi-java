// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.awsnative.apigateway.outputs.DomainNameEndpointConfiguration;
import io.pulumi.awsnative.apigateway.outputs.DomainNameMutualTlsAuthentication;
import io.pulumi.awsnative.apigateway.outputs.DomainNameTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDomainNameResult {
    private final @Nullable String certificateArn;
    private final @Nullable String distributionDomainName;
    private final @Nullable String distributionHostedZoneId;
    private final @Nullable DomainNameEndpointConfiguration endpointConfiguration;
    private final @Nullable DomainNameMutualTlsAuthentication mutualTlsAuthentication;
    private final @Nullable String ownershipVerificationCertificateArn;
    private final @Nullable String regionalCertificateArn;
    private final @Nullable String regionalDomainName;
    private final @Nullable String regionalHostedZoneId;
    private final @Nullable String securityPolicy;
    private final @Nullable List<DomainNameTag> tags;

    @OutputCustomType.Constructor({"certificateArn","distributionDomainName","distributionHostedZoneId","endpointConfiguration","mutualTlsAuthentication","ownershipVerificationCertificateArn","regionalCertificateArn","regionalDomainName","regionalHostedZoneId","securityPolicy","tags"})
    private GetDomainNameResult(
        @Nullable String certificateArn,
        @Nullable String distributionDomainName,
        @Nullable String distributionHostedZoneId,
        @Nullable DomainNameEndpointConfiguration endpointConfiguration,
        @Nullable DomainNameMutualTlsAuthentication mutualTlsAuthentication,
        @Nullable String ownershipVerificationCertificateArn,
        @Nullable String regionalCertificateArn,
        @Nullable String regionalDomainName,
        @Nullable String regionalHostedZoneId,
        @Nullable String securityPolicy,
        @Nullable List<DomainNameTag> tags) {
        this.certificateArn = certificateArn;
        this.distributionDomainName = distributionDomainName;
        this.distributionHostedZoneId = distributionHostedZoneId;
        this.endpointConfiguration = endpointConfiguration;
        this.mutualTlsAuthentication = mutualTlsAuthentication;
        this.ownershipVerificationCertificateArn = ownershipVerificationCertificateArn;
        this.regionalCertificateArn = regionalCertificateArn;
        this.regionalDomainName = regionalDomainName;
        this.regionalHostedZoneId = regionalHostedZoneId;
        this.securityPolicy = securityPolicy;
        this.tags = tags;
    }

    public Optional<String> getCertificateArn() {
        return Optional.ofNullable(this.certificateArn);
    }
    public Optional<String> getDistributionDomainName() {
        return Optional.ofNullable(this.distributionDomainName);
    }
    public Optional<String> getDistributionHostedZoneId() {
        return Optional.ofNullable(this.distributionHostedZoneId);
    }
    public Optional<DomainNameEndpointConfiguration> getEndpointConfiguration() {
        return Optional.ofNullable(this.endpointConfiguration);
    }
    public Optional<DomainNameMutualTlsAuthentication> getMutualTlsAuthentication() {
        return Optional.ofNullable(this.mutualTlsAuthentication);
    }
    public Optional<String> getOwnershipVerificationCertificateArn() {
        return Optional.ofNullable(this.ownershipVerificationCertificateArn);
    }
    public Optional<String> getRegionalCertificateArn() {
        return Optional.ofNullable(this.regionalCertificateArn);
    }
    public Optional<String> getRegionalDomainName() {
        return Optional.ofNullable(this.regionalDomainName);
    }
    public Optional<String> getRegionalHostedZoneId() {
        return Optional.ofNullable(this.regionalHostedZoneId);
    }
    public Optional<String> getSecurityPolicy() {
        return Optional.ofNullable(this.securityPolicy);
    }
    public List<DomainNameTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainNameResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateArn;
        private @Nullable String distributionDomainName;
        private @Nullable String distributionHostedZoneId;
        private @Nullable DomainNameEndpointConfiguration endpointConfiguration;
        private @Nullable DomainNameMutualTlsAuthentication mutualTlsAuthentication;
        private @Nullable String ownershipVerificationCertificateArn;
        private @Nullable String regionalCertificateArn;
        private @Nullable String regionalDomainName;
        private @Nullable String regionalHostedZoneId;
        private @Nullable String securityPolicy;
        private @Nullable List<DomainNameTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainNameResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.distributionDomainName = defaults.distributionDomainName;
    	      this.distributionHostedZoneId = defaults.distributionHostedZoneId;
    	      this.endpointConfiguration = defaults.endpointConfiguration;
    	      this.mutualTlsAuthentication = defaults.mutualTlsAuthentication;
    	      this.ownershipVerificationCertificateArn = defaults.ownershipVerificationCertificateArn;
    	      this.regionalCertificateArn = defaults.regionalCertificateArn;
    	      this.regionalDomainName = defaults.regionalDomainName;
    	      this.regionalHostedZoneId = defaults.regionalHostedZoneId;
    	      this.securityPolicy = defaults.securityPolicy;
    	      this.tags = defaults.tags;
        }

        public Builder setCertificateArn(@Nullable String certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        public Builder setDistributionDomainName(@Nullable String distributionDomainName) {
            this.distributionDomainName = distributionDomainName;
            return this;
        }

        public Builder setDistributionHostedZoneId(@Nullable String distributionHostedZoneId) {
            this.distributionHostedZoneId = distributionHostedZoneId;
            return this;
        }

        public Builder setEndpointConfiguration(@Nullable DomainNameEndpointConfiguration endpointConfiguration) {
            this.endpointConfiguration = endpointConfiguration;
            return this;
        }

        public Builder setMutualTlsAuthentication(@Nullable DomainNameMutualTlsAuthentication mutualTlsAuthentication) {
            this.mutualTlsAuthentication = mutualTlsAuthentication;
            return this;
        }

        public Builder setOwnershipVerificationCertificateArn(@Nullable String ownershipVerificationCertificateArn) {
            this.ownershipVerificationCertificateArn = ownershipVerificationCertificateArn;
            return this;
        }

        public Builder setRegionalCertificateArn(@Nullable String regionalCertificateArn) {
            this.regionalCertificateArn = regionalCertificateArn;
            return this;
        }

        public Builder setRegionalDomainName(@Nullable String regionalDomainName) {
            this.regionalDomainName = regionalDomainName;
            return this;
        }

        public Builder setRegionalHostedZoneId(@Nullable String regionalHostedZoneId) {
            this.regionalHostedZoneId = regionalHostedZoneId;
            return this;
        }

        public Builder setSecurityPolicy(@Nullable String securityPolicy) {
            this.securityPolicy = securityPolicy;
            return this;
        }

        public Builder setTags(@Nullable List<DomainNameTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetDomainNameResult build() {
            return new GetDomainNameResult(certificateArn, distributionDomainName, distributionHostedZoneId, endpointConfiguration, mutualTlsAuthentication, ownershipVerificationCertificateArn, regionalCertificateArn, regionalDomainName, regionalHostedZoneId, securityPolicy, tags);
        }
    }
}
