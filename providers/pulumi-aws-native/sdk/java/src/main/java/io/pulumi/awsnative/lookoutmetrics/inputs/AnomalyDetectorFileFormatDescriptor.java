// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorCsvFormatDescriptor;
import io.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorJsonFormatDescriptor;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnomalyDetectorFileFormatDescriptor extends io.pulumi.resources.InvokeArgs {

    public static final AnomalyDetectorFileFormatDescriptor Empty = new AnomalyDetectorFileFormatDescriptor();

    @InputImport(name="csvFormatDescriptor")
    private final @Nullable AnomalyDetectorCsvFormatDescriptor csvFormatDescriptor;

    public Optional<AnomalyDetectorCsvFormatDescriptor> getCsvFormatDescriptor() {
        return this.csvFormatDescriptor == null ? Optional.empty() : Optional.ofNullable(this.csvFormatDescriptor);
    }

    @InputImport(name="jsonFormatDescriptor")
    private final @Nullable AnomalyDetectorJsonFormatDescriptor jsonFormatDescriptor;

    public Optional<AnomalyDetectorJsonFormatDescriptor> getJsonFormatDescriptor() {
        return this.jsonFormatDescriptor == null ? Optional.empty() : Optional.ofNullable(this.jsonFormatDescriptor);
    }

    public AnomalyDetectorFileFormatDescriptor(
        @Nullable AnomalyDetectorCsvFormatDescriptor csvFormatDescriptor,
        @Nullable AnomalyDetectorJsonFormatDescriptor jsonFormatDescriptor) {
        this.csvFormatDescriptor = csvFormatDescriptor;
        this.jsonFormatDescriptor = jsonFormatDescriptor;
    }

    private AnomalyDetectorFileFormatDescriptor() {
        this.csvFormatDescriptor = null;
        this.jsonFormatDescriptor = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorFileFormatDescriptor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AnomalyDetectorCsvFormatDescriptor csvFormatDescriptor;
        private @Nullable AnomalyDetectorJsonFormatDescriptor jsonFormatDescriptor;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorFileFormatDescriptor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csvFormatDescriptor = defaults.csvFormatDescriptor;
    	      this.jsonFormatDescriptor = defaults.jsonFormatDescriptor;
        }

        public Builder setCsvFormatDescriptor(@Nullable AnomalyDetectorCsvFormatDescriptor csvFormatDescriptor) {
            this.csvFormatDescriptor = csvFormatDescriptor;
            return this;
        }

        public Builder setJsonFormatDescriptor(@Nullable AnomalyDetectorJsonFormatDescriptor jsonFormatDescriptor) {
            this.jsonFormatDescriptor = jsonFormatDescriptor;
            return this;
        }

        public AnomalyDetectorFileFormatDescriptor build() {
            return new AnomalyDetectorFileFormatDescriptor(csvFormatDescriptor, jsonFormatDescriptor);
        }
    }
}
