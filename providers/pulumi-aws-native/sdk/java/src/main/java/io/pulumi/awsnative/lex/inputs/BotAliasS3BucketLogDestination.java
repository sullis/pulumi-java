// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies an Amazon S3 bucket for logging audio conversations
 * 
 */
public final class BotAliasS3BucketLogDestination extends io.pulumi.resources.InvokeArgs {

    public static final BotAliasS3BucketLogDestination Empty = new BotAliasS3BucketLogDestination();

    /**
     * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key for encrypting audio log files stored in an S3 bucket.
     * 
     */
    @InputImport(name="kmsKeyArn")
    private final @Nullable String kmsKeyArn;

    public Optional<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Optional.empty() : Optional.ofNullable(this.kmsKeyArn);
    }

    /**
     * The Amazon S3 key of the deployment package.
     * 
     */
    @InputImport(name="logPrefix", required=true)
    private final String logPrefix;

    public String getLogPrefix() {
        return this.logPrefix;
    }

    /**
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log files are stored.
     * 
     */
    @InputImport(name="s3BucketArn", required=true)
    private final String s3BucketArn;

    public String getS3BucketArn() {
        return this.s3BucketArn;
    }

    public BotAliasS3BucketLogDestination(
        @Nullable String kmsKeyArn,
        String logPrefix,
        String s3BucketArn) {
        this.kmsKeyArn = kmsKeyArn;
        this.logPrefix = Objects.requireNonNull(logPrefix, "expected parameter 'logPrefix' to be non-null");
        this.s3BucketArn = Objects.requireNonNull(s3BucketArn, "expected parameter 's3BucketArn' to be non-null");
    }

    private BotAliasS3BucketLogDestination() {
        this.kmsKeyArn = null;
        this.logPrefix = null;
        this.s3BucketArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasS3BucketLogDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyArn;
        private String logPrefix;
        private String s3BucketArn;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasS3BucketLogDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.logPrefix = defaults.logPrefix;
    	      this.s3BucketArn = defaults.s3BucketArn;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder setLogPrefix(String logPrefix) {
            this.logPrefix = Objects.requireNonNull(logPrefix);
            return this;
        }

        public Builder setS3BucketArn(String s3BucketArn) {
            this.s3BucketArn = Objects.requireNonNull(s3BucketArn);
            return this;
        }

        public BotAliasS3BucketLogDestination build() {
            return new BotAliasS3BucketLogDestination(kmsKeyArn, logPrefix, s3BucketArn);
        }
    }
}
