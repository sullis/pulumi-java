// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital.inputs;

import io.pulumi.azurenative.orbital.inputs.ResourceReferenceResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Customer retrieves list of Available Contacts for a spacecraft resource. Later, one of the available contact can be selected to create a contact.
 * 
 */
public final class AvailableContactsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AvailableContactsResponse Empty = new AvailableContactsResponse();

    /**
     * Azimuth of the antenna at the end of the contact in decimal degrees.
     * 
     */
    @Import(name="endAzimuthDegrees", required=true)
      private final Double endAzimuthDegrees;

    public Double getEndAzimuthDegrees() {
        return this.endAzimuthDegrees;
    }

    /**
     * Spacecraft elevation above the horizon at contact end.
     * 
     */
    @Import(name="endElevationDegrees", required=true)
      private final Double endElevationDegrees;

    public Double getEndElevationDegrees() {
        return this.endElevationDegrees;
    }

    /**
     * Name of Azure Ground Station.
     * 
     */
    @Import(name="groundStationName", required=true)
      private final String groundStationName;

    public String getGroundStationName() {
        return this.groundStationName;
    }

    /**
     * Maximum elevation of the antenna during the contact in decimal degrees.
     * 
     */
    @Import(name="maximumElevationDegrees", required=true)
      private final Double maximumElevationDegrees;

    public Double getMaximumElevationDegrees() {
        return this.maximumElevationDegrees;
    }

    /**
     * Time to lost receiving a signal.
     * 
     */
    @Import(name="rxEndTime", required=true)
      private final String rxEndTime;

    public String getRxEndTime() {
        return this.rxEndTime;
    }

    /**
     * Earliest time to receive a signal.
     * 
     */
    @Import(name="rxStartTime", required=true)
      private final String rxStartTime;

    public String getRxStartTime() {
        return this.rxStartTime;
    }

    /**
     * The reference to the spacecraft resource.
     * 
     */
    @Import(name="spacecraft")
      private final @Nullable ResourceReferenceResponse spacecraft;

    public Optional<ResourceReferenceResponse> getSpacecraft() {
        return this.spacecraft == null ? Optional.empty() : Optional.ofNullable(this.spacecraft);
    }

    /**
     * Azimuth of the antenna at the start of the contact in decimal degrees.
     * 
     */
    @Import(name="startAzimuthDegrees", required=true)
      private final Double startAzimuthDegrees;

    public Double getStartAzimuthDegrees() {
        return this.startAzimuthDegrees;
    }

    /**
     * Spacecraft elevation above the horizon at contact start.
     * 
     */
    @Import(name="startElevationDegrees", required=true)
      private final Double startElevationDegrees;

    public Double getStartElevationDegrees() {
        return this.startElevationDegrees;
    }

    /**
     * Time at which antenna transmit will be disabled.
     * 
     */
    @Import(name="txEndTime", required=true)
      private final String txEndTime;

    public String getTxEndTime() {
        return this.txEndTime;
    }

    /**
     * Time at which antenna transmit will be enabled.
     * 
     */
    @Import(name="txStartTime", required=true)
      private final String txStartTime;

    public String getTxStartTime() {
        return this.txStartTime;
    }

    public AvailableContactsResponse(
        Double endAzimuthDegrees,
        Double endElevationDegrees,
        String groundStationName,
        Double maximumElevationDegrees,
        String rxEndTime,
        String rxStartTime,
        @Nullable ResourceReferenceResponse spacecraft,
        Double startAzimuthDegrees,
        Double startElevationDegrees,
        String txEndTime,
        String txStartTime) {
        this.endAzimuthDegrees = Objects.requireNonNull(endAzimuthDegrees, "expected parameter 'endAzimuthDegrees' to be non-null");
        this.endElevationDegrees = Objects.requireNonNull(endElevationDegrees, "expected parameter 'endElevationDegrees' to be non-null");
        this.groundStationName = Objects.requireNonNull(groundStationName, "expected parameter 'groundStationName' to be non-null");
        this.maximumElevationDegrees = Objects.requireNonNull(maximumElevationDegrees, "expected parameter 'maximumElevationDegrees' to be non-null");
        this.rxEndTime = Objects.requireNonNull(rxEndTime, "expected parameter 'rxEndTime' to be non-null");
        this.rxStartTime = Objects.requireNonNull(rxStartTime, "expected parameter 'rxStartTime' to be non-null");
        this.spacecraft = spacecraft;
        this.startAzimuthDegrees = Objects.requireNonNull(startAzimuthDegrees, "expected parameter 'startAzimuthDegrees' to be non-null");
        this.startElevationDegrees = Objects.requireNonNull(startElevationDegrees, "expected parameter 'startElevationDegrees' to be non-null");
        this.txEndTime = Objects.requireNonNull(txEndTime, "expected parameter 'txEndTime' to be non-null");
        this.txStartTime = Objects.requireNonNull(txStartTime, "expected parameter 'txStartTime' to be non-null");
    }

    private AvailableContactsResponse() {
        this.endAzimuthDegrees = null;
        this.endElevationDegrees = null;
        this.groundStationName = null;
        this.maximumElevationDegrees = null;
        this.rxEndTime = null;
        this.rxStartTime = null;
        this.spacecraft = null;
        this.startAzimuthDegrees = null;
        this.startElevationDegrees = null;
        this.txEndTime = null;
        this.txStartTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvailableContactsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double endAzimuthDegrees;
        private Double endElevationDegrees;
        private String groundStationName;
        private Double maximumElevationDegrees;
        private String rxEndTime;
        private String rxStartTime;
        private @Nullable ResourceReferenceResponse spacecraft;
        private Double startAzimuthDegrees;
        private Double startElevationDegrees;
        private String txEndTime;
        private String txStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(AvailableContactsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endAzimuthDegrees = defaults.endAzimuthDegrees;
    	      this.endElevationDegrees = defaults.endElevationDegrees;
    	      this.groundStationName = defaults.groundStationName;
    	      this.maximumElevationDegrees = defaults.maximumElevationDegrees;
    	      this.rxEndTime = defaults.rxEndTime;
    	      this.rxStartTime = defaults.rxStartTime;
    	      this.spacecraft = defaults.spacecraft;
    	      this.startAzimuthDegrees = defaults.startAzimuthDegrees;
    	      this.startElevationDegrees = defaults.startElevationDegrees;
    	      this.txEndTime = defaults.txEndTime;
    	      this.txStartTime = defaults.txStartTime;
        }

        public Builder endAzimuthDegrees(Double endAzimuthDegrees) {
            this.endAzimuthDegrees = Objects.requireNonNull(endAzimuthDegrees);
            return this;
        }
        public Builder endElevationDegrees(Double endElevationDegrees) {
            this.endElevationDegrees = Objects.requireNonNull(endElevationDegrees);
            return this;
        }
        public Builder groundStationName(String groundStationName) {
            this.groundStationName = Objects.requireNonNull(groundStationName);
            return this;
        }
        public Builder maximumElevationDegrees(Double maximumElevationDegrees) {
            this.maximumElevationDegrees = Objects.requireNonNull(maximumElevationDegrees);
            return this;
        }
        public Builder rxEndTime(String rxEndTime) {
            this.rxEndTime = Objects.requireNonNull(rxEndTime);
            return this;
        }
        public Builder rxStartTime(String rxStartTime) {
            this.rxStartTime = Objects.requireNonNull(rxStartTime);
            return this;
        }
        public Builder spacecraft(@Nullable ResourceReferenceResponse spacecraft) {
            this.spacecraft = spacecraft;
            return this;
        }
        public Builder startAzimuthDegrees(Double startAzimuthDegrees) {
            this.startAzimuthDegrees = Objects.requireNonNull(startAzimuthDegrees);
            return this;
        }
        public Builder startElevationDegrees(Double startElevationDegrees) {
            this.startElevationDegrees = Objects.requireNonNull(startElevationDegrees);
            return this;
        }
        public Builder txEndTime(String txEndTime) {
            this.txEndTime = Objects.requireNonNull(txEndTime);
            return this;
        }
        public Builder txStartTime(String txStartTime) {
            this.txStartTime = Objects.requireNonNull(txStartTime);
            return this;
        }        public AvailableContactsResponse build() {
            return new AvailableContactsResponse(endAzimuthDegrees, endElevationDegrees, groundStationName, maximumElevationDegrees, rxEndTime, rxStartTime, spacecraft, startAzimuthDegrees, startElevationDegrees, txEndTime, txStartTime);
        }
    }
}
