// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.azurenative.streamanalytics.outputs.PrivateLinkServiceConnectionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrivateEndpointPropertiesResponse {
    /**
     * The date when this private endpoint was created.
     * 
     */
    private final String createdDate;
    /**
     * A list of connections to the remote resource. Immutable after it is set.
     * 
     */
    private final @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections;

    @OutputCustomType.Constructor({"createdDate","manualPrivateLinkServiceConnections"})
    private PrivateEndpointPropertiesResponse(
        String createdDate,
        @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections) {
        this.createdDate = Objects.requireNonNull(createdDate);
        this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
    }

    /**
     * The date when this private endpoint was created.
     * 
     */
    public String getCreatedDate() {
        return this.createdDate;
    }
    /**
     * A list of connections to the remote resource. Immutable after it is set.
     * 
     */
    public List<PrivateLinkServiceConnectionResponse> getManualPrivateLinkServiceConnections() {
        return this.manualPrivateLinkServiceConnections == null ? List.of() : this.manualPrivateLinkServiceConnections;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdDate;
        private @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.manualPrivateLinkServiceConnections = defaults.manualPrivateLinkServiceConnections;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder setManualPrivateLinkServiceConnections(@Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections) {
            this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
            return this;
        }

        public PrivateEndpointPropertiesResponse build() {
            return new PrivateEndpointPropertiesResponse(createdDate, manualPrivateLinkServiceConnections);
        }
    }
}
