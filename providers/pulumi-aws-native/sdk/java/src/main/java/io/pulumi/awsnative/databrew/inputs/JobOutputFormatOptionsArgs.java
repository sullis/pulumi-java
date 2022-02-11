// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.JobCsvOutputOptionsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobOutputFormatOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobOutputFormatOptionsArgs Empty = new JobOutputFormatOptionsArgs();

    @InputImport(name="csv")
    private final @Nullable Input<JobCsvOutputOptionsArgs> csv;

    public Input<JobCsvOutputOptionsArgs> getCsv() {
        return this.csv == null ? Input.empty() : this.csv;
    }

    public JobOutputFormatOptionsArgs(@Nullable Input<JobCsvOutputOptionsArgs> csv) {
        this.csv = csv;
    }

    private JobOutputFormatOptionsArgs() {
        this.csv = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobOutputFormatOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<JobCsvOutputOptionsArgs> csv;

        public Builder() {
    	      // Empty
        }

        public Builder(JobOutputFormatOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csv = defaults.csv;
        }

        public Builder setCsv(@Nullable Input<JobCsvOutputOptionsArgs> csv) {
            this.csv = csv;
            return this;
        }

        public Builder setCsv(@Nullable JobCsvOutputOptionsArgs csv) {
            this.csv = Input.ofNullable(csv);
            return this;
        }

        public JobOutputFormatOptionsArgs build() {
            return new JobOutputFormatOptionsArgs(csv);
        }
    }
}
