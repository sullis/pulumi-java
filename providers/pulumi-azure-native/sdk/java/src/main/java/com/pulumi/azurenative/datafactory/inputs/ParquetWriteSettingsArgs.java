// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
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
public final class ParquetWriteSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ParquetWriteSettingsArgs Empty = new ParquetWriteSettingsArgs();

    /**
     * Specifies the file name pattern &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileNamePrefix")
    private @Nullable Output<Object> fileNamePrefix;

    /**
     * @return Specifies the file name pattern &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> fileNamePrefix() {
        return Optional.ofNullable(this.fileNamePrefix);
    }

    /**
     * Limit the written file&#39;s row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxRowsPerFile")
    private @Nullable Output<Object> maxRowsPerFile;

    /**
     * @return Limit the written file&#39;s row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> maxRowsPerFile() {
        return Optional.ofNullable(this.maxRowsPerFile);
    }

    /**
     * The write setting type.
     * Expected value is &#39;ParquetWriteSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The write setting type.
     * Expected value is &#39;ParquetWriteSettings&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ParquetWriteSettingsArgs() {}

    private ParquetWriteSettingsArgs(ParquetWriteSettingsArgs $) {
        this.fileNamePrefix = $.fileNamePrefix;
        this.maxRowsPerFile = $.maxRowsPerFile;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParquetWriteSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParquetWriteSettingsArgs $;

        public Builder() {
            $ = new ParquetWriteSettingsArgs();
        }

        public Builder(ParquetWriteSettingsArgs defaults) {
            $ = new ParquetWriteSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileNamePrefix Specifies the file name pattern &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileNamePrefix(@Nullable Output<Object> fileNamePrefix) {
            $.fileNamePrefix = fileNamePrefix;
            return this;
        }

        /**
         * @param fileNamePrefix Specifies the file name pattern &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileNamePrefix(Object fileNamePrefix) {
            return fileNamePrefix(Output.of(fileNamePrefix));
        }

        /**
         * @param maxRowsPerFile Limit the written file&#39;s row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxRowsPerFile(@Nullable Output<Object> maxRowsPerFile) {
            $.maxRowsPerFile = maxRowsPerFile;
            return this;
        }

        /**
         * @param maxRowsPerFile Limit the written file&#39;s row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxRowsPerFile(Object maxRowsPerFile) {
            return maxRowsPerFile(Output.of(maxRowsPerFile));
        }

        /**
         * @param type The write setting type.
         * Expected value is &#39;ParquetWriteSettings&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
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
            return type(Output.of(type));
        }

        public ParquetWriteSettingsArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
