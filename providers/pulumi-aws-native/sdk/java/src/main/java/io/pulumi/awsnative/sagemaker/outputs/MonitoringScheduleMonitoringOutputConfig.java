// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleMonitoringOutput;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MonitoringScheduleMonitoringOutputConfig {
    /**
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
     * 
     */
    private final List<MonitoringScheduleMonitoringOutput> monitoringOutputs;

    @OutputCustomType.Constructor({"kmsKeyId","monitoringOutputs"})
    private MonitoringScheduleMonitoringOutputConfig(
        @Nullable String kmsKeyId,
        List<MonitoringScheduleMonitoringOutput> monitoringOutputs) {
        this.kmsKeyId = kmsKeyId;
        this.monitoringOutputs = Objects.requireNonNull(monitoringOutputs);
    }

    /**
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
     * 
    */
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
     * 
    */
    public List<MonitoringScheduleMonitoringOutput> getMonitoringOutputs() {
        return this.monitoringOutputs;
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