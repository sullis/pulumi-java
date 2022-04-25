// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AmazonS3LocationResponse {
    /**
     * @return Specify the bucketName of amazon S3. Type: string (or Expression with resultType string)
     * 
     */
    private final @Nullable Object bucketName;
    /**
     * @return Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object fileName;
    /**
     * @return Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    private final @Nullable Object folderPath;
    /**
     * @return Type of dataset storage location.
     * Expected value is &#39;AmazonS3Location&#39;.
     * 
     */
    private final String type;
    /**
     * @return Specify the version of amazon S3. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object version;

    @CustomType.Constructor
    private AmazonS3LocationResponse(
        @CustomType.Parameter("bucketName") @Nullable Object bucketName,
        @CustomType.Parameter("fileName") @Nullable Object fileName,
        @CustomType.Parameter("folderPath") @Nullable Object folderPath,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") @Nullable Object version) {
        this.bucketName = bucketName;
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.type = type;
        this.version = version;
    }

    /**
     * @return Specify the bucketName of amazon S3. Type: string (or Expression with resultType string)
     * 
     */
    public Optional<Object> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }
    /**
     * @return Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> fileName() {
        return Optional.ofNullable(this.fileName);
    }
    /**
     * @return Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    public Optional<Object> folderPath() {
        return Optional.ofNullable(this.folderPath);
    }
    /**
     * @return Type of dataset storage location.
     * Expected value is &#39;AmazonS3Location&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Specify the version of amazon S3. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmazonS3LocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object bucketName;
        private @Nullable Object fileName;
        private @Nullable Object folderPath;
        private String type;
        private @Nullable Object version;

        public Builder() {
    	      // Empty
        }

        public Builder(AmazonS3LocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.fileName = defaults.fileName;
    	      this.folderPath = defaults.folderPath;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder bucketName(@Nullable Object bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public Builder fileName(@Nullable Object fileName) {
            this.fileName = fileName;
            return this;
        }
        public Builder folderPath(@Nullable Object folderPath) {
            this.folderPath = folderPath;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(@Nullable Object version) {
            this.version = version;
            return this;
        }        public AmazonS3LocationResponse build() {
            return new AmazonS3LocationResponse(bucketName, fileName, folderPath, type, version);
        }
    }
}
