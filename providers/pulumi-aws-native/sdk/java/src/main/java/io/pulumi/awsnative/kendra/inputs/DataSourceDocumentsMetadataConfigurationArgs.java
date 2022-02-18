// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceDocumentsMetadataConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceDocumentsMetadataConfigurationArgs Empty = new DataSourceDocumentsMetadataConfigurationArgs();

    @InputImport(name="s3Prefix")
    private final @Nullable Input<String> s3Prefix;

    public Input<String> getS3Prefix() {
        return this.s3Prefix == null ? Input.empty() : this.s3Prefix;
    }

    public DataSourceDocumentsMetadataConfigurationArgs(@Nullable Input<String> s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    private DataSourceDocumentsMetadataConfigurationArgs() {
        this.s3Prefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceDocumentsMetadataConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> s3Prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceDocumentsMetadataConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Prefix = defaults.s3Prefix;
        }

        public Builder setS3Prefix(@Nullable Input<String> s3Prefix) {
            this.s3Prefix = s3Prefix;
            return this;
        }

        public Builder setS3Prefix(@Nullable String s3Prefix) {
            this.s3Prefix = Input.ofNullable(s3Prefix);
            return this;
        }

        public DataSourceDocumentsMetadataConfigurationArgs build() {
            return new DataSourceDocumentsMetadataConfigurationArgs(s3Prefix);
        }
    }
}
