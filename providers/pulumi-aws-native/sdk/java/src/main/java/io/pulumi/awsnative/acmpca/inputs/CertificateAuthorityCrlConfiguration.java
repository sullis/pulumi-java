// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateAuthorityCrlConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final CertificateAuthorityCrlConfiguration Empty = new CertificateAuthorityCrlConfiguration();

    @InputImport(name="customCname")
    private final @Nullable String customCname;

    public Optional<String> getCustomCname() {
        return this.customCname == null ? Optional.empty() : Optional.ofNullable(this.customCname);
    }

    @InputImport(name="enabled")
    private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    @InputImport(name="expirationInDays")
    private final @Nullable Integer expirationInDays;

    public Optional<Integer> getExpirationInDays() {
        return this.expirationInDays == null ? Optional.empty() : Optional.ofNullable(this.expirationInDays);
    }

    @InputImport(name="s3BucketName")
    private final @Nullable String s3BucketName;

    public Optional<String> getS3BucketName() {
        return this.s3BucketName == null ? Optional.empty() : Optional.ofNullable(this.s3BucketName);
    }

    @InputImport(name="s3ObjectAcl")
    private final @Nullable String s3ObjectAcl;

    public Optional<String> getS3ObjectAcl() {
        return this.s3ObjectAcl == null ? Optional.empty() : Optional.ofNullable(this.s3ObjectAcl);
    }

    public CertificateAuthorityCrlConfiguration(
        @Nullable String customCname,
        @Nullable Boolean enabled,
        @Nullable Integer expirationInDays,
        @Nullable String s3BucketName,
        @Nullable String s3ObjectAcl) {
        this.customCname = customCname;
        this.enabled = enabled;
        this.expirationInDays = expirationInDays;
        this.s3BucketName = s3BucketName;
        this.s3ObjectAcl = s3ObjectAcl;
    }

    private CertificateAuthorityCrlConfiguration() {
        this.customCname = null;
        this.enabled = null;
        this.expirationInDays = null;
        this.s3BucketName = null;
        this.s3ObjectAcl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityCrlConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customCname;
        private @Nullable Boolean enabled;
        private @Nullable Integer expirationInDays;
        private @Nullable String s3BucketName;
        private @Nullable String s3ObjectAcl;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityCrlConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customCname = defaults.customCname;
    	      this.enabled = defaults.enabled;
    	      this.expirationInDays = defaults.expirationInDays;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3ObjectAcl = defaults.s3ObjectAcl;
        }

        public Builder setCustomCname(@Nullable String customCname) {
            this.customCname = customCname;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setExpirationInDays(@Nullable Integer expirationInDays) {
            this.expirationInDays = expirationInDays;
            return this;
        }

        public Builder setS3BucketName(@Nullable String s3BucketName) {
            this.s3BucketName = s3BucketName;
            return this;
        }

        public Builder setS3ObjectAcl(@Nullable String s3ObjectAcl) {
            this.s3ObjectAcl = s3ObjectAcl;
            return this;
        }

        public CertificateAuthorityCrlConfiguration build() {
            return new CertificateAuthorityCrlConfiguration(customCname, enabled, expirationInDays, s3BucketName, s3ObjectAcl);
        }
    }
}
