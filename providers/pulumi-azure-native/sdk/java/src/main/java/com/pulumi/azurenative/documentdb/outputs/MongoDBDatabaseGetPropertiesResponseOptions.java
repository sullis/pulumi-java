// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.outputs;

import com.pulumi.azurenative.documentdb.outputs.AutoscaleSettingsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MongoDBDatabaseGetPropertiesResponseOptions {
    /**
     * @return Specifies the Autoscale settings.
     * 
     */
    private final @Nullable AutoscaleSettingsResponse autoscaleSettings;
    /**
     * @return Value of the Cosmos DB resource throughput or autoscaleSettings. Use the ThroughputSetting resource when retrieving offer details.
     * 
     */
    private final @Nullable Integer throughput;

    @CustomType.Constructor
    private MongoDBDatabaseGetPropertiesResponseOptions(
        @CustomType.Parameter("autoscaleSettings") @Nullable AutoscaleSettingsResponse autoscaleSettings,
        @CustomType.Parameter("throughput") @Nullable Integer throughput) {
        this.autoscaleSettings = autoscaleSettings;
        this.throughput = throughput;
    }

    /**
     * @return Specifies the Autoscale settings.
     * 
     */
    public Optional<AutoscaleSettingsResponse> autoscaleSettings() {
        return Optional.ofNullable(this.autoscaleSettings);
    }
    /**
     * @return Value of the Cosmos DB resource throughput or autoscaleSettings. Use the ThroughputSetting resource when retrieving offer details.
     * 
     */
    public Optional<Integer> throughput() {
        return Optional.ofNullable(this.throughput);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDBDatabaseGetPropertiesResponseOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoscaleSettingsResponse autoscaleSettings;
        private @Nullable Integer throughput;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDBDatabaseGetPropertiesResponseOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaleSettings = defaults.autoscaleSettings;
    	      this.throughput = defaults.throughput;
        }

        public Builder autoscaleSettings(@Nullable AutoscaleSettingsResponse autoscaleSettings) {
            this.autoscaleSettings = autoscaleSettings;
            return this;
        }
        public Builder throughput(@Nullable Integer throughput) {
            this.throughput = throughput;
            return this;
        }        public MongoDBDatabaseGetPropertiesResponseOptions build() {
            return new MongoDBDatabaseGetPropertiesResponseOptions(autoscaleSettings, throughput);
        }
    }
}
