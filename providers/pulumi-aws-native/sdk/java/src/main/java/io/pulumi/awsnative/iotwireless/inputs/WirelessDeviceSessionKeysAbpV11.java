// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WirelessDeviceSessionKeysAbpV11 extends io.pulumi.resources.InvokeArgs {

    public static final WirelessDeviceSessionKeysAbpV11 Empty = new WirelessDeviceSessionKeysAbpV11();

    @InputImport(name="appSKey", required=true)
    private final String appSKey;

    public String getAppSKey() {
        return this.appSKey;
    }

    @InputImport(name="fNwkSIntKey", required=true)
    private final String fNwkSIntKey;

    public String getFNwkSIntKey() {
        return this.fNwkSIntKey;
    }

    @InputImport(name="nwkSEncKey", required=true)
    private final String nwkSEncKey;

    public String getNwkSEncKey() {
        return this.nwkSEncKey;
    }

    @InputImport(name="sNwkSIntKey", required=true)
    private final String sNwkSIntKey;

    public String getSNwkSIntKey() {
        return this.sNwkSIntKey;
    }

    public WirelessDeviceSessionKeysAbpV11(
        String appSKey,
        String fNwkSIntKey,
        String nwkSEncKey,
        String sNwkSIntKey) {
        this.appSKey = Objects.requireNonNull(appSKey, "expected parameter 'appSKey' to be non-null");
        this.fNwkSIntKey = Objects.requireNonNull(fNwkSIntKey, "expected parameter 'fNwkSIntKey' to be non-null");
        this.nwkSEncKey = Objects.requireNonNull(nwkSEncKey, "expected parameter 'nwkSEncKey' to be non-null");
        this.sNwkSIntKey = Objects.requireNonNull(sNwkSIntKey, "expected parameter 'sNwkSIntKey' to be non-null");
    }

    private WirelessDeviceSessionKeysAbpV11() {
        this.appSKey = null;
        this.fNwkSIntKey = null;
        this.nwkSEncKey = null;
        this.sNwkSIntKey = null;
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
