// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApiArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiArgs Empty = new GetApiArgs();

    /**
     * The API identifier.
     * 
     */
    @Import(name="apiId", required=true)
    private String apiId;

    /**
     * @return The API identifier.
     * 
     */
    public String apiId() {
        return this.apiId;
    }

    /**
     * A map of resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A map of resource tags.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetApiArgs() {}

    private GetApiArgs(GetApiArgs $) {
        this.apiId = $.apiId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiArgs $;

        public Builder() {
            $ = new GetApiArgs();
        }

        public Builder(GetApiArgs defaults) {
            $ = new GetApiArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId The API identifier.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param tags A map of resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetApiArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            return $;
        }
    }

}
