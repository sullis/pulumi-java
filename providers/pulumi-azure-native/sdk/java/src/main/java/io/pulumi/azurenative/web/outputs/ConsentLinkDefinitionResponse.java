// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConsentLinkDefinitionResponse {
    /**
     * Display name of the parameter in the connection provider's OAuth settings
     * 
     */
    private final @Nullable String displayName;
    /**
     * URI for first party login
     * 
     */
    private final @Nullable String firstPartyLoginUri;
    /**
     * URI for the consent link
     * 
     */
    private final @Nullable String link;
    /**
     * Status of the link
     * 
     */
    private final @Nullable String status;

    @OutputCustomType.Constructor({"displayName","firstPartyLoginUri","link","status"})
    private ConsentLinkDefinitionResponse(
        @Nullable String displayName,
        @Nullable String firstPartyLoginUri,
        @Nullable String link,
        @Nullable String status) {
        this.displayName = displayName;
        this.firstPartyLoginUri = firstPartyLoginUri;
        this.link = link;
        this.status = status;
    }

    /**
     * Display name of the parameter in the connection provider's OAuth settings
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * URI for first party login
     * 
    */
    public Optional<String> getFirstPartyLoginUri() {
        return Optional.ofNullable(this.firstPartyLoginUri);
    }
    /**
     * URI for the consent link
     * 
    */
    public Optional<String> getLink() {
        return Optional.ofNullable(this.link);
    }
    /**
     * Status of the link
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsentLinkDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable String firstPartyLoginUri;
        private @Nullable String link;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsentLinkDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.firstPartyLoginUri = defaults.firstPartyLoginUri;
    	      this.link = defaults.link;
    	      this.status = defaults.status;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setFirstPartyLoginUri(@Nullable String firstPartyLoginUri) {
            this.firstPartyLoginUri = firstPartyLoginUri;
            return this;
        }

        public Builder setLink(@Nullable String link) {
            this.link = link;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }
        public ConsentLinkDefinitionResponse build() {
            return new ConsentLinkDefinitionResponse(displayName, firstPartyLoginUri, link, status);
        }
    }
}