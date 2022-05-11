// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.frontdoor.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesEngineRuleActionRequestHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesEngineRuleActionRequestHeaderArgs Empty = new RulesEngineRuleActionRequestHeaderArgs();

    /**
     * can be set to `Overwrite`, `Append` or `Delete`.
     * 
     */
    @Import(name="headerActionType")
    private @Nullable Output<String> headerActionType;

    /**
     * @return can be set to `Overwrite`, `Append` or `Delete`.
     * 
     */
    public Optional<Output<String>> headerActionType() {
        return Optional.ofNullable(this.headerActionType);
    }

    /**
     * header name (string).
     * 
     */
    @Import(name="headerName")
    private @Nullable Output<String> headerName;

    /**
     * @return header name (string).
     * 
     */
    public Optional<Output<String>> headerName() {
        return Optional.ofNullable(this.headerName);
    }

    /**
     * value name (string).
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return value name (string).
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private RulesEngineRuleActionRequestHeaderArgs() {}

    private RulesEngineRuleActionRequestHeaderArgs(RulesEngineRuleActionRequestHeaderArgs $) {
        this.headerActionType = $.headerActionType;
        this.headerName = $.headerName;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesEngineRuleActionRequestHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesEngineRuleActionRequestHeaderArgs $;

        public Builder() {
            $ = new RulesEngineRuleActionRequestHeaderArgs();
        }

        public Builder(RulesEngineRuleActionRequestHeaderArgs defaults) {
            $ = new RulesEngineRuleActionRequestHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headerActionType can be set to `Overwrite`, `Append` or `Delete`.
         * 
         * @return builder
         * 
         */
        public Builder headerActionType(@Nullable Output<String> headerActionType) {
            $.headerActionType = headerActionType;
            return this;
        }

        /**
         * @param headerActionType can be set to `Overwrite`, `Append` or `Delete`.
         * 
         * @return builder
         * 
         */
        public Builder headerActionType(String headerActionType) {
            return headerActionType(Output.of(headerActionType));
        }

        /**
         * @param headerName header name (string).
         * 
         * @return builder
         * 
         */
        public Builder headerName(@Nullable Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        /**
         * @param headerName header name (string).
         * 
         * @return builder
         * 
         */
        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        /**
         * @param value value name (string).
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value value name (string).
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public RulesEngineRuleActionRequestHeaderArgs build() {
            return $;
        }
    }

}
