// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the formal API definition for the app.
 * 
 */
public final class ApiDefinitionInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApiDefinitionInfoResponse Empty = new ApiDefinitionInfoResponse();

    /**
     * The URL of the API definition.
     * 
     */
    @Import(name="url")
    private @Nullable String url;

    /**
     * @return The URL of the API definition.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    private ApiDefinitionInfoResponse() {}

    private ApiDefinitionInfoResponse(ApiDefinitionInfoResponse $) {
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiDefinitionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiDefinitionInfoResponse $;

        public Builder() {
            $ = new ApiDefinitionInfoResponse();
        }

        public Builder(ApiDefinitionInfoResponse defaults) {
            $ = new ApiDefinitionInfoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param url The URL of the API definition.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable String url) {
            $.url = url;
            return this;
        }

        public ApiDefinitionInfoResponse build() {
            return $;
        }
    }

}
