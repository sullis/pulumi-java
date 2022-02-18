// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Facebook page for Facebook channel registration
 * 
 */
public final class FacebookPageArgs extends io.pulumi.resources.ResourceArgs {

    public static final FacebookPageArgs Empty = new FacebookPageArgs();

    /**
     * Facebook application access token. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @InputImport(name="accessToken")
    private final @Nullable Input<String> accessToken;

    public Input<String> getAccessToken() {
        return this.accessToken == null ? Input.empty() : this.accessToken;
    }

    /**
     * Page id
     * 
     */
    @InputImport(name="id", required=true)
    private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    public FacebookPageArgs(
        @Nullable Input<String> accessToken,
        Input<String> id) {
        this.accessToken = accessToken;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private FacebookPageArgs() {
        this.accessToken = Input.empty();
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FacebookPageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessToken;
        private Input<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(FacebookPageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.id = defaults.id;
        }

        public Builder setAccessToken(@Nullable Input<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setAccessToken(@Nullable String accessToken) {
            this.accessToken = Input.ofNullable(accessToken);
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public FacebookPageArgs build() {
            return new FacebookPageArgs(accessToken, id);
        }
    }
}
