// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.SdsConfigResponse;
import io.pulumi.googlenative.compute_alpha.outputs.TlsCertificatePathsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TlsCertificateContextResponse {
    /**
     * Specifies the certificate and private key paths. This field is applicable only if tlsCertificateSource is set to USE_PATH.
     * 
     */
    private final TlsCertificatePathsResponse certificatePaths;
    /**
     * Defines how TLS certificates are obtained.
     * 
     */
    private final String certificateSource;
    /**
     * Specifies the config to retrieve certificates through SDS. This field is applicable only if tlsCertificateSource is set to USE_SDS.
     * 
     */
    private final SdsConfigResponse sdsConfig;

    @OutputCustomType.Constructor({"certificatePaths","certificateSource","sdsConfig"})
    private TlsCertificateContextResponse(
        TlsCertificatePathsResponse certificatePaths,
        String certificateSource,
        SdsConfigResponse sdsConfig) {
        this.certificatePaths = Objects.requireNonNull(certificatePaths);
        this.certificateSource = Objects.requireNonNull(certificateSource);
        this.sdsConfig = Objects.requireNonNull(sdsConfig);
    }

    /**
     * Specifies the certificate and private key paths. This field is applicable only if tlsCertificateSource is set to USE_PATH.
     * 
    */
    public TlsCertificatePathsResponse getCertificatePaths() {
        return this.certificatePaths;
    }
    /**
     * Defines how TLS certificates are obtained.
     * 
    */
    public String getCertificateSource() {
        return this.certificateSource;
    }
    /**
     * Specifies the config to retrieve certificates through SDS. This field is applicable only if tlsCertificateSource is set to USE_SDS.
     * 
    */
    public SdsConfigResponse getSdsConfig() {
        return this.sdsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsCertificateContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsCertificatePathsResponse certificatePaths;
        private String certificateSource;
        private SdsConfigResponse sdsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsCertificateContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificatePaths = defaults.certificatePaths;
    	      this.certificateSource = defaults.certificateSource;
    	      this.sdsConfig = defaults.sdsConfig;
        }

        public Builder setCertificatePaths(TlsCertificatePathsResponse certificatePaths) {
            this.certificatePaths = Objects.requireNonNull(certificatePaths);
            return this;
        }

        public Builder setCertificateSource(String certificateSource) {
            this.certificateSource = Objects.requireNonNull(certificateSource);
            return this;
        }

        public Builder setSdsConfig(SdsConfigResponse sdsConfig) {
            this.sdsConfig = Objects.requireNonNull(sdsConfig);
            return this;
        }
        public TlsCertificateContextResponse build() {
            return new TlsCertificateContextResponse(certificatePaths, certificateSource, sdsConfig);
        }
    }
}