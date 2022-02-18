// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedClusterServicePrincipalProfileResponse {
    /**
     * The ID for the service principal.
     * 
     */
    private final String clientId;
    /**
     * The secret password associated with the service principal in plain text.
     * 
     */
    private final @Nullable String secret;

    @OutputCustomType.Constructor({"clientId","secret"})
    private ManagedClusterServicePrincipalProfileResponse(
        String clientId,
        @Nullable String secret) {
        this.clientId = Objects.requireNonNull(clientId);
        this.secret = secret;
    }

    /**
     * The ID for the service principal.
     * 
     */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * The secret password associated with the service principal in plain text.
     * 
     */
    public Optional<String> getSecret() {
        return Optional.ofNullable(this.secret);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterServicePrincipalProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private @Nullable String secret;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterServicePrincipalProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.secret = defaults.secret;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setSecret(@Nullable String secret) {
            this.secret = secret;
            return this;
        }

        public ManagedClusterServicePrincipalProfileResponse build() {
            return new ManagedClusterServicePrincipalProfileResponse(clientId, secret);
        }
    }
}
