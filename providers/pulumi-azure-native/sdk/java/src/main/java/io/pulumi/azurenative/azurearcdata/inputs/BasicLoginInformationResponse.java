// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Username and password for basic login authentication.
 * 
 */
public final class BasicLoginInformationResponse extends io.pulumi.resources.InvokeArgs {

    public static final BasicLoginInformationResponse Empty = new BasicLoginInformationResponse();

    /**
     * Login username.
     * 
     */
    @InputImport(name="username")
    private final @Nullable String username;

    public Optional<String> getUsername() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public BasicLoginInformationResponse(@Nullable String username) {
        this.username = username;
    }

    private BasicLoginInformationResponse() {
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicLoginInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicLoginInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.username = defaults.username;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }

        public BasicLoginInformationResponse build() {
            return new BasicLoginInformationResponse(username);
        }
    }
}
