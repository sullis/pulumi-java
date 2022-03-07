// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RadiusServerResponse {
    /**
     * The address of this radius server.
     * 
     */
    private final String radiusServerAddress;
    /**
     * The initial score assigned to this radius server.
     * 
     */
    private final @Nullable Double radiusServerScore;
    /**
     * The secret used for this radius server.
     * 
     */
    private final @Nullable String radiusServerSecret;

    @OutputCustomType.Constructor({"radiusServerAddress","radiusServerScore","radiusServerSecret"})
    private RadiusServerResponse(
        String radiusServerAddress,
        @Nullable Double radiusServerScore,
        @Nullable String radiusServerSecret) {
        this.radiusServerAddress = Objects.requireNonNull(radiusServerAddress);
        this.radiusServerScore = radiusServerScore;
        this.radiusServerSecret = radiusServerSecret;
    }

    /**
     * The address of this radius server.
     * 
    */
    public String getRadiusServerAddress() {
        return this.radiusServerAddress;
    }
    /**
     * The initial score assigned to this radius server.
     * 
    */
    public Optional<Double> getRadiusServerScore() {
        return Optional.ofNullable(this.radiusServerScore);
    }
    /**
     * The secret used for this radius server.
     * 
    */
    public Optional<String> getRadiusServerSecret() {
        return Optional.ofNullable(this.radiusServerSecret);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RadiusServerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String radiusServerAddress;
        private @Nullable Double radiusServerScore;
        private @Nullable String radiusServerSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(RadiusServerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.radiusServerAddress = defaults.radiusServerAddress;
    	      this.radiusServerScore = defaults.radiusServerScore;
    	      this.radiusServerSecret = defaults.radiusServerSecret;
        }

        public Builder setRadiusServerAddress(String radiusServerAddress) {
            this.radiusServerAddress = Objects.requireNonNull(radiusServerAddress);
            return this;
        }

        public Builder setRadiusServerScore(@Nullable Double radiusServerScore) {
            this.radiusServerScore = radiusServerScore;
            return this;
        }

        public Builder setRadiusServerSecret(@Nullable String radiusServerSecret) {
            this.radiusServerSecret = radiusServerSecret;
            return this;
        }
        public RadiusServerResponse build() {
            return new RadiusServerResponse(radiusServerAddress, radiusServerScore, radiusServerSecret);
        }
    }
}