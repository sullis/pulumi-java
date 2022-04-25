// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointS3SettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointS3SettingsArgs Empty = new EndpointS3SettingsArgs();

    /**
     * S3 Bucket Object prefix.
     * 
     */
    @Import(name="bucketFolder")
    private @Nullable Output<String> bucketFolder;

    /**
     * @return S3 Bucket Object prefix.
     * 
     */
    public Optional<Output<String>> bucketFolder() {
        return Optional.ofNullable(this.bucketFolder);
    }

    /**
     * S3 Bucket name.
     * 
     */
    @Import(name="bucketName")
    private @Nullable Output<String> bucketName;

    /**
     * @return S3 Bucket name.
     * 
     */
    public Optional<Output<String>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    /**
     * Set to compress target files. Defaults to `NONE`. Valid values are `GZIP` and `NONE`.
     * 
     */
    @Import(name="compressionType")
    private @Nullable Output<String> compressionType;

    /**
     * @return Set to compress target files. Defaults to `NONE`. Valid values are `GZIP` and `NONE`.
     * 
     */
    public Optional<Output<String>> compressionType() {
        return Optional.ofNullable(this.compressionType);
    }

    /**
     * Delimiter used to separate columns in the source files. Defaults to `,`.
     * 
     */
    @Import(name="csvDelimiter")
    private @Nullable Output<String> csvDelimiter;

    /**
     * @return Delimiter used to separate columns in the source files. Defaults to `,`.
     * 
     */
    public Optional<Output<String>> csvDelimiter() {
        return Optional.ofNullable(this.csvDelimiter);
    }

    /**
     * Delimiter used to separate rows in the source files. Defaults to `\n`.
     * 
     */
    @Import(name="csvRowDelimiter")
    private @Nullable Output<String> csvRowDelimiter;

    /**
     * @return Delimiter used to separate rows in the source files. Defaults to `\n`.
     * 
     */
    public Optional<Output<String>> csvRowDelimiter() {
        return Optional.ofNullable(this.csvRowDelimiter);
    }

    /**
     * The output format for the files that AWS DMS uses to create S3 objects. Defaults to `csv`. Valid values are `csv` and `parquet`.
     * 
     */
    @Import(name="dataFormat")
    private @Nullable Output<String> dataFormat;

    /**
     * @return The output format for the files that AWS DMS uses to create S3 objects. Defaults to `csv`. Valid values are `csv` and `parquet`.
     * 
     */
    public Optional<Output<String>> dataFormat() {
        return Optional.ofNullable(this.dataFormat);
    }

    /**
     * Partition S3 bucket folders based on transaction commit dates. Defaults to `false`.
     * 
     */
    @Import(name="datePartitionEnabled")
    private @Nullable Output<Boolean> datePartitionEnabled;

    /**
     * @return Partition S3 bucket folders based on transaction commit dates. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> datePartitionEnabled() {
        return Optional.ofNullable(this.datePartitionEnabled);
    }

    /**
     * The server-side encryption mode that you want to encrypt your .csv or .parquet object files copied to S3. Defaults to `SSE_S3`. Valid values are `SSE_S3` and `SSE_KMS`.
     * 
     */
    @Import(name="encryptionMode")
    private @Nullable Output<String> encryptionMode;

    /**
     * @return The server-side encryption mode that you want to encrypt your .csv or .parquet object files copied to S3. Defaults to `SSE_S3`. Valid values are `SSE_S3` and `SSE_KMS`.
     * 
     */
    public Optional<Output<String>> encryptionMode() {
        return Optional.ofNullable(this.encryptionMode);
    }

    /**
     * JSON document that describes how AWS DMS should interpret the data.
     * 
     */
    @Import(name="externalTableDefinition")
    private @Nullable Output<String> externalTableDefinition;

    /**
     * @return JSON document that describes how AWS DMS should interpret the data.
     * 
     */
    public Optional<Output<String>> externalTableDefinition() {
        return Optional.ofNullable(this.externalTableDefinition);
    }

    /**
     * - Specifies the precision of any TIMESTAMP column values written to an S3 object file in .parquet format. Defaults to `false`.
     * 
     */
    @Import(name="parquetTimestampInMillisecond")
    private @Nullable Output<Boolean> parquetTimestampInMillisecond;

    /**
     * @return - Specifies the precision of any TIMESTAMP column values written to an S3 object file in .parquet format. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> parquetTimestampInMillisecond() {
        return Optional.ofNullable(this.parquetTimestampInMillisecond);
    }

    /**
     * The version of the .parquet file format. Defaults to `parquet-1-0`. Valid values are `parquet-1-0` and `parquet-2-0`.
     * 
     */
    @Import(name="parquetVersion")
    private @Nullable Output<String> parquetVersion;

    /**
     * @return The version of the .parquet file format. Defaults to `parquet-1-0`. Valid values are `parquet-1-0` and `parquet-2-0`.
     * 
     */
    public Optional<Output<String>> parquetVersion() {
        return Optional.ofNullable(this.parquetVersion);
    }

    /**
     * If you set encryptionMode to `SSE_KMS`, set this parameter to the Amazon Resource Name (ARN) for the AWS KMS key.
     * 
     */
    @Import(name="serverSideEncryptionKmsKeyId")
    private @Nullable Output<String> serverSideEncryptionKmsKeyId;

    /**
     * @return If you set encryptionMode to `SSE_KMS`, set this parameter to the Amazon Resource Name (ARN) for the AWS KMS key.
     * 
     */
    public Optional<Output<String>> serverSideEncryptionKmsKeyId() {
        return Optional.ofNullable(this.serverSideEncryptionKmsKeyId);
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role with permissions to read from or write to the S3 Bucket.
     * 
     */
    @Import(name="serviceAccessRoleArn")
    private @Nullable Output<String> serviceAccessRoleArn;

    /**
     * @return Amazon Resource Name (ARN) of the IAM Role with permissions to read from or write to the S3 Bucket.
     * 
     */
    public Optional<Output<String>> serviceAccessRoleArn() {
        return Optional.ofNullable(this.serviceAccessRoleArn);
    }

    private EndpointS3SettingsArgs() {}

    private EndpointS3SettingsArgs(EndpointS3SettingsArgs $) {
        this.bucketFolder = $.bucketFolder;
        this.bucketName = $.bucketName;
        this.compressionType = $.compressionType;
        this.csvDelimiter = $.csvDelimiter;
        this.csvRowDelimiter = $.csvRowDelimiter;
        this.dataFormat = $.dataFormat;
        this.datePartitionEnabled = $.datePartitionEnabled;
        this.encryptionMode = $.encryptionMode;
        this.externalTableDefinition = $.externalTableDefinition;
        this.parquetTimestampInMillisecond = $.parquetTimestampInMillisecond;
        this.parquetVersion = $.parquetVersion;
        this.serverSideEncryptionKmsKeyId = $.serverSideEncryptionKmsKeyId;
        this.serviceAccessRoleArn = $.serviceAccessRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointS3SettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointS3SettingsArgs $;

        public Builder() {
            $ = new EndpointS3SettingsArgs();
        }

        public Builder(EndpointS3SettingsArgs defaults) {
            $ = new EndpointS3SettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketFolder S3 Bucket Object prefix.
         * 
         * @return builder
         * 
         */
        public Builder bucketFolder(@Nullable Output<String> bucketFolder) {
            $.bucketFolder = bucketFolder;
            return this;
        }

        /**
         * @param bucketFolder S3 Bucket Object prefix.
         * 
         * @return builder
         * 
         */
        public Builder bucketFolder(String bucketFolder) {
            return bucketFolder(Output.of(bucketFolder));
        }

        /**
         * @param bucketName S3 Bucket name.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(@Nullable Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName S3 Bucket name.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param compressionType Set to compress target files. Defaults to `NONE`. Valid values are `GZIP` and `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder compressionType(@Nullable Output<String> compressionType) {
            $.compressionType = compressionType;
            return this;
        }

        /**
         * @param compressionType Set to compress target files. Defaults to `NONE`. Valid values are `GZIP` and `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder compressionType(String compressionType) {
            return compressionType(Output.of(compressionType));
        }

        /**
         * @param csvDelimiter Delimiter used to separate columns in the source files. Defaults to `,`.
         * 
         * @return builder
         * 
         */
        public Builder csvDelimiter(@Nullable Output<String> csvDelimiter) {
            $.csvDelimiter = csvDelimiter;
            return this;
        }

        /**
         * @param csvDelimiter Delimiter used to separate columns in the source files. Defaults to `,`.
         * 
         * @return builder
         * 
         */
        public Builder csvDelimiter(String csvDelimiter) {
            return csvDelimiter(Output.of(csvDelimiter));
        }

        /**
         * @param csvRowDelimiter Delimiter used to separate rows in the source files. Defaults to `\n`.
         * 
         * @return builder
         * 
         */
        public Builder csvRowDelimiter(@Nullable Output<String> csvRowDelimiter) {
            $.csvRowDelimiter = csvRowDelimiter;
            return this;
        }

        /**
         * @param csvRowDelimiter Delimiter used to separate rows in the source files. Defaults to `\n`.
         * 
         * @return builder
         * 
         */
        public Builder csvRowDelimiter(String csvRowDelimiter) {
            return csvRowDelimiter(Output.of(csvRowDelimiter));
        }

        /**
         * @param dataFormat The output format for the files that AWS DMS uses to create S3 objects. Defaults to `csv`. Valid values are `csv` and `parquet`.
         * 
         * @return builder
         * 
         */
        public Builder dataFormat(@Nullable Output<String> dataFormat) {
            $.dataFormat = dataFormat;
            return this;
        }

        /**
         * @param dataFormat The output format for the files that AWS DMS uses to create S3 objects. Defaults to `csv`. Valid values are `csv` and `parquet`.
         * 
         * @return builder
         * 
         */
        public Builder dataFormat(String dataFormat) {
            return dataFormat(Output.of(dataFormat));
        }

        /**
         * @param datePartitionEnabled Partition S3 bucket folders based on transaction commit dates. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder datePartitionEnabled(@Nullable Output<Boolean> datePartitionEnabled) {
            $.datePartitionEnabled = datePartitionEnabled;
            return this;
        }

        /**
         * @param datePartitionEnabled Partition S3 bucket folders based on transaction commit dates. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder datePartitionEnabled(Boolean datePartitionEnabled) {
            return datePartitionEnabled(Output.of(datePartitionEnabled));
        }

        /**
         * @param encryptionMode The server-side encryption mode that you want to encrypt your .csv or .parquet object files copied to S3. Defaults to `SSE_S3`. Valid values are `SSE_S3` and `SSE_KMS`.
         * 
         * @return builder
         * 
         */
        public Builder encryptionMode(@Nullable Output<String> encryptionMode) {
            $.encryptionMode = encryptionMode;
            return this;
        }

        /**
         * @param encryptionMode The server-side encryption mode that you want to encrypt your .csv or .parquet object files copied to S3. Defaults to `SSE_S3`. Valid values are `SSE_S3` and `SSE_KMS`.
         * 
         * @return builder
         * 
         */
        public Builder encryptionMode(String encryptionMode) {
            return encryptionMode(Output.of(encryptionMode));
        }

        /**
         * @param externalTableDefinition JSON document that describes how AWS DMS should interpret the data.
         * 
         * @return builder
         * 
         */
        public Builder externalTableDefinition(@Nullable Output<String> externalTableDefinition) {
            $.externalTableDefinition = externalTableDefinition;
            return this;
        }

        /**
         * @param externalTableDefinition JSON document that describes how AWS DMS should interpret the data.
         * 
         * @return builder
         * 
         */
        public Builder externalTableDefinition(String externalTableDefinition) {
            return externalTableDefinition(Output.of(externalTableDefinition));
        }

        /**
         * @param parquetTimestampInMillisecond - Specifies the precision of any TIMESTAMP column values written to an S3 object file in .parquet format. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder parquetTimestampInMillisecond(@Nullable Output<Boolean> parquetTimestampInMillisecond) {
            $.parquetTimestampInMillisecond = parquetTimestampInMillisecond;
            return this;
        }

        /**
         * @param parquetTimestampInMillisecond - Specifies the precision of any TIMESTAMP column values written to an S3 object file in .parquet format. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder parquetTimestampInMillisecond(Boolean parquetTimestampInMillisecond) {
            return parquetTimestampInMillisecond(Output.of(parquetTimestampInMillisecond));
        }

        /**
         * @param parquetVersion The version of the .parquet file format. Defaults to `parquet-1-0`. Valid values are `parquet-1-0` and `parquet-2-0`.
         * 
         * @return builder
         * 
         */
        public Builder parquetVersion(@Nullable Output<String> parquetVersion) {
            $.parquetVersion = parquetVersion;
            return this;
        }

        /**
         * @param parquetVersion The version of the .parquet file format. Defaults to `parquet-1-0`. Valid values are `parquet-1-0` and `parquet-2-0`.
         * 
         * @return builder
         * 
         */
        public Builder parquetVersion(String parquetVersion) {
            return parquetVersion(Output.of(parquetVersion));
        }

        /**
         * @param serverSideEncryptionKmsKeyId If you set encryptionMode to `SSE_KMS`, set this parameter to the Amazon Resource Name (ARN) for the AWS KMS key.
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryptionKmsKeyId(@Nullable Output<String> serverSideEncryptionKmsKeyId) {
            $.serverSideEncryptionKmsKeyId = serverSideEncryptionKmsKeyId;
            return this;
        }

        /**
         * @param serverSideEncryptionKmsKeyId If you set encryptionMode to `SSE_KMS`, set this parameter to the Amazon Resource Name (ARN) for the AWS KMS key.
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryptionKmsKeyId(String serverSideEncryptionKmsKeyId) {
            return serverSideEncryptionKmsKeyId(Output.of(serverSideEncryptionKmsKeyId));
        }

        /**
         * @param serviceAccessRoleArn Amazon Resource Name (ARN) of the IAM Role with permissions to read from or write to the S3 Bucket.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccessRoleArn(@Nullable Output<String> serviceAccessRoleArn) {
            $.serviceAccessRoleArn = serviceAccessRoleArn;
            return this;
        }

        /**
         * @param serviceAccessRoleArn Amazon Resource Name (ARN) of the IAM Role with permissions to read from or write to the S3 Bucket.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccessRoleArn(String serviceAccessRoleArn) {
            return serviceAccessRoleArn(Output.of(serviceAccessRoleArn));
        }

        public EndpointS3SettingsArgs build() {
            return $;
        }
    }

}
