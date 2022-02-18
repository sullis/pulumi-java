// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewayProbeHealthResponseMatchResponse {
    /**
     * Body that must be contained in the health response. Default value is empty.
     * 
     */
    private final @Nullable String body;
    /**
     * Allowed ranges of healthy status codes. Default range of healthy status codes is 200-399.
     * 
     */
    private final @Nullable List<String> statusCodes;

    @OutputCustomType.Constructor({"body","statusCodes"})
    private ApplicationGatewayProbeHealthResponseMatchResponse(
        @Nullable String body,
        @Nullable List<String> statusCodes) {
        this.body = body;
        this.statusCodes = statusCodes;
    }

    /**
     * Body that must be contained in the health response. Default value is empty.
     * 
     */
    public Optional<String> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Allowed ranges of healthy status codes. Default range of healthy status codes is 200-399.
     * 
     */
    public List<String> getStatusCodes() {
        return this.statusCodes == null ? List.of() : this.statusCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayProbeHealthResponseMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String body;
        private @Nullable List<String> statusCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayProbeHealthResponseMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.statusCodes = defaults.statusCodes;
        }

        public Builder setBody(@Nullable String body) {
            this.body = body;
            return this;
        }

        public Builder setStatusCodes(@Nullable List<String> statusCodes) {
            this.statusCodes = statusCodes;
            return this;
        }

        public ApplicationGatewayProbeHealthResponseMatchResponse build() {
            return new ApplicationGatewayProbeHealthResponseMatchResponse(body, statusCodes);
        }
    }
}
