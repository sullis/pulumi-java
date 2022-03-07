// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location;

import io.pulumi.awsnative.location.enums.MapPricingPlan;
import io.pulumi.awsnative.location.inputs.MapConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MapArgs extends io.pulumi.resources.ResourceArgs {

    public static final MapArgs Empty = new MapArgs();

    @InputImport(name="configuration", required=true)
      private final Input<MapConfigurationArgs> configuration;

    public Input<MapConfigurationArgs> getConfiguration() {
        return this.configuration;
    }

    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="mapName")
      private final @Nullable Input<String> mapName;

    public Input<String> getMapName() {
        return this.mapName == null ? Input.empty() : this.mapName;
    }

    @InputImport(name="pricingPlan")
      private final @Nullable Input<MapPricingPlan> pricingPlan;

    public Input<MapPricingPlan> getPricingPlan() {
        return this.pricingPlan == null ? Input.empty() : this.pricingPlan;
    }

    public MapArgs(
        Input<MapConfigurationArgs> configuration,
        @Nullable Input<String> description,
        @Nullable Input<String> mapName,
        @Nullable Input<MapPricingPlan> pricingPlan) {
        this.configuration = Objects.requireNonNull(configuration, "expected parameter 'configuration' to be non-null");
        this.description = description;
        this.mapName = mapName;
        this.pricingPlan = pricingPlan;
    }

    private MapArgs() {
        this.configuration = Input.empty();
        this.description = Input.empty();
        this.mapName = Input.empty();
        this.pricingPlan = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<MapConfigurationArgs> configuration;
        private @Nullable Input<String> description;
        private @Nullable Input<String> mapName;
        private @Nullable Input<MapPricingPlan> pricingPlan;

        public Builder() {
    	      // Empty
        }

        public Builder(MapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.description = defaults.description;
    	      this.mapName = defaults.mapName;
    	      this.pricingPlan = defaults.pricingPlan;
        }

        public Builder setConfiguration(Input<MapConfigurationArgs> configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }

        public Builder setConfiguration(MapConfigurationArgs configuration) {
            this.configuration = Input.of(Objects.requireNonNull(configuration));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setMapName(@Nullable Input<String> mapName) {
            this.mapName = mapName;
            return this;
        }

        public Builder setMapName(@Nullable String mapName) {
            this.mapName = Input.ofNullable(mapName);
            return this;
        }

        public Builder setPricingPlan(@Nullable Input<MapPricingPlan> pricingPlan) {
            this.pricingPlan = pricingPlan;
            return this;
        }

        public Builder setPricingPlan(@Nullable MapPricingPlan pricingPlan) {
            this.pricingPlan = Input.ofNullable(pricingPlan);
            return this;
        }
        public MapArgs build() {
            return new MapArgs(configuration, description, mapName, pricingPlan);
        }
    }
}