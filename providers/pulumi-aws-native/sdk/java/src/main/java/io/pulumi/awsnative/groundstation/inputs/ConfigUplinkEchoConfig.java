// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigUplinkEchoConfig extends io.pulumi.resources.InvokeArgs {

    public static final ConfigUplinkEchoConfig Empty = new ConfigUplinkEchoConfig();

    @Import(name="antennaUplinkConfigArn")
      private final @Nullable String antennaUplinkConfigArn;

    public Optional<String> antennaUplinkConfigArn() {
        return this.antennaUplinkConfigArn == null ? Optional.empty() : Optional.ofNullable(this.antennaUplinkConfigArn);
    }

    @Import(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    public ConfigUplinkEchoConfig(
        @Nullable String antennaUplinkConfigArn,
        @Nullable Boolean enabled) {
        this.antennaUplinkConfigArn = antennaUplinkConfigArn;
        this.enabled = enabled;
    }

    private ConfigUplinkEchoConfig() {
        this.antennaUplinkConfigArn = null;
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigUplinkEchoConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String antennaUplinkConfigArn;
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigUplinkEchoConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.antennaUplinkConfigArn = defaults.antennaUplinkConfigArn;
    	      this.enabled = defaults.enabled;
        }

        public Builder antennaUplinkConfigArn(@Nullable String antennaUplinkConfigArn) {
            this.antennaUplinkConfigArn = antennaUplinkConfigArn;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }        public ConfigUplinkEchoConfig build() {
            return new ConfigUplinkEchoConfig(antennaUplinkConfigArn, enabled);
        }
    }
}
