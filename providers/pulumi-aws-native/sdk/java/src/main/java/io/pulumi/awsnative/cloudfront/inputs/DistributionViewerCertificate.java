// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionViewerCertificate extends io.pulumi.resources.InvokeArgs {

    public static final DistributionViewerCertificate Empty = new DistributionViewerCertificate();

    @InputImport(name="acmCertificateArn")
    private final @Nullable String acmCertificateArn;

    public Optional<String> getAcmCertificateArn() {
        return this.acmCertificateArn == null ? Optional.empty() : Optional.ofNullable(this.acmCertificateArn);
    }

    @InputImport(name="cloudFrontDefaultCertificate")
    private final @Nullable Boolean cloudFrontDefaultCertificate;

    public Optional<Boolean> getCloudFrontDefaultCertificate() {
        return this.cloudFrontDefaultCertificate == null ? Optional.empty() : Optional.ofNullable(this.cloudFrontDefaultCertificate);
    }

    @InputImport(name="iamCertificateId")
    private final @Nullable String iamCertificateId;

    public Optional<String> getIamCertificateId() {
        return this.iamCertificateId == null ? Optional.empty() : Optional.ofNullable(this.iamCertificateId);
    }

    @InputImport(name="minimumProtocolVersion")
    private final @Nullable String minimumProtocolVersion;

    public Optional<String> getMinimumProtocolVersion() {
        return this.minimumProtocolVersion == null ? Optional.empty() : Optional.ofNullable(this.minimumProtocolVersion);
    }

    @InputImport(name="sslSupportMethod")
    private final @Nullable String sslSupportMethod;

    public Optional<String> getSslSupportMethod() {
        return this.sslSupportMethod == null ? Optional.empty() : Optional.ofNullable(this.sslSupportMethod);
    }

    public DistributionViewerCertificate(
        @Nullable String acmCertificateArn,
        @Nullable Boolean cloudFrontDefaultCertificate,
        @Nullable String iamCertificateId,
        @Nullable String minimumProtocolVersion,
        @Nullable String sslSupportMethod) {
        this.acmCertificateArn = acmCertificateArn;
        this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
        this.iamCertificateId = iamCertificateId;
        this.minimumProtocolVersion = minimumProtocolVersion;
        this.sslSupportMethod = sslSupportMethod;
    }

    private DistributionViewerCertificate() {
        this.acmCertificateArn = null;
        this.cloudFrontDefaultCertificate = null;
        this.iamCertificateId = null;
        this.minimumProtocolVersion = null;
        this.sslSupportMethod = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionViewerCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acmCertificateArn;
        private @Nullable Boolean cloudFrontDefaultCertificate;
        private @Nullable String iamCertificateId;
        private @Nullable String minimumProtocolVersion;
        private @Nullable String sslSupportMethod;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionViewerCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acmCertificateArn = defaults.acmCertificateArn;
    	      this.cloudFrontDefaultCertificate = defaults.cloudFrontDefaultCertificate;
    	      this.iamCertificateId = defaults.iamCertificateId;
    	      this.minimumProtocolVersion = defaults.minimumProtocolVersion;
    	      this.sslSupportMethod = defaults.sslSupportMethod;
        }

        public Builder setAcmCertificateArn(@Nullable String acmCertificateArn) {
            this.acmCertificateArn = acmCertificateArn;
            return this;
        }

        public Builder setCloudFrontDefaultCertificate(@Nullable Boolean cloudFrontDefaultCertificate) {
            this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
            return this;
        }

        public Builder setIamCertificateId(@Nullable String iamCertificateId) {
            this.iamCertificateId = iamCertificateId;
            return this;
        }

        public Builder setMinimumProtocolVersion(@Nullable String minimumProtocolVersion) {
            this.minimumProtocolVersion = minimumProtocolVersion;
            return this;
        }

        public Builder setSslSupportMethod(@Nullable String sslSupportMethod) {
            this.sslSupportMethod = sslSupportMethod;
            return this;
        }

        public DistributionViewerCertificate build() {
            return new DistributionViewerCertificate(acmCertificateArn, cloudFrontDefaultCertificate, iamCertificateId, minimumProtocolVersion, sslSupportMethod);
        }
    }
}
