// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v1alpha1.inputs.EnvVarSourceResponse;
import java.lang.String;
import java.util.Objects;


/**
 * EnvVar represents an environment variable present in a Container.
 * 
 */
public final class EnvVarResponse extends com.pulumi.resources.InvokeArgs {

    public static final EnvVarResponse Empty = new EnvVarResponse();

    /**
     * Name of the environment variable. Must be a C_IDENTIFIER.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the environment variable. Must be a C_IDENTIFIER.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * (Optional) Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to &#34;&#34;.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return (Optional) Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to &#34;&#34;.
     * 
     */
    public String value() {
        return this.value;
    }

    /**
     * (Optional) Source for the environment variable&#39;s value. Only supports secret_key_ref. Source for the environment variable&#39;s value. Cannot be used if value is not empty.
     * 
     */
    @Import(name="valueFrom", required=true)
    private EnvVarSourceResponse valueFrom;

    /**
     * @return (Optional) Source for the environment variable&#39;s value. Only supports secret_key_ref. Source for the environment variable&#39;s value. Cannot be used if value is not empty.
     * 
     */
    public EnvVarSourceResponse valueFrom() {
        return this.valueFrom;
    }

    private EnvVarResponse() {}

    private EnvVarResponse(EnvVarResponse $) {
        this.name = $.name;
        this.value = $.value;
        this.valueFrom = $.valueFrom;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvVarResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvVarResponse $;

        public Builder() {
            $ = new EnvVarResponse();
        }

        public Builder(EnvVarResponse defaults) {
            $ = new EnvVarResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the environment variable. Must be a C_IDENTIFIER.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param value (Optional) Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to &#34;&#34;.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        /**
         * @param valueFrom (Optional) Source for the environment variable&#39;s value. Only supports secret_key_ref. Source for the environment variable&#39;s value. Cannot be used if value is not empty.
         * 
         * @return builder
         * 
         */
        public Builder valueFrom(EnvVarSourceResponse valueFrom) {
            $.valueFrom = valueFrom;
            return this;
        }

        public EnvVarResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            $.valueFrom = Objects.requireNonNull($.valueFrom, "expected parameter 'valueFrom' to be non-null");
            return $;
        }
    }

}
