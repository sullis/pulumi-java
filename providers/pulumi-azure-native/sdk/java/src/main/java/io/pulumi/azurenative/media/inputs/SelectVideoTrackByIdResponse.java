// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Select video tracks from the input by specifying a track identifier.
 * 
 */
public final class SelectVideoTrackByIdResponse extends io.pulumi.resources.InvokeArgs {

    public static final SelectVideoTrackByIdResponse Empty = new SelectVideoTrackByIdResponse();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectVideoTrackById'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Track identifier to select
     * 
     */
    @InputImport(name="trackId", required=true)
    private final Double trackId;

    public Double getTrackId() {
        return this.trackId;
    }

    public SelectVideoTrackByIdResponse(
        String odataType,
        Double trackId) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.trackId = Objects.requireNonNull(trackId, "expected parameter 'trackId' to be non-null");
    }

    private SelectVideoTrackByIdResponse() {
        this.odataType = null;
        this.trackId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectVideoTrackByIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private Double trackId;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectVideoTrackByIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.trackId = defaults.trackId;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setTrackId(Double trackId) {
            this.trackId = Objects.requireNonNull(trackId);
            return this;
        }

        public SelectVideoTrackByIdResponse build() {
            return new SelectVideoTrackByIdResponse(odataType, trackId);
        }
    }
}
