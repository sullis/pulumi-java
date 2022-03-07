// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.awsnative.acmpca.inputs.CertificateAuthorityCrlConfigurationArgs;
import io.pulumi.awsnative.acmpca.inputs.CertificateAuthorityOcspConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Certificate Authority revocation information.
 * 
 */
public final class CertificateAuthorityRevocationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityRevocationConfigurationArgs Empty = new CertificateAuthorityRevocationConfigurationArgs();

    @InputImport(name="crlConfiguration")
      private final @Nullable Input<CertificateAuthorityCrlConfigurationArgs> crlConfiguration;

    public Input<CertificateAuthorityCrlConfigurationArgs> getCrlConfiguration() {
        return this.crlConfiguration == null ? Input.empty() : this.crlConfiguration;
    }

    @InputImport(name="ocspConfiguration")
      private final @Nullable Input<CertificateAuthorityOcspConfigurationArgs> ocspConfiguration;

    public Input<CertificateAuthorityOcspConfigurationArgs> getOcspConfiguration() {
        return this.ocspConfiguration == null ? Input.empty() : this.ocspConfiguration;
    }

    public CertificateAuthorityRevocationConfigurationArgs(
        @Nullable Input<CertificateAuthorityCrlConfigurationArgs> crlConfiguration,
        @Nullable Input<CertificateAuthorityOcspConfigurationArgs> ocspConfiguration) {
        this.crlConfiguration = crlConfiguration;
        this.ocspConfiguration = ocspConfiguration;
    }

    private CertificateAuthorityRevocationConfigurationArgs() {
        this.crlConfiguration = Input.empty();
        this.ocspConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityRevocationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CertificateAuthorityCrlConfigurationArgs> crlConfiguration;
        private @Nullable Input<CertificateAuthorityOcspConfigurationArgs> ocspConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityRevocationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crlConfiguration = defaults.crlConfiguration;
    	      this.ocspConfiguration = defaults.ocspConfiguration;
        }

        public Builder setCrlConfiguration(@Nullable Input<CertificateAuthorityCrlConfigurationArgs> crlConfiguration) {
            this.crlConfiguration = crlConfiguration;
            return this;
        }

        public Builder setCrlConfiguration(@Nullable CertificateAuthorityCrlConfigurationArgs crlConfiguration) {
            this.crlConfiguration = Input.ofNullable(crlConfiguration);
            return this;
        }

        public Builder setOcspConfiguration(@Nullable Input<CertificateAuthorityOcspConfigurationArgs> ocspConfiguration) {
            this.ocspConfiguration = ocspConfiguration;
            return this;
        }

        public Builder setOcspConfiguration(@Nullable CertificateAuthorityOcspConfigurationArgs ocspConfiguration) {
            this.ocspConfiguration = Input.ofNullable(ocspConfiguration);
            return this;
        }
        public CertificateAuthorityRevocationConfigurationArgs build() {
            return new CertificateAuthorityRevocationConfigurationArgs(crlConfiguration, ocspConfiguration);
        }
    }
}