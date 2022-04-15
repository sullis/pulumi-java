// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateAuthorityRevocationConfigurationCrlConfiguration {
    /**
     * Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public. Must be less than or equal to 253 characters in length.
     * 
     */
    private final @Nullable String customCname;
    /**
     * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Number of days until a certificate expires. Must be between 1 and 5000.
     * 
     */
    private final Integer expirationInDays;
    /**
     * Name of the S3 bucket that contains the CRL. If you do not provide a value for the `custom_cname` argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You must specify a bucket policy that allows ACM PCA to write the CRL to your bucket. Must be less than or equal to 255 characters in length.
     * 
     */
    private final @Nullable String s3BucketName;
    /**
     * Determines whether the CRL will be publicly readable or privately held in the CRL Amazon S3 bucket. Defaults to `PUBLIC_READ`.
     * 
     */
    private final @Nullable String s3ObjectAcl;

    @CustomType.Constructor
    private CertificateAuthorityRevocationConfigurationCrlConfiguration(
        @CustomType.Parameter("customCname") @Nullable String customCname,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("expirationInDays") Integer expirationInDays,
        @CustomType.Parameter("s3BucketName") @Nullable String s3BucketName,
        @CustomType.Parameter("s3ObjectAcl") @Nullable String s3ObjectAcl) {
        this.customCname = customCname;
        this.enabled = enabled;
        this.expirationInDays = expirationInDays;
        this.s3BucketName = s3BucketName;
        this.s3ObjectAcl = s3ObjectAcl;
    }

    /**
     * Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public. Must be less than or equal to 253 characters in length.
     * 
    */
    public Optional<String> customCname() {
        return Optional.ofNullable(this.customCname);
    }
    /**
     * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Number of days until a certificate expires. Must be between 1 and 5000.
     * 
    */
    public Integer expirationInDays() {
        return this.expirationInDays;
    }
    /**
     * Name of the S3 bucket that contains the CRL. If you do not provide a value for the `custom_cname` argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You must specify a bucket policy that allows ACM PCA to write the CRL to your bucket. Must be less than or equal to 255 characters in length.
     * 
    */
    public Optional<String> s3BucketName() {
        return Optional.ofNullable(this.s3BucketName);
    }
    /**
     * Determines whether the CRL will be publicly readable or privately held in the CRL Amazon S3 bucket. Defaults to `PUBLIC_READ`.
     * 
    */
    public Optional<String> s3ObjectAcl() {
        return Optional.ofNullable(this.s3ObjectAcl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityRevocationConfigurationCrlConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customCname;
        private @Nullable Boolean enabled;
        private Integer expirationInDays;
        private @Nullable String s3BucketName;
        private @Nullable String s3ObjectAcl;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityRevocationConfigurationCrlConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customCname = defaults.customCname;
    	      this.enabled = defaults.enabled;
    	      this.expirationInDays = defaults.expirationInDays;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3ObjectAcl = defaults.s3ObjectAcl;
        }

        public Builder customCname(@Nullable String customCname) {
            this.customCname = customCname;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder expirationInDays(Integer expirationInDays) {
            this.expirationInDays = Objects.requireNonNull(expirationInDays);
            return this;
        }
        public Builder s3BucketName(@Nullable String s3BucketName) {
            this.s3BucketName = s3BucketName;
            return this;
        }
        public Builder s3ObjectAcl(@Nullable String s3ObjectAcl) {
            this.s3ObjectAcl = s3ObjectAcl;
            return this;
        }        public CertificateAuthorityRevocationConfigurationCrlConfiguration build() {
            return new CertificateAuthorityRevocationConfigurationCrlConfiguration(customCname, enabled, expirationInDays, s3BucketName, s3ObjectAcl);
        }
    }
}
