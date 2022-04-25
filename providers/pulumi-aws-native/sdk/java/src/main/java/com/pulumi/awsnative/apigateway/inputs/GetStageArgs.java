// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStageArgs Empty = new GetStageArgs();

    /**
     * The ID of the RestApi resource that you&#39;re deploying with this stage.
     * 
     */
    @Import(name="restApiId", required=true)
    private String restApiId;

    /**
     * @return The ID of the RestApi resource that you&#39;re deploying with this stage.
     * 
     */
    public String restApiId() {
        return this.restApiId;
    }

    /**
     * The name of the stage, which API Gateway uses as the first path segment in the invoked Uniform Resource Identifier (URI).
     * 
     */
    @Import(name="stageName", required=true)
    private String stageName;

    /**
     * @return The name of the stage, which API Gateway uses as the first path segment in the invoked Uniform Resource Identifier (URI).
     * 
     */
    public String stageName() {
        return this.stageName;
    }

    private GetStageArgs() {}

    private GetStageArgs(GetStageArgs $) {
        this.restApiId = $.restApiId;
        this.stageName = $.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStageArgs $;

        public Builder() {
            $ = new GetStageArgs();
        }

        public Builder(GetStageArgs defaults) {
            $ = new GetStageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param restApiId The ID of the RestApi resource that you&#39;re deploying with this stage.
         * 
         * @return builder
         * 
         */
        public Builder restApiId(String restApiId) {
            $.restApiId = restApiId;
            return this;
        }

        /**
         * @param stageName The name of the stage, which API Gateway uses as the first path segment in the invoked Uniform Resource Identifier (URI).
         * 
         * @return builder
         * 
         */
        public Builder stageName(String stageName) {
            $.stageName = stageName;
            return this;
        }

        public GetStageArgs build() {
            $.restApiId = Objects.requireNonNull($.restApiId, "expected parameter 'restApiId' to be non-null");
            $.stageName = Objects.requireNonNull($.stageName, "expected parameter 'stageName' to be non-null");
            return $;
        }
    }

}
