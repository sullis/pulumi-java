// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketLoggingConfiguration {
    /**
     * The name of an Amazon S3 bucket where Amazon S3 store server access log files. You can store log files in any bucket that you own. By default, logs are stored in the bucket where the LoggingConfiguration property is defined.
     * 
     */
    private final @Nullable String destinationBucketName;
    private final @Nullable String logFilePrefix;

    @OutputCustomType.Constructor({"destinationBucketName","logFilePrefix"})
    private BucketLoggingConfiguration(
        @Nullable String destinationBucketName,
        @Nullable String logFilePrefix) {
        this.destinationBucketName = destinationBucketName;
        this.logFilePrefix = logFilePrefix;
    }

    /**
     * The name of an Amazon S3 bucket where Amazon S3 store server access log files. You can store log files in any bucket that you own. By default, logs are stored in the bucket where the LoggingConfiguration property is defined.
     * 
     */
    public Optional<String> getDestinationBucketName() {
        return Optional.ofNullable(this.destinationBucketName);
    }
    public Optional<String> getLogFilePrefix() {
        return Optional.ofNullable(this.logFilePrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLoggingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destinationBucketName;
        private @Nullable String logFilePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLoggingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationBucketName = defaults.destinationBucketName;
    	      this.logFilePrefix = defaults.logFilePrefix;
        }

        public Builder setDestinationBucketName(@Nullable String destinationBucketName) {
            this.destinationBucketName = destinationBucketName;
            return this;
        }

        public Builder setLogFilePrefix(@Nullable String logFilePrefix) {
            this.logFilePrefix = logFilePrefix;
            return this;
        }

        public BucketLoggingConfiguration build() {
            return new BucketLoggingConfiguration(destinationBucketName, logFilePrefix);
        }
    }
}
