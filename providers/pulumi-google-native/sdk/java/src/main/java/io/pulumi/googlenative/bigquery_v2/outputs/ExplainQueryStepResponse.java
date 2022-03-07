// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ExplainQueryStepResponse {
    /**
     * Machine-readable operation type.
     * 
     */
    private final String kind;
    /**
     * Human-readable stage descriptions.
     * 
     */
    private final List<String> substeps;

    @OutputCustomType.Constructor({"kind","substeps"})
    private ExplainQueryStepResponse(
        String kind,
        List<String> substeps) {
        this.kind = Objects.requireNonNull(kind);
        this.substeps = Objects.requireNonNull(substeps);
    }

    /**
     * Machine-readable operation type.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Human-readable stage descriptions.
     * 
    */
    public List<String> getSubsteps() {
        return this.substeps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExplainQueryStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private List<String> substeps;

        public Builder() {
    	      // Empty
        }

        public Builder(ExplainQueryStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.substeps = defaults.substeps;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setSubsteps(List<String> substeps) {
            this.substeps = Objects.requireNonNull(substeps);
            return this;
        }
        public ExplainQueryStepResponse build() {
            return new ExplainQueryStepResponse(kind, substeps);
        }
    }
}