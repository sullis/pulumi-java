// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class IntegrationResponseParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationResponseParameterArgs Empty = new IntegrationResponseParameterArgs();

    /**
     * A key-value map. The key of ths map identifies the location of the request parameter to change, and how to change it. The corresponding value specifies the new data for the parameter.
     * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html) for details.
     * 
     */
    @Import(name="mappings", required=true)
    private Output<Map<String,String>> mappings;

    /**
     * @return A key-value map. The key of ths map identifies the location of the request parameter to change, and how to change it. The corresponding value specifies the new data for the parameter.
     * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html) for details.
     * 
     */
    public Output<Map<String,String>> mappings() {
        return this.mappings;
    }

    /**
     * The HTTP status code in the range 200-599.
     * 
     */
    @Import(name="statusCode", required=true)
    private Output<String> statusCode;

    /**
     * @return The HTTP status code in the range 200-599.
     * 
     */
    public Output<String> statusCode() {
        return this.statusCode;
    }

    private IntegrationResponseParameterArgs() {}

    private IntegrationResponseParameterArgs(IntegrationResponseParameterArgs $) {
        this.mappings = $.mappings;
        this.statusCode = $.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationResponseParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationResponseParameterArgs $;

        public Builder() {
            $ = new IntegrationResponseParameterArgs();
        }

        public Builder(IntegrationResponseParameterArgs defaults) {
            $ = new IntegrationResponseParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mappings A key-value map. The key of ths map identifies the location of the request parameter to change, and how to change it. The corresponding value specifies the new data for the parameter.
         * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html) for details.
         * 
         * @return builder
         * 
         */
        public Builder mappings(Output<Map<String,String>> mappings) {
            $.mappings = mappings;
            return this;
        }

        /**
         * @param mappings A key-value map. The key of ths map identifies the location of the request parameter to change, and how to change it. The corresponding value specifies the new data for the parameter.
         * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html) for details.
         * 
         * @return builder
         * 
         */
        public Builder mappings(Map<String,String> mappings) {
            return mappings(Output.of(mappings));
        }

        /**
         * @param statusCode The HTTP status code in the range 200-599.
         * 
         * @return builder
         * 
         */
        public Builder statusCode(Output<String> statusCode) {
            $.statusCode = statusCode;
            return this;
        }

        /**
         * @param statusCode The HTTP status code in the range 200-599.
         * 
         * @return builder
         * 
         */
        public Builder statusCode(String statusCode) {
            return statusCode(Output.of(statusCode));
        }

        public IntegrationResponseParameterArgs build() {
            $.mappings = Objects.requireNonNull($.mappings, "expected parameter 'mappings' to be non-null");
            $.statusCode = Objects.requireNonNull($.statusCode, "expected parameter 'statusCode' to be non-null");
            return $;
        }
    }

}
