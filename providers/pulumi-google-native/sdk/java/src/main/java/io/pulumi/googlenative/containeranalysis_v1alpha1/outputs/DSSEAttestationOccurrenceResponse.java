// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.EnvelopeResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.InTotoStatementResponse;
import java.util.Objects;

@OutputCustomType
public final class DSSEAttestationOccurrenceResponse {
    /**
     * If doing something security critical, make sure to verify the signatures in this metadata.
     * 
     */
    private final EnvelopeResponse envelope;
    private final InTotoStatementResponse statement;

    @OutputCustomType.Constructor({"envelope","statement"})
    private DSSEAttestationOccurrenceResponse(
        EnvelopeResponse envelope,
        InTotoStatementResponse statement) {
        this.envelope = Objects.requireNonNull(envelope);
        this.statement = Objects.requireNonNull(statement);
    }

    /**
     * If doing something security critical, make sure to verify the signatures in this metadata.
     * 
    */
    public EnvelopeResponse getEnvelope() {
        return this.envelope;
    }
    public InTotoStatementResponse getStatement() {
        return this.statement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DSSEAttestationOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvelopeResponse envelope;
        private InTotoStatementResponse statement;

        public Builder() {
    	      // Empty
        }

        public Builder(DSSEAttestationOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envelope = defaults.envelope;
    	      this.statement = defaults.statement;
        }

        public Builder setEnvelope(EnvelopeResponse envelope) {
            this.envelope = Objects.requireNonNull(envelope);
            return this;
        }

        public Builder setStatement(InTotoStatementResponse statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }
        public DSSEAttestationOccurrenceResponse build() {
            return new DSSEAttestationOccurrenceResponse(envelope, statement);
        }
    }
}