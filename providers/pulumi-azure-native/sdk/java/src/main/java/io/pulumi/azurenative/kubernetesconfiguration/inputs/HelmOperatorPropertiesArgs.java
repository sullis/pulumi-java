// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for Helm operator.
 * 
 */
public final class HelmOperatorPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final HelmOperatorPropertiesArgs Empty = new HelmOperatorPropertiesArgs();

    /**
     * Values override for the operator Helm chart.
     * 
     */
    @InputImport(name="chartValues")
      private final @Nullable Input<String> chartValues;

    public Input<String> getChartValues() {
        return this.chartValues == null ? Input.empty() : this.chartValues;
    }

    /**
     * Version of the operator Helm chart.
     * 
     */
    @InputImport(name="chartVersion")
      private final @Nullable Input<String> chartVersion;

    public Input<String> getChartVersion() {
        return this.chartVersion == null ? Input.empty() : this.chartVersion;
    }

    public HelmOperatorPropertiesArgs(
        @Nullable Input<String> chartValues,
        @Nullable Input<String> chartVersion) {
        this.chartValues = chartValues;
        this.chartVersion = chartVersion;
    }

    private HelmOperatorPropertiesArgs() {
        this.chartValues = Input.empty();
        this.chartVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HelmOperatorPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> chartValues;
        private @Nullable Input<String> chartVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(HelmOperatorPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chartValues = defaults.chartValues;
    	      this.chartVersion = defaults.chartVersion;
        }

        public Builder setChartValues(@Nullable Input<String> chartValues) {
            this.chartValues = chartValues;
            return this;
        }

        public Builder setChartValues(@Nullable String chartValues) {
            this.chartValues = Input.ofNullable(chartValues);
            return this;
        }

        public Builder setChartVersion(@Nullable Input<String> chartVersion) {
            this.chartVersion = chartVersion;
            return this;
        }

        public Builder setChartVersion(@Nullable String chartVersion) {
            this.chartVersion = Input.ofNullable(chartVersion);
            return this;
        }
        public HelmOperatorPropertiesArgs build() {
            return new HelmOperatorPropertiesArgs(chartValues, chartVersion);
        }
    }
}