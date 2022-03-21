// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StackAccessEndpoint {
    private final String endpointType;
    private final @Nullable String vpceId;

    @CustomType.Constructor
    private StackAccessEndpoint(
        @CustomType.Parameter("endpointType") String endpointType,
        @CustomType.Parameter("vpceId") @Nullable String vpceId) {
        this.endpointType = endpointType;
        this.vpceId = vpceId;
    }

    public String getEndpointType() {
        return this.endpointType;
    }
    public Optional<String> getVpceId() {
        return Optional.ofNullable(this.vpceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackAccessEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointType;
        private @Nullable String vpceId;

        public Builder() {
    	      // Empty
        }

        public Builder(StackAccessEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.vpceId = defaults.vpceId;
        }

        public Builder endpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }
        public Builder vpceId(@Nullable String vpceId) {
            this.vpceId = vpceId;
            return this;
        }        public StackAccessEndpoint build() {
            return new StackAccessEndpoint(endpointType, vpceId);
        }
    }
}
