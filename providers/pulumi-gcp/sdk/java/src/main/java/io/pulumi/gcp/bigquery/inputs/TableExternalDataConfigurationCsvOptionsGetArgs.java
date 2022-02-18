// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableExternalDataConfigurationCsvOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableExternalDataConfigurationCsvOptionsGetArgs Empty = new TableExternalDataConfigurationCsvOptionsGetArgs();

    /**
     * Indicates if BigQuery should accept rows
     * that are missing trailing optional columns.
     * 
     */
    @InputImport(name="allowJaggedRows")
    private final @Nullable Input<Boolean> allowJaggedRows;

    public Input<Boolean> getAllowJaggedRows() {
        return this.allowJaggedRows == null ? Input.empty() : this.allowJaggedRows;
    }

    /**
     * Indicates if BigQuery should allow
     * quoted data sections that contain newline characters in a CSV file.
     * The default value is false.
     * 
     */
    @InputImport(name="allowQuotedNewlines")
    private final @Nullable Input<Boolean> allowQuotedNewlines;

    public Input<Boolean> getAllowQuotedNewlines() {
        return this.allowQuotedNewlines == null ? Input.empty() : this.allowQuotedNewlines;
    }

    /**
     * The character encoding of the data. The supported
     * values are UTF-8 or ISO-8859-1.
     * 
     */
    @InputImport(name="encoding")
    private final @Nullable Input<String> encoding;

    public Input<String> getEncoding() {
        return this.encoding == null ? Input.empty() : this.encoding;
    }

    /**
     * The separator for fields in a CSV file.
     * 
     */
    @InputImport(name="fieldDelimiter")
    private final @Nullable Input<String> fieldDelimiter;

    public Input<String> getFieldDelimiter() {
        return this.fieldDelimiter == null ? Input.empty() : this.fieldDelimiter;
    }

    /**
     * The value that is used to quote data sections in a
     * CSV file. If your data does not contain quoted sections, set the
     * property value to an empty string. If your data contains quoted newline
     * characters, you must also set the `allow_quoted_newlines` property to true.
     * The API-side default is `"`, specified in the provider escaped as `\"`. Due to
     * limitations with default values, this value is required to be
     * explicitly set.
     * 
     */
    @InputImport(name="quote", required=true)
    private final Input<String> quote;

    public Input<String> getQuote() {
        return this.quote;
    }

    /**
     * The number of rows at the top of the sheet
     * that BigQuery will skip when reading the data. At least one of `range` or
     * `skip_leading_rows` must be set.
     * 
     */
    @InputImport(name="skipLeadingRows")
    private final @Nullable Input<Integer> skipLeadingRows;

    public Input<Integer> getSkipLeadingRows() {
        return this.skipLeadingRows == null ? Input.empty() : this.skipLeadingRows;
    }

    public TableExternalDataConfigurationCsvOptionsGetArgs(
        @Nullable Input<Boolean> allowJaggedRows,
        @Nullable Input<Boolean> allowQuotedNewlines,
        @Nullable Input<String> encoding,
        @Nullable Input<String> fieldDelimiter,
        Input<String> quote,
        @Nullable Input<Integer> skipLeadingRows) {
        this.allowJaggedRows = allowJaggedRows;
        this.allowQuotedNewlines = allowQuotedNewlines;
        this.encoding = encoding;
        this.fieldDelimiter = fieldDelimiter;
        this.quote = Objects.requireNonNull(quote, "expected parameter 'quote' to be non-null");
        this.skipLeadingRows = skipLeadingRows;
    }

    private TableExternalDataConfigurationCsvOptionsGetArgs() {
        this.allowJaggedRows = Input.empty();
        this.allowQuotedNewlines = Input.empty();
        this.encoding = Input.empty();
        this.fieldDelimiter = Input.empty();
        this.quote = Input.empty();
        this.skipLeadingRows = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableExternalDataConfigurationCsvOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowJaggedRows;
        private @Nullable Input<Boolean> allowQuotedNewlines;
        private @Nullable Input<String> encoding;
        private @Nullable Input<String> fieldDelimiter;
        private Input<String> quote;
        private @Nullable Input<Integer> skipLeadingRows;

        public Builder() {
    	      // Empty
        }

        public Builder(TableExternalDataConfigurationCsvOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowJaggedRows = defaults.allowJaggedRows;
    	      this.allowQuotedNewlines = defaults.allowQuotedNewlines;
    	      this.encoding = defaults.encoding;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.quote = defaults.quote;
    	      this.skipLeadingRows = defaults.skipLeadingRows;
        }

        public Builder setAllowJaggedRows(@Nullable Input<Boolean> allowJaggedRows) {
            this.allowJaggedRows = allowJaggedRows;
            return this;
        }

        public Builder setAllowJaggedRows(@Nullable Boolean allowJaggedRows) {
            this.allowJaggedRows = Input.ofNullable(allowJaggedRows);
            return this;
        }

        public Builder setAllowQuotedNewlines(@Nullable Input<Boolean> allowQuotedNewlines) {
            this.allowQuotedNewlines = allowQuotedNewlines;
            return this;
        }

        public Builder setAllowQuotedNewlines(@Nullable Boolean allowQuotedNewlines) {
            this.allowQuotedNewlines = Input.ofNullable(allowQuotedNewlines);
            return this;
        }

        public Builder setEncoding(@Nullable Input<String> encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setEncoding(@Nullable String encoding) {
            this.encoding = Input.ofNullable(encoding);
            return this;
        }

        public Builder setFieldDelimiter(@Nullable Input<String> fieldDelimiter) {
            this.fieldDelimiter = fieldDelimiter;
            return this;
        }

        public Builder setFieldDelimiter(@Nullable String fieldDelimiter) {
            this.fieldDelimiter = Input.ofNullable(fieldDelimiter);
            return this;
        }

        public Builder setQuote(Input<String> quote) {
            this.quote = Objects.requireNonNull(quote);
            return this;
        }

        public Builder setQuote(String quote) {
            this.quote = Input.of(Objects.requireNonNull(quote));
            return this;
        }

        public Builder setSkipLeadingRows(@Nullable Input<Integer> skipLeadingRows) {
            this.skipLeadingRows = skipLeadingRows;
            return this;
        }

        public Builder setSkipLeadingRows(@Nullable Integer skipLeadingRows) {
            this.skipLeadingRows = Input.ofNullable(skipLeadingRows);
            return this;
        }

        public TableExternalDataConfigurationCsvOptionsGetArgs build() {
            return new TableExternalDataConfigurationCsvOptionsGetArgs(allowJaggedRows, allowQuotedNewlines, encoding, fieldDelimiter, quote, skipLeadingRows);
        }
    }
}
