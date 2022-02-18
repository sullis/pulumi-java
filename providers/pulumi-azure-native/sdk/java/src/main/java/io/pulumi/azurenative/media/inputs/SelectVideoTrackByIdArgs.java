// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Select video tracks from the input by specifying a track identifier.
 * 
 */
public final class SelectVideoTrackByIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final SelectVideoTrackByIdArgs Empty = new SelectVideoTrackByIdArgs();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectVideoTrackById'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    /**
     * Track identifier to select
     * 
     */
    @InputImport(name="trackId", required=true)
    private final Input<Double> trackId;

    public Input<Double> getTrackId() {
        return this.trackId;
    }

    public SelectVideoTrackByIdArgs(
        Input<String> odataType,
        Input<Double> trackId) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.trackId = Objects.requireNonNull(trackId, "expected parameter 'trackId' to be non-null");
    }

    private SelectVideoTrackByIdArgs() {
        this.odataType = Input.empty();
        this.trackId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectVideoTrackByIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> odataType;
        private Input<Double> trackId;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectVideoTrackByIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.trackId = defaults.trackId;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setTrackId(Input<Double> trackId) {
            this.trackId = Objects.requireNonNull(trackId);
            return this;
        }

        public Builder setTrackId(Double trackId) {
            this.trackId = Input.of(Objects.requireNonNull(trackId));
            return this;
        }

        public SelectVideoTrackByIdArgs build() {
            return new SelectVideoTrackByIdArgs(odataType, trackId);
        }
    }
}
