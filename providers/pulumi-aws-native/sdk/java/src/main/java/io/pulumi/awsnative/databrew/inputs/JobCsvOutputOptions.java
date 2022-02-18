// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Output Csv options
 * 
 */
public final class JobCsvOutputOptions extends io.pulumi.resources.InvokeArgs {

    public static final JobCsvOutputOptions Empty = new JobCsvOutputOptions();

    @InputImport(name="delimiter")
    private final @Nullable String delimiter;

    public Optional<String> getDelimiter() {
        return this.delimiter == null ? Optional.empty() : Optional.ofNullable(this.delimiter);
    }

    public JobCsvOutputOptions(@Nullable String delimiter) {
        this.delimiter = delimiter;
    }

    private JobCsvOutputOptions() {
        this.delimiter = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobCsvOutputOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String delimiter;

        public Builder() {
    	      // Empty
        }

        public Builder(JobCsvOutputOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delimiter = defaults.delimiter;
        }

        public Builder setDelimiter(@Nullable String delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        public JobCsvOutputOptions build() {
            return new JobCsvOutputOptions(delimiter);
        }
    }
}
