// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca_v1beta1.inputs.ReusableConfigValuesResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A ReusableConfigWrapper describes values that may assist in creating an X.509 certificate, or a reference to a pre-defined set of values.
 * 
 */
public final class ReusableConfigWrapperResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReusableConfigWrapperResponse Empty = new ReusableConfigWrapperResponse();

    /**
     * A resource path to a ReusableConfig in the format `projects/*{@literal /}locations/*{@literal /}reusableConfigs/*`.
     * 
     */
    @Import(name="reusableConfig", required=true)
    private String reusableConfig;

    /**
     * @return A resource path to a ReusableConfig in the format `projects/*{@literal /}locations/*{@literal /}reusableConfigs/*`.
     * 
     */
    public String reusableConfig() {
        return this.reusableConfig;
    }

    /**
     * A user-specified inline ReusableConfigValues.
     * 
     */
    @Import(name="reusableConfigValues", required=true)
    private ReusableConfigValuesResponse reusableConfigValues;

    /**
     * @return A user-specified inline ReusableConfigValues.
     * 
     */
    public ReusableConfigValuesResponse reusableConfigValues() {
        return this.reusableConfigValues;
    }

    private ReusableConfigWrapperResponse() {}

    private ReusableConfigWrapperResponse(ReusableConfigWrapperResponse $) {
        this.reusableConfig = $.reusableConfig;
        this.reusableConfigValues = $.reusableConfigValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReusableConfigWrapperResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReusableConfigWrapperResponse $;

        public Builder() {
            $ = new ReusableConfigWrapperResponse();
        }

        public Builder(ReusableConfigWrapperResponse defaults) {
            $ = new ReusableConfigWrapperResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param reusableConfig A resource path to a ReusableConfig in the format `projects/*{@literal /}locations/*{@literal /}reusableConfigs/*`.
         * 
         * @return builder
         * 
         */
        public Builder reusableConfig(String reusableConfig) {
            $.reusableConfig = reusableConfig;
            return this;
        }

        /**
         * @param reusableConfigValues A user-specified inline ReusableConfigValues.
         * 
         * @return builder
         * 
         */
        public Builder reusableConfigValues(ReusableConfigValuesResponse reusableConfigValues) {
            $.reusableConfigValues = reusableConfigValues;
            return this;
        }

        public ReusableConfigWrapperResponse build() {
            $.reusableConfig = Objects.requireNonNull($.reusableConfig, "expected parameter 'reusableConfig' to be non-null");
            $.reusableConfigValues = Objects.requireNonNull($.reusableConfigValues, "expected parameter 'reusableConfigValues' to be non-null");
            return $;
        }
    }

}
