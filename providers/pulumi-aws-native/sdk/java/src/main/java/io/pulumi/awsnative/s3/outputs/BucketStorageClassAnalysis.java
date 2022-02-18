// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.BucketDataExport;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketStorageClassAnalysis {
    private final @Nullable BucketDataExport dataExport;

    @OutputCustomType.Constructor({"dataExport"})
    private BucketStorageClassAnalysis(@Nullable BucketDataExport dataExport) {
        this.dataExport = dataExport;
    }

    public Optional<BucketDataExport> getDataExport() {
        return Optional.ofNullable(this.dataExport);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketStorageClassAnalysis defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketDataExport dataExport;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketStorageClassAnalysis defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataExport = defaults.dataExport;
        }

        public Builder setDataExport(@Nullable BucketDataExport dataExport) {
            this.dataExport = dataExport;
            return this;
        }

        public BucketStorageClassAnalysis build() {
            return new BucketStorageClassAnalysis(dataExport);
        }
    }
}
