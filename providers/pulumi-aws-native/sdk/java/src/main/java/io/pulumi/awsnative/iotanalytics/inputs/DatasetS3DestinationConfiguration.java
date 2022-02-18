// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatasetGlueConfiguration;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetS3DestinationConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DatasetS3DestinationConfiguration Empty = new DatasetS3DestinationConfiguration();

    @InputImport(name="bucket", required=true)
    private final String bucket;

    public String getBucket() {
        return this.bucket;
    }

    @InputImport(name="glueConfiguration")
    private final @Nullable DatasetGlueConfiguration glueConfiguration;

    public Optional<DatasetGlueConfiguration> getGlueConfiguration() {
        return this.glueConfiguration == null ? Optional.empty() : Optional.ofNullable(this.glueConfiguration);
    }

    @InputImport(name="key", required=true)
    private final String key;

    public String getKey() {
        return this.key;
    }

    @InputImport(name="roleArn", required=true)
    private final String roleArn;

    public String getRoleArn() {
        return this.roleArn;
    }

    public DatasetS3DestinationConfiguration(
        String bucket,
        @Nullable DatasetGlueConfiguration glueConfiguration,
        String key,
        String roleArn) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.glueConfiguration = glueConfiguration;
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private DatasetS3DestinationConfiguration() {
        this.bucket = null;
        this.glueConfiguration = null;
        this.key = null;
        this.roleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetS3DestinationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable DatasetGlueConfiguration glueConfiguration;
        private String key;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetS3DestinationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.glueConfiguration = defaults.glueConfiguration;
    	      this.key = defaults.key;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setGlueConfiguration(@Nullable DatasetGlueConfiguration glueConfiguration) {
            this.glueConfiguration = glueConfiguration;
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public DatasetS3DestinationConfiguration build() {
            return new DatasetS3DestinationConfiguration(bucket, glueConfiguration, key, roleArn);
        }
    }
}
