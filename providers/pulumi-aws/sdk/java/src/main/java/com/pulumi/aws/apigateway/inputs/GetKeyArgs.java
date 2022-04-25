// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyArgs Empty = new GetKeyArgs();

    /**
     * The ID of the API Key to look up.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the API Key to look up.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * A map of tags for the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A map of tags for the resource.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetKeyArgs() {}

    private GetKeyArgs(GetKeyArgs $) {
        this.id = $.id;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyArgs $;

        public Builder() {
            $ = new GetKeyArgs();
        }

        public Builder(GetKeyArgs defaults) {
            $ = new GetKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the API Key to look up.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param tags A map of tags for the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetKeyArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
