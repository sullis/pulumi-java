// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital.outputs;

import io.pulumi.azurenative.orbital.outputs.ContactProfileLinkChannelResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContactProfileLinkResponse {
    /**
     * Contact Profile Link Channel
     * 
     */
    private final List<ContactProfileLinkChannelResponse> channels;
    /**
     * Direction (uplink or downlink)
     * 
     */
    private final String direction;
    /**
     * Effective Isotropic Radiated Power (EIRP) in dBW.
     * 
     */
    private final @Nullable Double eirpdBW;
    /**
     * Gain To Noise Temperature in db/K.
     * 
     */
    private final @Nullable Double gainOverTemperature;
    /**
     * polarization. eg (RHCP, LHCP)
     * 
     */
    private final String polarization;

    @OutputCustomType.Constructor({"channels","direction","eirpdBW","gainOverTemperature","polarization"})
    private ContactProfileLinkResponse(
        List<ContactProfileLinkChannelResponse> channels,
        String direction,
        @Nullable Double eirpdBW,
        @Nullable Double gainOverTemperature,
        String polarization) {
        this.channels = Objects.requireNonNull(channels);
        this.direction = Objects.requireNonNull(direction);
        this.eirpdBW = eirpdBW;
        this.gainOverTemperature = gainOverTemperature;
        this.polarization = Objects.requireNonNull(polarization);
    }

    /**
     * Contact Profile Link Channel
     * 
     */
    public List<ContactProfileLinkChannelResponse> getChannels() {
        return this.channels;
    }
    /**
     * Direction (uplink or downlink)
     * 
     */
    public String getDirection() {
        return this.direction;
    }
    /**
     * Effective Isotropic Radiated Power (EIRP) in dBW.
     * 
     */
    public Optional<Double> getEirpdBW() {
        return Optional.ofNullable(this.eirpdBW);
    }
    /**
     * Gain To Noise Temperature in db/K.
     * 
     */
    public Optional<Double> getGainOverTemperature() {
        return Optional.ofNullable(this.gainOverTemperature);
    }
    /**
     * polarization. eg (RHCP, LHCP)
     * 
     */
    public String getPolarization() {
        return this.polarization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactProfileLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ContactProfileLinkChannelResponse> channels;
        private String direction;
        private @Nullable Double eirpdBW;
        private @Nullable Double gainOverTemperature;
        private String polarization;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactProfileLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channels = defaults.channels;
    	      this.direction = defaults.direction;
    	      this.eirpdBW = defaults.eirpdBW;
    	      this.gainOverTemperature = defaults.gainOverTemperature;
    	      this.polarization = defaults.polarization;
        }

        public Builder setChannels(List<ContactProfileLinkChannelResponse> channels) {
            this.channels = Objects.requireNonNull(channels);
            return this;
        }

        public Builder setDirection(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setEirpdBW(@Nullable Double eirpdBW) {
            this.eirpdBW = eirpdBW;
            return this;
        }

        public Builder setGainOverTemperature(@Nullable Double gainOverTemperature) {
            this.gainOverTemperature = gainOverTemperature;
            return this;
        }

        public Builder setPolarization(String polarization) {
            this.polarization = Objects.requireNonNull(polarization);
            return this;
        }

        public ContactProfileLinkResponse build() {
            return new ContactProfileLinkResponse(channels, direction, eirpdBW, gainOverTemperature, polarization);
        }
    }
}
