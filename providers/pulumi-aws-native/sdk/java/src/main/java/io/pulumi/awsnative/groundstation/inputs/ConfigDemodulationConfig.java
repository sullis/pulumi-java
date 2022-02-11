// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigDemodulationConfig extends io.pulumi.resources.InvokeArgs {

    public static final ConfigDemodulationConfig Empty = new ConfigDemodulationConfig();

    @InputImport(name="unvalidatedJSON")
    private final @Nullable String unvalidatedJSON;

    public Optional<String> getUnvalidatedJSON() {
        return this.unvalidatedJSON == null ? Optional.empty() : Optional.ofNullable(this.unvalidatedJSON);
    }

    public ConfigDemodulationConfig(@Nullable String unvalidatedJSON) {
        this.unvalidatedJSON = unvalidatedJSON;
    }

    private ConfigDemodulationConfig() {
        this.unvalidatedJSON = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigDemodulationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String unvalidatedJSON;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigDemodulationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unvalidatedJSON = defaults.unvalidatedJSON;
        }

        public Builder setUnvalidatedJSON(@Nullable String unvalidatedJSON) {
            this.unvalidatedJSON = unvalidatedJSON;
            return this;
        }

        public ConfigDemodulationConfig build() {
            return new ConfigDemodulationConfig(unvalidatedJSON);
        }
    }
}
