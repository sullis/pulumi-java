// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WirelessDeviceSessionKeysAbpV11 {
    private final String appSKey;
    private final String fNwkSIntKey;
    private final String nwkSEncKey;
    private final String sNwkSIntKey;

    @OutputCustomType.Constructor({"appSKey","fNwkSIntKey","nwkSEncKey","sNwkSIntKey"})
    private WirelessDeviceSessionKeysAbpV11(
        String appSKey,
        String fNwkSIntKey,
        String nwkSEncKey,
        String sNwkSIntKey) {
        this.appSKey = Objects.requireNonNull(appSKey);
        this.fNwkSIntKey = Objects.requireNonNull(fNwkSIntKey);
        this.nwkSEncKey = Objects.requireNonNull(nwkSEncKey);
        this.sNwkSIntKey = Objects.requireNonNull(sNwkSIntKey);
    }

    public String getAppSKey() {
        return this.appSKey;
    }
    public String getFNwkSIntKey() {
        return this.fNwkSIntKey;
    }
    public String getNwkSEncKey() {
        return this.nwkSEncKey;
    }
    public String getSNwkSIntKey() {
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

        public Builder setAppSKey(String appSKey) {
            this.appSKey = Objects.requireNonNull(appSKey);
            return this;
        }

        public Builder setFNwkSIntKey(String fNwkSIntKey) {
            this.fNwkSIntKey = Objects.requireNonNull(fNwkSIntKey);
            return this;
        }

        public Builder setNwkSEncKey(String nwkSEncKey) {
            this.nwkSEncKey = Objects.requireNonNull(nwkSEncKey);
            return this;
        }

        public Builder setSNwkSIntKey(String sNwkSIntKey) {
            this.sNwkSIntKey = Objects.requireNonNull(sNwkSIntKey);
            return this;
        }

        public WirelessDeviceSessionKeysAbpV11 build() {
            return new WirelessDeviceSessionKeysAbpV11(appSKey, fNwkSIntKey, nwkSEncKey, sNwkSIntKey);
        }
    }
}
