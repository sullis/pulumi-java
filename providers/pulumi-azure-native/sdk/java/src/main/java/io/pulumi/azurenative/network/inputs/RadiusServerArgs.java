// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Radius Server Settings.
 * 
 */
public final class RadiusServerArgs extends io.pulumi.resources.ResourceArgs {

    public static final RadiusServerArgs Empty = new RadiusServerArgs();

    /**
     * The address of this radius server.
     * 
     */
    @InputImport(name="radiusServerAddress", required=true)
    private final Input<String> radiusServerAddress;

    public Input<String> getRadiusServerAddress() {
        return this.radiusServerAddress;
    }

    /**
     * The initial score assigned to this radius server.
     * 
     */
    @InputImport(name="radiusServerScore")
    private final @Nullable Input<Double> radiusServerScore;

    public Input<Double> getRadiusServerScore() {
        return this.radiusServerScore == null ? Input.empty() : this.radiusServerScore;
    }

    /**
     * The secret used for this radius server.
     * 
     */
    @InputImport(name="radiusServerSecret")
    private final @Nullable Input<String> radiusServerSecret;

    public Input<String> getRadiusServerSecret() {
        return this.radiusServerSecret == null ? Input.empty() : this.radiusServerSecret;
    }

    public RadiusServerArgs(
        Input<String> radiusServerAddress,
        @Nullable Input<Double> radiusServerScore,
        @Nullable Input<String> radiusServerSecret) {
        this.radiusServerAddress = Objects.requireNonNull(radiusServerAddress, "expected parameter 'radiusServerAddress' to be non-null");
        this.radiusServerScore = radiusServerScore;
        this.radiusServerSecret = radiusServerSecret;
    }

    private RadiusServerArgs() {
        this.radiusServerAddress = Input.empty();
        this.radiusServerScore = Input.empty();
        this.radiusServerSecret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RadiusServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> radiusServerAddress;
        private @Nullable Input<Double> radiusServerScore;
        private @Nullable Input<String> radiusServerSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(RadiusServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.radiusServerAddress = defaults.radiusServerAddress;
    	      this.radiusServerScore = defaults.radiusServerScore;
    	      this.radiusServerSecret = defaults.radiusServerSecret;
        }

        public Builder setRadiusServerAddress(Input<String> radiusServerAddress) {
            this.radiusServerAddress = Objects.requireNonNull(radiusServerAddress);
            return this;
        }

        public Builder setRadiusServerAddress(String radiusServerAddress) {
            this.radiusServerAddress = Input.of(Objects.requireNonNull(radiusServerAddress));
            return this;
        }

        public Builder setRadiusServerScore(@Nullable Input<Double> radiusServerScore) {
            this.radiusServerScore = radiusServerScore;
            return this;
        }

        public Builder setRadiusServerScore(@Nullable Double radiusServerScore) {
            this.radiusServerScore = Input.ofNullable(radiusServerScore);
            return this;
        }

        public Builder setRadiusServerSecret(@Nullable Input<String> radiusServerSecret) {
            this.radiusServerSecret = radiusServerSecret;
            return this;
        }

        public Builder setRadiusServerSecret(@Nullable String radiusServerSecret) {
            this.radiusServerSecret = Input.ofNullable(radiusServerSecret);
            return this;
        }

        public RadiusServerArgs build() {
            return new RadiusServerArgs(radiusServerAddress, radiusServerScore, radiusServerSecret);
        }
    }
}
