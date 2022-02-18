// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vertex.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs Empty = new AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs();

    /**
     * The monitoring schedule for snapshot analysis. For EntityType-level config: unset / disabled = true indicates disabled by default for Features under it; otherwise by default enable snapshot analysis monitoring with monitoringInterval for Features under it.
     * 
     */
    @InputImport(name="disabled")
    private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * Configuration of the snapshot analysis based monitoring pipeline running interval. The value is rolled up to full day.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @InputImport(name="monitoringInterval")
    private final @Nullable Input<String> monitoringInterval;

    public Input<String> getMonitoringInterval() {
        return this.monitoringInterval == null ? Input.empty() : this.monitoringInterval;
    }

    public AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs(
        @Nullable Input<Boolean> disabled,
        @Nullable Input<String> monitoringInterval) {
        this.disabled = disabled;
        this.monitoringInterval = monitoringInterval;
    }

    private AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs() {
        this.disabled = Input.empty();
        this.monitoringInterval = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> disabled;
        private @Nullable Input<String> monitoringInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.monitoringInterval = defaults.monitoringInterval;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder setMonitoringInterval(@Nullable Input<String> monitoringInterval) {
            this.monitoringInterval = monitoringInterval;
            return this;
        }

        public Builder setMonitoringInterval(@Nullable String monitoringInterval) {
            this.monitoringInterval = Input.ofNullable(monitoringInterval);
            return this;
        }

        public AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs build() {
            return new AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs(disabled, monitoringInterval);
        }
    }
}
