// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateAuthorityCrlConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityCrlConfigurationArgs Empty = new CertificateAuthorityCrlConfigurationArgs();

    @InputImport(name="customCname")
    private final @Nullable Input<String> customCname;

    public Input<String> getCustomCname() {
        return this.customCname == null ? Input.empty() : this.customCname;
    }

    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="expirationInDays")
    private final @Nullable Input<Integer> expirationInDays;

    public Input<Integer> getExpirationInDays() {
        return this.expirationInDays == null ? Input.empty() : this.expirationInDays;
    }

    @InputImport(name="s3BucketName")
    private final @Nullable Input<String> s3BucketName;

    public Input<String> getS3BucketName() {
        return this.s3BucketName == null ? Input.empty() : this.s3BucketName;
    }

    @InputImport(name="s3ObjectAcl")
    private final @Nullable Input<String> s3ObjectAcl;

    public Input<String> getS3ObjectAcl() {
        return this.s3ObjectAcl == null ? Input.empty() : this.s3ObjectAcl;
    }

    public CertificateAuthorityCrlConfigurationArgs(
        @Nullable Input<String> customCname,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Integer> expirationInDays,
        @Nullable Input<String> s3BucketName,
        @Nullable Input<String> s3ObjectAcl) {
        this.customCname = customCname;
        this.enabled = enabled;
        this.expirationInDays = expirationInDays;
        this.s3BucketName = s3BucketName;
        this.s3ObjectAcl = s3ObjectAcl;
    }

    private CertificateAuthorityCrlConfigurationArgs() {
        this.customCname = Input.empty();
        this.enabled = Input.empty();
        this.expirationInDays = Input.empty();
        this.s3BucketName = Input.empty();
        this.s3ObjectAcl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityCrlConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> customCname;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Integer> expirationInDays;
        private @Nullable Input<String> s3BucketName;
        private @Nullable Input<String> s3ObjectAcl;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityCrlConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customCname = defaults.customCname;
    	      this.enabled = defaults.enabled;
    	      this.expirationInDays = defaults.expirationInDays;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3ObjectAcl = defaults.s3ObjectAcl;
        }

        public Builder setCustomCname(@Nullable Input<String> customCname) {
            this.customCname = customCname;
            return this;
        }

        public Builder setCustomCname(@Nullable String customCname) {
            this.customCname = Input.ofNullable(customCname);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setExpirationInDays(@Nullable Input<Integer> expirationInDays) {
            this.expirationInDays = expirationInDays;
            return this;
        }

        public Builder setExpirationInDays(@Nullable Integer expirationInDays) {
            this.expirationInDays = Input.ofNullable(expirationInDays);
            return this;
        }

        public Builder setS3BucketName(@Nullable Input<String> s3BucketName) {
            this.s3BucketName = s3BucketName;
            return this;
        }

        public Builder setS3BucketName(@Nullable String s3BucketName) {
            this.s3BucketName = Input.ofNullable(s3BucketName);
            return this;
        }

        public Builder setS3ObjectAcl(@Nullable Input<String> s3ObjectAcl) {
            this.s3ObjectAcl = s3ObjectAcl;
            return this;
        }

        public Builder setS3ObjectAcl(@Nullable String s3ObjectAcl) {
            this.s3ObjectAcl = Input.ofNullable(s3ObjectAcl);
            return this;
        }

        public CertificateAuthorityCrlConfigurationArgs build() {
            return new CertificateAuthorityCrlConfigurationArgs(customCname, enabled, expirationInDays, s3BucketName, s3ObjectAcl);
        }
    }
}
