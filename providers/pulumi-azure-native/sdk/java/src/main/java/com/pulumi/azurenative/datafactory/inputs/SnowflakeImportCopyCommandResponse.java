// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Snowflake import command settings.
 * 
 */
public final class SnowflakeImportCopyCommandResponse extends com.pulumi.resources.InvokeArgs {

    public static final SnowflakeImportCopyCommandResponse Empty = new SnowflakeImportCopyCommandResponse();

    /**
     * Additional copy options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: &#34;additionalCopyOptions&#34;: { &#34;DATE_FORMAT&#34;: &#34;MM/DD/YYYY&#34;, &#34;TIME_FORMAT&#34;: &#34;&#39;HH24:MI:SS.FF&#39;&#34; }
     * 
     */
    @Import(name="additionalCopyOptions")
    private @Nullable Map<String,Object> additionalCopyOptions;

    /**
     * @return Additional copy options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: &#34;additionalCopyOptions&#34;: { &#34;DATE_FORMAT&#34;: &#34;MM/DD/YYYY&#34;, &#34;TIME_FORMAT&#34;: &#34;&#39;HH24:MI:SS.FF&#39;&#34; }
     * 
     */
    public Optional<Map<String,Object>> additionalCopyOptions() {
        return Optional.ofNullable(this.additionalCopyOptions);
    }

    /**
     * Additional format options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: &#34;additionalFormatOptions&#34;: { &#34;FORCE&#34;: &#34;TRUE&#34;, &#34;LOAD_UNCERTAIN_FILES&#34;: &#34;&#39;FALSE&#39;&#34; }
     * 
     */
    @Import(name="additionalFormatOptions")
    private @Nullable Map<String,Object> additionalFormatOptions;

    /**
     * @return Additional format options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: &#34;additionalFormatOptions&#34;: { &#34;FORCE&#34;: &#34;TRUE&#34;, &#34;LOAD_UNCERTAIN_FILES&#34;: &#34;&#39;FALSE&#39;&#34; }
     * 
     */
    public Optional<Map<String,Object>> additionalFormatOptions() {
        return Optional.ofNullable(this.additionalFormatOptions);
    }

    /**
     * The import setting type.
     * Expected value is &#39;SnowflakeImportCopyCommand&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The import setting type.
     * Expected value is &#39;SnowflakeImportCopyCommand&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private SnowflakeImportCopyCommandResponse() {}

    private SnowflakeImportCopyCommandResponse(SnowflakeImportCopyCommandResponse $) {
        this.additionalCopyOptions = $.additionalCopyOptions;
        this.additionalFormatOptions = $.additionalFormatOptions;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnowflakeImportCopyCommandResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnowflakeImportCopyCommandResponse $;

        public Builder() {
            $ = new SnowflakeImportCopyCommandResponse();
        }

        public Builder(SnowflakeImportCopyCommandResponse defaults) {
            $ = new SnowflakeImportCopyCommandResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalCopyOptions Additional copy options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: &#34;additionalCopyOptions&#34;: { &#34;DATE_FORMAT&#34;: &#34;MM/DD/YYYY&#34;, &#34;TIME_FORMAT&#34;: &#34;&#39;HH24:MI:SS.FF&#39;&#34; }
         * 
         * @return builder
         * 
         */
        public Builder additionalCopyOptions(@Nullable Map<String,Object> additionalCopyOptions) {
            $.additionalCopyOptions = additionalCopyOptions;
            return this;
        }

        /**
         * @param additionalFormatOptions Additional format options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: &#34;additionalFormatOptions&#34;: { &#34;FORCE&#34;: &#34;TRUE&#34;, &#34;LOAD_UNCERTAIN_FILES&#34;: &#34;&#39;FALSE&#39;&#34; }
         * 
         * @return builder
         * 
         */
        public Builder additionalFormatOptions(@Nullable Map<String,Object> additionalFormatOptions) {
            $.additionalFormatOptions = additionalFormatOptions;
            return this;
        }

        /**
         * @param type The import setting type.
         * Expected value is &#39;SnowflakeImportCopyCommand&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public SnowflakeImportCopyCommandResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
