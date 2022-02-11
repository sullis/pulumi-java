// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceDocumentsMetadataConfiguration {
    private final @Nullable String s3Prefix;

    @OutputCustomType.Constructor({"s3Prefix"})
    private DataSourceDocumentsMetadataConfiguration(@Nullable String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    public Optional<String> getS3Prefix() {
        return Optional.ofNullable(this.s3Prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceDocumentsMetadataConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String s3Prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceDocumentsMetadataConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Prefix = defaults.s3Prefix;
        }

        public Builder setS3Prefix(@Nullable String s3Prefix) {
            this.s3Prefix = s3Prefix;
            return this;
        }

        public DataSourceDocumentsMetadataConfiguration build() {
            return new DataSourceDocumentsMetadataConfiguration(s3Prefix);
        }
    }
}
