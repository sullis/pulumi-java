// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiResourcePoliciesResponse {
    /**
     * @return The API level only policies XML as embedded content.
     * 
     */
    private final @Nullable String content;
    /**
     * @return The content link to the policies.
     * 
     */
    private final @Nullable String contentLink;

    @CustomType.Constructor
    private ApiResourcePoliciesResponse(
        @CustomType.Parameter("content") @Nullable String content,
        @CustomType.Parameter("contentLink") @Nullable String contentLink) {
        this.content = content;
        this.contentLink = contentLink;
    }

    /**
     * @return The API level only policies XML as embedded content.
     * 
     */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * @return The content link to the policies.
     * 
     */
    public Optional<String> contentLink() {
        return Optional.ofNullable(this.contentLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiResourcePoliciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;
        private @Nullable String contentLink;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiResourcePoliciesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentLink = defaults.contentLink;
        }

        public Builder content(@Nullable String content) {
            this.content = content;
            return this;
        }
        public Builder contentLink(@Nullable String contentLink) {
            this.contentLink = contentLink;
            return this;
        }        public ApiResourcePoliciesResponse build() {
            return new ApiResourcePoliciesResponse(content, contentLink);
        }
    }
}
