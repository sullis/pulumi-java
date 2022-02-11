// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExperimentTreatmentObject extends io.pulumi.resources.InvokeArgs {

    public static final ExperimentTreatmentObject Empty = new ExperimentTreatmentObject();

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="feature", required=true)
    private final String feature;

    public String getFeature() {
        return this.feature;
    }

    @InputImport(name="treatmentName", required=true)
    private final String treatmentName;

    public String getTreatmentName() {
        return this.treatmentName;
    }

    @InputImport(name="variation", required=true)
    private final String variation;

    public String getVariation() {
        return this.variation;
    }

    public ExperimentTreatmentObject(
        @Nullable String description,
        String feature,
        String treatmentName,
        String variation) {
        this.description = description;
        this.feature = Objects.requireNonNull(feature, "expected parameter 'feature' to be non-null");
        this.treatmentName = Objects.requireNonNull(treatmentName, "expected parameter 'treatmentName' to be non-null");
        this.variation = Objects.requireNonNull(variation, "expected parameter 'variation' to be non-null");
    }

    private ExperimentTreatmentObject() {
        this.description = null;
        this.feature = null;
        this.treatmentName = null;
        this.variation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentTreatmentObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String feature;
        private String treatmentName;
        private String variation;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentTreatmentObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.feature = defaults.feature;
    	      this.treatmentName = defaults.treatmentName;
    	      this.variation = defaults.variation;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFeature(String feature) {
            this.feature = Objects.requireNonNull(feature);
            return this;
        }

        public Builder setTreatmentName(String treatmentName) {
            this.treatmentName = Objects.requireNonNull(treatmentName);
            return this;
        }

        public Builder setVariation(String variation) {
            this.variation = Objects.requireNonNull(variation);
            return this;
        }

        public ExperimentTreatmentObject build() {
            return new ExperimentTreatmentObject(description, feature, treatmentName, variation);
        }
    }
}
