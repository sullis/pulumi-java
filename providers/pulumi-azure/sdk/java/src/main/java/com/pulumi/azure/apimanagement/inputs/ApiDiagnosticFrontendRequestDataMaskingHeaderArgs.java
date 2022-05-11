// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApiDiagnosticFrontendRequestDataMaskingHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiDiagnosticFrontendRequestDataMaskingHeaderArgs Empty = new ApiDiagnosticFrontendRequestDataMaskingHeaderArgs();

    /**
     * The data masking mode. Possible values are `Mask` and `Hide` for `query_params`. The only possible value is `Mask` for `headers`.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    /**
     * @return The data masking mode. Possible values are `Mask` and `Hide` for `query_params`. The only possible value is `Mask` for `headers`.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    /**
     * The name of the header or the query parameter to mask.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The name of the header or the query parameter to mask.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private ApiDiagnosticFrontendRequestDataMaskingHeaderArgs() {}

    private ApiDiagnosticFrontendRequestDataMaskingHeaderArgs(ApiDiagnosticFrontendRequestDataMaskingHeaderArgs $) {
        this.mode = $.mode;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiDiagnosticFrontendRequestDataMaskingHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiDiagnosticFrontendRequestDataMaskingHeaderArgs $;

        public Builder() {
            $ = new ApiDiagnosticFrontendRequestDataMaskingHeaderArgs();
        }

        public Builder(ApiDiagnosticFrontendRequestDataMaskingHeaderArgs defaults) {
            $ = new ApiDiagnosticFrontendRequestDataMaskingHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode The data masking mode. Possible values are `Mask` and `Hide` for `query_params`. The only possible value is `Mask` for `headers`.
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The data masking mode. Possible values are `Mask` and `Hide` for `query_params`. The only possible value is `Mask` for `headers`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param value The name of the header or the query parameter to mask.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The name of the header or the query parameter to mask.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ApiDiagnosticFrontendRequestDataMaskingHeaderArgs build() {
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
