// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MethodResponseState extends com.pulumi.resources.ResourceArgs {

    public static final MethodResponseState Empty = new MethodResponseState();

    /**
     * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
     * 
     */
    @Import(name="httpMethod")
    private @Nullable Output<String> httpMethod;

    /**
     * @return The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
     * 
     */
    public Optional<Output<String>> httpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }

    /**
     * The API resource ID
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return The API resource ID
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * A map of the API models used for the response&#39;s content type
     * 
     */
    @Import(name="responseModels")
    private @Nullable Output<Map<String,String>> responseModels;

    /**
     * @return A map of the API models used for the response&#39;s content type
     * 
     */
    public Optional<Output<Map<String,String>>> responseModels() {
        return Optional.ofNullable(this.responseModels);
    }

    /**
     * A map of response parameters that can be sent to the caller.
     * For example: `response_parameters = { &#34;method.response.header.X-Some-Header&#34; = true }`
     * would define that the header `X-Some-Header` can be provided on the response.
     * 
     */
    @Import(name="responseParameters")
    private @Nullable Output<Map<String,Boolean>> responseParameters;

    /**
     * @return A map of response parameters that can be sent to the caller.
     * For example: `response_parameters = { &#34;method.response.header.X-Some-Header&#34; = true }`
     * would define that the header `X-Some-Header` can be provided on the response.
     * 
     */
    public Optional<Output<Map<String,Boolean>>> responseParameters() {
        return Optional.ofNullable(this.responseParameters);
    }

    /**
     * The ID of the associated REST API
     * 
     */
    @Import(name="restApi")
    private @Nullable Output<String> restApi;

    /**
     * @return The ID of the associated REST API
     * 
     */
    public Optional<Output<String>> restApi() {
        return Optional.ofNullable(this.restApi);
    }

    /**
     * The HTTP status code
     * 
     */
    @Import(name="statusCode")
    private @Nullable Output<String> statusCode;

    /**
     * @return The HTTP status code
     * 
     */
    public Optional<Output<String>> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }

    private MethodResponseState() {}

    private MethodResponseState(MethodResponseState $) {
        this.httpMethod = $.httpMethod;
        this.resourceId = $.resourceId;
        this.responseModels = $.responseModels;
        this.responseParameters = $.responseParameters;
        this.restApi = $.restApi;
        this.statusCode = $.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MethodResponseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MethodResponseState $;

        public Builder() {
            $ = new MethodResponseState();
        }

        public Builder(MethodResponseState defaults) {
            $ = new MethodResponseState(Objects.requireNonNull(defaults));
        }

        /**
         * @param httpMethod The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(@Nullable Output<String> httpMethod) {
            $.httpMethod = httpMethod;
            return this;
        }

        /**
         * @param httpMethod The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(String httpMethod) {
            return httpMethod(Output.of(httpMethod));
        }

        /**
         * @param resourceId The API resource ID
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The API resource ID
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param responseModels A map of the API models used for the response&#39;s content type
         * 
         * @return builder
         * 
         */
        public Builder responseModels(@Nullable Output<Map<String,String>> responseModels) {
            $.responseModels = responseModels;
            return this;
        }

        /**
         * @param responseModels A map of the API models used for the response&#39;s content type
         * 
         * @return builder
         * 
         */
        public Builder responseModels(Map<String,String> responseModels) {
            return responseModels(Output.of(responseModels));
        }

        /**
         * @param responseParameters A map of response parameters that can be sent to the caller.
         * For example: `response_parameters = { &#34;method.response.header.X-Some-Header&#34; = true }`
         * would define that the header `X-Some-Header` can be provided on the response.
         * 
         * @return builder
         * 
         */
        public Builder responseParameters(@Nullable Output<Map<String,Boolean>> responseParameters) {
            $.responseParameters = responseParameters;
            return this;
        }

        /**
         * @param responseParameters A map of response parameters that can be sent to the caller.
         * For example: `response_parameters = { &#34;method.response.header.X-Some-Header&#34; = true }`
         * would define that the header `X-Some-Header` can be provided on the response.
         * 
         * @return builder
         * 
         */
        public Builder responseParameters(Map<String,Boolean> responseParameters) {
            return responseParameters(Output.of(responseParameters));
        }

        /**
         * @param restApi The ID of the associated REST API
         * 
         * @return builder
         * 
         */
        public Builder restApi(@Nullable Output<String> restApi) {
            $.restApi = restApi;
            return this;
        }

        /**
         * @param restApi The ID of the associated REST API
         * 
         * @return builder
         * 
         */
        public Builder restApi(String restApi) {
            return restApi(Output.of(restApi));
        }

        /**
         * @param statusCode The HTTP status code
         * 
         * @return builder
         * 
         */
        public Builder statusCode(@Nullable Output<String> statusCode) {
            $.statusCode = statusCode;
            return this;
        }

        /**
         * @param statusCode The HTTP status code
         * 
         * @return builder
         * 
         */
        public Builder statusCode(String statusCode) {
            return statusCode(Output.of(statusCode));
        }

        public MethodResponseState build() {
            return $;
        }
    }

}
