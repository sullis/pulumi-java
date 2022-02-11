// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateAuthorityOcspConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final CertificateAuthorityOcspConfiguration Empty = new CertificateAuthorityOcspConfiguration();

    @InputImport(name="enabled")
    private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    @InputImport(name="ocspCustomCname")
    private final @Nullable String ocspCustomCname;

    public Optional<String> getOcspCustomCname() {
        return this.ocspCustomCname == null ? Optional.empty() : Optional.ofNullable(this.ocspCustomCname);
    }

    public CertificateAuthorityOcspConfiguration(
        @Nullable Boolean enabled,
        @Nullable String ocspCustomCname) {
        this.enabled = enabled;
        this.ocspCustomCname = ocspCustomCname;
    }

    private CertificateAuthorityOcspConfiguration() {
        this.enabled = null;
        this.ocspCustomCname = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityOcspConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String ocspCustomCname;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityOcspConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.ocspCustomCname = defaults.ocspCustomCname;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setOcspCustomCname(@Nullable String ocspCustomCname) {
            this.ocspCustomCname = ocspCustomCname;
            return this;
        }

        public CertificateAuthorityOcspConfiguration build() {
            return new CertificateAuthorityOcspConfiguration(enabled, ocspCustomCname);
        }
    }
}
