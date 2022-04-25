// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcLinkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcLinkArgs Empty = new GetVpcLinkArgs();

    /**
     * The name of the API Gateway VPC Link to look up. If no API Gateway VPC Link is found with this name, an error will be returned.
     * If multiple API Gateway VPC Links are found with this name, an error will be returned.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the API Gateway VPC Link to look up. If no API Gateway VPC Link is found with this name, an error will be returned.
     * If multiple API Gateway VPC Links are found with this name, an error will be returned.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Key-value map of resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Key-value map of resource tags
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetVpcLinkArgs() {}

    private GetVpcLinkArgs(GetVpcLinkArgs $) {
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcLinkArgs $;

        public Builder() {
            $ = new GetVpcLinkArgs();
        }

        public Builder(GetVpcLinkArgs defaults) {
            $ = new GetVpcLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the API Gateway VPC Link to look up. If no API Gateway VPC Link is found with this name, an error will be returned.
         * If multiple API Gateway VPC Links are found with this name, an error will be returned.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetVpcLinkArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
