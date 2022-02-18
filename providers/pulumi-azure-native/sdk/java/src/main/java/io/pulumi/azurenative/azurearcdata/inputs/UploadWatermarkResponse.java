// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties on upload watermark.  Mostly timestamp for each upload data type
 * 
 */
public final class UploadWatermarkResponse extends io.pulumi.resources.InvokeArgs {

    public static final UploadWatermarkResponse Empty = new UploadWatermarkResponse();

    /**
     * Last uploaded date for logs from kubernetes cluster. Defaults to current date time
     * 
     */
    @InputImport(name="logs")
    private final @Nullable String logs;

    public Optional<String> getLogs() {
        return this.logs == null ? Optional.empty() : Optional.ofNullable(this.logs);
    }

    /**
     * Last uploaded date for metrics from kubernetes cluster. Defaults to current date time
     * 
     */
    @InputImport(name="metrics")
    private final @Nullable String metrics;

    public Optional<String> getMetrics() {
        return this.metrics == null ? Optional.empty() : Optional.ofNullable(this.metrics);
    }

    /**
     * Last uploaded date for usages from kubernetes cluster. Defaults to current date time
     * 
     */
    @InputImport(name="usages")
    private final @Nullable String usages;

    public Optional<String> getUsages() {
        return this.usages == null ? Optional.empty() : Optional.ofNullable(this.usages);
    }

    public UploadWatermarkResponse(
        @Nullable String logs,
        @Nullable String metrics,
        @Nullable String usages) {
        this.logs = logs;
        this.metrics = metrics;
        this.usages = usages;
    }

    private UploadWatermarkResponse() {
        this.logs = null;
        this.metrics = null;
        this.usages = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UploadWatermarkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String logs;
        private @Nullable String metrics;
        private @Nullable String usages;

        public Builder() {
    	      // Empty
        }

        public Builder(UploadWatermarkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logs = defaults.logs;
    	      this.metrics = defaults.metrics;
    	      this.usages = defaults.usages;
        }

        public Builder setLogs(@Nullable String logs) {
            this.logs = logs;
            return this;
        }

        public Builder setMetrics(@Nullable String metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder setUsages(@Nullable String usages) {
            this.usages = usages;
            return this;
        }

        public UploadWatermarkResponse build() {
            return new UploadWatermarkResponse(logs, metrics, usages);
        }
    }
}
