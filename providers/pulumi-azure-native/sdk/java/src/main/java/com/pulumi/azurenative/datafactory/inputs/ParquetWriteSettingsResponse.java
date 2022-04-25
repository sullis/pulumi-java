// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parquet write settings.
 * 
 */
public final class ParquetWriteSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ParquetWriteSettingsResponse Empty = new ParquetWriteSettingsResponse();

    /**
     * Specifies the file name pattern &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileNamePrefix")
    private @Nullable Object fileNamePrefix;

    /**
     * @return Specifies the file name pattern &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> fileNamePrefix() {
        return Optional.ofNullable(this.fileNamePrefix);
    }

    /**
     * Limit the written file&#39;s row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxRowsPerFile")
    private @Nullable Object maxRowsPerFile;

    /**
     * @return Limit the written file&#39;s row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> maxRowsPerFile() {
        return Optional.ofNullable(this.maxRowsPerFile);
    }

    /**
     * The write setting type.
     * Expected value is &#39;ParquetWriteSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The write setting type.
     * Expected value is &#39;ParquetWriteSettings&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private ParquetWriteSettingsResponse() {}

    private ParquetWriteSettingsResponse(ParquetWriteSettingsResponse $) {
        this.fileNamePrefix = $.fileNamePrefix;
        this.maxRowsPerFile = $.maxRowsPerFile;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParquetWriteSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParquetWriteSettingsResponse $;

        public Builder() {
            $ = new ParquetWriteSettingsResponse();
        }

        public Builder(ParquetWriteSettingsResponse defaults) {
            $ = new ParquetWriteSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileNamePrefix Specifies the file name pattern &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileNamePrefix(@Nullable Object fileNamePrefix) {
            $.fileNamePrefix = fileNamePrefix;
            return this;
        }

        /**
         * @param maxRowsPerFile Limit the written file&#39;s row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxRowsPerFile(@Nullable Object maxRowsPerFile) {
            $.maxRowsPerFile = maxRowsPerFile;
            return this;
        }

        /**
         * @param type The write setting type.
         * Expected value is &#39;ParquetWriteSettings&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ParquetWriteSettingsResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
