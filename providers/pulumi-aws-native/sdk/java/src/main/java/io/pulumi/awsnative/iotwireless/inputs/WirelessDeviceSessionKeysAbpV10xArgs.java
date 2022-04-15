// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class WirelessDeviceSessionKeysAbpV10xArgs extends io.pulumi.resources.ResourceArgs {

    public static final WirelessDeviceSessionKeysAbpV10xArgs Empty = new WirelessDeviceSessionKeysAbpV10xArgs();

    @Import(name="appSKey", required=true)
      private final Output<String> appSKey;

    public Output<String> appSKey() {
        return this.appSKey;
    }

    @Import(name="nwkSKey", required=true)
      private final Output<String> nwkSKey;

    public Output<String> nwkSKey() {
        return this.nwkSKey;
    }

    public WirelessDeviceSessionKeysAbpV10xArgs(
        Output<String> appSKey,
        Output<String> nwkSKey) {
        this.appSKey = Objects.requireNonNull(appSKey, "expected parameter 'appSKey' to be non-null");
        this.nwkSKey = Objects.requireNonNull(nwkSKey, "expected parameter 'nwkSKey' to be non-null");
    }

    private WirelessDeviceSessionKeysAbpV10xArgs() {
        this.appSKey = Codegen.empty();
        this.nwkSKey = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceSessionKeysAbpV10xArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appSKey;
        private Output<String> nwkSKey;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceSessionKeysAbpV10xArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appSKey = defaults.appSKey;
    	      this.nwkSKey = defaults.nwkSKey;
        }

        public Builder appSKey(Output<String> appSKey) {
            this.appSKey = Objects.requireNonNull(appSKey);
            return this;
        }
        public Builder appSKey(String appSKey) {
            this.appSKey = Output.of(Objects.requireNonNull(appSKey));
            return this;
        }
        public Builder nwkSKey(Output<String> nwkSKey) {
            this.nwkSKey = Objects.requireNonNull(nwkSKey);
            return this;
        }
        public Builder nwkSKey(String nwkSKey) {
            this.nwkSKey = Output.of(Objects.requireNonNull(nwkSKey));
            return this;
        }        public WirelessDeviceSessionKeysAbpV10xArgs build() {
            return new WirelessDeviceSessionKeysAbpV10xArgs(appSKey, nwkSKey);
        }
    }
}
