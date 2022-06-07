// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudtrail.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFunctionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFunctionPlainArgs Empty = new GetFunctionPlainArgs();

    /**
     * Name of the CloudFront function.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the CloudFront function.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The function’s stage, either `DEVELOPMENT` or `LIVE`.
     * 
     */
    @Import(name="stage", required=true)
    private String stage;

    /**
     * @return The function’s stage, either `DEVELOPMENT` or `LIVE`.
     * 
     */
    public String stage() {
        return this.stage;
    }

    private GetFunctionPlainArgs() {}

    private GetFunctionPlainArgs(GetFunctionPlainArgs $) {
        this.name = $.name;
        this.stage = $.stage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFunctionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFunctionPlainArgs $;

        public Builder() {
            $ = new GetFunctionPlainArgs();
        }

        public Builder(GetFunctionPlainArgs defaults) {
            $ = new GetFunctionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the CloudFront function.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param stage The function’s stage, either `DEVELOPMENT` or `LIVE`.
         * 
         * @return builder
         * 
         */
        public Builder stage(String stage) {
            $.stage = stage;
            return this;
        }

        public GetFunctionPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.stage = Objects.requireNonNull($.stage, "expected parameter 'stage' to be non-null");
            return $;
        }
    }

}
