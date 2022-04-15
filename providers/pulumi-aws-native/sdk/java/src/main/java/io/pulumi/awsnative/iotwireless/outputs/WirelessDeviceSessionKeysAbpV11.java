// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WirelessDeviceSessionKeysAbpV11 {
    private final String appSKey;
    private final String fNwkSIntKey;
    private final String nwkSEncKey;
    private final String sNwkSIntKey;

    @CustomType.Constructor
    private WirelessDeviceSessionKeysAbpV11(
        @CustomType.Parameter("appSKey") String appSKey,
        @CustomType.Parameter("fNwkSIntKey") String fNwkSIntKey,
        @CustomType.Parameter("nwkSEncKey") String nwkSEncKey,
        @CustomType.Parameter("sNwkSIntKey") String sNwkSIntKey) {
        this.appSKey = appSKey;
        this.fNwkSIntKey = fNwkSIntKey;
        this.nwkSEncKey = nwkSEncKey;
        this.sNwkSIntKey = sNwkSIntKey;
    }

    public String appSKey() {
        return this.appSKey;
    }
    public String fNwkSIntKey() {
        return this.fNwkSIntKey;
    }
    public String nwkSEncKey() {
        return this.nwkSEncKey;
    }
    public String sNwkSIntKey() {
        return this.sNwkSIntKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceSessionKeysAbpV11 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appSKey;
        private String fNwkSIntKey;
        private String nwkSEncKey;
        private String sNwkSIntKey;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceSessionKeysAbpV11 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appSKey = defaults.appSKey;
    	      this.fNwkSIntKey = defaults.fNwkSIntKey;
    	      this.nwkSEncKey = defaults.nwkSEncKey;
    	      this.sNwkSIntKey = defaults.sNwkSIntKey;
        }

        public Builder appSKey(String appSKey) {
            this.appSKey = Objects.requireNonNull(appSKey);
            return this;
        }
        public Builder fNwkSIntKey(String fNwkSIntKey) {
            this.fNwkSIntKey = Objects.requireNonNull(fNwkSIntKey);
            return this;
        }
        public Builder nwkSEncKey(String nwkSEncKey) {
            this.nwkSEncKey = Objects.requireNonNull(nwkSEncKey);
            return this;
        }
        public Builder sNwkSIntKey(String sNwkSIntKey) {
            this.sNwkSIntKey = Objects.requireNonNull(sNwkSIntKey);
            return this;
        }        public WirelessDeviceSessionKeysAbpV11 build() {
            return new WirelessDeviceSessionKeysAbpV11(appSKey, fNwkSIntKey, nwkSEncKey, sNwkSIntKey);
        }
    }
}
