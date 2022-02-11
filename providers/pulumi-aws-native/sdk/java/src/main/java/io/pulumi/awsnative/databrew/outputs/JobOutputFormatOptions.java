// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.outputs.JobCsvOutputOptions;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobOutputFormatOptions {
    private final @Nullable JobCsvOutputOptions csv;

    @OutputCustomType.Constructor({"csv"})
    private JobOutputFormatOptions(@Nullable JobCsvOutputOptions csv) {
        this.csv = csv;
    }

    public Optional<JobCsvOutputOptions> getCsv() {
        return Optional.ofNullable(this.csv);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobOutputFormatOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JobCsvOutputOptions csv;

        public Builder() {
    	      // Empty
        }

        public Builder(JobOutputFormatOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csv = defaults.csv;
        }

        public Builder setCsv(@Nullable JobCsvOutputOptions csv) {
            this.csv = csv;
            return this;
        }

        public JobOutputFormatOptions build() {
            return new JobOutputFormatOptions(csv);
        }
    }
}
