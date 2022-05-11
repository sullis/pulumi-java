// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationArgs Empty = new ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationArgs();

    /**
     * Header name of the header configuration.
     * 
     */
    @Import(name="headerName", required=true)
    private Output<String> headerName;

    /**
     * @return Header name of the header configuration.
     * 
     */
    public Output<String> headerName() {
        return this.headerName;
    }

    /**
     * Header value of the header configuration. To delete a request header set this property to an empty string.
     * 
     */
    @Import(name="headerValue", required=true)
    private Output<String> headerValue;

    /**
     * @return Header value of the header configuration. To delete a request header set this property to an empty string.
     * 
     */
    public Output<String> headerValue() {
        return this.headerValue;
    }

    private ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationArgs() {}

    private ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationArgs(ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationArgs $) {
        this.headerName = $.headerName;
        this.headerValue = $.headerValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationArgs $;

        public Builder() {
            $ = new ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationArgs();
        }

        public Builder(ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationArgs defaults) {
            $ = new ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headerName Header name of the header configuration.
         * 
         * @return builder
         * 
         */
        public Builder headerName(Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        /**
         * @param headerName Header name of the header configuration.
         * 
         * @return builder
         * 
         */
        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        /**
         * @param headerValue Header value of the header configuration. To delete a request header set this property to an empty string.
         * 
         * @return builder
         * 
         */
        public Builder headerValue(Output<String> headerValue) {
            $.headerValue = headerValue;
            return this;
        }

        /**
         * @param headerValue Header value of the header configuration. To delete a request header set this property to an empty string.
         * 
         * @return builder
         * 
         */
        public Builder headerValue(String headerValue) {
            return headerValue(Output.of(headerValue));
        }

        public ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationArgs build() {
            $.headerName = Objects.requireNonNull($.headerName, "expected parameter 'headerName' to be non-null");
            $.headerValue = Objects.requireNonNull($.headerValue, "expected parameter 'headerValue' to be non-null");
            return $;
        }
    }

}
