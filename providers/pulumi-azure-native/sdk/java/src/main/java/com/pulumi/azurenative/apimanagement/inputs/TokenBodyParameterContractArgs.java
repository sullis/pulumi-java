// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * OAuth acquire token request body parameter (www-url-form-encoded).
 * 
 */
public final class TokenBodyParameterContractArgs extends com.pulumi.resources.ResourceArgs {

    public static final TokenBodyParameterContractArgs Empty = new TokenBodyParameterContractArgs();

    /**
     * body parameter name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return body parameter name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * body parameter value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return body parameter value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private TokenBodyParameterContractArgs() {}

    private TokenBodyParameterContractArgs(TokenBodyParameterContractArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TokenBodyParameterContractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TokenBodyParameterContractArgs $;

        public Builder() {
            $ = new TokenBodyParameterContractArgs();
        }

        public Builder(TokenBodyParameterContractArgs defaults) {
            $ = new TokenBodyParameterContractArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name body parameter name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name body parameter name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value body parameter value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value body parameter value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public TokenBodyParameterContractArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
