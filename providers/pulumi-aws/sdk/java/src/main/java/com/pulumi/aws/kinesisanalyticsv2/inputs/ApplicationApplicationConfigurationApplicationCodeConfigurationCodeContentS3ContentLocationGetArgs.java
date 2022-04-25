// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs Empty = new ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs();

    /**
     * The ARN for the S3 bucket containing the application code.
     * 
     */
    @Import(name="bucketArn", required=true)
    private Output<String> bucketArn;

    /**
     * @return The ARN for the S3 bucket containing the application code.
     * 
     */
    public Output<String> bucketArn() {
        return this.bucketArn;
    }

    /**
     * The file key for the object containing the application code.
     * 
     */
    @Import(name="fileKey", required=true)
    private Output<String> fileKey;

    /**
     * @return The file key for the object containing the application code.
     * 
     */
    public Output<String> fileKey() {
        return this.fileKey;
    }

    /**
     * The version of the object containing the application code.
     * 
     */
    @Import(name="objectVersion")
    private @Nullable Output<String> objectVersion;

    /**
     * @return The version of the object containing the application code.
     * 
     */
    public Optional<Output<String>> objectVersion() {
        return Optional.ofNullable(this.objectVersion);
    }

    private ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs() {}

    private ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs(ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs $) {
        this.bucketArn = $.bucketArn;
        this.fileKey = $.fileKey;
        this.objectVersion = $.objectVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs();
        }

        public Builder(ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs defaults) {
            $ = new ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketArn The ARN for the S3 bucket containing the application code.
         * 
         * @return builder
         * 
         */
        public Builder bucketArn(Output<String> bucketArn) {
            $.bucketArn = bucketArn;
            return this;
        }

        /**
         * @param bucketArn The ARN for the S3 bucket containing the application code.
         * 
         * @return builder
         * 
         */
        public Builder bucketArn(String bucketArn) {
            return bucketArn(Output.of(bucketArn));
        }

        /**
         * @param fileKey The file key for the object containing the application code.
         * 
         * @return builder
         * 
         */
        public Builder fileKey(Output<String> fileKey) {
            $.fileKey = fileKey;
            return this;
        }

        /**
         * @param fileKey The file key for the object containing the application code.
         * 
         * @return builder
         * 
         */
        public Builder fileKey(String fileKey) {
            return fileKey(Output.of(fileKey));
        }

        /**
         * @param objectVersion The version of the object containing the application code.
         * 
         * @return builder
         * 
         */
        public Builder objectVersion(@Nullable Output<String> objectVersion) {
            $.objectVersion = objectVersion;
            return this;
        }

        /**
         * @param objectVersion The version of the object containing the application code.
         * 
         * @return builder
         * 
         */
        public Builder objectVersion(String objectVersion) {
            return objectVersion(Output.of(objectVersion));
        }

        public ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs build() {
            $.bucketArn = Objects.requireNonNull($.bucketArn, "expected parameter 'bucketArn' to be non-null");
            $.fileKey = Objects.requireNonNull($.fileKey, "expected parameter 'fileKey' to be non-null");
            return $;
        }
    }

}
