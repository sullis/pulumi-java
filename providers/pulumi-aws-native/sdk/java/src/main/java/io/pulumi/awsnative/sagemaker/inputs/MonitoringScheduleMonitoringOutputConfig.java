// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringOutput;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitoringScheduleMonitoringOutputConfig extends io.pulumi.resources.InvokeArgs {

    public static final MonitoringScheduleMonitoringOutputConfig Empty = new MonitoringScheduleMonitoringOutputConfig();

    @InputImport(name="kmsKeyId")
    private final @Nullable String kmsKeyId;

    public Optional<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Optional.empty() : Optional.ofNullable(this.kmsKeyId);
    }

    @InputImport(name="monitoringOutputs", required=true)
    private final List<MonitoringScheduleMonitoringOutput> monitoringOutputs;

    public List<MonitoringScheduleMonitoringOutput> getMonitoringOutputs() {
        return this.monitoringOutputs;
    }

    public MonitoringScheduleMonitoringOutputConfig(
        @Nullable String kmsKeyId,
        List<MonitoringScheduleMonitoringOutput> monitoringOutputs) {
        this.kmsKeyId = kmsKeyId;
        this.monitoringOutputs = Objects.requireNonNull(monitoringOutputs, "expected parameter 'monitoringOutputs' to be non-null");
    }

    private MonitoringScheduleMonitoringOutputConfig() {
        this.kmsKeyId = null;
        this.monitoringOutputs = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleMonitoringOutputConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyId;
        private List<MonitoringScheduleMonitoringOutput> monitoringOutputs;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleMonitoringOutputConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.monitoringOutputs = defaults.monitoringOutputs;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setMonitoringOutputs(List<MonitoringScheduleMonitoringOutput> monitoringOutputs) {
            this.monitoringOutputs = Objects.requireNonNull(monitoringOutputs);
            return this;
        }

        public MonitoringScheduleMonitoringOutputConfig build() {
            return new MonitoringScheduleMonitoringOutputConfig(kmsKeyId, monitoringOutputs);
        }
    }
}
