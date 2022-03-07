// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.awsnative.lookoutmetrics.enums.AnomalyDetectorCsvFormatDescriptorFileCompression;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnomalyDetectorCsvFormatDescriptorArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorCsvFormatDescriptorArgs Empty = new AnomalyDetectorCsvFormatDescriptorArgs();

    @InputImport(name="charset")
      private final @Nullable Input<String> charset;

    public Input<String> getCharset() {
        return this.charset == null ? Input.empty() : this.charset;
    }

    @InputImport(name="containsHeader")
      private final @Nullable Input<Boolean> containsHeader;

    public Input<Boolean> getContainsHeader() {
        return this.containsHeader == null ? Input.empty() : this.containsHeader;
    }

    @InputImport(name="delimiter")
      private final @Nullable Input<String> delimiter;

    public Input<String> getDelimiter() {
        return this.delimiter == null ? Input.empty() : this.delimiter;
    }

    @InputImport(name="fileCompression")
      private final @Nullable Input<AnomalyDetectorCsvFormatDescriptorFileCompression> fileCompression;

    public Input<AnomalyDetectorCsvFormatDescriptorFileCompression> getFileCompression() {
        return this.fileCompression == null ? Input.empty() : this.fileCompression;
    }

    @InputImport(name="headerList")
      private final @Nullable Input<List<String>> headerList;

    public Input<List<String>> getHeaderList() {
        return this.headerList == null ? Input.empty() : this.headerList;
    }

    @InputImport(name="quoteSymbol")
      private final @Nullable Input<String> quoteSymbol;

    public Input<String> getQuoteSymbol() {
        return this.quoteSymbol == null ? Input.empty() : this.quoteSymbol;
    }

    public AnomalyDetectorCsvFormatDescriptorArgs(
        @Nullable Input<String> charset,
        @Nullable Input<Boolean> containsHeader,
        @Nullable Input<String> delimiter,
        @Nullable Input<AnomalyDetectorCsvFormatDescriptorFileCompression> fileCompression,
        @Nullable Input<List<String>> headerList,
        @Nullable Input<String> quoteSymbol) {
        this.charset = charset;
        this.containsHeader = containsHeader;
        this.delimiter = delimiter;
        this.fileCompression = fileCompression;
        this.headerList = headerList;
        this.quoteSymbol = quoteSymbol;
    }

    private AnomalyDetectorCsvFormatDescriptorArgs() {
        this.charset = Input.empty();
        this.containsHeader = Input.empty();
        this.delimiter = Input.empty();
        this.fileCompression = Input.empty();
        this.headerList = Input.empty();
        this.quoteSymbol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorCsvFormatDescriptorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> charset;
        private @Nullable Input<Boolean> containsHeader;
        private @Nullable Input<String> delimiter;
        private @Nullable Input<AnomalyDetectorCsvFormatDescriptorFileCompression> fileCompression;
        private @Nullable Input<List<String>> headerList;
        private @Nullable Input<String> quoteSymbol;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorCsvFormatDescriptorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charset = defaults.charset;
    	      this.containsHeader = defaults.containsHeader;
    	      this.delimiter = defaults.delimiter;
    	      this.fileCompression = defaults.fileCompression;
    	      this.headerList = defaults.headerList;
    	      this.quoteSymbol = defaults.quoteSymbol;
        }

        public Builder setCharset(@Nullable Input<String> charset) {
            this.charset = charset;
            return this;
        }

        public Builder setCharset(@Nullable String charset) {
            this.charset = Input.ofNullable(charset);
            return this;
        }

        public Builder setContainsHeader(@Nullable Input<Boolean> containsHeader) {
            this.containsHeader = containsHeader;
            return this;
        }

        public Builder setContainsHeader(@Nullable Boolean containsHeader) {
            this.containsHeader = Input.ofNullable(containsHeader);
            return this;
        }

        public Builder setDelimiter(@Nullable Input<String> delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        public Builder setDelimiter(@Nullable String delimiter) {
            this.delimiter = Input.ofNullable(delimiter);
            return this;
        }

        public Builder setFileCompression(@Nullable Input<AnomalyDetectorCsvFormatDescriptorFileCompression> fileCompression) {
            this.fileCompression = fileCompression;
            return this;
        }

        public Builder setFileCompression(@Nullable AnomalyDetectorCsvFormatDescriptorFileCompression fileCompression) {
            this.fileCompression = Input.ofNullable(fileCompression);
            return this;
        }

        public Builder setHeaderList(@Nullable Input<List<String>> headerList) {
            this.headerList = headerList;
            return this;
        }

        public Builder setHeaderList(@Nullable List<String> headerList) {
            this.headerList = Input.ofNullable(headerList);
            return this;
        }

        public Builder setQuoteSymbol(@Nullable Input<String> quoteSymbol) {
            this.quoteSymbol = quoteSymbol;
            return this;
        }

        public Builder setQuoteSymbol(@Nullable String quoteSymbol) {
            this.quoteSymbol = Input.ofNullable(quoteSymbol);
            return this;
        }
        public AnomalyDetectorCsvFormatDescriptorArgs build() {
            return new AnomalyDetectorCsvFormatDescriptorArgs(charset, containsHeader, delimiter, fileCompression, headerList, quoteSymbol);
        }
    }
}