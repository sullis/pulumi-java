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
 * The data stored in text format.
 * 
 */
public final class TextFormatResponse extends com.pulumi.resources.InvokeArgs {

    public static final TextFormatResponse Empty = new TextFormatResponse();

    /**
     * The column delimiter. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="columnDelimiter")
    private @Nullable Object columnDelimiter;

    /**
     * @return The column delimiter. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> columnDelimiter() {
        return Optional.ofNullable(this.columnDelimiter);
    }

    /**
     * Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="deserializer")
    private @Nullable Object deserializer;

    /**
     * @return Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> deserializer() {
        return Optional.ofNullable(this.deserializer);
    }

    /**
     * The code page name of the preferred encoding. If miss, the default value is ΓÇ£utf-8ΓÇ¥, unless BOM denotes another Unicode encoding. Refer to the ΓÇ£NameΓÇ¥ column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encodingName")
    private @Nullable Object encodingName;

    /**
     * @return The code page name of the preferred encoding. If miss, the default value is ΓÇ£utf-8ΓÇ¥, unless BOM denotes another Unicode encoding. Refer to the ΓÇ£NameΓÇ¥ column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> encodingName() {
        return Optional.ofNullable(this.encodingName);
    }

    /**
     * The escape character. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="escapeChar")
    private @Nullable Object escapeChar;

    /**
     * @return The escape character. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> escapeChar() {
        return Optional.ofNullable(this.escapeChar);
    }

    /**
     * When used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="firstRowAsHeader")
    private @Nullable Object firstRowAsHeader;

    /**
     * @return When used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> firstRowAsHeader() {
        return Optional.ofNullable(this.firstRowAsHeader);
    }

    /**
     * The null value string. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="nullValue")
    private @Nullable Object nullValue;

    /**
     * @return The null value string. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> nullValue() {
        return Optional.ofNullable(this.nullValue);
    }

    /**
     * The quote character. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="quoteChar")
    private @Nullable Object quoteChar;

    /**
     * @return The quote character. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> quoteChar() {
        return Optional.ofNullable(this.quoteChar);
    }

    /**
     * The row delimiter. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="rowDelimiter")
    private @Nullable Object rowDelimiter;

    /**
     * @return The row delimiter. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> rowDelimiter() {
        return Optional.ofNullable(this.rowDelimiter);
    }

    /**
     * Serializer. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="serializer")
    private @Nullable Object serializer;

    /**
     * @return Serializer. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> serializer() {
        return Optional.ofNullable(this.serializer);
    }

    /**
     * The number of lines/rows to be skipped when parsing text files. The default value is 0. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="skipLineCount")
    private @Nullable Object skipLineCount;

    /**
     * @return The number of lines/rows to be skipped when parsing text files. The default value is 0. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> skipLineCount() {
        return Optional.ofNullable(this.skipLineCount);
    }

    /**
     * Treat empty column values in the text file as null. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="treatEmptyAsNull")
    private @Nullable Object treatEmptyAsNull;

    /**
     * @return Treat empty column values in the text file as null. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> treatEmptyAsNull() {
        return Optional.ofNullable(this.treatEmptyAsNull);
    }

    /**
     * Type of dataset storage format.
     * Expected value is &#39;TextFormat&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of dataset storage format.
     * Expected value is &#39;TextFormat&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private TextFormatResponse() {}

    private TextFormatResponse(TextFormatResponse $) {
        this.columnDelimiter = $.columnDelimiter;
        this.deserializer = $.deserializer;
        this.encodingName = $.encodingName;
        this.escapeChar = $.escapeChar;
        this.firstRowAsHeader = $.firstRowAsHeader;
        this.nullValue = $.nullValue;
        this.quoteChar = $.quoteChar;
        this.rowDelimiter = $.rowDelimiter;
        this.serializer = $.serializer;
        this.skipLineCount = $.skipLineCount;
        this.treatEmptyAsNull = $.treatEmptyAsNull;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TextFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TextFormatResponse $;

        public Builder() {
            $ = new TextFormatResponse();
        }

        public Builder(TextFormatResponse defaults) {
            $ = new TextFormatResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param columnDelimiter The column delimiter. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder columnDelimiter(@Nullable Object columnDelimiter) {
            $.columnDelimiter = columnDelimiter;
            return this;
        }

        /**
         * @param deserializer Deserializer. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder deserializer(@Nullable Object deserializer) {
            $.deserializer = deserializer;
            return this;
        }

        /**
         * @param encodingName The code page name of the preferred encoding. If miss, the default value is ΓÇ£utf-8ΓÇ¥, unless BOM denotes another Unicode encoding. Refer to the ΓÇ£NameΓÇ¥ column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder encodingName(@Nullable Object encodingName) {
            $.encodingName = encodingName;
            return this;
        }

        /**
         * @param escapeChar The escape character. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder escapeChar(@Nullable Object escapeChar) {
            $.escapeChar = escapeChar;
            return this;
        }

        /**
         * @param firstRowAsHeader When used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder firstRowAsHeader(@Nullable Object firstRowAsHeader) {
            $.firstRowAsHeader = firstRowAsHeader;
            return this;
        }

        /**
         * @param nullValue The null value string. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder nullValue(@Nullable Object nullValue) {
            $.nullValue = nullValue;
            return this;
        }

        /**
         * @param quoteChar The quote character. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder quoteChar(@Nullable Object quoteChar) {
            $.quoteChar = quoteChar;
            return this;
        }

        /**
         * @param rowDelimiter The row delimiter. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder rowDelimiter(@Nullable Object rowDelimiter) {
            $.rowDelimiter = rowDelimiter;
            return this;
        }

        /**
         * @param serializer Serializer. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder serializer(@Nullable Object serializer) {
            $.serializer = serializer;
            return this;
        }

        /**
         * @param skipLineCount The number of lines/rows to be skipped when parsing text files. The default value is 0. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder skipLineCount(@Nullable Object skipLineCount) {
            $.skipLineCount = skipLineCount;
            return this;
        }

        /**
         * @param treatEmptyAsNull Treat empty column values in the text file as null. The default value is true. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder treatEmptyAsNull(@Nullable Object treatEmptyAsNull) {
            $.treatEmptyAsNull = treatEmptyAsNull;
            return this;
        }

        /**
         * @param type Type of dataset storage format.
         * Expected value is &#39;TextFormat&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public TextFormatResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
