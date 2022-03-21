// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Csv options
 * 
 */
public final class DatasetCsvOptions extends io.pulumi.resources.InvokeArgs {

    public static final DatasetCsvOptions Empty = new DatasetCsvOptions();

    @Import(name="delimiter")
      private final @Nullable String delimiter;

    public Optional<String> getDelimiter() {
        return this.delimiter == null ? Optional.empty() : Optional.ofNullable(this.delimiter);
    }

    @Import(name="headerRow")
      private final @Nullable Boolean headerRow;

    public Optional<Boolean> getHeaderRow() {
        return this.headerRow == null ? Optional.empty() : Optional.ofNullable(this.headerRow);
    }

    public DatasetCsvOptions(
        @Nullable String delimiter,
        @Nullable Boolean headerRow) {
        this.delimiter = delimiter;
        this.headerRow = headerRow;
    }

    private DatasetCsvOptions() {
        this.delimiter = null;
        this.headerRow = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetCsvOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String delimiter;
        private @Nullable Boolean headerRow;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetCsvOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delimiter = defaults.delimiter;
    	      this.headerRow = defaults.headerRow;
        }

        public Builder delimiter(@Nullable String delimiter) {
            this.delimiter = delimiter;
            return this;
        }
        public Builder headerRow(@Nullable Boolean headerRow) {
            this.headerRow = headerRow;
            return this;
        }        public DatasetCsvOptions build() {
            return new DatasetCsvOptions(delimiter, headerRow);
        }
    }
}
