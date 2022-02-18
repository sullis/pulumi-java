// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A structure that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
 * 
 */
public final class ReportDeliveryChannelProperties extends io.pulumi.resources.InvokeArgs {

    public static final ReportDeliveryChannelProperties Empty = new ReportDeliveryChannelProperties();

    /**
     * A list of the format of your reports: CSV, JSON, or both. If not specified, the default format is CSV.
     * 
     */
    @InputImport(name="formats")
    private final @Nullable List<String> formats;

    public List<String> getFormats() {
        return this.formats == null ? List.of() : this.formats;
    }

    /**
     * The unique name of the S3 bucket that receives your reports.
     * 
     */
    @InputImport(name="s3BucketName", required=true)
    private final String s3BucketName;

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * The prefix for where AWS Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the following path: s3://your-bucket-name/prefix/Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
     * 
     */
    @InputImport(name="s3KeyPrefix")
    private final @Nullable String s3KeyPrefix;

    public Optional<String> getS3KeyPrefix() {
        return this.s3KeyPrefix == null ? Optional.empty() : Optional.ofNullable(this.s3KeyPrefix);
    }

    public ReportDeliveryChannelProperties(
        @Nullable List<String> formats,
        String s3BucketName,
        @Nullable String s3KeyPrefix) {
        this.formats = formats;
        this.s3BucketName = Objects.requireNonNull(s3BucketName, "expected parameter 's3BucketName' to be non-null");
        this.s3KeyPrefix = s3KeyPrefix;
    }

    private ReportDeliveryChannelProperties() {
        this.formats = List.of();
        this.s3BucketName = null;
        this.s3KeyPrefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDeliveryChannelProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> formats;
        private String s3BucketName;
        private @Nullable String s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDeliveryChannelProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.formats = defaults.formats;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder setFormats(@Nullable List<String> formats) {
            this.formats = formats;
            return this;
        }

        public Builder setS3BucketName(String s3BucketName) {
            this.s3BucketName = Objects.requireNonNull(s3BucketName);
            return this;
        }

        public Builder setS3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        public ReportDeliveryChannelProperties build() {
            return new ReportDeliveryChannelProperties(formats, s3BucketName, s3KeyPrefix);
        }
    }
}
