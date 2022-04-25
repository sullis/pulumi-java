// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * StringNotIn Advanced Filter.
 * 
 */
public final class StringNotInAdvancedFilterResponse extends com.pulumi.resources.InvokeArgs {

    public static final StringNotInAdvancedFilterResponse Empty = new StringNotInAdvancedFilterResponse();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @Import(name="key")
    private @Nullable String key;

    /**
     * @return The field/property in the event based on which you want to filter.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;StringNotIn&#39;.
     * 
     */
    @Import(name="operatorType", required=true)
    private String operatorType;

    /**
     * @return The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;StringNotIn&#39;.
     * 
     */
    public String operatorType() {
        return this.operatorType;
    }

    /**
     * The set of filter values.
     * 
     */
    @Import(name="values")
    private @Nullable List<String> values;

    /**
     * @return The set of filter values.
     * 
     */
    public Optional<List<String>> values() {
        return Optional.ofNullable(this.values);
    }

    private StringNotInAdvancedFilterResponse() {}

    private StringNotInAdvancedFilterResponse(StringNotInAdvancedFilterResponse $) {
        this.key = $.key;
        this.operatorType = $.operatorType;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StringNotInAdvancedFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StringNotInAdvancedFilterResponse $;

        public Builder() {
            $ = new StringNotInAdvancedFilterResponse();
        }

        public Builder(StringNotInAdvancedFilterResponse defaults) {
            $ = new StringNotInAdvancedFilterResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The field/property in the event based on which you want to filter.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable String key) {
            $.key = key;
            return this;
        }

        /**
         * @param operatorType The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
         * Expected value is &#39;StringNotIn&#39;.
         * 
         * @return builder
         * 
         */
        public Builder operatorType(String operatorType) {
            $.operatorType = operatorType;
            return this;
        }

        /**
         * @param values The set of filter values.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The set of filter values.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public StringNotInAdvancedFilterResponse build() {
            $.operatorType = Codegen.stringProp("operatorType").arg($.operatorType).require();
            return $;
        }
    }

}
